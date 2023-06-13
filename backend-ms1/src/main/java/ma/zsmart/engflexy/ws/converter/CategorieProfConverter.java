package  ma.zsmart.engflexy.ws.converter;

import ma.zsmart.engflexy.bean.core.CategorieProf;
import ma.zsmart.engflexy.bean.history.CategorieProfHistory;
import ma.zsmart.engflexy.ws.dto.CategorieProfDto;
import ma.zsmart.engflexy.zynerator.converter.AbstractConverter;
import ma.zsmart.engflexy.zynerator.util.ListUtil;
import ma.zsmart.engflexy.zynerator.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CategorieProfConverter extends AbstractConverter<CategorieProf, CategorieProfDto, CategorieProfHistory> {

    @Autowired
    private ProfConverter profConverter ;
    @Autowired
    private ParcoursConverter parcoursConverter ;
    @Autowired
    private TypeTeacherConverter typeTeacherConverter ;
    @Autowired
    private ClassRoomConverter classRoomConverter ;
    @Autowired
    private RecommendTeacherConverter recommendTeacherConverter ;
    @Autowired
    private TrancheHoraireProfConverter trancheHoraireProfConverter ;
    private boolean profs;

    public  CategorieProfConverter(){
        super(CategorieProf.class, CategorieProfDto.class, CategorieProfHistory.class);
        init(true);
    }

    @Override
    public CategorieProf toItem(CategorieProfDto dto) {
        if (dto == null) {
            return null;
        } else {
        CategorieProf item = new CategorieProf();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getLevel()))
                item.setLevel(dto.getLevel());
            if(StringUtil.isNotEmpty(dto.getLessonRate()))
                item.setLessonRate(dto.getLessonRate());

            if(this.profs && ListUtil.isNotEmpty(dto.getProfs()))
                item.setProfs(profConverter.toItem(dto.getProfs()));

        return item;
        }
    }

    @Override
    public CategorieProfDto toDto(CategorieProf item) {
        if (item == null) {
            return null;
        } else {
            CategorieProfDto dto = new CategorieProfDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if(StringUtil.isNotEmpty(item.getLevel()))
                dto.setLevel(item.getLevel());
            if(StringUtil.isNotEmpty(item.getLessonRate()))
                dto.setLessonRate(item.getLessonRate());
        if(this.profs && ListUtil.isNotEmpty(item.getProfs())){
            profConverter.init(true);
            profConverter.setCategorieProf(false);
            dto.setProfs(profConverter.toDto(item.getProfs()));
            profConverter.setCategorieProf(true);

        }


        return dto;
        }
    }
    @Override
    public void initList(boolean value) {
        this.profs = value;
    }

    @Override
    public void initObject(boolean value) {
        //not used
    }


    public ProfConverter getProfConverter(){
        return this.profConverter;
    }
    public void setProfConverter(ProfConverter profConverter ){
        this.profConverter = profConverter;
    }
    public ParcoursConverter getParcoursConverter(){
        return this.parcoursConverter;
    }
    public void setParcoursConverter(ParcoursConverter parcoursConverter ){
        this.parcoursConverter = parcoursConverter;
    }
    public TypeTeacherConverter getTypeTeacherConverter(){
        return this.typeTeacherConverter;
    }
    public void setTypeTeacherConverter(TypeTeacherConverter typeTeacherConverter ){
        this.typeTeacherConverter = typeTeacherConverter;
    }
    public ClassRoomConverter getClassRoomConverter(){
        return this.classRoomConverter;
    }
    public void setClassRoomConverter(ClassRoomConverter classRoomConverter ){
        this.classRoomConverter = classRoomConverter;
    }
    public RecommendTeacherConverter getRecommendTeacherConverter(){
        return this.recommendTeacherConverter;
    }
    public void setRecommendTeacherConverter(RecommendTeacherConverter recommendTeacherConverter ){
        this.recommendTeacherConverter = recommendTeacherConverter;
    }
    public TrancheHoraireProfConverter getTrancheHoraireProfConverter(){
        return this.trancheHoraireProfConverter;
    }
    public void setTrancheHoraireProfConverter(TrancheHoraireProfConverter trancheHoraireProfConverter ){
        this.trancheHoraireProfConverter = trancheHoraireProfConverter;
    }
    public boolean  isProfs(){
        return this.profs ;
    }
    public void  setProfs(boolean profs ){
        this.profs  = profs ;
    }
}
