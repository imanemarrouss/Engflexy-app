package  ma.zsmart.engflexy.ws.converter;

import ma.zsmart.engflexy.bean.core.Fonction;
import ma.zsmart.engflexy.bean.history.FonctionHistory;
import ma.zsmart.engflexy.ws.dto.FonctionDto;
import ma.zsmart.engflexy.zynerator.converter.AbstractConverter;
import ma.zsmart.engflexy.zynerator.util.StringUtil;
import org.springframework.stereotype.Component;

@Component
public class FonctionConverter extends AbstractConverter<Fonction, FonctionDto, FonctionHistory> {


    public  FonctionConverter(){
        super(Fonction.class, FonctionDto.class, FonctionHistory.class);
    }

    @Override
    public Fonction toItem(FonctionDto dto) {
        if (dto == null) {
            return null;
        } else {
        Fonction item = new Fonction();
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
    public FonctionDto toDto(Fonction item) {
        if (item == null) {
            return null;
        } else {
            FonctionDto dto = new FonctionDto();
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
