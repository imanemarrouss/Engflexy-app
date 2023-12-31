package  ma.zsmart.engflexy.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.zsmart.engflexy.bean.core.ProfReview;
import ma.zsmart.engflexy.bean.history.ProfReviewHistory;
import ma.zsmart.engflexy.dao.criteria.core.ProfReviewCriteria;
import ma.zsmart.engflexy.dao.criteria.history.ProfReviewHistoryCriteria;
import ma.zsmart.engflexy.service.facade.admin.ProfReviewAdminService;
import ma.zsmart.engflexy.ws.converter.ProfReviewConverter;
import ma.zsmart.engflexy.ws.dto.ProfReviewDto;
import ma.zsmart.engflexy.zynerator.controller.AbstractController;
import ma.zsmart.engflexy.zynerator.dto.AuditEntityDto;
import ma.zsmart.engflexy.zynerator.dto.FileTempDto;
import ma.zsmart.engflexy.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Api("Manages profReview services")
@RestController
@RequestMapping("/api/admin/profReview/")
public class ProfReviewRestAdmin  extends AbstractController<ProfReview, ProfReviewDto, ProfReviewHistory, ProfReviewCriteria, ProfReviewHistoryCriteria, ProfReviewAdminService, ProfReviewConverter> {


    @ApiOperation("upload one profReview")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple profReviews")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all profReviews")
    @GetMapping("")
    @Override
    public ResponseEntity<List<ProfReviewDto>> findAll() throws Exception {
        return super.findAll();
    }


    @ApiOperation("Finds a profReview by id")
    @GetMapping("id/{id}")
    @Override
    public ResponseEntity<ProfReviewDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  profReview")
    @PostMapping("")
    @Override
    public ResponseEntity<ProfReviewDto> save(@RequestBody ProfReviewDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  profReview")
    @PutMapping("")
    @Override
    public ResponseEntity<ProfReviewDto> update(@RequestBody ProfReviewDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of profReview")
    @PostMapping("multiple")
    @Override
    public ResponseEntity<List<ProfReviewDto>> delete(@RequestBody List<ProfReviewDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified profReview")
    @DeleteMapping("")
    @Override
    public ResponseEntity<ProfReviewDto> delete(@RequestBody ProfReviewDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified profReview")
    @DeleteMapping("id/{id}")
    @Override
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple profReviews by ids")
    @DeleteMapping("multiple/id")
    @Override
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("find by etudiant id")
    @GetMapping("etudiant/id/{id}")
    public List<ProfReview> findByEtudiantId(@PathVariable Long id){
        return service.findByEtudiantId(id);
    }
    @ApiOperation("delete by etudiant id")
    @DeleteMapping("etudiant/id/{id}")
    public int deleteByEtudiantId(@PathVariable Long id){
        return service.deleteByEtudiantId(id);
    }
    @ApiOperation("find by prof id")
    @GetMapping("prof/id/{id}")
    public List<ProfReview> findByProfId(@PathVariable Long id){
        return service.findByProfId(id);
    }
    @ApiOperation("delete by prof id")
    @DeleteMapping("prof/id/{id}")
    public int deleteByProfId(@PathVariable Long id){
        return service.deleteByProfId(id);
    }
    @ApiOperation("find by cours id")
    @GetMapping("cours/id/{id}")
    public List<ProfReview> findByCoursId(@PathVariable Long id){
        return service.findByCoursId(id);
    }
    @ApiOperation("delete by cours id")
    @DeleteMapping("cours/id/{id}")
    public int deleteByCoursId(@PathVariable Long id){
        return service.deleteByCoursId(id);
    }
    @ApiOperation("Finds profReviews by criteria")
    @PostMapping("find-by-criteria")
    @Override
    public ResponseEntity<List<ProfReviewDto>> findByCriteria(@RequestBody ProfReviewCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated profReviews by criteria")
    @PostMapping("find-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody ProfReviewCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports profReviews by criteria")
    @PostMapping("export")
    @Override
    public ResponseEntity<InputStreamResource> export(@RequestBody ProfReviewCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets profReview data size by criteria")
    @PostMapping("data-size-by-criteria")
    @Override
    public ResponseEntity<Integer> getDataSize(@RequestBody ProfReviewCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets profReview history by id")
    @GetMapping("history/id/{id}")
    @Override
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets profReview paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody ProfReviewHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports profReview history by criteria")
    @PostMapping("export-history")
    @Override
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody ProfReviewHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets profReview history data size by criteria")
    @PostMapping("history-data-size")
    @Override
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody ProfReviewHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public ProfReviewRestAdmin (ProfReviewAdminService service, ProfReviewConverter converter) {
        super(service, converter);
    }


}