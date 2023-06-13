package  ma.zsmart.engflexy.ws.converter;

import ma.zsmart.engflexy.bean.core.Langue;
import ma.zsmart.engflexy.bean.history.LangueHistory;
import ma.zsmart.engflexy.ws.dto.LangueDto;
import ma.zsmart.engflexy.zynerator.converter.AbstractConverter;
import ma.zsmart.engflexy.zynerator.util.StringUtil;
import org.springframework.stereotype.Component;

@Component
public class LangueConverter extends AbstractConverter<Langue, LangueDto, LangueHistory> {


    public  LangueConverter(){
        super(Langue.class, LangueDto.class, LangueHistory.class);
    }

    @Override
    public Langue toItem(LangueDto dto) {
        if (dto == null) {
            return null;
        } else {
        Langue item = new Langue();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getRef()))
                item.setRef(dto.getRef());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());


        return item;
        }
    }

    @Override
    public LangueDto toDto(Langue item) {
        if (item == null) {
            return null;
        } else {
            LangueDto dto = new LangueDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getRef()))
                dto.setRef(item.getRef());
            if(StringUtil.isNotEmpty(item.getLibelle()))
                dto.setLibelle(item.getLibelle());


        return dto;
        }
    }


    public void initObject(boolean value) {
    }


}
