import {Component, OnInit} from '@angular/core';
import {CategorieProfService} from 'src/app/controller/service/CategorieProf.service';
import {CategorieProfDto} from 'src/app/controller/model/CategorieProf.model';
import {CategorieProfCriteria} from 'src/app/controller/criteria/CategorieProfCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';


import {ProfDto} from 'src/app/controller/model/Prof.model';


@Component({
  selector: 'app-categorie-prof-list-admin',
  templateUrl: './categorie-prof-list-admin.component.html'
})
export class CategorieProfListAdminComponent extends AbstractListController<CategorieProfDto, CategorieProfCriteria, CategorieProfService>  implements OnInit {

    fileName = 'CategorieProf';

  
    constructor(categorieProfService: CategorieProfService) {
        super(categorieProfService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
    }

    public async loadCategorieProfs(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('CategorieProf', 'list');
        isPermistted ? this.service.findAll().subscribe(categorieProfs => this.items = categorieProfs,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'problème d\'autorisation'});
    }


    public initCol() {
        this.cols = [
            {field: 'code', header: 'Code'},
            {field: 'level', header: 'Level'},
            {field: 'lessonRate', header: 'Lesson rate'},
        ];
    }



	public initDuplicate(res: CategorieProfDto) {
        if (res.profs != null) {
             res.profs.forEach(d => { d.categorieProf = null; d.id = null; });
        }
	}

   public prepareColumnExport() : void {
        this.exportData = this.items.map(e => {
            return {
                 'Code': e.code ,
                 'Level': e.level ,
                 'Lesson rate': e.lessonRate ,
            }
        });

        this.criteriaData = [{
            'Code': this.criteria.code ? this.criteria.code : environment.emptyForExport ,
            'Level': this.criteria.level ? this.criteria.level : environment.emptyForExport ,
            'Lesson rate Min': this.criteria.lessonRateMin ? this.criteria.lessonRateMin : environment.emptyForExport ,
            'Lesson rate Max': this.criteria.lessonRateMax ? this.criteria.lessonRateMax : environment.emptyForExport ,
        }];
      }
}
