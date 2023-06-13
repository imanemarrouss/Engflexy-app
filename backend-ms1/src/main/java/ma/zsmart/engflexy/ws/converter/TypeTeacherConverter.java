package  ma.zsmart.engflexy.ws.converter;

import ma.zsmart.engflexy.bean.core.TypeTeacher;
import ma.zsmart.engflexy.bean.history.TypeTeacherHistory;
import ma.zsmart.engflexy.ws.dto.TypeTeacherDto;
import ma.zsmart.engflexy.zynerator.converter.AbstractConverter;
import ma.zsmart.engflexy.zynerator.util.StringUtil;
import org.springframework.stereotype.Component;

@Component
public class TypeTeacherConverter extends AbstractConverter<TypeTeacher, TypeTeacherDto, TypeTeacherHistory> {


    public  TypeTeacherConverter(){
        super(TypeTeacher.class, TypeTeacherDto.class, TypeTeacherHistory.class);
    }

    @Override
    public TypeTeacher toItem(TypeTeacherDto dto) {
        if (dto == null) {
            return null;
        } else {
        TypeTeacher item = new TypeTeacher();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());


        return item;
        }
    }

    @Override
    public TypeTeacherDto toDto(TypeTeacher item) {
        if (item == null) {
            return null;
        } else {
            TypeTeacherDto dto = new TypeTeacherDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getLibelle()))
                dto.setLibelle(item.getLibelle());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());


        return dto;
        }
    }


    public void initObject(boolean value) {
    }


}
