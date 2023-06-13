package  ma.zsmart.engflexy.ws.converter;

import ma.zsmart.engflexy.bean.core.StatutSocial;
import ma.zsmart.engflexy.bean.history.StatutSocialHistory;
import ma.zsmart.engflexy.ws.dto.StatutSocialDto;
import ma.zsmart.engflexy.zynerator.converter.AbstractConverter;
import ma.zsmart.engflexy.zynerator.util.StringUtil;
import org.springframework.stereotype.Component;

@Component
public class StatutSocialConverter extends AbstractConverter<StatutSocial, StatutSocialDto, StatutSocialHistory> {


    public  StatutSocialConverter(){
        super(StatutSocial.class, StatutSocialDto.class, StatutSocialHistory.class);
    }

    @Override
    public StatutSocial toItem(StatutSocialDto dto) {
        if (dto == null) {
            return null;
        } else {
        StatutSocial item = new StatutSocial();
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
    public StatutSocialDto toDto(StatutSocial item) {
        if (item == null) {
            return null;
        } else {
            StatutSocialDto dto = new StatutSocialDto();
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
