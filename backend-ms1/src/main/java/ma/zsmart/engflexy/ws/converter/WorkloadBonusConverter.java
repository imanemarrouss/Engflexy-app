package  ma.zsmart.engflexy.ws.converter;

import ma.zsmart.engflexy.bean.core.WorkloadBonus;
import ma.zsmart.engflexy.bean.history.WorkloadBonusHistory;
import ma.zsmart.engflexy.ws.dto.WorkloadBonusDto;
import ma.zsmart.engflexy.zynerator.converter.AbstractConverter;
import ma.zsmart.engflexy.zynerator.util.StringUtil;
import org.springframework.stereotype.Component;

@Component
public class WorkloadBonusConverter extends AbstractConverter<WorkloadBonus, WorkloadBonusDto, WorkloadBonusHistory> {


    public  WorkloadBonusConverter(){
        super(WorkloadBonus.class, WorkloadBonusDto.class, WorkloadBonusHistory.class);
    }

    @Override
    public WorkloadBonus toItem(WorkloadBonusDto dto) {
        if (dto == null) {
            return null;
        } else {
        WorkloadBonus item = new WorkloadBonus();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getNombreSession()))
                item.setNombreSession(dto.getNombreSession());
            if(StringUtil.isNotEmpty(dto.getPrix()))
                item.setPrix(dto.getPrix());


        return item;
        }
    }

    @Override
    public WorkloadBonusDto toDto(WorkloadBonus item) {
        if (item == null) {
            return null;
        } else {
            WorkloadBonusDto dto = new WorkloadBonusDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if(StringUtil.isNotEmpty(item.getNombreSession()))
                dto.setNombreSession(item.getNombreSession());
            if(StringUtil.isNotEmpty(item.getPrix()))
                dto.setPrix(item.getPrix());


        return dto;
        }
    }


    public void initObject(boolean value) {
    }


}
