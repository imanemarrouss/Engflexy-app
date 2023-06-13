package  ma.zsmart.engflexy.ws.converter;

import ma.zsmart.engflexy.bean.core.Admin;
import ma.zsmart.engflexy.bean.history.AdminHistory;
import ma.zsmart.engflexy.ws.dto.AdminDto;
import ma.zsmart.engflexy.zynerator.converter.AbstractConverter;
import ma.zsmart.engflexy.zynerator.util.StringUtil;
import org.springframework.stereotype.Component;

@Component
public class AdminConverter extends AbstractConverter<Admin, AdminDto, AdminHistory> {


    public  AdminConverter(){
        super(Admin.class, AdminDto.class, AdminHistory.class);
    }

    @Override
    public Admin toItem(AdminDto dto) {
        if (dto == null) {
            return null;
        } else {
        Admin item = new Admin();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getDescription()))
                item.setDescription(dto.getDescription());


        return item;
        }
    }

    @Override
    public AdminDto toDto(Admin item) {
        if (item == null) {
            return null;
        } else {
            AdminDto dto = new AdminDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getDescription()))
                dto.setDescription(item.getDescription());


        return dto;
        }
    }

    @Override

    public void initObject(boolean value) {
        // This method is intentionally left empty.

    }


}
