package  ma.zsmart.engflexy.ws.converter;

import ma.zsmart.engflexy.bean.core.LevelTestConfiguration;
import ma.zsmart.engflexy.bean.core.Parcours;
import ma.zsmart.engflexy.bean.history.LevelTestConfigurationHistory;
import ma.zsmart.engflexy.ws.dto.LevelTestConfigurationDto;
import ma.zsmart.engflexy.zynerator.converter.AbstractConverter;
import ma.zsmart.engflexy.zynerator.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LevelTestConfigurationConverter extends AbstractConverter<LevelTestConfiguration, LevelTestConfigurationDto, LevelTestConfigurationHistory> {

    @Autowired
    private ParcoursConverter parcoursConverter ;
    private boolean parcours;

    public  LevelTestConfigurationConverter(){
        super(LevelTestConfiguration.class, LevelTestConfigurationDto.class, LevelTestConfigurationHistory.class);
    }

    @Override
    public LevelTestConfiguration toItem(LevelTestConfigurationDto dto) {
        if (dto == null) {
            return null;
        } else {
        LevelTestConfiguration item = new LevelTestConfiguration();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getNoteMin()))
                item.setNoteMin(dto.getNoteMin());
            if(StringUtil.isNotEmpty(dto.getNoteMax()))
                item.setNoteMax(dto.getNoteMax());
            if(dto.getParcours() != null && dto.getParcours().getId() != null){
                item.setParcours(new Parcours());
                item.getParcours().setId(dto.getParcours().getId());
            }



        return item;
        }
    }

    @Override
    public LevelTestConfigurationDto toDto(LevelTestConfiguration item) {
        if (item == null) {
            return null;
        } else {
            LevelTestConfigurationDto dto = new LevelTestConfigurationDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getNoteMin()))
                dto.setNoteMin(item.getNoteMin());
            if(StringUtil.isNotEmpty(item.getNoteMax()))
                dto.setNoteMax(item.getNoteMax());
        if(this.parcours && item.getParcours()!=null) {
            dto.setParcours(parcoursConverter.toDto(item.getParcours())) ;
        }


        return dto;
        }
    }


    public void initObject(boolean value) {
        this.parcours = value;
    }


    public ParcoursConverter getParcoursConverter(){
        return this.parcoursConverter;
    }
    public void setParcoursConverter(ParcoursConverter parcoursConverter ){
        this.parcoursConverter = parcoursConverter;
    }
    public boolean  isParcours(){
        return this.parcours;
    }
    public void  setParcours(boolean parcours){
        this.parcours = parcours;
    }
}
