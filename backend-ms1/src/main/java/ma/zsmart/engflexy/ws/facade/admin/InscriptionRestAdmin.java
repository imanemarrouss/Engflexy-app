package  ma.zsmart.engflexy.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.zsmart.engflexy.bean.core.Inscription;
import ma.zsmart.engflexy.bean.history.InscriptionHistory;
import ma.zsmart.engflexy.dao.criteria.core.InscriptionCriteria;
import ma.zsmart.engflexy.dao.criteria.history.InscriptionHistoryCriteria;
import ma.zsmart.engflexy.service.facade.admin.InscriptionAdminService;
import ma.zsmart.engflexy.ws.converter.InscriptionConverter;
import ma.zsmart.engflexy.ws.dto.InscriptionDto;
import ma.zsmart.engflexy.zynerator.controller.AbstractController;
import ma.zsmart.engflexy.zynerator.dto.AuditEntityDto;
import ma.zsmart.engflexy.zynerator.dto.FileTempDto;
import ma.zsmart.engflexy.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Api("Manages inscription services")
@RestController
@RequestMapping("/api/admin/inscription/")
public class InscriptionRestAdmin  extends AbstractController<Inscription, InscriptionDto, InscriptionHistory, InscriptionCriteria, InscriptionHistoryCriteria, InscriptionAdminService, InscriptionConverter> {


    @ApiOperation("upload one inscription")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple inscriptions")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all inscriptions")
    @GetMapping("")
    @Override
    public ResponseEntity<List<InscriptionDto>> findAll() throws Exception {
        return super.findAll();
    }


    @ApiOperation("Finds a inscription by id")
    @GetMapping("id/{id}")
    @Override
    public ResponseEntity<InscriptionDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  inscription")
    @PostMapping("")
    @Override
    public ResponseEntity<InscriptionDto> save(@RequestBody InscriptionDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  inscription")
    @PutMapping("")
    @Override
    public ResponseEntity<InscriptionDto> update(@RequestBody InscriptionDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of inscription")
    @PostMapping("multiple")
    @Override
    public ResponseEntity<List<InscriptionDto>> delete(@RequestBody List<InscriptionDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified inscription")
    @DeleteMapping("")
    @Override
    public ResponseEntity<InscriptionDto> delete(@RequestBody InscriptionDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified inscription")
    @DeleteMapping("id/{id}")
    @Override
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple inscriptions by ids")
    @DeleteMapping("multiple/id")
    @Override
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("find by etudiant id")
    @GetMapping("etudiant/id/{id}")
    public List<Inscription> findByEtudiantId(@PathVariable Long id){
        return service.findByEtudiantId(id);
    }
    @ApiOperation("delete by etudiant id")
    @DeleteMapping("etudiant/id/{id}")
    public int deleteByEtudiantId(@PathVariable Long id){
        return service.deleteByEtudiantId(id);
    }
    @ApiOperation("find by etatInscription id")
    @GetMapping("etatInscription/id/{id}")
    public List<Inscription> findByEtatInscriptionId(@PathVariable Long id){
        return service.findByEtatInscriptionId(id);
    }
    @ApiOperation("delete by etatInscription id")
    @DeleteMapping("etatInscription/id/{id}")
    public int deleteByEtatInscriptionId(@PathVariable Long id){
        return service.deleteByEtatInscriptionId(id);
    }
    @ApiOperation("find by parcours id")
    @GetMapping("parcours/id/{id}")
    public List<Inscription> findByParcoursId(@PathVariable Long id){
        return service.findByParcoursId(id);
    }
    @ApiOperation("delete by parcours id")
    @DeleteMapping("parcours/id/{id}")
    public int deleteByParcoursId(@PathVariable Long id){
        return service.deleteByParcoursId(id);
    }
    @ApiOperation("find by groupeEtude id")
    @GetMapping("groupeEtude/id/{id}")
    public List<Inscription> findByGroupeEtudeId(@PathVariable Long id){
        return service.findByGroupeEtudeId(id);
    }
    @ApiOperation("delete by groupeEtude id")
    @DeleteMapping("groupeEtude/id/{id}")
    public int deleteByGroupeEtudeId(@PathVariable Long id){
        return service.deleteByGroupeEtudeId(id);
    }
    @ApiOperation("find by statutSocial id")
    @GetMapping("statutSocial/id/{id}")
    public List<Inscription> findByStatutSocialId(@PathVariable Long id){
        return service.findByStatutSocialId(id);
    }
    @ApiOperation("delete by statutSocial id")
    @DeleteMapping("statutSocial/id/{id}")
    public int deleteByStatutSocialId(@PathVariable Long id){
        return service.deleteByStatutSocialId(id);
    }
    @ApiOperation("find by interetEtudiant id")
    @GetMapping("interetEtudiant/id/{id}")
    public List<Inscription> findByInteretEtudiantId(@PathVariable Long id){
        return service.findByInteretEtudiantId(id);
    }
    @ApiOperation("delete by interetEtudiant id")
    @DeleteMapping("interetEtudiant/id/{id}")
    public int deleteByInteretEtudiantId(@PathVariable Long id){
        return service.deleteByInteretEtudiantId(id);
    }
    @ApiOperation("find by niveauEtude id")
    @GetMapping("niveauEtude/id/{id}")
    public List<Inscription> findByNiveauEtudeId(@PathVariable Long id){
        return service.findByNiveauEtudeId(id);
    }
    @ApiOperation("delete by niveauEtude id")
    @DeleteMapping("niveauEtude/id/{id}")
    public int deleteByNiveauEtudeId(@PathVariable Long id){
        return service.deleteByNiveauEtudeId(id);
    }
    @ApiOperation("find by fonction id")
    @GetMapping("fonction/id/{id}")
    public List<Inscription> findByFonctionId(@PathVariable Long id){
        return service.findByFonctionId(id);
    }
    @ApiOperation("delete by fonction id")
    @DeleteMapping("fonction/id/{id}")
    public int deleteByFonctionId(@PathVariable Long id){
        return service.deleteByFonctionId(id);
    }
    @ApiOperation("find by quiz id")
    @GetMapping("quiz/id/{id}")
    public List<Inscription> findByQuizId(@PathVariable Long id){
        return service.findByQuizId(id);
    }
    @ApiOperation("delete by quiz id")
    @DeleteMapping("quiz/id/{id}")
    public int deleteByQuizId(@PathVariable Long id){
        return service.deleteByQuizId(id);
    }
    @ApiOperation("find by packStudent id")
    @GetMapping("packStudent/id/{id}")
    public List<Inscription> findByPackStudentId(@PathVariable Long id){
        return service.findByPackStudentId(id);
    }
    @ApiOperation("delete by packStudent id")
    @DeleteMapping("packStudent/id/{id}")
    public int deleteByPackStudentId(@PathVariable Long id){
        return service.deleteByPackStudentId(id);
    }
    @ApiOperation("find by skill id")
    @GetMapping("skill/id/{id}")
    public List<Inscription> findBySkillId(@PathVariable Long id){
        return service.findBySkillId(id);
    }
    @ApiOperation("delete by skill id")
    @DeleteMapping("skill/id/{id}")
    public int deleteBySkillId(@PathVariable Long id){
        return service.deleteBySkillId(id);
    }
    @ApiOperation("Finds inscriptions by criteria")
    @PostMapping("find-by-criteria")
    @Override
    public ResponseEntity<List<InscriptionDto>> findByCriteria(@RequestBody InscriptionCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated inscriptions by criteria")
    @PostMapping("find-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody InscriptionCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports inscriptions by criteria")
    @PostMapping("export")
    @Override
    public ResponseEntity<InputStreamResource> export(@RequestBody InscriptionCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets inscription data size by criteria")
    @PostMapping("data-size-by-criteria")
    @Override
    public ResponseEntity<Integer> getDataSize(@RequestBody InscriptionCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets inscription history by id")
    @GetMapping("history/id/{id}")
    @Override
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets inscription paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody InscriptionHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports inscription history by criteria")
    @PostMapping("export-history")
    @Override
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody InscriptionHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets inscription history data size by criteria")
    @PostMapping("history-data-size")
    @Override
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody InscriptionHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public InscriptionRestAdmin (InscriptionAdminService service, InscriptionConverter converter) {
        super(service, converter);
    }


}