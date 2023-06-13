package  ma.zsmart.engflexy.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.zsmart.engflexy.bean.core.FaqEtudiant;
import ma.zsmart.engflexy.bean.history.FaqEtudiantHistory;
import ma.zsmart.engflexy.dao.criteria.core.FaqEtudiantCriteria;
import ma.zsmart.engflexy.dao.criteria.history.FaqEtudiantHistoryCriteria;
import ma.zsmart.engflexy.service.facade.admin.FaqEtudiantAdminService;
import ma.zsmart.engflexy.ws.converter.FaqEtudiantConverter;
import ma.zsmart.engflexy.ws.dto.FaqEtudiantDto;
import ma.zsmart.engflexy.zynerator.controller.AbstractController;
import ma.zsmart.engflexy.zynerator.dto.AuditEntityDto;
import ma.zsmart.engflexy.zynerator.dto.FileTempDto;
import ma.zsmart.engflexy.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Api("Manages faqEtudiant services")
@RestController
@RequestMapping("/api/admin/faqEtudiant/")
public class FaqEtudiantRestAdmin  extends AbstractController<FaqEtudiant, FaqEtudiantDto, FaqEtudiantHistory, FaqEtudiantCriteria, FaqEtudiantHistoryCriteria, FaqEtudiantAdminService, FaqEtudiantConverter> {


    @ApiOperation("upload one faqEtudiant")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple faqEtudiants")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all faqEtudiants")
    @GetMapping("")
    @Override
    public ResponseEntity<List<FaqEtudiantDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all faqEtudiants")
    @GetMapping("optimized")
    @Override
    public ResponseEntity<List<FaqEtudiantDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a faqEtudiant by id")
    @GetMapping("id/{id}")
    @Override
    public ResponseEntity<FaqEtudiantDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  faqEtudiant")
    @PostMapping("")
    @Override
    public ResponseEntity<FaqEtudiantDto> save(@RequestBody FaqEtudiantDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  faqEtudiant")
    @PutMapping("")
    @Override
    public ResponseEntity<FaqEtudiantDto> update(@RequestBody FaqEtudiantDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of faqEtudiant")
    @PostMapping("multiple")
    @Override
    public ResponseEntity<List<FaqEtudiantDto>> delete(@RequestBody List<FaqEtudiantDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified faqEtudiant")
    @DeleteMapping("")
    @Override
    public ResponseEntity<FaqEtudiantDto> delete(@RequestBody FaqEtudiantDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified faqEtudiant")
    @DeleteMapping("id/{id}")
    @Override
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple faqEtudiants by ids")
    @DeleteMapping("multiple/id")
    @Override
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("find by etudiant id")
    @GetMapping("etudiant/id/{id}")
    public List<FaqEtudiant> findByEtudiantId(@PathVariable Long id){
        return service.findByEtudiantId(id);
    }
    @ApiOperation("delete by etudiant id")
    @DeleteMapping("etudiant/id/{id}")
    public int deleteByEtudiantId(@PathVariable Long id){
        return service.deleteByEtudiantId(id);
    }
    @ApiOperation("find by admin id")
    @GetMapping("admin/id/{id}")
    public List<FaqEtudiant> findByAdminId(@PathVariable Long id){
        return service.findByAdminId(id);
    }
    @ApiOperation("delete by admin id")
    @DeleteMapping("admin/id/{id}")
    public int deleteByAdminId(@PathVariable Long id){
        return service.deleteByAdminId(id);
    }
    @ApiOperation("find by faqType id")
    @GetMapping("faqType/id/{id}")
    public List<FaqEtudiant> findByFaqTypeId(@PathVariable Long id){
        return service.findByFaqTypeId(id);
    }
    @ApiOperation("delete by faqType id")
    @DeleteMapping("faqType/id/{id}")
    public int deleteByFaqTypeId(@PathVariable Long id){
        return service.deleteByFaqTypeId(id);
    }
    @ApiOperation("Finds faqEtudiants by criteria")
    @PostMapping("find-by-criteria")
    @Override
    public ResponseEntity<List<FaqEtudiantDto>> findByCriteria(@RequestBody FaqEtudiantCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated faqEtudiants by criteria")
    @PostMapping("find-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody FaqEtudiantCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports faqEtudiants by criteria")
    @PostMapping("export")
    @Override
    public ResponseEntity<InputStreamResource> export(@RequestBody FaqEtudiantCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets faqEtudiant data size by criteria")
    @PostMapping("data-size-by-criteria")
    @Override
    public ResponseEntity<Integer> getDataSize(@RequestBody FaqEtudiantCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets faqEtudiant history by id")
    @GetMapping("history/id/{id}")
    @Override
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets faqEtudiant paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody FaqEtudiantHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports faqEtudiant history by criteria")
    @PostMapping("export-history")
    @Override
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody FaqEtudiantHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets faqEtudiant history data size by criteria")
    @PostMapping("history-data-size")
    @Override
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody FaqEtudiantHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public FaqEtudiantRestAdmin (FaqEtudiantAdminService service, FaqEtudiantConverter converter) {
        super(service, converter);
    }


}