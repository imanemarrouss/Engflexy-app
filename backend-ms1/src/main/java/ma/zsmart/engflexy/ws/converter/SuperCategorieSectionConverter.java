package  ma.zsmart.engflexy.ws.converter;

import ma.zsmart.engflexy.bean.core.SuperCategorieSection;
import ma.zsmart.engflexy.bean.history.SuperCategorieSectionHistory;
import ma.zsmart.engflexy.ws.dto.SuperCategorieSectionDto;
import ma.zsmart.engflexy.zynerator.converter.AbstractConverter;
import ma.zsmart.engflexy.zynerator.util.ListUtil;
import ma.zsmart.engflexy.zynerator.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SuperCategorieSectionConverter extends AbstractConverter<SuperCategorieSection, SuperCategorieSectionDto, SuperCategorieSectionHistory> {

    @Autowired
    private SectionConverter sectionConverter ;
    @Autowired
    private CategorieSectionConverter categorieSectionConverter ;
    private boolean categorieSections;

    public  SuperCategorieSectionConverter(){
        super(SuperCategorieSection.class, SuperCategorieSectionDto.class, SuperCategorieSectionHistory.class);
        init(true);
    }

    @Override
    public SuperCategorieSection toItem(SuperCategorieSectionDto dto) {
        if (dto == null) {
            return null;
        } else {
        SuperCategorieSection item = new SuperCategorieSection();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());

            if(this.categorieSections && ListUtil.isNotEmpty(dto.getCategorieSections()))
                item.setCategorieSections(categorieSectionConverter.toItem(dto.getCategorieSections()));

        return item;
        }
    }

    @Override
    public SuperCategorieSectionDto toDto(SuperCategorieSection item) {
        if (item == null) {
            return null;
        } else {
            SuperCategorieSectionDto dto = new SuperCategorieSectionDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if(StringUtil.isNotEmpty(item.getLibelle()))
                dto.setLibelle(item.getLibelle());
        if(this.categorieSections && ListUtil.isNotEmpty(item.getCategorieSections())){
            categorieSectionConverter.init(true);
            categorieSectionConverter.setSuperCategorieSection(false);
            dto.setCategorieSections(categorieSectionConverter.toDto(item.getCategorieSections()));
            categorieSectionConverter.setSuperCategorieSection(true);

        }


        return dto;
        }
    }

    public void initList(boolean value) {
        this.categorieSections = value;
    }

    public void initObject(boolean value) {
    }


    public SectionConverter getSectionConverter(){
        return this.sectionConverter;
    }
    public void setSectionConverter(SectionConverter sectionConverter ){
        this.sectionConverter = sectionConverter;
    }
    public CategorieSectionConverter getCategorieSectionConverter(){
        return this.categorieSectionConverter;
    }
    public void setCategorieSectionConverter(CategorieSectionConverter categorieSectionConverter ){
        this.categorieSectionConverter = categorieSectionConverter;
    }
    public boolean  isCategorieSections(){
        return this.categorieSections ;
    }
    public void  setCategorieSections(boolean categorieSections ){
        this.categorieSections  = categorieSections ;
    }
}
