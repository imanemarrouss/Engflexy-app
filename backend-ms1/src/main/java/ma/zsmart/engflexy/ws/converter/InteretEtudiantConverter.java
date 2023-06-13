package  ma.zsmart.engflexy.ws.converter;

import ma.zsmart.engflexy.bean.core.InteretEtudiant;
import ma.zsmart.engflexy.bean.history.InteretEtudiantHistory;
import ma.zsmart.engflexy.ws.dto.InteretEtudiantDto;
import ma.zsmart.engflexy.zynerator.converter.AbstractConverter;
import ma.zsmart.engflexy.zynerator.util.StringUtil;
import org.springframework.stereotype.Component;

@Component
public class InteretEtudiantConverter extends AbstractConverter<InteretEtudiant, InteretEtudiantDto, InteretEtudiantHistory> {


    public  InteretEtudiantConverter(){
        super(InteretEtudiant.class, InteretEtudiantDto.class, InteretEtudiantHistory.class);
    }

    @Override
    public InteretEtudiant toItem(InteretEtudiantDto dto) {
        if (dto == null) {
            return null;
        } else {
        InteretEtudiant item = new InteretEtudiant();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());


        return item;
        }
    }

    @Override
    public InteretEtudiantDto toDto(InteretEtudiant item) {
        if (item == null) {
            return null;
        } else {
            InteretEtudiantDto dto = new InteretEtudiantDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if(StringUtil.isNotEmpty(item.getLibelle()))
                dto.setLibelle(item.getLibelle());


        return dto;
        }
    }


    public void initObject(boolean value) {
    }


}
