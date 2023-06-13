package  ma.zsmart.engflexy.ws.converter;

import ma.zsmart.engflexy.bean.core.GroupeEtude;
import ma.zsmart.engflexy.bean.history.GroupeEtudeHistory;
import ma.zsmart.engflexy.ws.dto.GroupeEtudeDto;
import ma.zsmart.engflexy.zynerator.converter.AbstractConverter;
import ma.zsmart.engflexy.zynerator.util.StringUtil;
import org.springframework.stereotype.Component;

@Component
public class GroupeEtudeConverter extends AbstractConverter<GroupeEtude, GroupeEtudeDto, GroupeEtudeHistory> {


    public  GroupeEtudeConverter(){
        super(GroupeEtude.class, GroupeEtudeDto.class, GroupeEtudeHistory.class);
    }

    @Override
    public GroupeEtude toItem(GroupeEtudeDto dto) {
        if (dto == null) {
            return null;
        } else {
        GroupeEtude item = new GroupeEtude();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());
            if(StringUtil.isNotEmpty(dto.getDescription()))
                item.setDescription(dto.getDescription());
            if(StringUtil.isNotEmpty(dto.getNombreEtudiant()))
                item.setNombreEtudiant(dto.getNombreEtudiant());


        return item;
        }
    }

    @Override
    public GroupeEtudeDto toDto(GroupeEtude item) {
        if (item == null) {
            return null;
        } else {
            GroupeEtudeDto dto = new GroupeEtudeDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getLibelle()))
                dto.setLibelle(item.getLibelle());
            if(StringUtil.isNotEmpty(item.getDescription()))
                dto.setDescription(item.getDescription());
            if(StringUtil.isNotEmpty(item.getNombreEtudiant()))
                dto.setNombreEtudiant(item.getNombreEtudiant());


        return dto;
        }
    }


    public void initObject(boolean value) {
    }


}
