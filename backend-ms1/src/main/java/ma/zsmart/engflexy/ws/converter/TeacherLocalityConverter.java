package  ma.zsmart.engflexy.ws.converter;

import ma.zsmart.engflexy.bean.core.TeacherLocality;
import ma.zsmart.engflexy.bean.history.TeacherLocalityHistory;
import ma.zsmart.engflexy.ws.dto.TeacherLocalityDto;
import ma.zsmart.engflexy.zynerator.converter.AbstractConverterEnhanced;
import ma.zsmart.engflexy.zynerator.util.StringUtil;
import org.springframework.stereotype.Component;

@Component
public class TeacherLocalityConverter extends AbstractConverterEnhanced<TeacherLocality, TeacherLocalityDto, TeacherLocalityHistory> {


    public  TeacherLocalityConverter(){
        super(TeacherLocality.class, TeacherLocalityDto.class, TeacherLocalityHistory.class);
    }

    @Override
    public TeacherLocality toItem(TeacherLocalityDto dto) {
        if (dto == null) {
            return null;
        } else {
        TeacherLocality item = new TeacherLocality();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());


        convertRefentielAttribute(dto, item);
        return item;
        }
    }

    @Override
    public TeacherLocalityDto toDto(TeacherLocality item) {
        if (item == null) {
            return null;
        } else {
            TeacherLocalityDto dto = new TeacherLocalityDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if(StringUtil.isNotEmpty(item.getLibelle()))
                dto.setLibelle(item.getLibelle());


        convertRefentielAttribute(item, dto);
        return dto;
        }
    }


    public void initObject(boolean value) {
    }


}
