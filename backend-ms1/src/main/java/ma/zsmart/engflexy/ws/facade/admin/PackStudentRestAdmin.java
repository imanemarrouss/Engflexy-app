package  ma.zsmart.engflexy.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.zsmart.engflexy.bean.core.PackStudent;
import ma.zsmart.engflexy.bean.history.PackStudentHistory;
import ma.zsmart.engflexy.dao.criteria.core.PackStudentCriteria;
import ma.zsmart.engflexy.dao.criteria.history.PackStudentHistoryCriteria;
import ma.zsmart.engflexy.service.facade.admin.PackStudentAdminService;
import ma.zsmart.engflexy.ws.converter.PackStudentConverter;
import ma.zsmart.engflexy.ws.dto.PackStudentDto;
import ma.zsmart.engflexy.zynerator.controller.AbstractController;
import ma.zsmart.engflexy.zynerator.dto.AuditEntityDto;
import ma.zsmart.engflexy.zynerator.dto.FileTempDto;
import ma.zsmart.engflexy.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Api("Manages packStudent services")
@RestController
@RequestMapping("/api/admin/packStudent/")
public class PackStudentRestAdmin  extends AbstractController<PackStudent, PackStudentDto, PackStudentHistory, PackStudentCriteria, PackStudentHistoryCriteria, PackStudentAdminService, PackStudentConverter> {


    @ApiOperation("upload one packStudent")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple packStudents")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all packStudents")
    @GetMapping("")
    @Override
    public ResponseEntity<List<PackStudentDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all packStudents")
    @GetMapping("optimized")
    @Override
    public ResponseEntity<List<PackStudentDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a packStudent by id")
    @GetMapping("id/{id}")
    @Override
    public ResponseEntity<PackStudentDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  packStudent")
    @PostMapping("")
    @Override
    public ResponseEntity<PackStudentDto> save(@RequestBody PackStudentDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  packStudent")
    @PutMapping("")
    @Override
    public ResponseEntity<PackStudentDto> update(@RequestBody PackStudentDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of packStudent")
    @PostMapping("multiple")
    @Override
    public ResponseEntity<List<PackStudentDto>> delete(@RequestBody List<PackStudentDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified packStudent")
    @DeleteMapping("")
    @Override
    public ResponseEntity<PackStudentDto> delete(@RequestBody PackStudentDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified packStudent")
    @DeleteMapping("id/{id}")
    @Override
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple packStudents by ids")
    @DeleteMapping("multiple/id")
    @Override
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("find by parcours id")
    @GetMapping("parcours/id/{id}")
    public List<PackStudent> findByParcoursId(@PathVariable Long id){
        return service.findByParcoursId(id);
    }
    @ApiOperation("delete by parcours id")
    @DeleteMapping("parcours/id/{id}")
    public int deleteByParcoursId(@PathVariable Long id){
        return service.deleteByParcoursId(id);
    }
    @ApiOperation("find by price id")
    @GetMapping("price/id/{id}")
    public List<PackStudent> findByPriceId(@PathVariable Long id){
        return service.findByPriceId(id);
    }
    @ApiOperation("delete by price id")
    @DeleteMapping("price/id/{id}")
    public int deleteByPriceId(@PathVariable Long id){
        return service.deleteByPriceId(id);
    }
    @ApiOperation("Finds packStudents by criteria")
    @PostMapping("find-by-criteria")
    @Override
    public ResponseEntity<List<PackStudentDto>> findByCriteria(@RequestBody PackStudentCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated packStudents by criteria")
    @PostMapping("find-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody PackStudentCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports packStudents by criteria")
    @PostMapping("export")
    @Override
    public ResponseEntity<InputStreamResource> export(@RequestBody PackStudentCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets packStudent data size by criteria")
    @PostMapping("data-size-by-criteria")
    @Override
    public ResponseEntity<Integer> getDataSize(@RequestBody PackStudentCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets packStudent history by id")
    @GetMapping("history/id/{id}")
    @Override
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets packStudent paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody PackStudentHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports packStudent history by criteria")
    @PostMapping("export-history")
    @Override
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody PackStudentHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets packStudent history data size by criteria")
    @PostMapping("history-data-size")
    @Override
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody PackStudentHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public PackStudentRestAdmin (PackStudentAdminService service, PackStudentConverter converter) {
        super(service, converter);
    }


}