package  ma.zsmart.engflexy.ws.converter;

import ma.zsmart.engflexy.bean.core.TypeReclamationEtudiant;
import ma.zsmart.engflexy.bean.history.TypeReclamationEtudiantHistory;
import ma.zsmart.engflexy.ws.dto.TypeReclamationEtudiantDto;
import ma.zsmart.engflexy.zynerator.converter.AbstractConverter;
import ma.zsmart.engflexy.zynerator.util.StringUtil;
import org.springframework.stereotype.Component;

@Component
public class TypeReclamationEtudiantConverter extends AbstractConverter<TypeReclamationEtudiant, TypeReclamationEtudiantDto, TypeReclamationEtudiantHistory> {


    public  TypeReclamationEtudiantConverter(){
        super(TypeReclamationEtudiant.class, TypeReclamationEtudiantDto.class, TypeReclamationEtudiantHistory.class);
    }

    @Override
    public TypeReclamationEtudiant toItem(TypeReclamationEtudiantDto dto) {
        if (dto == null) {
            return null;
        } else {
        TypeReclamationEtudiant item = new TypeReclamationEtudiant();
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
    public TypeReclamationEtudiantDto toDto(TypeReclamationEtudiant item) {
        if (item == null) {
            return null;
        } else {
            TypeReclamationEtudiantDto dto = new TypeReclamationEtudiantDto();
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
