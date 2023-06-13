package  ma.zsmart.engflexy.ws.converter;

import ma.zsmart.engflexy.bean.core.FaqType;
import ma.zsmart.engflexy.bean.history.FaqTypeHistory;
import ma.zsmart.engflexy.ws.dto.FaqTypeDto;
import ma.zsmart.engflexy.zynerator.converter.AbstractConverter;
import ma.zsmart.engflexy.zynerator.util.StringUtil;
import org.springframework.stereotype.Component;

@Component
public class FaqTypeConverter extends AbstractConverter<FaqType, FaqTypeDto, FaqTypeHistory> {


    public  FaqTypeConverter(){
        super(FaqType.class, FaqTypeDto.class, FaqTypeHistory.class);
    }

    @Override
    public FaqType toItem(FaqTypeDto dto) {
        if (dto == null) {
            return null;
        } else {
        FaqType item = new FaqType();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getDestinataire()))
                item.setDestinataire(dto.getDestinataire());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());


        return item;
        }
    }

    @Override
    public FaqTypeDto toDto(FaqType item) {
        if (item == null) {
            return null;
        } else {
            FaqTypeDto dto = new FaqTypeDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getDestinataire()))
                dto.setDestinataire(item.getDestinataire());
            if(StringUtil.isNotEmpty(item.getLibelle()))
                dto.setLibelle(item.getLibelle());


        return dto;
        }
    }


    public void initObject(boolean value) {
    }


}
