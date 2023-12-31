package  ma.zsmart.engflexy.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.zsmart.engflexy.bean.core.FreeTrial;
import ma.zsmart.engflexy.bean.history.FreeTrialHistory;
import ma.zsmart.engflexy.dao.criteria.core.FreeTrialCriteria;
import ma.zsmart.engflexy.dao.criteria.history.FreeTrialHistoryCriteria;
import ma.zsmart.engflexy.service.facade.admin.FreeTrialAdminService;
import ma.zsmart.engflexy.ws.converter.FreeTrialConverter;
import ma.zsmart.engflexy.ws.dto.FreeTrialDto;
import ma.zsmart.engflexy.zynerator.controller.AbstractController;
import ma.zsmart.engflexy.zynerator.dto.AuditEntityDto;
import ma.zsmart.engflexy.zynerator.dto.FileTempDto;
import ma.zsmart.engflexy.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Api("Manages freeTrial services")
@RestController
@RequestMapping("/api/admin/freeTrial/")
public class FreeTrialRestAdmin  extends AbstractController<FreeTrial, FreeTrialDto, FreeTrialHistory, FreeTrialCriteria, FreeTrialHistoryCriteria, FreeTrialAdminService, FreeTrialConverter> {


    @ApiOperation("upload one freeTrial")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple freeTrials")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all freeTrials")
    @GetMapping("")
    @Override
    public ResponseEntity<List<FreeTrialDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all freeTrials")
    @GetMapping("optimized")
    @Override
    public ResponseEntity<List<FreeTrialDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a freeTrial by id")
    @GetMapping("id/{id}")
    @Override
    public ResponseEntity<FreeTrialDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  freeTrial")
    @PostMapping("")
    @Override
    public ResponseEntity<FreeTrialDto> save(@RequestBody FreeTrialDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  freeTrial")
    @PutMapping("")
    @Override
    public ResponseEntity<FreeTrialDto> update(@RequestBody FreeTrialDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of freeTrial")
    @PostMapping("multiple")
    @Override
    public ResponseEntity<List<FreeTrialDto>> delete(@RequestBody List<FreeTrialDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified freeTrial")
    @DeleteMapping("")
    @Override
    public ResponseEntity<FreeTrialDto> delete(@RequestBody FreeTrialDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified freeTrial")
    @DeleteMapping("id/{id}")
    @Override
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple freeTrials by ids")
    @DeleteMapping("multiple/id")
    @Override
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("find by prof id")
    @GetMapping("prof/id/{id}")

    public List<FreeTrial> findByProfId(@PathVariable Long id){
        return service.findByProfId(id);
    }
    @ApiOperation("delete by prof id")
    @DeleteMapping("prof/id/{id}")
    public int deleteByProfId(@PathVariable Long id){
        return service.deleteByProfId(id);
    }
    @ApiOperation("find by niveauEtude id")
    @GetMapping("niveauEtude/id/{id}")
    public List<FreeTrial> findByNiveauEtudeId(@PathVariable Long id){
        return service.findByNiveauEtudeId(id);
    }
    @ApiOperation("delete by niveauEtude id")
    @DeleteMapping("niveauEtude/id/{id}")
    public int deleteByNiveauEtudeId(@PathVariable Long id){
        return service.deleteByNiveauEtudeId(id);
    }
    @ApiOperation("find by freeTrialStudentWhatsTemplate id")
    @GetMapping("freeTrialStudentWhatsTemplate/id/{id}")
    public List<FreeTrial> findByFreeTrialStudentWhatsTemplateId(@PathVariable Long id){
        return service.findByFreeTrialStudentWhatsTemplateId(id);
    }
    @ApiOperation("delete by freeTrialStudentWhatsTemplate id")
    @DeleteMapping("freeTrialStudentWhatsTemplate/id/{id}")
    public int deleteByFreeTrialStudentWhatsTemplateId(@PathVariable Long id){
        return service.deleteByFreeTrialStudentWhatsTemplateId(id);
    }
    @ApiOperation("find by freeTrialStudentEmailTemplate id")
    @GetMapping("freeTrialStudentEmailTemplate/id/{id}")
    public List<FreeTrial> findByFreeTrialStudentEmailTemplateId(@PathVariable Long id){
        return service.findByFreeTrialStudentEmailTemplateId(id);
    }
    @ApiOperation("delete by freeTrialStudentEmailTemplate id")
    @DeleteMapping("freeTrialStudentEmailTemplate/id/{id}")
    public int deleteByFreeTrialStudentEmailTemplateId(@PathVariable Long id){
        return service.deleteByFreeTrialStudentEmailTemplateId(id);
    }
    @ApiOperation("find by freeTrialTeacherEmailTemplate id")
    @GetMapping("freeTrialTeacherEmailTemplate/id/{id}")
    public List<FreeTrial> findByFreeTrialTeacherEmailTemplateId(@PathVariable Long id){
        return service.findByFreeTrialTeacherEmailTemplateId(id);
    }
    @ApiOperation("delete by freeTrialTeacherEmailTemplate id")
    @DeleteMapping("freeTrialTeacherEmailTemplate/id/{id}")
    public int deleteByFreeTrialTeacherEmailTemplateId(@PathVariable Long id){
        return service.deleteByFreeTrialTeacherEmailTemplateId(id);
    }
    @ApiOperation("find by freeTrialTeacherWhatsTemplate id")
    @GetMapping("freeTrialTeacherWhatsTemplate/id/{id}")
    public List<FreeTrial> findByFreeTrialTeacherWhatsTemplateId(@PathVariable Long id){
        return service.findByFreeTrialTeacherWhatsTemplateId(id);
    }
    @ApiOperation("delete by freeTrialTeacherWhatsTemplate id")
    @DeleteMapping("freeTrialTeacherWhatsTemplate/id/{id}")
    public int deleteByFreeTrialTeacherWhatsTemplateId(@PathVariable Long id){
        return service.deleteByFreeTrialTeacherWhatsTemplateId(id);
    }
    @ApiOperation("find by freeTrialConfiguration id")
    @GetMapping("freeTrialConfiguration/id/{id}")
    public List<FreeTrial> findByFreeTrialConfigurationId(@PathVariable Long id){
        return service.findByFreeTrialConfigurationId(id);
    }
    @ApiOperation("delete by freeTrialConfiguration id")
    @DeleteMapping("freeTrialConfiguration/id/{id}")
    public int deleteByFreeTrialConfigurationId(@PathVariable Long id){
        return service.deleteByFreeTrialConfigurationId(id);
    }
    @ApiOperation("find by statutFreeTrial id")
    @GetMapping("statutFreeTrial/id/{id}")
    public List<FreeTrial> findByStatutFreeTrialId(@PathVariable Long id){
        return service.findByStatutFreeTrialId(id);
    }
    @ApiOperation("delete by statutFreeTrial id")
    @DeleteMapping("statutFreeTrial/id/{id}")
    public int deleteByStatutFreeTrialId(@PathVariable Long id){
        return service.deleteByStatutFreeTrialId(id);
    }
    @ApiOperation("Finds a freeTrial and associated list by id")
    @GetMapping("detail/id/{id}")
    public ResponseEntity<FreeTrialDto> findWithAssociatedLists(@PathVariable Long id) {
        return super.findWithAssociatedLists(id);
    }

    @ApiOperation("Finds freeTrials by criteria")
    @PostMapping("find-by-criteria")
    @Override
    public ResponseEntity<List<FreeTrialDto>> findByCriteria(@RequestBody FreeTrialCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated freeTrials by criteria")
    @PostMapping("find-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody FreeTrialCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports freeTrials by criteria")
    @PostMapping("export")
    @Override
    public ResponseEntity<InputStreamResource> export(@RequestBody FreeTrialCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets freeTrial data size by criteria")
    @PostMapping("data-size-by-criteria")
    @Override
    public ResponseEntity<Integer> getDataSize(@RequestBody FreeTrialCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets freeTrial history by id")
    @GetMapping("history/id/{id}")
    @Override
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets freeTrial paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody FreeTrialHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports freeTrial history by criteria")
    @PostMapping("export-history")
    @Override
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody FreeTrialHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets freeTrial history data size by criteria")
    @PostMapping("history-data-size")
    @Override
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody FreeTrialHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public FreeTrialRestAdmin (FreeTrialAdminService service, FreeTrialConverter converter) {
        super(service, converter);
    }


}