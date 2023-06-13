package  ma.zsmart.engflexy.ws.converter;

import ma.zsmart.engflexy.bean.core.Skill;
import ma.zsmart.engflexy.bean.history.SkillHistory;
import ma.zsmart.engflexy.ws.dto.SkillDto;
import ma.zsmart.engflexy.zynerator.converter.AbstractConverter;
import ma.zsmart.engflexy.zynerator.util.StringUtil;
import org.springframework.stereotype.Component;

@Component
public class SkillConverter extends AbstractConverter<Skill, SkillDto, SkillHistory> {


    public  SkillConverter(){
        super(Skill.class, SkillDto.class, SkillHistory.class);
    }

    @Override
    public Skill toItem(SkillDto dto) {
        if (dto == null) {
            return null;
        } else {
        Skill item = new Skill();
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
    public SkillDto toDto(Skill item) {
        if (item == null) {
            return null;
        } else {
            SkillDto dto = new SkillDto();
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
