package  ma.zsmart.engflexy.ws.converter;

import ma.zsmart.engflexy.bean.core.StatutFreeTrial;
import ma.zsmart.engflexy.bean.history.StatutFreeTrialHistory;
import ma.zsmart.engflexy.ws.dto.StatutFreeTrialDto;
import ma.zsmart.engflexy.zynerator.converter.AbstractConverter;
import ma.zsmart.engflexy.zynerator.util.StringUtil;
import org.springframework.stereotype.Component;

@Component
public class StatutFreeTrialConverter extends AbstractConverter<StatutFreeTrial, StatutFreeTrialDto, StatutFreeTrialHistory> {


    public  StatutFreeTrialConverter(){
        super(StatutFreeTrial.class, StatutFreeTrialDto.class, StatutFreeTrialHistory.class);
    }

    @Override
    public StatutFreeTrial toItem(StatutFreeTrialDto dto) {
        if (dto == null) {
            return null;
        } else {
        StatutFreeTrial item = new StatutFreeTrial();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getStyle()))
                item.setStyle(dto.getStyle());


        return item;
        }
    }

    @Override
    public StatutFreeTrialDto toDto(StatutFreeTrial item) {
        if (item == null) {
            return null;
        } else {
            StatutFreeTrialDto dto = new StatutFreeTrialDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getLibelle()))
                dto.setLibelle(item.getLibelle());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if(StringUtil.isNotEmpty(item.getStyle()))
                dto.setStyle(item.getStyle());


        return dto;
        }
    }


    public void initObject(boolean value) {
    }


}
