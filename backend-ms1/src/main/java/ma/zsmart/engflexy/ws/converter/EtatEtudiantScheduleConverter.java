package  ma.zsmart.engflexy.ws.converter;

import ma.zsmart.engflexy.bean.core.EtatEtudiantSchedule;
import ma.zsmart.engflexy.bean.history.EtatEtudiantScheduleHistory;
import ma.zsmart.engflexy.ws.dto.EtatEtudiantScheduleDto;
import ma.zsmart.engflexy.zynerator.converter.AbstractConverter;
import ma.zsmart.engflexy.zynerator.util.StringUtil;
import org.springframework.stereotype.Component;

@Component
public class EtatEtudiantScheduleConverter extends AbstractConverter<EtatEtudiantSchedule, EtatEtudiantScheduleDto, EtatEtudiantScheduleHistory> {


    public  EtatEtudiantScheduleConverter(){
        super(EtatEtudiantSchedule.class, EtatEtudiantScheduleDto.class, EtatEtudiantScheduleHistory.class);
    }

    @Override
    public EtatEtudiantSchedule toItem(EtatEtudiantScheduleDto dto) {
        if (dto == null) {
            return null;
        } else {
        EtatEtudiantSchedule item = new EtatEtudiantSchedule();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getRef()))
                item.setRef(dto.getRef());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());
            if(StringUtil.isNotEmpty(dto.getCouleur()))
                item.setCouleur(dto.getCouleur());


        return item;
        }
    }

    @Override
    public EtatEtudiantScheduleDto toDto(EtatEtudiantSchedule item) {
        if (item == null) {
            return null;
        } else {
            EtatEtudiantScheduleDto dto = new EtatEtudiantScheduleDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getRef()))
                dto.setRef(item.getRef());
            if(StringUtil.isNotEmpty(item.getLibelle()))
                dto.setLibelle(item.getLibelle());
            if(StringUtil.isNotEmpty(item.getCouleur()))
                dto.setCouleur(item.getCouleur());


        return dto;
        }
    }


    public void initObject(boolean value) {
    }


}
