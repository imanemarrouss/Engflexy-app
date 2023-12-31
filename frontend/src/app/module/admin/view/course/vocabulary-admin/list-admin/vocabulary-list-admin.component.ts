import {Component, OnInit} from '@angular/core';
import {VocabularyService} from 'src/app/controller/service/Vocabulary.service';
import {VocabularyDto} from 'src/app/controller/model/Vocabulary.model';
import {VocabularyCriteria} from 'src/app/controller/criteria/VocabularyCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';

import { SectionService } from 'src/app/controller/service/Section.service';
import { VocabularyQuizService } from 'src/app/controller/service/VocabularyQuiz.service';

import {VocabularyQuizDto} from 'src/app/controller/model/VocabularyQuiz.model';
import {SectionDto} from 'src/app/controller/model/Section.model';


@Component({
    selector: 'app-vocabulary-list-admin',
    templateUrl: './vocabulary-list-admin.component.html'
})
export class VocabularyListAdminComponent extends AbstractListController<VocabularyDto, VocabularyCriteria, VocabularyService>  implements OnInit {

    fileName = 'Vocabulary';

    sections :Array<SectionDto>;
    vocabularyQuizs :Array<VocabularyQuizDto>;
    imgUrl: string;
    visibleSidebar: boolean;


    constructor(vocabularyService: VocabularyService, private sectionService: SectionService, private vocabularyQuizService: VocabularyQuizService) {
        super(vocabularyService);
    }

    ngOnInit() : void {
        this.findPaginatedByCriteria();
        this.initExport();
        this.initCol();
        this.loadSection();
        this.loadVocabularyQuiz();
    }

    public async loadVocabularys(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Vocabulary', 'list');
        isPermistted ? this.service.findAll().subscribe(vocabularys => this.items = vocabularys,error=>console.log(error))
            : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'problème d\'autorisation'});
    }
    showImage(imgUrl: string) {
        this.imgUrl = imgUrl;
        this.visibleSidebar = true;
    }

    public initCol() {
        this.cols = [
            {field: 'ref', header: 'Ref'},
            {field: 'numero', header: 'Numero'},
            {field: 'word', header: 'Word'},
            {field: 'libelle', header: 'Libelle'},
            {field: 'result', header: 'Result'},
            {field: 'explication', header: 'Explication'},
            {field: 'exemple', header: 'Exemple'},
            {field: 'image', header: 'Image'},
            {field: 'section?.code', header: 'Section'},
            {field: 'vocabularyQuiz?.libelle', header: 'Vocabulary quiz'},
        ];
    }


    public async loadSection(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Vocabulary', 'list');
        isPermistted ? this.sectionService.findAllOptimized().subscribe(sections => this.sections = sections,error=>console.log(error))
            : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }
    public async loadVocabularyQuiz(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Vocabulary', 'list');
        isPermistted ? this.vocabularyQuizService.findAllOptimized().subscribe(vocabularyQuizs => this.vocabularyQuizs = vocabularyQuizs,error=>console.log(error))
            : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }

    public initDuplicate(res: VocabularyDto) {
    }

    public prepareColumnExport() : void {
        this.exportData = this.items.map(e => {
            return {
                'Ref': e.ref ,
                'Numero': e.numero ,
                'Word': e.word ,
                'Libelle': e.libelle ,
                'Result': e.result ,
                'Explication': e.explication ,
                'Exemple': e.exemple ,
                'Image': e.image ,
                'Section': e.section?.code ,
                'Vocabulary quiz': e.vocabularyQuiz?.libelle ,
            }
        });

        this.criteriaData = [{
            'Ref': this.criteria.ref ? this.criteria.ref : environment.emptyForExport ,
            'Numero Min': this.criteria.numeroMin ? this.criteria.numeroMin : environment.emptyForExport ,
            'Numero Max': this.criteria.numeroMax ? this.criteria.numeroMax : environment.emptyForExport ,
            'Word': this.criteria.word ? this.criteria.word : environment.emptyForExport ,
            'Libelle': this.criteria.libelle ? this.criteria.libelle : environment.emptyForExport ,
            'Result': this.criteria.result ? this.criteria.result : environment.emptyForExport ,
            'Explication': this.criteria.explication ? this.criteria.explication : environment.emptyForExport ,
            'Exemple': this.criteria.exemple ? this.criteria.exemple : environment.emptyForExport ,
            'Image': this.criteria.image ? this.criteria.image : environment.emptyForExport ,
            //'Section': this.criteria.section?.code ? this.criteria.section?.code : environment.emptyForExport ,
            //'Vocabulary quiz': this.criteria.vocabularyQuiz?.libelle ? this.criteria.vocabularyQuiz?.libelle : environment.emptyForExport ,
        }];
    }
}
