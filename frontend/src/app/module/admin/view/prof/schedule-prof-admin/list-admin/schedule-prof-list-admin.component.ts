import {Component, EventEmitter, forwardRef, OnInit, Output, ViewChild} from '@angular/core';
import {ScheduleProfService} from 'src/app/controller/service/ScheduleProf.service';
import {ScheduleProfDto} from 'src/app/controller/model/ScheduleProf.model';
import {ScheduleProfCriteria} from 'src/app/controller/criteria/ScheduleProfCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';

import { GroupeEtudiantService } from 'src/app/controller/service/GroupeEtudiant.service';
import { ProfService } from 'src/app/controller/service/Prof.service';
import { CoursService } from 'src/app/controller/service/Cours.service';

import {GroupeEtudiantDto} from 'src/app/controller/model/GroupeEtudiant.model';
import {CoursDto} from 'src/app/controller/model/Cours.model';
import {ProfDto} from 'src/app/controller/model/Prof.model';
import interactionPlugin, {DateClickArg, EventDragStopArg} from "@fullcalendar/interaction";
import {CalendarOptions, EventClickArg, EventInput} from "@fullcalendar/core";
import dayGridPlugin from "@fullcalendar/daygrid";
import {Calendar} from "primeng/calendar";
import {FullCalendarComponent} from "@fullcalendar/angular";
import timeGridPlugin from "@fullcalendar/timegrid";
import {ScheduleProfCreateAdminComponent} from "../create-admin/schedule-prof-create-admin.component";
import {DialogService} from "primeng/dynamicdialog";
import {
    CalendrierProfListAdminComponent
} from "../../calendrier-prof-admin/list-admin/calendrier-prof-list-admin.component";
import {
    CalendrierProfCreateAdminComponent
} from "../../calendrier-prof-admin/create-admin/calendrier-prof-create-admin.component";
import {ScheduleProfEditAdminComponent} from "../edit-admin/schedule-prof-edit-admin.component";


@Component({
  selector: 'app-schedule-prof-list-admin',
  templateUrl: './schedule-prof-list-admin.component.html'
})
export class ScheduleProfListAdminComponent extends AbstractListController<ScheduleProfDto, ScheduleProfCriteria, ScheduleProfService>  implements OnInit {
    calendarOptions?: CalendarOptions;
    eventsModel: any;
    displayBasic: boolean = false;
    //@Output() saveSchedule = new EventEmitter<EventInput>();
    @ViewChild(ScheduleProfCreateAdminComponent) childComponent!: ScheduleProfCreateAdminComponent;

    @ViewChild('fullcalendar') fullcalendar?: FullCalendarComponent;
    events: EventInput[] = [];
    private scheduleData: any;
    private repeatOption: null;
    editedEvent: any;

    ngOnInit() {
        this.findPaginatedByCriteria();
        this.initExport();
        this.initCol();
        this.loadGroupeEtudiant();
        this.loadProf();
        this.loadCours();
        this.calendarOptions = {
            plugins: [dayGridPlugin, interactionPlugin, timeGridPlugin],
            editable: false,
            headerToolbar: {
                left: 'prev,next',
                center: 'title',
                right: 'dayGridMonth,timeGridWeek,timeGridDay'
            },
            dateClick: this.handleDateClick.bind(this),
            eventClick: this.handleEventClick.bind(this),
            eventDragStop: this.handleEventDragStop.bind(this),
            slotDuration: '00:30:00', // Sets the duration of each slot to 30 minutes
            slotLabelInterval: '01:00:00', // Displays the hour labels every 1 hour
            events: this.events,
        };
        this.loadScheduleProfs();


    }


    constructor(scheduleProfService: ScheduleProfService,
                private dialogService: DialogService,
                private groupeEtudiantService: GroupeEtudiantService, private profService: ProfService, private coursService: CoursService) {
        super(scheduleProfService);
    }
    handleDateClick(arg: DateClickArg) {
      console.log(arg);
        this.displayBasic = true;
    }

    handleEventClick(arg: EventClickArg) {

            this.selectedEvent = arg.event;
        this.displayBasic = false;
        console.log(arg);
    }

    handleEventDragStop(arg: EventDragStopArg) {
        console.log(arg);
    }




    saveEvent() {
        const title = prompt('Enter event title:');
        if (!title) {
            return; // User canceled the input
        }

        const startDateString = prompt('Enter event start date (YYYY-MM-DD):');
        if (!startDateString) {
            return; // User canceled the input
        }

        const startDate = new Date(startDateString);
        if (isNaN(startDate.getTime())) {
            console.log('Invalid date format');
            return; // Invalid date format entered by the user
        }

        const newEvent = {
            title: title,
            start: startDate,
        };

        if (this.fullcalendar && this.fullcalendar.getApi()) {
            const calendarApi = this.fullcalendar.getApi();
            calendarApi.addEvent(newEvent); // Add the new event to the calendar
        }

        this.displayBasic = false; // Close the pop-up dialog after saving
    }




    fileName = 'ScheduleProf';
    groupeEtudiants :Array<GroupeEtudiantDto>;
    profs :Array<ProfDto>;
    courss :Array<CoursDto>;
  

    selectedEvent: any;
    trancheHoraireProfs: any;

  /*  public async loadScheduleProfs(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('ScheduleProf', 'list');
        isPermistted ? this.service.findAll().subscribe(scheduleProfs => this.items = scheduleProfs,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'problème d\'autorisation'});
    }*/
    savedScheduleId: number;

    public async loadScheduleProfs() {
        await this.roleService.findAll();
        const isPermitted = await this.roleService.isPermitted('ScheduleProf', 'list');

        if (isPermitted) {
            this.service.findAll().subscribe(
                (scheduleProfs) => {
                    this.items = scheduleProfs;
                    this.loadEventsFromScheduleProfs();
                },
                (error) => console.log(error)
            );
        } else {
            this.messageService.add({
                severity: 'error',
                summary: 'erreur',
                detail: 'problème d\'autorisation',
            });
        }
    }

    loadEventsFromScheduleProfs() {
        this.events = [];

        for (const scheduleProf of this.items) {
            const startDate = new Date(scheduleProf.startTime);
            const endDate = new Date(scheduleProf.endTime);

            const newEvent = {
                title: scheduleProf.subject,
                start: startDate,
                end: endDate,
            };

            this.events.push(newEvent);
        }

        if (this.fullcalendar && this.fullcalendar.getApi()) {
            const calendarApi = this.fullcalendar.getApi();
            calendarApi.removeAllEvents();
            calendarApi.addEventSource(this.events);
        }
    }



    public initCol() {
        this.cols = [
            {field: 'subject', header: 'Subject'},
            {field: 'startTime', header: 'Start time'},
            {field: 'endTime', header: 'End time'},
            {field: 'ref', header: 'Ref'},
            {field: 'groupeEtudiant?.id', header: 'Groupe etudiant'},
            {field: 'prof?.ref', header: 'Prof'},
            {field: 'cours?.libelle', header: 'Cours'},
            {field: 'grpName', header: 'Grp name'},
            {field: 'profName', header: 'Prof name'},
            {field: 'profsId', header: 'Profs id'},
        ];
    }


    public async loadGroupeEtudiant(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('ScheduleProf', 'list');
        isPermistted ? this.groupeEtudiantService.findAll().subscribe(groupeEtudiants => this.groupeEtudiants = groupeEtudiants,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }
    public async loadProf(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('ScheduleProf', 'list');
        isPermistted ? this.profService.findAllOptimized().subscribe(profs => this.profs = profs,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }
    public async loadCours(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('ScheduleProf', 'list');
        isPermistted ? this.coursService.findAllOptimized().subscribe(courss => this.courss = courss,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }

	public initDuplicate(res: ScheduleProfDto) {
	}

   public prepareColumnExport() : void {
        this.exportData = this.items.map(e => {
            return {
                 'Subject': e.subject ,
                'Start time': this.datePipe.transform(e.startTime , 'dd/MM/yyyy hh:mm'),
                'End time': this.datePipe.transform(e.endTime , 'dd/MM/yyyy hh:mm'),
                 'Ref': e.ref ,
                'Groupe etudiant': e.groupeEtudiant?.id ,
                'Prof': e.prof?.ref ,
                'Cours': e.cours?.libelle ,
                 'Grp name': e.grpName ,
                 'Prof name': e.profName ,
                 'Profs id': e.profsId ,
            }
        });

        this.criteriaData = [{
            'Subject': this.criteria.subject ? this.criteria.subject : environment.emptyForExport ,
            'Start time Min': this.criteria.startTimeFrom ? this.datePipe.transform(this.criteria.startTimeFrom , this.dateFormat) : environment.emptyForExport ,
            'Start time Max': this.criteria.startTimeTo ? this.datePipe.transform(this.criteria.startTimeTo , this.dateFormat) : environment.emptyForExport ,
            'End time Min': this.criteria.endTimeFrom ? this.datePipe.transform(this.criteria.endTimeFrom , this.dateFormat) : environment.emptyForExport ,
            'End time Max': this.criteria.endTimeTo ? this.datePipe.transform(this.criteria.endTimeTo , this.dateFormat) : environment.emptyForExport ,
            'Ref': this.criteria.ref ? this.criteria.ref : environment.emptyForExport ,
        //'Groupe etudiant': this.criteria.groupeEtudiant?.id ? this.criteria.groupeEtudiant?.id : environment.emptyForExport ,
        //'Prof': this.criteria.prof?.ref ? this.criteria.prof?.ref : environment.emptyForExport ,
        //'Cours': this.criteria.cours?.libelle ? this.criteria.cours?.libelle : environment.emptyForExport ,
            'Grp name': this.criteria.grpName ? this.criteria.grpName : environment.emptyForExport ,
            'Prof name': this.criteria.profName ? this.criteria.profName : environment.emptyForExport ,
            'Profs id Min': this.criteria.profsIdMin ? this.criteria.profsIdMin : environment.emptyForExport ,
            'Profs id Max': this.criteria.profsIdMax ? this.criteria.profsIdMax : environment.emptyForExport ,
        }];
      }



    handleSaveSchedule(scheduleData: any) {
        this.scheduleData = scheduleData;
        console.log('Received scheduleData:', this.scheduleData);
    }

    save() {
        let savedScheduleId;
        if (
            this.scheduleData.subject &&
            this.scheduleData.startTime &&
            this.scheduleData.endTime
        ) {
            const scheduleData = {
                subject: this.scheduleData.subject,
                startTime: new Date(this.scheduleData.startTime),
                endTime: new Date(this.scheduleData.endTime),
                ref: this.scheduleData.ref,
                repeatOption: this.scheduleData.repeatOption,
                repeatNumber: this.scheduleData.repeatNumber,
                selectedDays: this.scheduleData.selectedDays,
                endDate: new Date(this.scheduleData.endDate),
                savedScheduleId: this.scheduleData.savedScheduleId,
            };
            console.log('saved id', this.savedScheduleId);
            console.log('saved data', scheduleData);
            this.addScheduleToCalendar(scheduleData);
            this.displayBasic = false;
        }}

    addScheduleToCalendar(scheduleData: any) {
        if ( scheduleData.startTime && scheduleData.endTime) {
            const startDate = new Date(scheduleData.startTime);
            const endDate = new Date(scheduleData.endTime);

            if (this.fullcalendar && this.fullcalendar.getApi()) {
                const calendarApi = this.fullcalendar.getApi();

                if (scheduleData.repeatOption === 'Daily') {
                    const repeatNumber = 1;// scheduleData.repeatNumber;
                    const lastEventDate = new Date(scheduleData.endDate);

                    let currentEventDate = new Date(startDate);

                    while (currentEventDate <= lastEventDate) {
                        const newEvent = {
                            title: scheduleData.subject,
                            start: new Date(currentEventDate),
                            end: new Date(currentEventDate),
                        };

                        calendarApi.addEvent(newEvent);

                        currentEventDate.setDate(currentEventDate.getDate() + repeatNumber);
                    }
                } else if (scheduleData.repeatOption === 'Weekly') {
                    const selectedDays = scheduleData.selectedDays;
                    const lastEventDate = new Date(scheduleData.endDate);

                    let currentEventDate = new Date(startDate);

                    while (currentEventDate <= lastEventDate) {
                        const currentDay = currentEventDate.getDay();
                        if (selectedDays.includes(currentDay)) {
                            const newEvent = {
                                title: scheduleData.subject,
                                start: new Date(currentEventDate),
                                end: new Date(currentEventDate),
                            };

                            calendarApi.addEvent(newEvent);
                        }

                        currentEventDate.setDate(currentEventDate.getDate() + 1);
                    }
                } else {
                    const newEvent = {
                        title: scheduleData.subject,
                        start: new Date(startDate),
                        end: new Date(endDate),
                    };

                    calendarApi.addEvent(newEvent);
                }
            }
        } else {
            console.log('Incomplete scheduleData object');
        }
    }

    formatDate(dateString: string): string {
        const date = new Date(dateString);
        if (isNaN(date.getTime())) {
            console.log('Invalid date format:', dateString);
            return '';
        }
        const year = date.getFullYear();
        const month = String(date.getMonth() + 1).padStart(2, '0');
        const day = String(date.getDate()).padStart(2, '0');

        return `${year}-${month}-${day}`;
    }


    openEditDialog() {
        this.item.id=this.selectedEvent.id;
        this.item.subject = this.selectedEvent.title;
        this.item.startTime = this.selectedEvent.start;
        this.item.endTime = this.selectedEvent.end;

        this.selectedEventDetails = { title: this.selectedEvent.title, start: this.selectedEvent.start, end: this.selectedEvent.end };
        this.editDialog=true;
        this.createDialog=false;
        console.log(this.selectedEvent.id);

    }
    openDialog() {
        this.createDialog = true;
        this.selectedEvent=null;
    }


    closeEditDialog() {
        this.editDialog=false;
    }

    closeEventDetailsDialog() {
        this.selectedEvent = null;
    }






    selectedDays: any;
    repeatNumber = 1;
    endDate: Date = new Date();
    selectedEventDetails: any;

}
