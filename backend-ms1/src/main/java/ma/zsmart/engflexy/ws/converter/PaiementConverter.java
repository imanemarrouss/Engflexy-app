package  ma.zsmart.engflexy.ws.converter;

import ma.zsmart.engflexy.bean.core.GroupeEtudiant;
import ma.zsmart.engflexy.bean.core.Paiement;
import ma.zsmart.engflexy.bean.core.Prof;
import ma.zsmart.engflexy.bean.history.PaiementHistory;
import ma.zsmart.engflexy.ws.dto.PaiementDto;
import ma.zsmart.engflexy.zynerator.converter.AbstractConverter;
import ma.zsmart.engflexy.zynerator.util.DateUtil;
import ma.zsmart.engflexy.zynerator.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaiementConverter extends AbstractConverter<Paiement, PaiementDto, PaiementHistory> {

    @Autowired
    private ProfConverter profConverter ;
    @Autowired
    private GroupeEtudiantConverter groupeEtudiantConverter ;
    private boolean prof;
    private boolean groupeEtudiant;

    public  PaiementConverter(){
        super(Paiement.class, PaiementDto.class, PaiementHistory.class);
    }

    @Override
    public Paiement toItem(PaiementDto dto) {
        if (dto == null) {
            return null;
        } else {
        Paiement item = new Paiement();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getDatePaiement()))
                item.setDatePaiement(DateUtil.stringEnToDate(dto.getDatePaiement()));
            if(dto.getProf() != null && dto.getProf().getId() != null){
                item.setProf(new Prof());
                item.getProf().setId(dto.getProf().getId());
            }

            if(dto.getGroupeEtudiant() != null && dto.getGroupeEtudiant().getId() != null){
                item.setGroupeEtudiant(new GroupeEtudiant());
                item.getGroupeEtudiant().setId(dto.getGroupeEtudiant().getId());
            }



        return item;
        }
    }

    @Override
    public PaiementDto toDto(Paiement item) {
        if (item == null) {
            return null;
        } else {
            PaiementDto dto = new PaiementDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(item.getDatePaiement()!=null)
                dto.setDatePaiement(DateUtil.dateTimeToString(item.getDatePaiement()));
        if(this.prof && item.getProf()!=null) {
            dto.setProf(profConverter.toDto(item.getProf())) ;
        }
        if(this.groupeEtudiant && item.getGroupeEtudiant()!=null) {
            dto.setGroupeEtudiant(groupeEtudiantConverter.toDto(item.getGroupeEtudiant())) ;
        }


        return dto;
        }
    }


    public void initObject(boolean value) {
        this.prof = value;
        this.groupeEtudiant = value;
    }


    public ProfConverter getProfConverter(){
        return this.profConverter;
    }
    public void setProfConverter(ProfConverter profConverter ){
        this.profConverter = profConverter;
    }
    public GroupeEtudiantConverter getGroupeEtudiantConverter(){
        return this.groupeEtudiantConverter;
    }
    public void setGroupeEtudiantConverter(GroupeEtudiantConverter groupeEtudiantConverter ){
        this.groupeEtudiantConverter = groupeEtudiantConverter;
    }
    public boolean  isProf(){
        return this.prof;
    }
    public void  setProf(boolean prof){
        this.prof = prof;
    }
    public boolean  isGroupeEtudiant(){
        return this.groupeEtudiant;
    }
    public void  setGroupeEtudiant(boolean groupeEtudiant){
        this.groupeEtudiant = groupeEtudiant;
    }
}
