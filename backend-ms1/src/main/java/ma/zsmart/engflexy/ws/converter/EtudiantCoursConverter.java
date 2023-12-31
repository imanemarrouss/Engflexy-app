package  ma.zsmart.engflexy.ws.converter;

import ma.zsmart.engflexy.bean.core.Cours;
import ma.zsmart.engflexy.bean.core.Etudiant;
import ma.zsmart.engflexy.bean.core.EtudiantCours;
import ma.zsmart.engflexy.bean.core.Prof;
import ma.zsmart.engflexy.bean.history.EtudiantCoursHistory;
import ma.zsmart.engflexy.ws.dto.EtudiantCoursDto;
import ma.zsmart.engflexy.zynerator.converter.AbstractConverter;
import ma.zsmart.engflexy.zynerator.util.DateUtil;
import ma.zsmart.engflexy.zynerator.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EtudiantCoursConverter extends AbstractConverter<EtudiantCours, EtudiantCoursDto, EtudiantCoursHistory> {

    @Autowired
    private ProfConverter profConverter ;
    @Autowired
    private EtudiantConverter etudiantConverter ;
    @Autowired
    private CoursConverter coursConverter ;
    private boolean etudiant;
    private boolean prof;
    private boolean cours;

    public  EtudiantCoursConverter(){
        super(EtudiantCours.class, EtudiantCoursDto.class, EtudiantCoursHistory.class);
    }

    @Override
    public EtudiantCours toItem(EtudiantCoursDto dto) {
        if (dto == null) {
            return null;
        } else {
        EtudiantCours item = new EtudiantCours();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(dto.getPayer() != null)
                item.setPayer(dto.getPayer());
            if(StringUtil.isNotEmpty(dto.getDateFin()))
                item.setDateFin(DateUtil.stringEnToDate(dto.getDateFin()));
            if(dto.getEtudiant() != null && dto.getEtudiant().getId() != null){
                item.setEtudiant(new Etudiant());
                item.getEtudiant().setId(dto.getEtudiant().getId());
            }

            if(dto.getProf() != null && dto.getProf().getId() != null){
                item.setProf(new Prof());
                item.getProf().setId(dto.getProf().getId());
            }

            if(dto.getCours() != null && dto.getCours().getId() != null){
                item.setCours(new Cours());
                item.getCours().setId(dto.getCours().getId());
            }



        return item;
        }
    }

    @Override
    public EtudiantCoursDto toDto(EtudiantCours item) {
        if (item == null) {
            return null;
        } else {
            EtudiantCoursDto dto = new EtudiantCoursDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
                dto.setPayer(item.getPayer());
            if(item.getDateFin()!=null)
                dto.setDateFin(DateUtil.dateTimeToString(item.getDateFin()));
        if(this.etudiant && item.getEtudiant()!=null) {
            dto.setEtudiant(etudiantConverter.toDto(item.getEtudiant())) ;
        }
        if(this.prof && item.getProf()!=null) {
            dto.setProf(profConverter.toDto(item.getProf())) ;
        }
        if(this.cours && item.getCours()!=null) {
            dto.setCours(coursConverter.toDto(item.getCours())) ;
        }


        return dto;
        }
    }


    public void initObject(boolean value) {
        this.etudiant = value;
        this.prof = value;
        this.cours = value;
    }


    public ProfConverter getProfConverter(){
        return this.profConverter;
    }
    public void setProfConverter(ProfConverter profConverter ){
        this.profConverter = profConverter;
    }
    public EtudiantConverter getEtudiantConverter(){
        return this.etudiantConverter;
    }
    public void setEtudiantConverter(EtudiantConverter etudiantConverter ){
        this.etudiantConverter = etudiantConverter;
    }
    public CoursConverter getCoursConverter(){
        return this.coursConverter;
    }
    public void setCoursConverter(CoursConverter coursConverter ){
        this.coursConverter = coursConverter;
    }
    public boolean  isEtudiant(){
        return this.etudiant;
    }
    public void  setEtudiant(boolean etudiant){
        this.etudiant = etudiant;
    }
    public boolean  isProf(){
        return this.prof;
    }
    public void  setProf(boolean prof){
        this.prof = prof;
    }
    public boolean  isCours(){
        return this.cours;
    }
    public void  setCours(boolean cours){
        this.cours = cours;
    }
}
