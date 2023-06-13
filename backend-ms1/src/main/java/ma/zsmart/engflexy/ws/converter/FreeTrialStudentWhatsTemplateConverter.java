package  ma.zsmart.engflexy.ws.converter;

import ma.zsmart.engflexy.bean.core.FreeTrialStudentWhatsTemplate;
import ma.zsmart.engflexy.bean.history.FreeTrialStudentWhatsTemplateHistory;
import ma.zsmart.engflexy.ws.dto.FreeTrialStudentWhatsTemplateDto;
import ma.zsmart.engflexy.zynerator.converter.AbstractConverter;
import ma.zsmart.engflexy.zynerator.util.StringUtil;
import org.springframework.stereotype.Component;

@Component
public class FreeTrialStudentWhatsTemplateConverter extends AbstractConverter<FreeTrialStudentWhatsTemplate, FreeTrialStudentWhatsTemplateDto, FreeTrialStudentWhatsTemplateHistory> {


    public  FreeTrialStudentWhatsTemplateConverter(){
        super(FreeTrialStudentWhatsTemplate.class, FreeTrialStudentWhatsTemplateDto.class, FreeTrialStudentWhatsTemplateHistory.class);
    }

    @Override
    public FreeTrialStudentWhatsTemplate toItem(FreeTrialStudentWhatsTemplateDto dto) {
        if (dto == null) {
            return null;
        } else {
        FreeTrialStudentWhatsTemplate item = new FreeTrialStudentWhatsTemplate();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getObject()))
                item.setObject(dto.getObject());
            if(StringUtil.isNotEmpty(dto.getCorps()))
                item.setCorps(dto.getCorps());
            if(StringUtil.isNotEmpty(dto.getSource()))
                item.setSource(dto.getSource());


        return item;
        }
    }

    @Override
    public FreeTrialStudentWhatsTemplateDto toDto(FreeTrialStudentWhatsTemplate item) {
        if (item == null) {
            return null;
        } else {
            FreeTrialStudentWhatsTemplateDto dto = new FreeTrialStudentWhatsTemplateDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getObject()))
                dto.setObject(item.getObject());
            if(StringUtil.isNotEmpty(item.getCorps()))
                dto.setCorps(item.getCorps());
            if(StringUtil.isNotEmpty(item.getSource()))
                dto.setSource(item.getSource());


        return dto;
        }
    }


    public void initObject(boolean value) {
    }


}
