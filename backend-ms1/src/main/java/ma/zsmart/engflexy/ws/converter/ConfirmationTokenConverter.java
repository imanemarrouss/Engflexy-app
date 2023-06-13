package  ma.zsmart.engflexy.ws.converter;

import ma.zsmart.engflexy.bean.core.ConfirmationToken;
import ma.zsmart.engflexy.bean.core.Etudiant;
import ma.zsmart.engflexy.bean.history.ConfirmationTokenHistory;
import ma.zsmart.engflexy.ws.dto.ConfirmationTokenDto;
import ma.zsmart.engflexy.zynerator.converter.AbstractConverter;
import ma.zsmart.engflexy.zynerator.util.DateUtil;
import ma.zsmart.engflexy.zynerator.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConfirmationTokenConverter extends AbstractConverter<ConfirmationToken, ConfirmationTokenDto, ConfirmationTokenHistory> {

    @Autowired
    private EtudiantConverter etudiantConverter ;
    private boolean etudiant;

    public  ConfirmationTokenConverter(){
        super(ConfirmationToken.class, ConfirmationTokenDto.class, ConfirmationTokenHistory.class);
    }

    @Override
    public ConfirmationToken toItem(ConfirmationTokenDto dto) {
        if (dto == null) {
            return null;
        } else {
        ConfirmationToken item = new ConfirmationToken();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getToken()))
                item.setToken(dto.getToken());
            if(StringUtil.isNotEmpty(dto.getExpiresAt()))
                item.setExpiresAt(DateUtil.stringEnToDate(dto.getExpiresAt()));
            if(StringUtil.isNotEmpty(dto.getCreatedAt()))
                item.setCreatedAt(DateUtil.stringEnToDate(dto.getCreatedAt()));
            if(StringUtil.isNotEmpty(dto.getConfirmedAt()))
                item.setConfirmedAt(DateUtil.stringEnToDate(dto.getConfirmedAt()));
            if(dto.getEtudiant() != null && dto.getEtudiant().getId() != null){
                item.setEtudiant(new Etudiant());
                item.getEtudiant().setId(dto.getEtudiant().getId());
            }



        return item;
        }
    }

    @Override
    public ConfirmationTokenDto toDto(ConfirmationToken item) {
        if (item == null) {
            return null;
        } else {
            ConfirmationTokenDto dto = new ConfirmationTokenDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getToken()))
                dto.setToken(item.getToken());
            if(item.getExpiresAt()!=null)
                dto.setExpiresAt(DateUtil.dateTimeToString(item.getExpiresAt()));
            if(item.getCreatedAt()!=null)
                dto.setCreatedAt(DateUtil.dateTimeToString(item.getCreatedAt()));
            if(item.getConfirmedAt()!=null)
                dto.setConfirmedAt(DateUtil.dateTimeToString(item.getConfirmedAt()));
        if(this.etudiant && item.getEtudiant()!=null) {
            dto.setEtudiant(etudiantConverter.toDto(item.getEtudiant())) ;
        }


        return dto;
        }
    }


    public void initObject(boolean value) {
        this.etudiant = value;
    }


    public EtudiantConverter getEtudiantConverter(){
        return this.etudiantConverter;
    }
    public void setEtudiantConverter(EtudiantConverter etudiantConverter ){
        this.etudiantConverter = etudiantConverter;
    }
    public boolean  isEtudiant(){
        return this.etudiant;
    }
    public void  setEtudiant(boolean etudiant){
        this.etudiant = etudiant;
    }
}
