import {Component, OnInit, Input, ViewChild, Output, EventEmitter} from '@angular/core';

import { AbstractCreateController } from 'src/app/zynerator/controller/AbstractCreateController';

import {ScheduleProfService} from 'src/app/controller/service/ScheduleProf.service';
import {ScheduleProfDto} from 'src/app/controller/model/ScheduleProf.model';
import {ScheduleProfCriteria} from 'src/app/controller/criteria/ScheduleProfCriteria.model';
import {CoursDto} from 'src/app/controller/model/Cours.model';
import {CoursService} from 'src/app/controller/service/Cours.service';
import {ProfDto} from 'src/app/controller/model/Prof.model';
import {ProfService} from 'src/app/controller/service/Prof.service';
import {GroupeEtudiantDto} from 'src/app/controller/model/GroupeEtudiant.model';
import {GroupeEtudiantService} from 'src/app/controller/service/GroupeEtudiant.service';
import {EventInput} from "@fullcalendar/core";
import {FullCalendarComponent} from "@fullcalendar/angular";
import {Observable} from "rxjs";
import {HttpClient} from "@angular/common/http";
@Component({
  selector: 'app-schedule-prof-create-admin',
  templateUrl: './schedule-prof-create-admin.component.html'
})
export class ScheduleProfCreateAdminComponent extends AbstractCreateController<ScheduleProfDto, ScheduleProfCriteria, ScheduleProfService>  implements OnInit {



    private _validProfRef = true;
    private _validCoursCode = true;
    private _validCoursLibelle = true;
    @Output() saveSchedule = new EventEmitter<EventInput>();
    private API: string = 'http://localhost:8036/api/admin/scheduleProf/';


    constructor( private scheduleProfService: ScheduleProfService ,
                 private http: HttpClient,
                 private coursService: CoursService, private profService: ProfService, private groupeEtudiantService: GroupeEtudiantService) {
        super(scheduleProfService);
    }

    ngOnInit(): void {
    this.groupeEtudiant = new GroupeEtudiantDto();
    this.groupeEtudiantService.findAll().subscribe((data) => this.groupeEtudiants = data);
    this.prof = new ProfDto();
    this.profService.findAll().subscribe((data) => this.profs = data);
    this.cours = new CoursDto();
    this.coursService.findAll().subscribe((data) => this.courss = data);
}




/*
    async save() {
        const scheduleData = {
            subject: this.item.subject,
            startTime: this.item.startTime,
            endTime: this.item.endTime,
            ref: this.item.ref,
            repeatOption: this.optionSelected.option,
            repeatNumber: this.repeatNumber,
            endDate: this.endDate,
            selectedDays: [],
            savedScheduleId: this.item.id,
        };

        if (this.optionSelected.option === 'Weekly') {
            scheduleData.selectedDays = this.selectedDays.map(day => day);
        }
        if (this.optionSelected.option === 'Never') {
                super.save();
        }

        console.log('scheduleData:', scheduleData);

        const lastEventDate = new Date(scheduleData.endDate);
        let currentEventDate = new Date(scheduleData.startTime);

        while (currentEventDate <= lastEventDate) {
            if (scheduleData.repeatOption === 'Daily') {
                const newEvent = {
                    title: scheduleData.subject,
                    start: new Date(currentEventDate.getTime()),
                    end: new Date(currentEventDate.getTime() + (scheduleData.endTime.getTime() - scheduleData.startTime.getTime())),
                };

                console.log('currentEventDate:', currentEventDate);
                await this.saveEvent(newEvent);
            } else if (scheduleData.repeatOption === 'Weekly' && (scheduleData.selectedDays.includes(currentEventDate.getDay()) || scheduleData.selectedDays.length === 0))
            {
                const newEvent = {
                    title: scheduleData.subject,
                    start: new Date(currentEventDate.getTime()),
                    end: new Date(currentEventDate.getTime() + (scheduleData.endTime.getTime() - scheduleData.startTime.getTime())),
                };

                console.log('currentEventDate:', currentEventDate);
                await this.saveEvent(newEvent);
            }

            const repeatNumber = scheduleData.repeatOption === 'Daily' ? 1 : 7;
            const updatedDate = new Date(currentEventDate.getTime());
            updatedDate.setDate(updatedDate.getDate() + 1);

            // Skip to the next selected day for weekly repetition
            if (scheduleData.repeatOption === 'Weekly' && scheduleData.selectedDays.length > 0) {
                while (!scheduleData.selectedDays.includes(updatedDate.getDay())) {
                    updatedDate.setDate(updatedDate.getDate() + 1);
                }
            }

            currentEventDate = updatedDate;
        }

        this.saveSchedule.emit(scheduleData);
        console.log(scheduleData.startTime);
        //super.save();
    }

    async saveEvent(eventData: any) {
        const saveEventData = {
            title: eventData.title,
            start: eventData.start,
            end: eventData.end,
        };
        this.item.startTime = eventData.start;
        this.item.endTime = eventData.end;
        await super.save();

        console.log('Saving event:', saveEventData);
    }*/





    async save() {
        const scheduleData = {
            subject: this.item.subject,
            startTime: this.item.startTime,
            endTime: this.item.endTime,
            ref: this.item.ref,
            repeatOption: this.optionSelected.option,
            repeatNumber: this.repeatNumber,
            endDate: this.endDate,
            selectedDays: [],
            savedScheduleId: this.item.id,
        };

        if (this.optionSelected.option === 'Weekly') {
            scheduleData.selectedDays = this.selectedDays.map(day => day);
        }

        console.log('scheduleData:', scheduleData);

        const lastEventDate = new Date(scheduleData.endDate);
        let currentEventDate = new Date(scheduleData.startTime);

        while (currentEventDate <= lastEventDate) {
            if (
                scheduleData.repeatOption === 'Daily' ||
                (scheduleData.repeatOption === 'Weekly' && (scheduleData.selectedDays.includes(currentEventDate.getDay()) || scheduleData.selectedDays.length === 0))
            ) {
                const newEvent = {
                    title: scheduleData.subject,
                    start: new Date(currentEventDate.getTime()),
                    end: new Date(currentEventDate.getTime() + (scheduleData.endTime.getTime() - scheduleData.startTime.getTime())),
                };

                console.log('currentEventDate:', currentEventDate);
                await this.saveEvent(newEvent, scheduleData.savedScheduleId);
            }

            const repeatNumber = scheduleData.repeatOption === 'Daily' ? 1 : 7;
            const updatedDate = new Date(currentEventDate.getTime());
            updatedDate.setDate(updatedDate.getDate() + repeatNumber);

            // Skip to the next selected day for weekly repetition
            if (scheduleData.repeatOption === 'Weekly' && scheduleData.selectedDays.length > 0) {
                while (!scheduleData.selectedDays.includes(updatedDate.getDay())) {
                    updatedDate.setDate(updatedDate.getDate() + 1);
                }
            }

            currentEventDate = updatedDate;
        }

        this.saveSchedule.emit(scheduleData);
        console.log(scheduleData.startTime);
    }

    async saveEvent(eventData: any, savedScheduleId: any) {
        const saveEventData = {
            title: eventData.title,
            start: eventData.start,
            end: eventData.end,
        };

        this.item.startTime = eventData.start;
        this.item.endTime = eventData.end;

        await super.save();

        console.log('Saving event:', saveEventData);
        console.log('Saved schedule ID:', savedScheduleId);
    }









    selectedDays: any[]=[];

    optionSelected: any = { option: 'Never' };
    repeatNumber = 1;
    endDate: Date = new Date();
    daysOptions = [
        {name: 'Sun', value: 0},
        {name: 'Mon', value: 1},
        {name: 'Tue', value: 2},
        {name: 'Wed', value: 3},
        {name: 'Thu', value: 4},
        {name: 'Fri', value: 5},
        {name: 'Sat', value: 6},
    ];
    repeats = [
        {option: 'Never'},
        {option: 'Daily'},
        {option: 'Weekly'},
    ];



    savehh() {
        const scheduleData = {
            subject: this.item.subject,
            startTime: this.item.startTime,
            endTime: this.item.endTime,
            ref: this.item.ref,
            repeatOption: this.optionSelected.option,
            repeatNumber: this.repeatNumber,
            endDate: this.endDate,
            selectedDays: [],
        };

        if (this.optionSelected.option === 'Weekly') {
            scheduleData.selectedDays = this.selectedDays.map(day => day);
        }

        console.log('scheduleData:', scheduleData);

        if (scheduleData.repeatOption === 'Never') {
            this.saveSchedule.emit(scheduleData);
            super.save();
        } else if (scheduleData.repeatOption === 'Daily') {
            this.saveDailySchedule(scheduleData);
        } else if (scheduleData.repeatOption === 'Weekly') {
            this.saveWeeklySchedule(scheduleData);
        }
    }

    saveDailySchedule(scheduleData: any) {
        const startDate = new Date(scheduleData.startTime);
        const endDate = new Date(scheduleData.endTime);

        let currentDate = new Date(startDate);

        while (currentDate <= endDate) {
            const newScheduleData = {
                ...scheduleData,
                startTime: currentDate,
                endTime: currentDate,
            };

            this.saveSchedule.emit(newScheduleData);
            super.save();

            currentDate.setDate(currentDate.getDate() + 1);
        }
    }

    saveWeeklySchedule(scheduleData: any) {
        const startDate = new Date(scheduleData.startTime);
        const endDate = new Date(scheduleData.endTime);
        const selectedDays = scheduleData.selectedDays;

        let currentDate = new Date(startDate);

        while (currentDate <= endDate) {
            const currentDay = currentDate.getDay();

            if (selectedDays.includes(currentDay)) {
                const newStartTime = new Date(currentDate.getFullYear(), currentDate.getMonth(), currentDate.getDate(), startDate.getHours(), startDate.getMinutes(), startDate.getSeconds());
                const newEndTime = new Date(currentDate.getFullYear(), currentDate.getMonth(), currentDate.getDate(), endDate.getHours(), endDate.getMinutes(), endDate.getSeconds());
              console.log('newEndTime',newEndTime);
                const newScheduleData = {
                    ...scheduleData,
                    startTime: newStartTime,
                    endTime: newEndTime,
                };
                console.log('newScheduleData',newScheduleData);

                this.saveSchedule.emit(newScheduleData);
                super.save();
            }

            currentDate.setDate(currentDate.getDate() + 1);
        }
    }





    updateSelectedDays($event: any) {
        this.selectedDays = $event;
    }

    public setValidation(value: boolean){
    }



    public validateForm(): void{
        this.errorMessages = new Array<string>();
    }




    public async openCreateProf(prof: string) {
    const isPermistted = await this.roleService.isPermitted('Prof', 'add');
    if(isPermistted) {
         this.prof = new ProfDto();
         this.createProfDialog = true;
    }else{
        this.messageService.add({
        severity: 'error', summary: 'erreur', detail: 'problème de permission'
        });
     }
    }

    get prof(): ProfDto {
        return this.profService.item;
    }
    set prof(value: ProfDto) {
        this.profService.item = value;
    }
    get profs(): Array<ProfDto> {
        return this.profService.items;
    }
    set profs(value: Array<ProfDto>) {
        this.profService.items = value;
    }
    get createProfDialog(): boolean {
       return this.profService.createDialog;
    }
    set createProfDialog(value: boolean) {
        this.profService.createDialog= value;
    }
    get groupeEtudiant(): GroupeEtudiantDto {
        return this.groupeEtudiantService.item;
    }
    set groupeEtudiant(value: GroupeEtudiantDto) {
        this.groupeEtudiantService.item = value;
    }
    get groupeEtudiants(): Array<GroupeEtudiantDto> {
        return this.groupeEtudiantService.items;
    }
    set groupeEtudiants(value: Array<GroupeEtudiantDto>) {
        this.groupeEtudiantService.items = value;
    }
    get createGroupeEtudiantDialog(): boolean {
       return this.groupeEtudiantService.createDialog;
    }
    set createGroupeEtudiantDialog(value: boolean) {
        this.groupeEtudiantService.createDialog= value;
    }
    get cours(): CoursDto {
        return this.coursService.item;
    }
    set cours(value: CoursDto) {
        this.coursService.item = value;
    }
    get courss(): Array<CoursDto> {
        return this.coursService.items;
    }
    set courss(value: Array<CoursDto>) {
        this.coursService.items = value;
    }
    get createCoursDialog(): boolean {
       return this.coursService.createDialog;
    }
    set createCoursDialog(value: boolean) {
        this.coursService.createDialog= value;
    }




    get validProfRef(): boolean {
        return this._validProfRef;
    }
    set validProfRef(value: boolean) {
        this._validProfRef = value;
    }
    get validCoursCode(): boolean {
        return this._validCoursCode;
    }
    set validCoursCode(value: boolean) {
        this._validCoursCode = value;
    }
    get validCoursLibelle(): boolean {
        return this._validCoursLibelle;
    }
    set validCoursLibelle(value: boolean) {
        this._validCoursLibelle = value;
    }



}
