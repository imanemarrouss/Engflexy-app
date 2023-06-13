package  ma.zsmart.engflexy;

import com.fasterxml.jackson.databind.ObjectMapper;
import ma.zsmart.engflexy.bean.core.*;
import ma.zsmart.engflexy.service.facade.admin.*;
import ma.zsmart.engflexy.zynerator.security.bean.Permission;
import ma.zsmart.engflexy.zynerator.security.bean.Role;
import ma.zsmart.engflexy.zynerator.security.bean.User;
import ma.zsmart.engflexy.zynerator.security.common.AuthoritiesConstants;
import ma.zsmart.engflexy.zynerator.security.service.facade.RoleService;
import ma.zsmart.engflexy.zynerator.security.service.facade.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@EnableCaching
//@EnableFeignClients("ma.zsmart.engflexy.required.facade")
public class EngflexyApplication {
    public static ConfigurableApplicationContext ctx;
    static {
        ctx = SpringApplication.run(EngflexyApplication.class);
    }
    public static void main(String[] args) {

        //ctx=SpringApplication.run(EngflexyApplication.class, args);
    }


    @Bean
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
    @Autowired
    private ObjectMapper objectMapper;

    @Bean
    ObjectMapper objectMapper(){
        return new ObjectMapper();
    }
    public static ConfigurableApplicationContext getCtx() {
        return ctx;
    }

    @Bean
    public CommandLineRunner demo(UserService userService, RoleService roleService) {
    return (args) -> {
        if(false){

            createTypeTeacher();
            createGroupeEtude();
            createEtudiantClassRoom();
            createFreeTrialConfiguration();
            createParcours();
            createStatutFreeTrial();
            createAdmin();
            createInteretEtudiant();
            createHomeWorkQuestion();
            createHomeWork();
            createCategorieSection();
            createReponseEtudiant();
            createClassAverageBonus();
            createTrancheHoraireProf();
            createEtatEtudiantSchedule();
            createResultatHomeWork();
            createSessionCours();
            createProfReview();
            createCours();
            createCalendrierProf();
            createReponseEtudiantHomeWork();
            createHoweWorkQSTReponse();
            createReclamationProf();
            createLangue();
            createTypeDeQuestion();
            createFreeTrialStudentWhatsTemplate();
            createFreeTrialTeacherEmailTemplate();
            createNews();
            createServices();
            createSkill();
            createEtatInscription();
            createInviteStudent();
            createPackStudent();
            createPrice();
            createCategorieProf();
            createFaqEtudiant();
            createTypeReclamationEtudiant();
            //createDictionary();
            createEtudiantCours();
            createEtudiantReview();
            createSuperCategorieSection();
            createTypeHomeWork();
            createQuiz();
            createVocabulary();
            createPaiement();
            createVocabularyQuiz();
            createStatutSocial();
            createFaqProf();
            createFreeTrialformule();
            createFreeTrial();
            createQuestion();
            createEtatEtudiant();
            createCentre();
            createFonction();
            createFreeTrialTeacherWhatsTemplate();
            createFaq();
            createFreeTrialStudentEmailTemplate();
            createEtudiant();
            createTypeReclamationProf();
            createProf();
            createFreeTrialDetail();
            createGroupeEtudiantDetail();
            createInscription();
            createEtatReponse();
            createFaqType();
            createConfirmationToken();
            createTeacherLocality();
            createQuizEtudiant();
            createContact();
            createSectionItem();
            createNiveauEtude();
            createEtatCours();
            createReclamationEtudiant();
            createSection();
            createSalary();
            createClassAverageBonusProf();
            createReponse();
            createScheduleProf();
            createRecommendTeacher();
            createClassRoom();
            createLevelTestConfiguration();
            createWorkloadBonus();
            createHomeWorkEtudiant();
            createQuizClassRoom();
            createWorkloadBonusProf();
            createGroupeEtudiant();


    // Role admin

        User userForAdmin = new User("admin");

        Role roleForAdmin = new Role();
        roleForAdmin.setAuthority(AuthoritiesConstants.ADMIN);
        List<Permission> permissionsForAdmin = new ArrayList<>();
        addPermissionForAdmin(permissionsForAdmin);
        roleForAdmin.setPermissions(permissionsForAdmin);
        if(userForAdmin.getRoles()==null)
            userForAdmin.setRoles(new ArrayList<>());

        userForAdmin.getRoles().add(roleForAdmin);
        userService.save(userForAdmin);
            }
        };
    }



    private void createTypeTeacher(){
        String libelle = "libelle";
        String code = "code";
        for (int i = 1; i < 100; i++) {
            TypeTeacher item = new TypeTeacher();
            item.setLibelle(fakeString(libelle, i));
            item.setCode(fakeString(code, i));
            typeTeacherService.create(item);
        }
    }
    private void createGroupeEtude(){
        String libelle = "libelle";
        String description = "description";
         String nombreEtudiant = "nombreEtudiant";
        for (int i = 1; i < 100; i++) {
            GroupeEtude item = new GroupeEtude();
            item.setLibelle(fakeString(libelle, i));
            item.setDescription(fakeString(description, i));
            item.setNombreEtudiant(fakeLong(nombreEtudiant, i));
            groupeEtudeService.create(item);
        }
    }
    private void createEtudiantClassRoom(){
        for (int i = 1; i < 100; i++) {
            EtudiantClassRoom item = new EtudiantClassRoom();
            etudiantClassRoomService.create(item);
        }
    }
    private void createFreeTrialConfiguration(){
        String dateApplicationDebut = "dateApplicationDebut";
        String dateApplicationFin = "dateApplicationFin";
         String nombreStudentMax = "nombreStudentMax";
         String nombreStudentMin = "nombreStudentMin";
        for (int i = 1; i < 100; i++) {
            FreeTrialConfiguration item = new FreeTrialConfiguration();
            item.setDateApplicationDebut(fakeLocalDateTime(dateApplicationDebut, i));
            item.setDateApplicationFin(fakeLocalDateTime(dateApplicationFin, i));
            item.setNombreStudentMax(fakeInteger(nombreStudentMax, i));
            item.setNombreStudentMin(fakeInteger(nombreStudentMin, i));
            freeTrialConfigurationService.create(item);
        }
    }
    private void createParcours(){
        String datePublication = "datePublication";
        String dateCreation = "dateCreation";
        String description = "description";
        String code = "code";
        String libelle = "libelle";
         String numeroOrder = "numeroOrder";
         String nombreCours = "nombreCours";
        for (int i = 1; i < 100; i++) {
            Parcours item = new Parcours();
            item.setDatePublication(fakeLocalDateTime(datePublication, i));
            item.setDateCreation(fakeLocalDateTime(dateCreation, i));
            item.setDescription(fakeString(description, i));
            item.setCode(fakeString(code, i));
            item.setLibelle(fakeString(libelle, i));
            item.setNumeroOrder(fakeInteger(numeroOrder, i));
            item.setNombreCours(fakeInteger(nombreCours, i));
            parcoursService.create(item);
        }
    }
    private void createStatutFreeTrial(){
        String libelle = "libelle";
        String code = "code";
        String style = "style";
        for (int i = 1; i < 100; i++) {
            StatutFreeTrial item = new StatutFreeTrial();
            item.setLibelle(fakeString(libelle, i));
            item.setCode(fakeString(code, i));
            item.setStyle(fakeString(style, i));
            statutFreeTrialService.create(item);
        }
    }
    private void createAdmin(){
        String description = "description";
        for (int i = 1; i < 100; i++) {
            Admin item = new Admin();
            item.setDescription(fakeString(description, i));
            adminService.create(item);
        }
    }
    private void createInteretEtudiant(){
        String code = "code";
        String libelle = "libelle";
        for (int i = 1; i < 100; i++) {
            InteretEtudiant item = new InteretEtudiant();
            item.setCode(fakeString(code, i));
            item.setLibelle(fakeString(libelle, i));
            interetEtudiantService.create(item);
        }
    }
    private void createHomeWorkQuestion(){
        String ref = "ref";
        String libelle = "libelle";
         String numero = "numero";
         String pointReponseJuste = "pointReponseJuste";
         String pointReponsefausse = "pointReponsefausse";
        for (int i = 1; i < 100; i++) {
            HomeWorkQuestion item = new HomeWorkQuestion();
            item.setRef(fakeString(ref, i));
            item.setLibelle(fakeString(libelle, i));
            item.setNumero(fakeInteger(numero, i));
            item.setPointReponseJuste(fakeBigDecimal(pointReponseJuste, i));
            item.setPointReponsefausse(fakeBigDecimal(pointReponsefausse, i));
            homeWorkQuestionService.create(item);
        }
    }
    private void createHomeWork(){
        String libelle = "libelle";
        String urlImage = "urlImage";
        String urlVideo = "urlVideo";
        for (int i = 1; i < 100; i++) {
            HomeWork item = new HomeWork();
            item.setLibelle(fakeString(libelle, i));
            item.setUrlImage(fakeString(urlImage, i));
            item.setUrlVideo(fakeString(urlVideo, i));
            homeWorkService.create(item);
        }
    }
    private void createCategorieSection(){
        String code = "code";
        String libelle = "libelle";
         String numeroOrder = "numeroOrder";
        for (int i = 1; i < 100; i++) {
            CategorieSection item = new CategorieSection();
            item.setCode(fakeString(code, i));
            item.setLibelle(fakeString(libelle, i));
            item.setNumeroOrder(fakeInteger(numeroOrder, i));
            categorieSectionService.create(item);
        }
    }
    private void createReponseEtudiant(){
        String ref = "ref";
        String answer = "answer";
         String note = "note";
        for (int i = 1; i < 100; i++) {
            ReponseEtudiant item = new ReponseEtudiant();
            item.setRef(fakeString(ref, i));
            item.setAnswer(fakeString(answer, i));
            item.setNote(fakeBigDecimal(note, i));
            reponseEtudiantService.create(item);
        }
    }
    private void createClassAverageBonus(){
        String code = "code";
         String nombreSession = "nombreSession";
         String prix = "prix";
        for (int i = 1; i < 100; i++) {
            ClassAverageBonus item = new ClassAverageBonus();
            item.setCode(fakeString(code, i));
            item.setNombreSession(fakeInteger(nombreSession, i));
            item.setPrix(fakeBigDecimal(prix, i));
            classAverageBonusService.create(item);
        }
    }
    private void createTrancheHoraireProf(){
        String startHour = "startHour";
        String endHour = "endHour";
         String day = "day";
         String groupIndex = "groupIndex";
         String profsId = "profsId";
        for (int i = 1; i < 100; i++) {
            TrancheHoraireProf item = new TrancheHoraireProf();
            item.setStartHour(fakeString(startHour, i));
            item.setEndHour(fakeString(endHour, i));
            item.setDay(fakeInteger(day, i));
            item.setGroupIndex(fakeInteger(groupIndex, i));
            item.setProfsId(fakeLong(profsId, i));
            trancheHoraireProfService.create(item);
        }
    }
    private void createEtatEtudiantSchedule(){
        String ref = "ref";
        String libelle = "libelle";
        String couleur = "couleur";
        for (int i = 1; i < 100; i++) {
            EtatEtudiantSchedule item = new EtatEtudiantSchedule();
            item.setRef(fakeString(ref, i));
            item.setLibelle(fakeString(libelle, i));
            item.setCouleur(fakeString(couleur, i));
            etatEtudiantScheduleService.create(item);
        }
    }
    private void createResultatHomeWork(){
        String libelle = "libelle";
        String code = "code";
        for (int i = 1; i < 100; i++) {
            ResultatHomeWork item = new ResultatHomeWork();
            item.setLibelle(fakeString(libelle, i));
            item.setCode(fakeString(code, i));
            resultatHomeWorkService.create(item);
        }
    }
    private void createSessionCours(){
        String reference = "reference";
         String duree = "duree";
         String totalheure = "totalheure";
         String mois = "mois";
         String annee = "annee";
        String dateFin = "dateFin";
        String dateDebut = "dateDebut";
         String payer = "payer";
        for (int i = 1; i < 100; i++) {
            SessionCours item = new SessionCours();
            item.setReference(fakeString(reference, i));
            item.setDuree(fakeBigDecimal(duree, i));
            item.setTotalheure(fakeBigDecimal(totalheure, i));
            item.setMois(fakeBigDecimal(mois, i));
            item.setAnnee(fakeBigDecimal(annee, i));
            item.setDateFin(fakeLocalDateTime(dateFin, i));
            item.setDateDebut(fakeLocalDateTime(dateDebut, i));
            item.setPayer(fakeBoolean(payer, i));
            sessionCoursService.create(item);
        }
    }
    private void createProfReview(){
         String review = "review";
        String comment = "comment";
        String dateReview = "dateReview";
        for (int i = 1; i < 100; i++) {
            ProfReview item = new ProfReview();
            item.setReview(fakeInteger(review, i));
            item.setComment(fakeString(comment, i));
            item.setDateReview(fakeLocalDateTime(dateReview, i));
            profReviewService.create(item);
        }
    }
    private void createCours(){
        String code = "code";
        String libelle = "libelle";
        String description = "description";
        String image = "image";
         String nombreSectionFinalise = "nombreSectionFinalise";
         String nombreSectionEnCours = "nombreSectionEnCours";
         String nombreLinkEnCours = "nombreLinkEnCours";
         String nombreLinkFinalise = "nombreLinkFinalise";
         String numeroOrder = "numeroOrder";
        for (int i = 1; i < 100; i++) {
            Cours item = new Cours();
            item.setCode(fakeString(code, i));
            item.setLibelle(fakeString(libelle, i));
            item.setDescription(fakeString(description, i));
            item.setImage(fakeString(image, i));
            item.setNombreSectionFinalise(fakeInteger(nombreSectionFinalise, i));
            item.setNombreSectionEnCours(fakeInteger(nombreSectionEnCours, i));
            item.setNombreLinkEnCours(fakeInteger(nombreLinkEnCours, i));
            item.setNombreLinkFinalise(fakeInteger(nombreLinkFinalise, i));
            item.setNumeroOrder(fakeInteger(numeroOrder, i));
            coursService.create(item);
        }
    }
    private void createCalendrierProf(){
        String ref = "ref";
        String startTime = "startTime";
        String endTime = "endTime";
        String startRecur = "startRecur";
        String endRecur = "endRecur";
        for (int i = 1; i < 100; i++) {
            CalendrierProf item = new CalendrierProf();
            item.setRef(fakeString(ref, i));
            item.setStartTime(fakeString(startTime, i));
            item.setEndTime(fakeString(endTime, i));
            item.setStartRecur(fakeLocalDateTime(startRecur, i));
            item.setEndRecur(fakeLocalDateTime(endRecur, i));
            calendrierProfService.create(item);
        }
    }
    private void createReponseEtudiantHomeWork(){
        String answer = "answer";
        String profNote = "profNote";
         String note = "note";
        for (int i = 1; i < 100; i++) {
            ReponseEtudiantHomeWork item = new ReponseEtudiantHomeWork();
            item.setAnswer(fakeString(answer, i));
            item.setProfNote(fakeString(profNote, i));
            item.setNote(fakeBigDecimal(note, i));
            reponseEtudiantHomeWorkService.create(item);
        }
    }
    private void createHoweWorkQSTReponse(){
        String ref = "ref";
        String lib = "lib";
         String numero = "numero";
        for (int i = 1; i < 100; i++) {
            HoweWorkQSTReponse item = new HoweWorkQSTReponse();
            item.setRef(fakeString(ref, i));
            item.setLib(fakeString(lib, i));
            item.setNumero(fakeInteger(numero, i));
            howeWorkQSTReponseService.create(item);
        }
    }
    private void createReclamationProf(){
        String reference = "reference";
        String dateReclamation = "dateReclamation";
        String message = "message";
         String traite = "traite";
        String dateTraitement = "dateTraitement";
        String dateReponse = "dateReponse";
         String postView = "postView";
        String commentaireTraiteur = "commentaireTraiteur";
        String objetReclamationProf = "objetReclamationProf";
        for (int i = 1; i < 100; i++) {
            ReclamationProf item = new ReclamationProf();
            item.setReference(fakeString(reference, i));
            item.setDateReclamation(fakeLocalDateTime(dateReclamation, i));
            item.setMessage(fakeString(message, i));
            item.setTraite(fakeBoolean(traite, i));
            item.setDateTraitement(fakeLocalDateTime(dateTraitement, i));
            item.setDateReponse(fakeLocalDateTime(dateReponse, i));
            item.setPostView(fakeBoolean(postView, i));
            item.setCommentaireTraiteur(fakeString(commentaireTraiteur, i));
            item.setObjetReclamationProf(fakeString(objetReclamationProf, i));
            reclamationProfService.create(item);
        }
    }
    private void createLangue(){
        String ref = "ref";
        String libelle = "libelle";
        for (int i = 1; i < 100; i++) {
            Langue item = new Langue();
            item.setRef(fakeString(ref, i));
            item.setLibelle(fakeString(libelle, i));
            langueService.create(item);
        }
    }
    private void createTypeDeQuestion(){
        String ref = "ref";
        String lib = "lib";
        for (int i = 1; i < 100; i++) {
            TypeDeQuestion item = new TypeDeQuestion();
            item.setRef(fakeString(ref, i));
            item.setLib(fakeString(lib, i));
            typeDeQuestionService.create(item);
        }
    }
    private void createFreeTrialStudentWhatsTemplate(){
        String object = "object";
        String corps = "corps";
        String source = "source";
        for (int i = 1; i < 100; i++) {
            FreeTrialStudentWhatsTemplate item = new FreeTrialStudentWhatsTemplate();
            item.setObject(fakeString(object, i));
            item.setCorps(fakeString(corps, i));
            item.setSource(fakeString(source, i));
            freeTrialStudentWhatsTemplateService.create(item);
        }
    }
    private void createFreeTrialTeacherEmailTemplate(){
        String object = "object";
        String corps = "corps";
        String source = "source";
        for (int i = 1; i < 100; i++) {
            FreeTrialTeacherEmailTemplate item = new FreeTrialTeacherEmailTemplate();
            item.setObject(fakeString(object, i));
            item.setCorps(fakeString(corps, i));
            item.setSource(fakeString(source, i));
            freeTrialTeacherEmailTemplateService.create(item);
        }
    }
    private void createNews(){
        String ref = "ref";
        String libelle = "libelle";
        String image = "image";
        String description = "description";
        String dateNews = "dateNews";
        String dateDebut = "dateDebut";
        String dateFin = "dateFin";
         String numeroOrdre = "numeroOrdre";
        String destinataire = "destinataire";
        for (int i = 1; i < 100; i++) {
            News item = new News();
            item.setRef(fakeString(ref, i));
            item.setLibelle(fakeString(libelle, i));
            item.setImage(fakeString(image, i));
            item.setDescription(fakeString(description, i));
            item.setDateNews(fakeLocalDateTime(dateNews, i));
            item.setDateDebut(fakeLocalDateTime(dateDebut, i));
            item.setDateFin(fakeLocalDateTime(dateFin, i));
            item.setNumeroOrdre(fakeInteger(numeroOrdre, i));
            item.setDestinataire(fakeString(destinataire, i));
            newsService.create(item);
        }
    }
    private void createServices(){
        String code = "code";
        String libelle = "libelle";
        String description = "description";
        for (int i = 1; i < 100; i++) {
            Services item = new Services();
            item.setCode(fakeString(code, i));
            item.setLibelle(fakeString(libelle, i));
            item.setDescription(fakeString(description, i));
            servicesService.create(item);
        }
    }
    private void createSkill(){
        String code = "code";
        String libelle = "libelle";
        for (int i = 1; i < 100; i++) {
            Skill item = new Skill();
            item.setCode(fakeString(code, i));
            item.setLibelle(fakeString(libelle, i));
            skillService.create(item);
        }
    }
    private void createEtatInscription(){
        String ref = "ref";
        String libelle = "libelle";
        for (int i = 1; i < 100; i++) {
            EtatInscription item = new EtatInscription();
            item.setRef(fakeString(ref, i));
            item.setLibelle(fakeString(libelle, i));
            etatInscriptionService.create(item);
        }
    }
    private void createInviteStudent(){
        String code = "code";
         String isAccepted = "isAccepted";
         String isPaidPack = "isPaidPack";
        String emailInvited = "emailInvited";
        String dateSentInvitation = "dateSentInvitation";
        String dateAcceptInvitation = "dateAcceptInvitation";
        String datePayPack = "datePayPack";
        for (int i = 1; i < 100; i++) {
            InviteStudent item = new InviteStudent();
            item.setCode(fakeString(code, i));
            item.setIsAccepted(fakeBoolean(isAccepted, i));
            item.setIsPaidPack(fakeBoolean(isPaidPack, i));
            item.setEmailInvited(fakeString(emailInvited, i));
            item.setDateSentInvitation(fakeLocalDateTime(dateSentInvitation, i));
            item.setDateAcceptInvitation(fakeLocalDateTime(dateAcceptInvitation, i));
            item.setDatePayPack(fakeLocalDateTime(datePayPack, i));
            inviteStudentService.create(item);
        }
    }
    private void createPackStudent(){
         String nombreCours = "nombreCours";
         String forGroupe = "forGroupe";
        String code = "code";
        String libelle = "libelle";
        String description = "description";
        String preRequisites = "preRequisites";
        String whyTakeThisCourse = "whyTakeThisCourse";
        String expectations = "expectations";
        String imgUrl = "imgUrl";
         String totalStudents = "totalStudents";
        String rating = "rating";
        String oldPrice = "oldPrice";
        for (int i = 1; i < 100; i++) {
            PackStudent item = new PackStudent();
            item.setNombreCours(fakeInteger(nombreCours, i));
            item.setForGroupe(fakeBoolean(forGroupe, i));
            item.setCode(fakeString(code, i));
            item.setLibelle(fakeString(libelle, i));
            item.setDescription(fakeString(description, i));
            item.setPreRequisites(fakeString(preRequisites, i));
            item.setWhyTakeThisCourse(fakeString(whyTakeThisCourse, i));
            item.setExpectations(fakeString(expectations, i));
            item.setImgUrl(fakeString(imgUrl, i));
            item.setTotalStudents(fakeInteger(totalStudents, i));
            item.setRating(fakeString(rating, i));
            item.setOldPrice(fakeString(oldPrice, i));
            packStudentService.create(item);
        }
    }
    private void createPrice(){
         String price = "price";
         String oldPrice = "oldPrice";
        String lib = "lib";
         String nreCourse = "nreCourse";
         String nreHours = "nreHours";
         String nreMonth = "nreMonth";
         String forGroup = "forGroup";
        for (int i = 1; i < 100; i++) {
            Price item = new Price();
            item.setPrice(fakeBigDecimal(price, i));
            item.setOldPrice(fakeBigDecimal(oldPrice, i));
            item.setLib(fakeString(lib, i));
            item.setNreCourse(fakeBigDecimal(nreCourse, i));
            item.setNreHours(fakeBigDecimal(nreHours, i));
            item.setNreMonth(fakeBigDecimal(nreMonth, i));
            item.setForGroup(fakeBoolean(forGroup, i));
            priceService.create(item);
        }
    }
    private void createCategorieProf(){
        String code = "code";
        String level = "level";
         String lessonRate = "lessonRate";
        for (int i = 1; i < 100; i++) {
            CategorieProf item = new CategorieProf();
            item.setCode(fakeString(code, i));
            item.setLevel(fakeString(level, i));
            item.setLessonRate(fakeBigDecimal(lessonRate, i));
            categorieProfService.create(item);
        }
    }
    private void createFaqEtudiant(){
        String description = "description";
        String libelle = "libelle";
        for (int i = 1; i < 100; i++) {
            FaqEtudiant item = new FaqEtudiant();
            item.setDescription(fakeString(description, i));
            item.setLibelle(fakeString(libelle, i));
            faqEtudiantService.create(item);
        }
    }
    private void createTypeReclamationEtudiant(){
        String code = "code";
        String libelle = "libelle";
        for (int i = 1; i < 100; i++) {
            TypeReclamationEtudiant item = new TypeReclamationEtudiant();
            item.setCode(fakeString(code, i));
            item.setLibelle(fakeString(libelle, i));
            typeReclamationEtudiantService.create(item);
        }
    }
  /*  private void createDictionary(){
        String word = "word";
        String definition = "definition";
        for (int i = 1; i < 100; i++) {
            Dictionary item = new Dictionary();
            item.setWord(fakeString(word, i));
            item.setDefinition(fakeString(definition, i));
            dictionaryService.create(item);
        }
    }*/
    private void createEtudiantCours(){
         String payer = "payer";
        String dateFin = "dateFin";
        for (int i = 1; i < 100; i++) {
            EtudiantCours item = new EtudiantCours();
            item.setPayer(fakeBoolean(payer, i));
            item.setDateFin(fakeLocalDateTime(dateFin, i));
            etudiantCoursService.create(item);
        }
    }
    private void createEtudiantReview(){
         String review = "review";
        String comment = "comment";
        String dateReview = "dateReview";
        for (int i = 1; i < 100; i++) {
            EtudiantReview item = new EtudiantReview();
            item.setReview(fakeInteger(review, i));
            item.setComment(fakeString(comment, i));
            item.setDateReview(fakeLocalDateTime(dateReview, i));
            etudiantReviewService.create(item);
        }
    }
    private void createSuperCategorieSection(){
        String code = "code";
        String libelle = "libelle";
        for (int i = 1; i < 100; i++) {
            SuperCategorieSection item = new SuperCategorieSection();
            item.setCode(fakeString(code, i));
            item.setLibelle(fakeString(libelle, i));
            superCategorieSectionService.create(item);
        }
    }
    private void createTypeHomeWork(){
        String code = "code";
        String lib = "lib";
        for (int i = 1; i < 100; i++) {
            TypeHomeWork item = new TypeHomeWork();
            item.setCode(fakeString(code, i));
            item.setLib(fakeString(lib, i));
            typeHomeWorkService.create(item);
        }
    }
    private void createQuiz(){
        String ref = "ref";
        String lib = "lib";
        String dateDebut = "dateDebut";
        String dateFin = "dateFin";
         String numero = "numero";
         String seuilReussite = "seuilReussite";
        for (int i = 1; i < 100; i++) {
            Quiz item = new Quiz();
            item.setRef(fakeString(ref, i));
            item.setLib(fakeString(lib, i));
            item.setDateDebut(fakeLocalDateTime(dateDebut, i));
            item.setDateFin(fakeLocalDateTime(dateFin, i));
            item.setNumero(fakeLong(numero, i));
            item.setSeuilReussite(fakeLong(seuilReussite, i));
            quizService.create(item);
        }
    }
    private void createVocabulary(){
        String ref = "ref";
         String numero = "numero";
        String word = "word";
        String libelle = "libelle";
        String result = "result";
        String explication = "explication";
        String exemple = "exemple";
        String image = "image";
        for (int i = 1; i < 100; i++) {
            Vocabulary item = new Vocabulary();
            item.setRef(fakeString(ref, i));
            item.setNumero(fakeLong(numero, i));
            item.setWord(fakeString(word, i));
            item.setLibelle(fakeString(libelle, i));
            item.setResult(fakeString(result, i));
            item.setExplication(fakeString(explication, i));
            item.setExemple(fakeString(exemple, i));
            item.setImage(fakeString(image, i));
            vocabularyService.create(item);
        }
    }
    private void createPaiement(){
        String datePaiement = "datePaiement";
        for (int i = 1; i < 100; i++) {
            Paiement item = new Paiement();
            item.setDatePaiement(fakeLocalDateTime(datePaiement, i));
            paiementService.create(item);
        }
    }
    private void createVocabularyQuiz(){
        String libelle = "libelle";
        String dateDebut = "dateDebut";
        String dateFin = "dateFin";
        for (int i = 1; i < 100; i++) {
            VocabularyQuiz item = new VocabularyQuiz();
            item.setLibelle(fakeString(libelle, i));
            item.setDateDebut(fakeLocalDateTime(dateDebut, i));
            item.setDateFin(fakeLocalDateTime(dateFin, i));
            vocabularyQuizService.create(item);
        }
    }
    private void createStatutSocial(){
        String code = "code";
        String libelle = "libelle";
        for (int i = 1; i < 100; i++) {
            StatutSocial item = new StatutSocial();
            item.setCode(fakeString(code, i));
            item.setLibelle(fakeString(libelle, i));
            statutSocialService.create(item);
        }
    }
    private void createFaqProf(){
        String description = "description";
        String libelle = "libelle";
        for (int i = 1; i < 100; i++) {
            FaqProf item = new FaqProf();
            item.setDescription(fakeString(description, i));
            item.setLibelle(fakeString(libelle, i));
            faqProfService.create(item);
        }
    }
    private void createFreeTrialformule(){
        String code = "code";
        String dayspeerweek = "dayspeerweek";
        String timeperday = "timeperday";
        String teacherGenderoption = "teacherGenderoption";
        String teacherAgeRange = "teacherAgeRange";
        String teacherPersonnality = "teacherPersonnality";
         String status = "status";
        String dateConfirmation = "dateConfirmation";
        for (int i = 1; i < 100; i++) {
            FreeTrialformule item = new FreeTrialformule();
            item.setCode(fakeString(code, i));
            item.setDayspeerweek(fakeString(dayspeerweek, i));
            item.setTimeperday(fakeString(timeperday, i));
            item.setTeacherGenderoption(fakeString(teacherGenderoption, i));
            item.setTeacherAgeRange(fakeString(teacherAgeRange, i));
            item.setTeacherPersonnality(fakeString(teacherPersonnality, i));
            item.setStatus(fakeBoolean(status, i));
            item.setDateConfirmation(fakeLocalDateTime(dateConfirmation, i));
            freeTrialformuleService.create(item);
        }
    }
    private void createFreeTrial(){
        String reference = "reference";
        String dateFreeTrial = "dateFreeTrial";
        String link = "link";
         String emailTeacherSent = "emailTeacherSent";
        String emailTeacherSendingDate = "emailTeacherSendingDate";
         String whatsTeacherSent = "whatsTeacherSent";
        String whatsTeacherSendingDate = "whatsTeacherSendingDate";
        String dateFreeTrialPremierRappel = "dateFreeTrialPremierRappel";
        String dateFreeTrialPremierDeuxiemeRappel = "dateFreeTrialPremierDeuxiemeRappel";
         String nombreStudentTotal = "nombreStudentTotal";
         String nombreStudentAbonne = "nombreStudentAbonne";
         String nombreStudentPresent = "nombreStudentPresent";
        for (int i = 1; i < 100; i++) {
            FreeTrial item = new FreeTrial();
            item.setReference(fakeString(reference, i));
            item.setDateFreeTrial(fakeLocalDateTime(dateFreeTrial, i));
            item.setLink(fakeString(link, i));
            item.setEmailTeacherSent(fakeBoolean(emailTeacherSent, i));
            item.setEmailTeacherSendingDate(fakeLocalDateTime(emailTeacherSendingDate, i));
            item.setWhatsTeacherSent(fakeBoolean(whatsTeacherSent, i));
            item.setWhatsTeacherSendingDate(fakeLocalDateTime(whatsTeacherSendingDate, i));
            item.setDateFreeTrialPremierRappel(fakeLocalDateTime(dateFreeTrialPremierRappel, i));
            item.setDateFreeTrialPremierDeuxiemeRappel(fakeLocalDateTime(dateFreeTrialPremierDeuxiemeRappel, i));
            item.setNombreStudentTotal(fakeInteger(nombreStudentTotal, i));
            item.setNombreStudentAbonne(fakeInteger(nombreStudentAbonne, i));
            item.setNombreStudentPresent(fakeInteger(nombreStudentPresent, i));
            freeTrialService.create(item);
        }
    }
    private void createQuestion(){
        String ref = "ref";
        String libelle = "libelle";
        String urlImg = "urlImg";
        String urlVideo = "urlVideo";
         String numero = "numero";
         String pointReponseJuste = "pointReponseJuste";
         String pointReponsefausse = "pointReponsefausse";
        for (int i = 1; i < 100; i++) {
            Question item = new Question();
            item.setRef(fakeString(ref, i));
            item.setLibelle(fakeString(libelle, i));
            item.setUrlImg(fakeString(urlImg, i));
            item.setUrlVideo(fakeString(urlVideo, i));
            item.setNumero(fakeLong(numero, i));
            item.setPointReponseJuste(fakeBigDecimal(pointReponseJuste, i));
            item.setPointReponsefausse(fakeBigDecimal(pointReponsefausse, i));
            questionService.create(item);
        }
    }
    private void createEtatEtudiant(){
        String reference = "reference";
        String username = "username";
        String firstName = "firstName";
        String lastName = "lastName";
        String nationnalite = "nationnalite";
        String schedule1 = "schedule1";
        String schedule2 = "schedule2";
        String lastClass = "lastClass";
        String nbrClass = "nbrClass";
        String etat = "etat";
         String etatNumber = "etatNumber";
        for (int i = 1; i < 100; i++) {
            EtatEtudiant item = new EtatEtudiant();
            item.setReference(fakeString(reference, i));
            item.setUsername(fakeString(username, i));
            item.setFirstName(fakeString(firstName, i));
            item.setLastName(fakeString(lastName, i));
            item.setNationnalite(fakeString(nationnalite, i));
            item.setSchedule1(fakeString(schedule1, i));
            item.setSchedule2(fakeString(schedule2, i));
            item.setLastClass(fakeString(lastClass, i));
            item.setNbrClass(fakeString(nbrClass, i));
            item.setEtat(fakeString(etat, i));
            item.setEtatNumber(fakeLong(etatNumber, i));
            etatEtudiantService.create(item);
        }
    }
    private void createCentre(){
        String ref = "ref";
        String libelle = "libelle";
        String description = "description";
        String log = "log";
        String password = "password";
        for (int i = 1; i < 100; i++) {
            Centre item = new Centre();
            item.setRef(fakeString(ref, i));
            item.setLibelle(fakeString(libelle, i));
            item.setDescription(fakeString(description, i));
            item.setLog(fakeString(log, i));
            item.setPassword(fakeString(password, i));
            centreService.create(item);
        }
    }
    private void createFonction(){
        String code = "code";
        String libelle = "libelle";
        for (int i = 1; i < 100; i++) {
            Fonction item = new Fonction();
            item.setCode(fakeString(code, i));
            item.setLibelle(fakeString(libelle, i));
            fonctionService.create(item);
        }
    }
    private void createFreeTrialTeacherWhatsTemplate(){
        String object = "object";
        String corps = "corps";
        String source = "source";
        for (int i = 1; i < 100; i++) {
            FreeTrialTeacherWhatsTemplate item = new FreeTrialTeacherWhatsTemplate();
            item.setObject(fakeString(object, i));
            item.setCorps(fakeString(corps, i));
            item.setSource(fakeString(source, i));
            freeTrialTeacherWhatsTemplateService.create(item);
        }
    }
    private void createFaq(){
        String description = "description";
        String libelle = "libelle";
        for (int i = 1; i < 100; i++) {
            Faq item = new Faq();
            item.setDescription(fakeString(description, i));
            item.setLibelle(fakeString(libelle, i));
            faqService.create(item);
        }
    }
    private void createFreeTrialStudentEmailTemplate(){
        String object = "object";
        String corps = "corps";
        String source = "source";
        for (int i = 1; i < 100; i++) {
            FreeTrialStudentEmailTemplate item = new FreeTrialStudentEmailTemplate();
            item.setObject(fakeString(object, i));
            item.setCorps(fakeString(corps, i));
            item.setSource(fakeString(source, i));
            freeTrialStudentEmailTemplateService.create(item);
        }
    }
    private void createEtudiant(){
        String ref = "ref";
        String groupOption = "groupOption";
        String email = "email";
        for (int i = 1; i < 100; i++) {
            Etudiant item = new Etudiant();
            item.setRef(fakeString(ref, i));
            item.setGroupOption(fakeString(groupOption, i));
            item.setEmail(fakeString(email, i));
            etudiantService.create(item);
        }
    }
    private void createTypeReclamationProf(){
        String code = "code";
        String libelle = "libelle";
        for (int i = 1; i < 100; i++) {
            TypeReclamationProf item = new TypeReclamationProf();
            item.setCode(fakeString(code, i));
            item.setLibelle(fakeString(libelle, i));
            typeReclamationProfService.create(item);
        }
    }
    private void createProf(){
        String ref = "ref";
        String about = "about";
        String email = "email";
        for (int i = 1; i < 100; i++) {
            Prof item = new Prof();
            item.setRef(fakeString(ref, i));
            item.setAbout(fakeString(about, i));
            item.setEmail(fakeString(email, i));
            profService.create(item);
        }
    }
    private void createFreeTrialDetail(){
         String presence = "presence";
         String whatsUpMessageSent = "whatsUpMessageSent";
        String dateEnvoiwhatsUpMessage = "dateEnvoiwhatsUpMessage";
         String emailMessageSent = "emailMessageSent";
        String dateEnvoiEmailMessage = "dateEnvoiEmailMessage";
         String abonne = "abonne";
        for (int i = 1; i < 100; i++) {
            FreeTrialDetail item = new FreeTrialDetail();
            item.setPresence(fakeBoolean(presence, i));
            item.setWhatsUpMessageSent(fakeBoolean(whatsUpMessageSent, i));
            item.setDateEnvoiwhatsUpMessage(fakeLocalDateTime(dateEnvoiwhatsUpMessage, i));
            item.setEmailMessageSent(fakeBoolean(emailMessageSent, i));
            item.setDateEnvoiEmailMessage(fakeLocalDateTime(dateEnvoiEmailMessage, i));
            item.setAbonne(fakeBoolean(abonne, i));
            freeTrialDetailService.create(item);
        }
    }
    private void createGroupeEtudiantDetail(){
        for (int i = 1; i < 100; i++) {
            GroupeEtudiantDetail item = new GroupeEtudiantDetail();
            groupeEtudiantDetailService.create(item);
        }
    }
    private void createInscription(){
         String numeroInscription = "numeroInscription";
         String noteQuizNiveau = "noteQuizNiveau";
         String quizFinished = "quizFinished";
        String dateRegistration = "dateRegistration";
        String datedebutinscription = "datedebutinscription";
        String datefininscription = "datefininscription";
        String skype = "skype";
        for (int i = 1; i < 100; i++) {
            Inscription item = new Inscription();
            item.setNumeroInscription(fakeInteger(numeroInscription, i));
            item.setNoteQuizNiveau(fakeBigDecimal(noteQuizNiveau, i));
            item.setQuizFinished(fakeBoolean(quizFinished, i));
            item.setDateRegistration(fakeString(dateRegistration, i));
            item.setDatedebutinscription(fakeLocalDateTime(datedebutinscription, i));
            item.setDatefininscription(fakeLocalDateTime(datefininscription, i));
            item.setSkype(fakeString(skype, i));
            inscriptionService.create(item);
        }
    }
    private void createEtatReponse(){
        String code = "code";
        String libelle = "libelle";
        for (int i = 1; i < 100; i++) {
            EtatReponse item = new EtatReponse();
            item.setCode(fakeString(code, i));
            item.setLibelle(fakeString(libelle, i));
            etatReponseService.create(item);
        }
    }
    private void createFaqType(){
        String destinataire = "destinataire";
        String libelle = "libelle";
        for (int i = 1; i < 100; i++) {
            FaqType item = new FaqType();
            item.setDestinataire(fakeString(destinataire, i));
            item.setLibelle(fakeString(libelle, i));
            faqTypeService.create(item);
        }
    }
    private void createConfirmationToken(){
        String token = "token";
        String expiresAt = "expiresAt";
        String createdAt = "createdAt";
        String confirmedAt = "confirmedAt";
        for (int i = 1; i < 100; i++) {
            ConfirmationToken item = new ConfirmationToken();
            item.setToken(fakeString(token, i));
            item.setExpiresAt(fakeLocalDateTime(expiresAt, i));
            item.setCreatedAt(fakeLocalDateTime(createdAt, i));
            item.setConfirmedAt(fakeLocalDateTime(confirmedAt, i));
            confirmationTokenService.create(item);
        }
    }
    private void createTeacherLocality(){
        String code = "code";
        String libelle = "libelle";
        for (int i = 1; i < 100; i++) {
            TeacherLocality item = new TeacherLocality();
            item.setCode(fakeString(code, i));
            item.setLibelle(fakeString(libelle, i));
            teacherLocalityService.create(item);
        }
    }
    private void createQuizEtudiant(){
        String ref = "ref";
         String note = "note";
        String resultat = "resultat";
         String questionCurrent = "questionCurrent";
        for (int i = 1; i < 100; i++) {
            QuizEtudiant item = new QuizEtudiant();
            item.setRef(fakeString(ref, i));
            item.setNote(fakeBigDecimal(note, i));
            item.setResultat(fakeString(resultat, i));
            item.setQuestionCurrent(fakeLong(questionCurrent, i));
            quizEtudiantService.create(item);
        }
    }
    private void createContact(){
        String name = "name";
        String email = "email";
        String phone = "phone";
        String setFrom = "setFrom";
        String dateContact = "dateContact";
         String replied = "replied";
        String message = "message";
        for (int i = 1; i < 100; i++) {
            Contact item = new Contact();
            item.setName(fakeString(name, i));
            item.setEmail(fakeString(email, i));
            item.setPhone(fakeString(phone, i));
            item.setSetFrom(fakeString(setFrom, i));
            item.setDateContact(fakeLocalDateTime(dateContact, i));
            item.setReplied(fakeBoolean(replied, i));
            item.setMessage(fakeString(message, i));
            contactService.create(item);
        }
    }
    private void createSectionItem(){
        String imageUrl = "imageUrl";
        String response = "response";
        String transcription = "transcription";
        String translation = "translation";
        String explanation = "explanation";
        String example = "example";
        String synonyms = "synonyms";
        for (int i = 1; i < 100; i++) {
            SectionItem item = new SectionItem();
            item.setImageUrl(fakeString(imageUrl, i));
            item.setResponse(fakeString(response, i));
            item.setTranscription(fakeString(transcription, i));
            item.setTranslation(fakeString(translation, i));
            item.setExplanation(fakeString(explanation, i));
            item.setExample(fakeString(example, i));
            item.setSynonyms(fakeString(synonyms, i));
            sectionItemService.create(item);
        }
    }
    private void createNiveauEtude(){
        String libelle = "libelle";
        String code = "code";
        for (int i = 1; i < 100; i++) {
            NiveauEtude item = new NiveauEtude();
            item.setLibelle(fakeString(libelle, i));
            item.setCode(fakeString(code, i));
            niveauEtudeService.create(item);
        }
    }
    private void createEtatCours(){
        String code = "code";
        String libelle = "libelle";
        for (int i = 1; i < 100; i++) {
            EtatCours item = new EtatCours();
            item.setCode(fakeString(code, i));
            item.setLibelle(fakeString(libelle, i));
            etatCoursService.create(item);
        }
    }
    private void createReclamationEtudiant(){
        String reference = "reference";
        String dateReclamation = "dateReclamation";
        String message = "message";
        String setFrom = "setFrom";
        String img = "img";
         String traite = "traite";
        String dateTraitement = "dateTraitement";
        String dateReponse = "dateReponse";
         String postView = "postView";
        String objetReclamationEtudiant = "objetReclamationEtudiant";
        String commentaireTraiteur = "commentaireTraiteur";
        String username = "username";
        for (int i = 1; i < 100; i++) {
            ReclamationEtudiant item = new ReclamationEtudiant();
            item.setReference(fakeString(reference, i));
            item.setDateReclamation(fakeLocalDateTime(dateReclamation, i));
            item.setMessage(fakeString(message, i));
            item.setSetFrom(fakeString(setFrom, i));
            item.setImg(fakeString(img, i));
            item.setTraite(fakeBoolean(traite, i));
            item.setDateTraitement(fakeLocalDateTime(dateTraitement, i));
            item.setDateReponse(fakeLocalDateTime(dateReponse, i));
            item.setPostView(fakeBoolean(postView, i));
            item.setObjetReclamationEtudiant(fakeString(objetReclamationEtudiant, i));
            item.setCommentaireTraiteur(fakeString(commentaireTraiteur, i));
            item.setUsername(fakeString(username, i));
            reclamationEtudiantService.create(item);
        }
    }
    private void createSection(){
        String code = "code";
        String libelle = "libelle";
        String urlImage = "urlImage";
        String urlImage2 = "urlImage2";
        String urlImage3 = "urlImage3";
        String urlVideo = "urlVideo";
        String contenu = "contenu";
        String questions = "questions";
        String indicationProf = "indicationProf";
         String numeroOrder = "numeroOrder";
         String url = "url";
         String content = "content";
        for (int i = 1; i < 100; i++) {
            Section item = new Section();
            item.setCode(fakeString(code, i));
            item.setLibelle(fakeString(libelle, i));
            item.setUrlImage(fakeString(urlImage, i));
            item.setUrlImage2(fakeString(urlImage2, i));
            item.setUrlImage3(fakeString(urlImage3, i));
            item.setUrlVideo(fakeString(urlVideo, i));
            item.setContenu(fakeString(contenu, i));
            item.setQuestions(fakeString(questions, i));
            item.setIndicationProf(fakeString(indicationProf, i));
            item.setNumeroOrder(fakeInteger(numeroOrder, i));
            item.setUrl(fakeInteger(url, i));
            item.setContent(fakeInteger(content, i));
            sectionService.create(item);
        }
    }
    private void createSalary(){
        String code = "code";
         String mois = "mois";
         String annee = "annee";
         String nbrSessionMensuel = "nbrSessionMensuel";
         String payer = "payer";
         String totalPayment = "totalPayment";
         String totalBonusClassAverage = "totalBonusClassAverage";
         String totalBonusWorkload = "totalBonusWorkload";
        for (int i = 1; i < 100; i++) {
            Salary item = new Salary();
            item.setCode(fakeString(code, i));
            item.setMois(fakeInteger(mois, i));
            item.setAnnee(fakeInteger(annee, i));
            item.setNbrSessionMensuel(fakeBigDecimal(nbrSessionMensuel, i));
            item.setPayer(fakeBoolean(payer, i));
            item.setTotalPayment(fakeBigDecimal(totalPayment, i));
            item.setTotalBonusClassAverage(fakeBigDecimal(totalBonusClassAverage, i));
            item.setTotalBonusWorkload(fakeBigDecimal(totalBonusWorkload, i));
            salaryService.create(item);
        }
    }
    private void createClassAverageBonusProf(){
         String mois = "mois";
         String annee = "annee";
        for (int i = 1; i < 100; i++) {
            ClassAverageBonusProf item = new ClassAverageBonusProf();
            item.setMois(fakeInteger(mois, i));
            item.setAnnee(fakeInteger(annee, i));
            classAverageBonusProfService.create(item);
        }
    }
    private void createReponse(){
        String ref = "ref";
        String lib = "lib";
         String numero = "numero";
        for (int i = 1; i < 100; i++) {
            Reponse item = new Reponse();
            item.setRef(fakeString(ref, i));
            item.setLib(fakeString(lib, i));
            item.setNumero(fakeLong(numero, i));
            reponseService.create(item);
        }
    }
    private void createScheduleProf(){
        String subject = "subject";
        String startTime = "startTime";
        String endTime = "endTime";
        String ref = "ref";
        String grpName = "grpName";
        String profName = "profName";
         String profsId = "profsId";
        for (int i = 1; i < 100; i++) {
            ScheduleProf item = new ScheduleProf();
            item.setSubject(fakeString(subject, i));
            item.setStartTime(fakeLocalDateTime(startTime, i));
            item.setEndTime(fakeLocalDateTime(endTime, i));
            item.setRef(fakeString(ref, i));
            item.setGrpName(fakeString(grpName, i));
            item.setProfName(fakeString(profName, i));
            item.setProfsId(fakeLong(profsId, i));
            scheduleProfService.create(item);
        }
    }
    private void createRecommendTeacher(){
        String ref = "ref";
         String nombrevote = "nombrevote";
        String nom = "nom";
        String prenom = "prenom";
        String commentaire = "commentaire";
        String telephone = "telephone";
        String login = "login";
        String dateRecommamdation = "dateRecommamdation";
        for (int i = 1; i < 100; i++) {
            RecommendTeacher item = new RecommendTeacher();
            item.setRef(fakeString(ref, i));
            item.setNombrevote(fakeInteger(nombrevote, i));
            item.setNom(fakeString(nom, i));
            item.setPrenom(fakeString(prenom, i));
            item.setCommentaire(fakeString(commentaire, i));
            item.setTelephone(fakeString(telephone, i));
            item.setLogin(fakeString(login, i));
            item.setDateRecommamdation(fakeLocalDateTime(dateRecommamdation, i));
            recommendTeacherService.create(item);
        }
    }
    private void createClassRoom(){
        String libelle = "libelle";
        String description = "description";
        for (int i = 1; i < 100; i++) {
            ClassRoom item = new ClassRoom();
            item.setLibelle(fakeString(libelle, i));
            item.setDescription(fakeString(description, i));
            classRoomService.create(item);
        }
    }
    private void createLevelTestConfiguration(){
         String noteMin = "noteMin";
         String noteMax = "noteMax";
        for (int i = 1; i < 100; i++) {
            LevelTestConfiguration item = new LevelTestConfiguration();
            item.setNoteMin(fakeBigDecimal(noteMin, i));
            item.setNoteMax(fakeBigDecimal(noteMax, i));
            levelTestConfigurationService.create(item);
        }
    }
    private void createWorkloadBonus(){
        String code = "code";
         String nombreSession = "nombreSession";
         String prix = "prix";
        for (int i = 1; i < 100; i++) {
            WorkloadBonus item = new WorkloadBonus();
            item.setCode(fakeString(code, i));
            item.setNombreSession(fakeInteger(nombreSession, i));
            item.setPrix(fakeBigDecimal(prix, i));
            workloadBonusService.create(item);
        }
    }
    private void createHomeWorkEtudiant(){
         String note = "note";
        String dateHomeWork = "dateHomeWork";
        for (int i = 1; i < 100; i++) {
            HomeWorkEtudiant item = new HomeWorkEtudiant();
            item.setNote(fakeBigDecimal(note, i));
            item.setDateHomeWork(fakeLocalDateTime(dateHomeWork, i));
            homeWorkEtudiantService.create(item);
        }
    }
    private void createQuizClassRoom(){
        for (int i = 1; i < 100; i++) {
            QuizClassRoom item = new QuizClassRoom();
            quizClassRoomService.create(item);
        }
    }
    private void createWorkloadBonusProf(){
         String mois = "mois";
         String annee = "annee";
        for (int i = 1; i < 100; i++) {
            WorkloadBonusProf item = new WorkloadBonusProf();
            item.setMois(fakeInteger(mois, i));
            item.setAnnee(fakeInteger(annee, i));
            workloadBonusProfService.create(item);
        }
    }
    private void createGroupeEtudiant(){
        String libelle = "libelle";
        String niveau = "niveau";
        String dateDebut = "dateDebut";
        String dateFin = "dateFin";
         String nombrePlace = "nombrePlace";
         String nombrePlacevide = "nombrePlacevide";
         String nombrePlaceNonVide = "nombrePlaceNonVide";
        for (int i = 1; i < 100; i++) {
            GroupeEtudiant item = new GroupeEtudiant();
            item.setLibelle(fakeString(libelle, i));
            item.setNiveau(fakeString(niveau, i));
            item.setDateDebut(fakeLocalDateTime(dateDebut, i));
            item.setDateFin(fakeLocalDateTime(dateFin, i));
            item.setNombrePlace(fakeLong(nombrePlace, i));
            item.setNombrePlacevide(fakeLong(nombrePlacevide, i));
            item.setNombrePlaceNonVide(fakeLong(nombrePlaceNonVide, i));
            groupeEtudiantService.create(item);
        }
    }

    private static String fakeString(String attributeName, int i) {
        return attributeName + i;
    }

    private static Long fakeLong(String attributeName, int i) {
        return  10L * i;
    }
    private static Integer fakeInteger(String attributeName, int i) {
        return  10 * i;
    }

    private static Double fakeDouble(String attributeName, int i) {
        return 10D * i;
    }

    private static BigDecimal fakeBigDecimal(String attributeName, int i) {
        return  BigDecimal.valueOf(i*1L*10);
    }

    private static Boolean fakeBoolean(String attributeName, int i) {
        return i % 2 == 0 ? true : false;
    }
    private static LocalDateTime fakeLocalDateTime(String attributeName, int i) {
        return LocalDateTime.now().plusDays(i);
    }
    private static void addPermissionForAdmin(List<Permission> permissions){
        permissions.add(new Permission("TypeTeacher.edit"));
        permissions.add(new Permission("TypeTeacher.list"));
        permissions.add(new Permission("TypeTeacher.view"));
        permissions.add(new Permission("TypeTeacher.add"));
        permissions.add(new Permission("TypeTeacher.delete"));
        permissions.add(new Permission("GroupeEtude.edit"));
        permissions.add(new Permission("GroupeEtude.list"));
        permissions.add(new Permission("GroupeEtude.view"));
        permissions.add(new Permission("GroupeEtude.add"));
        permissions.add(new Permission("GroupeEtude.delete"));
        permissions.add(new Permission("EtudiantClassRoom.edit"));
        permissions.add(new Permission("EtudiantClassRoom.list"));
        permissions.add(new Permission("EtudiantClassRoom.view"));
        permissions.add(new Permission("EtudiantClassRoom.add"));
        permissions.add(new Permission("EtudiantClassRoom.delete"));
        permissions.add(new Permission("FreeTrialConfiguration.edit"));
        permissions.add(new Permission("FreeTrialConfiguration.list"));
        permissions.add(new Permission("FreeTrialConfiguration.view"));
        permissions.add(new Permission("FreeTrialConfiguration.add"));
        permissions.add(new Permission("FreeTrialConfiguration.delete"));
        permissions.add(new Permission("Parcours.edit"));
        permissions.add(new Permission("Parcours.list"));
        permissions.add(new Permission("Parcours.view"));
        permissions.add(new Permission("Parcours.add"));
        permissions.add(new Permission("Parcours.delete"));
        permissions.add(new Permission("StatutFreeTrial.edit"));
        permissions.add(new Permission("StatutFreeTrial.list"));
        permissions.add(new Permission("StatutFreeTrial.view"));
        permissions.add(new Permission("StatutFreeTrial.add"));
        permissions.add(new Permission("StatutFreeTrial.delete"));
        permissions.add(new Permission("Admin.edit"));
        permissions.add(new Permission("Admin.list"));
        permissions.add(new Permission("Admin.view"));
        permissions.add(new Permission("Admin.add"));
        permissions.add(new Permission("Admin.delete"));
        permissions.add(new Permission("InteretEtudiant.edit"));
        permissions.add(new Permission("InteretEtudiant.list"));
        permissions.add(new Permission("InteretEtudiant.view"));
        permissions.add(new Permission("InteretEtudiant.add"));
        permissions.add(new Permission("InteretEtudiant.delete"));
        permissions.add(new Permission("HomeWorkQuestion.edit"));
        permissions.add(new Permission("HomeWorkQuestion.list"));
        permissions.add(new Permission("HomeWorkQuestion.view"));
        permissions.add(new Permission("HomeWorkQuestion.add"));
        permissions.add(new Permission("HomeWorkQuestion.delete"));
        permissions.add(new Permission("HomeWork.edit"));
        permissions.add(new Permission("HomeWork.list"));
        permissions.add(new Permission("HomeWork.view"));
        permissions.add(new Permission("HomeWork.add"));
        permissions.add(new Permission("HomeWork.delete"));
        permissions.add(new Permission("CategorieSection.edit"));
        permissions.add(new Permission("CategorieSection.list"));
        permissions.add(new Permission("CategorieSection.view"));
        permissions.add(new Permission("CategorieSection.add"));
        permissions.add(new Permission("CategorieSection.delete"));
        permissions.add(new Permission("ReponseEtudiant.edit"));
        permissions.add(new Permission("ReponseEtudiant.list"));
        permissions.add(new Permission("ReponseEtudiant.view"));
        permissions.add(new Permission("ReponseEtudiant.add"));
        permissions.add(new Permission("ReponseEtudiant.delete"));
        permissions.add(new Permission("ClassAverageBonus.edit"));
        permissions.add(new Permission("ClassAverageBonus.list"));
        permissions.add(new Permission("ClassAverageBonus.view"));
        permissions.add(new Permission("ClassAverageBonus.add"));
        permissions.add(new Permission("ClassAverageBonus.delete"));
        permissions.add(new Permission("TrancheHoraireProf.edit"));
        permissions.add(new Permission("TrancheHoraireProf.list"));
        permissions.add(new Permission("TrancheHoraireProf.view"));
        permissions.add(new Permission("TrancheHoraireProf.add"));
        permissions.add(new Permission("TrancheHoraireProf.delete"));
        permissions.add(new Permission("EtatEtudiantSchedule.edit"));
        permissions.add(new Permission("EtatEtudiantSchedule.list"));
        permissions.add(new Permission("EtatEtudiantSchedule.view"));
        permissions.add(new Permission("EtatEtudiantSchedule.add"));
        permissions.add(new Permission("EtatEtudiantSchedule.delete"));
        permissions.add(new Permission("ResultatHomeWork.edit"));
        permissions.add(new Permission("ResultatHomeWork.list"));
        permissions.add(new Permission("ResultatHomeWork.view"));
        permissions.add(new Permission("ResultatHomeWork.add"));
        permissions.add(new Permission("ResultatHomeWork.delete"));
        permissions.add(new Permission("SessionCours.edit"));
        permissions.add(new Permission("SessionCours.list"));
        permissions.add(new Permission("SessionCours.view"));
        permissions.add(new Permission("SessionCours.add"));
        permissions.add(new Permission("SessionCours.delete"));
        permissions.add(new Permission("ProfReview.edit"));
        permissions.add(new Permission("ProfReview.list"));
        permissions.add(new Permission("ProfReview.view"));
        permissions.add(new Permission("ProfReview.add"));
        permissions.add(new Permission("ProfReview.delete"));
        permissions.add(new Permission("Cours.edit"));
        permissions.add(new Permission("Cours.list"));
        permissions.add(new Permission("Cours.view"));
        permissions.add(new Permission("Cours.add"));
        permissions.add(new Permission("Cours.delete"));
        permissions.add(new Permission("CalendrierProf.edit"));
        permissions.add(new Permission("CalendrierProf.list"));
        permissions.add(new Permission("CalendrierProf.view"));
        permissions.add(new Permission("CalendrierProf.add"));
        permissions.add(new Permission("CalendrierProf.delete"));
        permissions.add(new Permission("ReponseEtudiantHomeWork.edit"));
        permissions.add(new Permission("ReponseEtudiantHomeWork.list"));
        permissions.add(new Permission("ReponseEtudiantHomeWork.view"));
        permissions.add(new Permission("ReponseEtudiantHomeWork.add"));
        permissions.add(new Permission("ReponseEtudiantHomeWork.delete"));
        permissions.add(new Permission("HoweWorkQSTReponse.edit"));
        permissions.add(new Permission("HoweWorkQSTReponse.list"));
        permissions.add(new Permission("HoweWorkQSTReponse.view"));
        permissions.add(new Permission("HoweWorkQSTReponse.add"));
        permissions.add(new Permission("HoweWorkQSTReponse.delete"));
        permissions.add(new Permission("ReclamationProf.edit"));
        permissions.add(new Permission("ReclamationProf.list"));
        permissions.add(new Permission("ReclamationProf.view"));
        permissions.add(new Permission("ReclamationProf.add"));
        permissions.add(new Permission("ReclamationProf.delete"));
        permissions.add(new Permission("Langue.edit"));
        permissions.add(new Permission("Langue.list"));
        permissions.add(new Permission("Langue.view"));
        permissions.add(new Permission("Langue.add"));
        permissions.add(new Permission("Langue.delete"));
        permissions.add(new Permission("TypeDeQuestion.edit"));
        permissions.add(new Permission("TypeDeQuestion.list"));
        permissions.add(new Permission("TypeDeQuestion.view"));
        permissions.add(new Permission("TypeDeQuestion.add"));
        permissions.add(new Permission("TypeDeQuestion.delete"));
        permissions.add(new Permission("FreeTrialStudentWhatsTemplate.edit"));
        permissions.add(new Permission("FreeTrialStudentWhatsTemplate.list"));
        permissions.add(new Permission("FreeTrialStudentWhatsTemplate.view"));
        permissions.add(new Permission("FreeTrialStudentWhatsTemplate.add"));
        permissions.add(new Permission("FreeTrialStudentWhatsTemplate.delete"));
        permissions.add(new Permission("FreeTrialTeacherEmailTemplate.edit"));
        permissions.add(new Permission("FreeTrialTeacherEmailTemplate.list"));
        permissions.add(new Permission("FreeTrialTeacherEmailTemplate.view"));
        permissions.add(new Permission("FreeTrialTeacherEmailTemplate.add"));
        permissions.add(new Permission("FreeTrialTeacherEmailTemplate.delete"));
        permissions.add(new Permission("News.edit"));
        permissions.add(new Permission("News.list"));
        permissions.add(new Permission("News.view"));
        permissions.add(new Permission("News.add"));
        permissions.add(new Permission("News.delete"));
        permissions.add(new Permission("Services.edit"));
        permissions.add(new Permission("Services.list"));
        permissions.add(new Permission("Services.view"));
        permissions.add(new Permission("Services.add"));
        permissions.add(new Permission("Services.delete"));
        permissions.add(new Permission("Skill.edit"));
        permissions.add(new Permission("Skill.list"));
        permissions.add(new Permission("Skill.view"));
        permissions.add(new Permission("Skill.add"));
        permissions.add(new Permission("Skill.delete"));
        permissions.add(new Permission("EtatInscription.edit"));
        permissions.add(new Permission("EtatInscription.list"));
        permissions.add(new Permission("EtatInscription.view"));
        permissions.add(new Permission("EtatInscription.add"));
        permissions.add(new Permission("EtatInscription.delete"));
        permissions.add(new Permission("InviteStudent.edit"));
        permissions.add(new Permission("InviteStudent.list"));
        permissions.add(new Permission("InviteStudent.view"));
        permissions.add(new Permission("InviteStudent.add"));
        permissions.add(new Permission("InviteStudent.delete"));
        permissions.add(new Permission("PackStudent.edit"));
        permissions.add(new Permission("PackStudent.list"));
        permissions.add(new Permission("PackStudent.view"));
        permissions.add(new Permission("PackStudent.add"));
        permissions.add(new Permission("PackStudent.delete"));
        permissions.add(new Permission("Price.edit"));
        permissions.add(new Permission("Price.list"));
        permissions.add(new Permission("Price.view"));
        permissions.add(new Permission("Price.add"));
        permissions.add(new Permission("Price.delete"));
        permissions.add(new Permission("CategorieProf.edit"));
        permissions.add(new Permission("CategorieProf.list"));
        permissions.add(new Permission("CategorieProf.view"));
        permissions.add(new Permission("CategorieProf.add"));
        permissions.add(new Permission("CategorieProf.delete"));
        permissions.add(new Permission("FaqEtudiant.edit"));
        permissions.add(new Permission("FaqEtudiant.list"));
        permissions.add(new Permission("FaqEtudiant.view"));
        permissions.add(new Permission("FaqEtudiant.add"));
        permissions.add(new Permission("FaqEtudiant.delete"));
        permissions.add(new Permission("TypeReclamationEtudiant.edit"));
        permissions.add(new Permission("TypeReclamationEtudiant.list"));
        permissions.add(new Permission("TypeReclamationEtudiant.view"));
        permissions.add(new Permission("TypeReclamationEtudiant.add"));
        permissions.add(new Permission("TypeReclamationEtudiant.delete"));
        permissions.add(new Permission("Dictionary.edit"));
        permissions.add(new Permission("Dictionary.list"));
        permissions.add(new Permission("Dictionary.view"));
        permissions.add(new Permission("Dictionary.add"));
        permissions.add(new Permission("Dictionary.delete"));
        permissions.add(new Permission("EtudiantCours.edit"));
        permissions.add(new Permission("EtudiantCours.list"));
        permissions.add(new Permission("EtudiantCours.view"));
        permissions.add(new Permission("EtudiantCours.add"));
        permissions.add(new Permission("EtudiantCours.delete"));
        permissions.add(new Permission("EtudiantReview.edit"));
        permissions.add(new Permission("EtudiantReview.list"));
        permissions.add(new Permission("EtudiantReview.view"));
        permissions.add(new Permission("EtudiantReview.add"));
        permissions.add(new Permission("EtudiantReview.delete"));
        permissions.add(new Permission("SuperCategorieSection.edit"));
        permissions.add(new Permission("SuperCategorieSection.list"));
        permissions.add(new Permission("SuperCategorieSection.view"));
        permissions.add(new Permission("SuperCategorieSection.add"));
        permissions.add(new Permission("SuperCategorieSection.delete"));
        permissions.add(new Permission("TypeHomeWork.edit"));
        permissions.add(new Permission("TypeHomeWork.list"));
        permissions.add(new Permission("TypeHomeWork.view"));
        permissions.add(new Permission("TypeHomeWork.add"));
        permissions.add(new Permission("TypeHomeWork.delete"));
        permissions.add(new Permission("Quiz.edit"));
        permissions.add(new Permission("Quiz.list"));
        permissions.add(new Permission("Quiz.view"));
        permissions.add(new Permission("Quiz.add"));
        permissions.add(new Permission("Quiz.delete"));
        permissions.add(new Permission("Vocabulary.edit"));
        permissions.add(new Permission("Vocabulary.list"));
        permissions.add(new Permission("Vocabulary.view"));
        permissions.add(new Permission("Vocabulary.add"));
        permissions.add(new Permission("Vocabulary.delete"));
        permissions.add(new Permission("Paiement.edit"));
        permissions.add(new Permission("Paiement.list"));
        permissions.add(new Permission("Paiement.view"));
        permissions.add(new Permission("Paiement.add"));
        permissions.add(new Permission("Paiement.delete"));
        permissions.add(new Permission("VocabularyQuiz.edit"));
        permissions.add(new Permission("VocabularyQuiz.list"));
        permissions.add(new Permission("VocabularyQuiz.view"));
        permissions.add(new Permission("VocabularyQuiz.add"));
        permissions.add(new Permission("VocabularyQuiz.delete"));
        permissions.add(new Permission("StatutSocial.edit"));
        permissions.add(new Permission("StatutSocial.list"));
        permissions.add(new Permission("StatutSocial.view"));
        permissions.add(new Permission("StatutSocial.add"));
        permissions.add(new Permission("StatutSocial.delete"));
        permissions.add(new Permission("FaqProf.edit"));
        permissions.add(new Permission("FaqProf.list"));
        permissions.add(new Permission("FaqProf.view"));
        permissions.add(new Permission("FaqProf.add"));
        permissions.add(new Permission("FaqProf.delete"));
        permissions.add(new Permission("FreeTrialformule.edit"));
        permissions.add(new Permission("FreeTrialformule.list"));
        permissions.add(new Permission("FreeTrialformule.view"));
        permissions.add(new Permission("FreeTrialformule.add"));
        permissions.add(new Permission("FreeTrialformule.delete"));
        permissions.add(new Permission("FreeTrial.edit"));
        permissions.add(new Permission("FreeTrial.list"));
        permissions.add(new Permission("FreeTrial.view"));
        permissions.add(new Permission("FreeTrial.add"));
        permissions.add(new Permission("FreeTrial.delete"));
        permissions.add(new Permission("Question.edit"));
        permissions.add(new Permission("Question.list"));
        permissions.add(new Permission("Question.view"));
        permissions.add(new Permission("Question.add"));
        permissions.add(new Permission("Question.delete"));
        permissions.add(new Permission("EtatEtudiant.edit"));
        permissions.add(new Permission("EtatEtudiant.list"));
        permissions.add(new Permission("EtatEtudiant.view"));
        permissions.add(new Permission("EtatEtudiant.add"));
        permissions.add(new Permission("EtatEtudiant.delete"));
        permissions.add(new Permission("Centre.edit"));
        permissions.add(new Permission("Centre.list"));
        permissions.add(new Permission("Centre.view"));
        permissions.add(new Permission("Centre.add"));
        permissions.add(new Permission("Centre.delete"));
        permissions.add(new Permission("Fonction.edit"));
        permissions.add(new Permission("Fonction.list"));
        permissions.add(new Permission("Fonction.view"));
        permissions.add(new Permission("Fonction.add"));
        permissions.add(new Permission("Fonction.delete"));
        permissions.add(new Permission("FreeTrialTeacherWhatsTemplate.edit"));
        permissions.add(new Permission("FreeTrialTeacherWhatsTemplate.list"));
        permissions.add(new Permission("FreeTrialTeacherWhatsTemplate.view"));
        permissions.add(new Permission("FreeTrialTeacherWhatsTemplate.add"));
        permissions.add(new Permission("FreeTrialTeacherWhatsTemplate.delete"));
        permissions.add(new Permission("Faq.edit"));
        permissions.add(new Permission("Faq.list"));
        permissions.add(new Permission("Faq.view"));
        permissions.add(new Permission("Faq.add"));
        permissions.add(new Permission("Faq.delete"));
        permissions.add(new Permission("FreeTrialStudentEmailTemplate.edit"));
        permissions.add(new Permission("FreeTrialStudentEmailTemplate.list"));
        permissions.add(new Permission("FreeTrialStudentEmailTemplate.view"));
        permissions.add(new Permission("FreeTrialStudentEmailTemplate.add"));
        permissions.add(new Permission("FreeTrialStudentEmailTemplate.delete"));
        permissions.add(new Permission("Etudiant.edit"));
        permissions.add(new Permission("Etudiant.list"));
        permissions.add(new Permission("Etudiant.view"));
        permissions.add(new Permission("Etudiant.add"));
        permissions.add(new Permission("Etudiant.delete"));
        permissions.add(new Permission("TypeReclamationProf.edit"));
        permissions.add(new Permission("TypeReclamationProf.list"));
        permissions.add(new Permission("TypeReclamationProf.view"));
        permissions.add(new Permission("TypeReclamationProf.add"));
        permissions.add(new Permission("TypeReclamationProf.delete"));
        permissions.add(new Permission("Prof.edit"));
        permissions.add(new Permission("Prof.list"));
        permissions.add(new Permission("Prof.view"));
        permissions.add(new Permission("Prof.add"));
        permissions.add(new Permission("Prof.delete"));
        permissions.add(new Permission("FreeTrialDetail.edit"));
        permissions.add(new Permission("FreeTrialDetail.list"));
        permissions.add(new Permission("FreeTrialDetail.view"));
        permissions.add(new Permission("FreeTrialDetail.add"));
        permissions.add(new Permission("FreeTrialDetail.delete"));
        permissions.add(new Permission("GroupeEtudiantDetail.edit"));
        permissions.add(new Permission("GroupeEtudiantDetail.list"));
        permissions.add(new Permission("GroupeEtudiantDetail.view"));
        permissions.add(new Permission("GroupeEtudiantDetail.add"));
        permissions.add(new Permission("GroupeEtudiantDetail.delete"));
        permissions.add(new Permission("Inscription.edit"));
        permissions.add(new Permission("Inscription.list"));
        permissions.add(new Permission("Inscription.view"));
        permissions.add(new Permission("Inscription.add"));
        permissions.add(new Permission("Inscription.delete"));
        permissions.add(new Permission("EtatReponse.edit"));
        permissions.add(new Permission("EtatReponse.list"));
        permissions.add(new Permission("EtatReponse.view"));
        permissions.add(new Permission("EtatReponse.add"));
        permissions.add(new Permission("EtatReponse.delete"));
        permissions.add(new Permission("FaqType.edit"));
        permissions.add(new Permission("FaqType.list"));
        permissions.add(new Permission("FaqType.view"));
        permissions.add(new Permission("FaqType.add"));
        permissions.add(new Permission("FaqType.delete"));
        permissions.add(new Permission("ConfirmationToken.edit"));
        permissions.add(new Permission("ConfirmationToken.list"));
        permissions.add(new Permission("ConfirmationToken.view"));
        permissions.add(new Permission("ConfirmationToken.add"));
        permissions.add(new Permission("ConfirmationToken.delete"));
        permissions.add(new Permission("TeacherLocality.edit"));
        permissions.add(new Permission("TeacherLocality.list"));
        permissions.add(new Permission("TeacherLocality.view"));
        permissions.add(new Permission("TeacherLocality.add"));
        permissions.add(new Permission("TeacherLocality.delete"));
        permissions.add(new Permission("QuizEtudiant.edit"));
        permissions.add(new Permission("QuizEtudiant.list"));
        permissions.add(new Permission("QuizEtudiant.view"));
        permissions.add(new Permission("QuizEtudiant.add"));
        permissions.add(new Permission("QuizEtudiant.delete"));
        permissions.add(new Permission("Contact.edit"));
        permissions.add(new Permission("Contact.list"));
        permissions.add(new Permission("Contact.view"));
        permissions.add(new Permission("Contact.add"));
        permissions.add(new Permission("Contact.delete"));
        permissions.add(new Permission("SectionItem.edit"));
        permissions.add(new Permission("SectionItem.list"));
        permissions.add(new Permission("SectionItem.view"));
        permissions.add(new Permission("SectionItem.add"));
        permissions.add(new Permission("SectionItem.delete"));
        permissions.add(new Permission("NiveauEtude.edit"));
        permissions.add(new Permission("NiveauEtude.list"));
        permissions.add(new Permission("NiveauEtude.view"));
        permissions.add(new Permission("NiveauEtude.add"));
        permissions.add(new Permission("NiveauEtude.delete"));
        permissions.add(new Permission("EtatCours.edit"));
        permissions.add(new Permission("EtatCours.list"));
        permissions.add(new Permission("EtatCours.view"));
        permissions.add(new Permission("EtatCours.add"));
        permissions.add(new Permission("EtatCours.delete"));
        permissions.add(new Permission("ReclamationEtudiant.edit"));
        permissions.add(new Permission("ReclamationEtudiant.list"));
        permissions.add(new Permission("ReclamationEtudiant.view"));
        permissions.add(new Permission("ReclamationEtudiant.add"));
        permissions.add(new Permission("ReclamationEtudiant.delete"));
        permissions.add(new Permission("Section.edit"));
        permissions.add(new Permission("Section.list"));
        permissions.add(new Permission("Section.view"));
        permissions.add(new Permission("Section.add"));
        permissions.add(new Permission("Section.delete"));
        permissions.add(new Permission("Salary.edit"));
        permissions.add(new Permission("Salary.list"));
        permissions.add(new Permission("Salary.view"));
        permissions.add(new Permission("Salary.add"));
        permissions.add(new Permission("Salary.delete"));
        permissions.add(new Permission("ClassAverageBonusProf.edit"));
        permissions.add(new Permission("ClassAverageBonusProf.list"));
        permissions.add(new Permission("ClassAverageBonusProf.view"));
        permissions.add(new Permission("ClassAverageBonusProf.add"));
        permissions.add(new Permission("ClassAverageBonusProf.delete"));
        permissions.add(new Permission("Reponse.edit"));
        permissions.add(new Permission("Reponse.list"));
        permissions.add(new Permission("Reponse.view"));
        permissions.add(new Permission("Reponse.add"));
        permissions.add(new Permission("Reponse.delete"));
        permissions.add(new Permission("ScheduleProf.edit"));
        permissions.add(new Permission("ScheduleProf.list"));
        permissions.add(new Permission("ScheduleProf.view"));
        permissions.add(new Permission("ScheduleProf.add"));
        permissions.add(new Permission("ScheduleProf.delete"));
        permissions.add(new Permission("RecommendTeacher.edit"));
        permissions.add(new Permission("RecommendTeacher.list"));
        permissions.add(new Permission("RecommendTeacher.view"));
        permissions.add(new Permission("RecommendTeacher.add"));
        permissions.add(new Permission("RecommendTeacher.delete"));
        permissions.add(new Permission("ClassRoom.edit"));
        permissions.add(new Permission("ClassRoom.list"));
        permissions.add(new Permission("ClassRoom.view"));
        permissions.add(new Permission("ClassRoom.add"));
        permissions.add(new Permission("ClassRoom.delete"));
        permissions.add(new Permission("LevelTestConfiguration.edit"));
        permissions.add(new Permission("LevelTestConfiguration.list"));
        permissions.add(new Permission("LevelTestConfiguration.view"));
        permissions.add(new Permission("LevelTestConfiguration.add"));
        permissions.add(new Permission("LevelTestConfiguration.delete"));
        permissions.add(new Permission("WorkloadBonus.edit"));
        permissions.add(new Permission("WorkloadBonus.list"));
        permissions.add(new Permission("WorkloadBonus.view"));
        permissions.add(new Permission("WorkloadBonus.add"));
        permissions.add(new Permission("WorkloadBonus.delete"));
        permissions.add(new Permission("HomeWorkEtudiant.edit"));
        permissions.add(new Permission("HomeWorkEtudiant.list"));
        permissions.add(new Permission("HomeWorkEtudiant.view"));
        permissions.add(new Permission("HomeWorkEtudiant.add"));
        permissions.add(new Permission("HomeWorkEtudiant.delete"));
        permissions.add(new Permission("QuizClassRoom.edit"));
        permissions.add(new Permission("QuizClassRoom.list"));
        permissions.add(new Permission("QuizClassRoom.view"));
        permissions.add(new Permission("QuizClassRoom.add"));
        permissions.add(new Permission("QuizClassRoom.delete"));
        permissions.add(new Permission("WorkloadBonusProf.edit"));
        permissions.add(new Permission("WorkloadBonusProf.list"));
        permissions.add(new Permission("WorkloadBonusProf.view"));
        permissions.add(new Permission("WorkloadBonusProf.add"));
        permissions.add(new Permission("WorkloadBonusProf.delete"));
        permissions.add(new Permission("GroupeEtudiant.edit"));
        permissions.add(new Permission("GroupeEtudiant.list"));
        permissions.add(new Permission("GroupeEtudiant.view"));
        permissions.add(new Permission("GroupeEtudiant.add"));
        permissions.add(new Permission("GroupeEtudiant.delete"));
    }

    @Autowired
    TypeTeacherAdminService typeTeacherService;
    @Autowired
    GroupeEtudeAdminService groupeEtudeService;
    @Autowired
    EtudiantClassRoomAdminService etudiantClassRoomService;
    @Autowired
    FreeTrialConfigurationAdminService freeTrialConfigurationService;
    @Autowired
    ParcoursAdminService parcoursService;
    @Autowired
    StatutFreeTrialAdminService statutFreeTrialService;
    @Autowired
    AdminAdminService adminService;
    @Autowired
    InteretEtudiantAdminService interetEtudiantService;
    @Autowired
    HomeWorkQuestionAdminService homeWorkQuestionService;
    @Autowired
    HomeWorkAdminService homeWorkService;
    @Autowired
    CategorieSectionAdminService categorieSectionService;
    @Autowired
    ReponseEtudiantAdminService reponseEtudiantService;
    @Autowired
    ClassAverageBonusAdminService classAverageBonusService;
    @Autowired
    TrancheHoraireProfAdminService trancheHoraireProfService;
    @Autowired
    EtatEtudiantScheduleAdminService etatEtudiantScheduleService;
    @Autowired
    ResultatHomeWorkAdminService resultatHomeWorkService;
    @Autowired
    SessionCoursAdminService sessionCoursService;
    @Autowired
    ProfReviewAdminService profReviewService;
    @Autowired
    CoursAdminService coursService;
    @Autowired
    CalendrierProfAdminService calendrierProfService;
    @Autowired
    ReponseEtudiantHomeWorkAdminService reponseEtudiantHomeWorkService;
    @Autowired
    HoweWorkQSTReponseAdminService howeWorkQSTReponseService;
    @Autowired
    ReclamationProfAdminService reclamationProfService;
    @Autowired
    LangueAdminService langueService;
    @Autowired
    TypeDeQuestionAdminService typeDeQuestionService;
    @Autowired
    FreeTrialStudentWhatsTemplateAdminService freeTrialStudentWhatsTemplateService;
    @Autowired
    FreeTrialTeacherEmailTemplateAdminService freeTrialTeacherEmailTemplateService;
    @Autowired
    NewsAdminService newsService;
    @Autowired
    ServicesAdminService servicesService;
    @Autowired
    SkillAdminService skillService;
    @Autowired
    EtatInscriptionAdminService etatInscriptionService;
    @Autowired
    InviteStudentAdminService inviteStudentService;
    @Autowired
    PackStudentAdminService packStudentService;
    @Autowired
    PriceAdminService priceService;
    @Autowired
    CategorieProfAdminService categorieProfService;
    @Autowired
    FaqEtudiantAdminService faqEtudiantService;
    @Autowired
    TypeReclamationEtudiantAdminService typeReclamationEtudiantService;
    @Autowired
    DictionaryAdminService dictionaryService;
    @Autowired
    EtudiantCoursAdminService etudiantCoursService;
    @Autowired
    EtudiantReviewAdminService etudiantReviewService;
    @Autowired
    SuperCategorieSectionAdminService superCategorieSectionService;
    @Autowired
    TypeHomeWorkAdminService typeHomeWorkService;
    @Autowired
    QuizAdminService quizService;
    @Autowired
    VocabularyAdminService vocabularyService;
    @Autowired
    PaiementAdminService paiementService;
    @Autowired
    VocabularyQuizAdminService vocabularyQuizService;
    @Autowired
    StatutSocialAdminService statutSocialService;
    @Autowired
    FaqProfAdminService faqProfService;
    @Autowired
    FreeTrialformuleAdminService freeTrialformuleService;
    @Autowired
    FreeTrialAdminService freeTrialService;
    @Autowired
    QuestionAdminService questionService;
    @Autowired
    EtatEtudiantAdminService etatEtudiantService;
    @Autowired
    CentreAdminService centreService;
    @Autowired
    FonctionAdminService fonctionService;
    @Autowired
    FreeTrialTeacherWhatsTemplateAdminService freeTrialTeacherWhatsTemplateService;
    @Autowired
    FaqAdminService faqService;
    @Autowired
    FreeTrialStudentEmailTemplateAdminService freeTrialStudentEmailTemplateService;
    @Autowired
    EtudiantAdminService etudiantService;
    @Autowired
    TypeReclamationProfAdminService typeReclamationProfService;
    @Autowired
    ProfAdminService profService;
    @Autowired
    FreeTrialDetailAdminService freeTrialDetailService;
    @Autowired
    GroupeEtudiantDetailAdminService groupeEtudiantDetailService;
    @Autowired
    InscriptionAdminService inscriptionService;
    @Autowired
    EtatReponseAdminService etatReponseService;
    @Autowired
    FaqTypeAdminService faqTypeService;
    @Autowired
    ConfirmationTokenAdminService confirmationTokenService;
    @Autowired
    TeacherLocalityAdminService teacherLocalityService;
    @Autowired
    QuizEtudiantAdminService quizEtudiantService;
    @Autowired
    ContactAdminService contactService;
    @Autowired
    SectionItemAdminService sectionItemService;
    @Autowired
    NiveauEtudeAdminService niveauEtudeService;
    @Autowired
    EtatCoursAdminService etatCoursService;
    @Autowired
    ReclamationEtudiantAdminService reclamationEtudiantService;
    @Autowired
    SectionAdminService sectionService;
    @Autowired
    SalaryAdminService salaryService;
    @Autowired
    ClassAverageBonusProfAdminService classAverageBonusProfService;
    @Autowired
    ReponseAdminService reponseService;
    @Autowired
    ScheduleProfAdminService scheduleProfService;
    @Autowired
    RecommendTeacherAdminService recommendTeacherService;
    @Autowired
    ClassRoomAdminService classRoomService;
    @Autowired
    LevelTestConfigurationAdminService levelTestConfigurationService;
    @Autowired
    WorkloadBonusAdminService workloadBonusService;
    @Autowired
    HomeWorkEtudiantAdminService homeWorkEtudiantService;
    @Autowired
    QuizClassRoomAdminService quizClassRoomService;
    @Autowired
    WorkloadBonusProfAdminService workloadBonusProfService;
    @Autowired
    GroupeEtudiantAdminService groupeEtudiantService;
}


