package  ma.zsmart.engflexy.ws.converter;

import ma.zsmart.engflexy.bean.core.TypeReclamationProf;
import ma.zsmart.engflexy.bean.history.TypeReclamationProfHistory;
import ma.zsmart.engflexy.ws.dto.TypeReclamationProfDto;
import ma.zsmart.engflexy.zynerator.converter.AbstractConverter;
import ma.zsmart.engflexy.zynerator.util.StringUtil;
import org.springframework.stereotype.Component;

@Component
public class TypeReclamationProfConverter extends AbstractConverter<TypeReclamationProf, TypeReclamationProfDto, TypeReclamationProfHistory> {


    public  TypeReclamationProfConverter(){
        super(TypeReclamationProf.class, TypeReclamationProfDto.class, TypeReclamationProfHistory.class);
    }

    @Override
    public TypeReclamationProf toItem(TypeReclamationProfDto dto) {
        if (dto == null) {
            return null;
        } else {
        TypeReclamationProf item = new TypeReclamationProf();
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
    public TypeReclamationProfDto toDto(TypeReclamationProf item) {
        if (item == null) {
            return null;
        } else {
            TypeReclamationProfDto dto = new TypeReclamationProfDto();
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
