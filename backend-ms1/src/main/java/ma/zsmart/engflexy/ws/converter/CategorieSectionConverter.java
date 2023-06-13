package  ma.zsmart.engflexy.ws.converter;

import ma.zsmart.engflexy.bean.core.CategorieSection;
import ma.zsmart.engflexy.bean.core.SuperCategorieSection;
import ma.zsmart.engflexy.bean.history.CategorieSectionHistory;
import ma.zsmart.engflexy.ws.dto.CategorieSectionDto;
import ma.zsmart.engflexy.zynerator.converter.AbstractConverter;
import ma.zsmart.engflexy.zynerator.util.ListUtil;
import ma.zsmart.engflexy.zynerator.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CategorieSectionConverter extends AbstractConverter<CategorieSection, CategorieSectionDto, CategorieSectionHistory> {

    @Autowired
    private CoursConverter coursConverter ;
    @Autowired
    private SessionCoursConverter sessionCoursConverter ;
    @Autowired
    private SectionItemConverter sectionItemConverter ;
    @Autowired
    private SectionConverter sectionConverter ;
    @Autowired
    private SuperCategorieSectionConverter superCategorieSectionConverter ;
    private boolean superCategorieSection;
    private boolean sections;

    public  CategorieSectionConverter(){
        super(CategorieSection.class, CategorieSectionDto.class, CategorieSectionHistory.class);
        init(true);
    }

    @Override
    public CategorieSection toItem(CategorieSectionDto dto) {
        if (dto == null) {
            return null;
        } else {
        CategorieSection item = new CategorieSection();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());
            if(StringUtil.isNotEmpty(dto.getNumeroOrder()))
                item.setNumeroOrder(dto.getNumeroOrder());
            if(dto.getSuperCategorieSection() != null && dto.getSuperCategorieSection().getId() != null){
                item.setSuperCategorieSection(new SuperCategorieSection());
                item.getSuperCategorieSection().setId(dto.getSuperCategorieSection().getId());
            }


            if(this.sections && ListUtil.isNotEmpty(dto.getSections()))
                item.setSections(sectionConverter.toItem(dto.getSections()));

        return item;
        }
    }

    @Override
    public CategorieSectionDto toDto(CategorieSection item) {
        if (item == null) {
            return null;
        } else {
            CategorieSectionDto dto = new CategorieSectionDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if(StringUtil.isNotEmpty(item.getLibelle()))
                dto.setLibelle(item.getLibelle());
            if(StringUtil.isNotEmpty(item.getNumeroOrder()))
                dto.setNumeroOrder(item.getNumeroOrder());
        if(this.superCategorieSection && item.getSuperCategorieSection()!=null) {
            dto.setSuperCategorieSection(superCategorieSectionConverter.toDto(item.getSuperCategorieSection())) ;
        }
        if(this.sections && ListUtil.isNotEmpty(item.getSections())){
            sectionConverter.init(true);
            sectionConverter.setCategorieSection(false);
            dto.setSections(sectionConverter.toDto(item.getSections()));
            sectionConverter.setCategorieSection(true);

        }


        return dto;
        }
    }

    @Override
    public void initList(boolean value) {
        this.sections = value;
    }
    @Override
    public void initObject(boolean value) {
        this.superCategorieSection = value;
    }


    public CoursConverter getCoursConverter(){
        return this.coursConverter;
    }
    public void setCoursConverter(CoursConverter coursConverter ){
        this.coursConverter = coursConverter;
    }
    public SessionCoursConverter getSessionCoursConverter(){
        return this.sessionCoursConverter;
    }
    public void setSessionCoursConverter(SessionCoursConverter sessionCoursConverter ){
        this.sessionCoursConverter = sessionCoursConverter;
    }
    public SectionItemConverter getSectionItemConverter(){
        return this.sectionItemConverter;
    }
    public void setSectionItemConverter(SectionItemConverter sectionItemConverter ){
        this.sectionItemConverter = sectionItemConverter;
    }
    public SectionConverter getSectionConverter(){
        return this.sectionConverter;
    }
    public void setSectionConverter(SectionConverter sectionConverter ){
        this.sectionConverter = sectionConverter;
    }
    public SuperCategorieSectionConverter getSuperCategorieSectionConverter(){
        return this.superCategorieSectionConverter;
    }
    public void setSuperCategorieSectionConverter(SuperCategorieSectionConverter superCategorieSectionConverter ){
        this.superCategorieSectionConverter = superCategorieSectionConverter;
    }
    public boolean  isSuperCategorieSection(){
        return this.superCategorieSection;
    }
    public void  setSuperCategorieSection(boolean superCategorieSection){
        this.superCategorieSection = superCategorieSection;
    }
    public boolean  isSections(){
        return this.sections ;
    }
    public void  setSections(boolean sections ){
        this.sections  = sections ;
    }
}
