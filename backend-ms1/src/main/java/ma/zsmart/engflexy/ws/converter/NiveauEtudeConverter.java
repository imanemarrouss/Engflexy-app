package  ma.zsmart.engflexy.ws.converter;

import ma.zsmart.engflexy.bean.core.NiveauEtude;
import ma.zsmart.engflexy.bean.history.NiveauEtudeHistory;
import ma.zsmart.engflexy.ws.dto.NiveauEtudeDto;
import ma.zsmart.engflexy.zynerator.converter.AbstractConverter;
import ma.zsmart.engflexy.zynerator.util.StringUtil;
import org.springframework.stereotype.Component;

@Component
public class NiveauEtudeConverter extends AbstractConverter<NiveauEtude, NiveauEtudeDto, NiveauEtudeHistory> {


    public  NiveauEtudeConverter(){
        super(NiveauEtude.class, NiveauEtudeDto.class, NiveauEtudeHistory.class);
    }

    @Override
    public NiveauEtude toItem(NiveauEtudeDto dto) {
        if (dto == null) {
            return null;
        } else {
        NiveauEtude item = new NiveauEtude();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());


        return item;
        }
    }

    @Override
    public NiveauEtudeDto toDto(NiveauEtude item) {
        if (item == null) {
            return null;
        } else {
            NiveauEtudeDto dto = new NiveauEtudeDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getLibelle()))
                dto.setLibelle(item.getLibelle());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());


        return dto;
        }
    }


    public void initObject(boolean value) {
    }


}
