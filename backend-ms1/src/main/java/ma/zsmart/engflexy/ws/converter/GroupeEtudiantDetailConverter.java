package  ma.zsmart.engflexy.ws.converter;

import ma.zsmart.engflexy.bean.core.Etudiant;
import ma.zsmart.engflexy.bean.core.GroupeEtudiant;
import ma.zsmart.engflexy.bean.core.GroupeEtudiantDetail;
import ma.zsmart.engflexy.bean.history.GroupeEtudiantDetailHistory;
import ma.zsmart.engflexy.ws.dto.GroupeEtudiantDetailDto;
import ma.zsmart.engflexy.zynerator.converter.AbstractConverter;
import ma.zsmart.engflexy.zynerator.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GroupeEtudiantDetailConverter extends AbstractConverter<GroupeEtudiantDetail, GroupeEtudiantDetailDto, GroupeEtudiantDetailHistory> {

    @Autowired
    private EtudiantConverter etudiantConverter ;
    @Autowired
    private GroupeEtudiantConverter groupeEtudiantConverter ;
    private boolean groupeEtudiant;
    private boolean etudiant;

    public  GroupeEtudiantDetailConverter(){
        super(GroupeEtudiantDetail.class, GroupeEtudiantDetailDto.class, GroupeEtudiantDetailHistory.class);
    }

    @Override
    public GroupeEtudiantDetail toItem(GroupeEtudiantDetailDto dto) {
        if (dto == null) {
            return null;
        } else {
        GroupeEtudiantDetail item = new GroupeEtudiantDetail();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(dto.getGroupeEtudiant() != null && dto.getGroupeEtudiant().getId() != null){
                item.setGroupeEtudiant(new GroupeEtudiant());
                item.getGroupeEtudiant().setId(dto.getGroupeEtudiant().getId());
            }

            if(dto.getEtudiant() != null && dto.getEtudiant().getId() != null){
                item.setEtudiant(new Etudiant());
                item.getEtudiant().setId(dto.getEtudiant().getId());
            }



        return item;
        }
    }

    @Override
    public GroupeEtudiantDetailDto toDto(GroupeEtudiantDetail item) {
        if (item == null) {
            return null;
        } else {
            GroupeEtudiantDetailDto dto = new GroupeEtudiantDetailDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
        if(this.groupeEtudiant && item.getGroupeEtudiant()!=null) {
            dto.setGroupeEtudiant(groupeEtudiantConverter.toDto(item.getGroupeEtudiant())) ;
        }
        if(this.etudiant && item.getEtudiant()!=null) {
            dto.setEtudiant(etudiantConverter.toDto(item.getEtudiant())) ;
        }


        return dto;
        }
    }


    public void initObject(boolean value) {
        this.groupeEtudiant = value;
        this.etudiant = value;
    }


    public EtudiantConverter getEtudiantConverter(){
        return this.etudiantConverter;
    }
    public void setEtudiantConverter(EtudiantConverter etudiantConverter ){
        this.etudiantConverter = etudiantConverter;
    }
    public GroupeEtudiantConverter getGroupeEtudiantConverter(){
        return this.groupeEtudiantConverter;
    }
    public void setGroupeEtudiantConverter(GroupeEtudiantConverter groupeEtudiantConverter ){
        this.groupeEtudiantConverter = groupeEtudiantConverter;
    }
    public boolean  isGroupeEtudiant(){
        return this.groupeEtudiant;
    }
    public void  setGroupeEtudiant(boolean groupeEtudiant){
        this.groupeEtudiant = groupeEtudiant;
    }
    public boolean  isEtudiant(){
        return this.etudiant;
    }
    public void  setEtudiant(boolean etudiant){
        this.etudiant = etudiant;
    }
}
