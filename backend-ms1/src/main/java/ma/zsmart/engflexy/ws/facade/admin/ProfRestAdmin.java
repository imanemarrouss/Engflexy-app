package  ma.zsmart.engflexy.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.zsmart.engflexy.bean.core.Prof;
import ma.zsmart.engflexy.bean.history.ProfHistory;
import ma.zsmart.engflexy.dao.criteria.core.ProfCriteria;
import ma.zsmart.engflexy.dao.criteria.history.ProfHistoryCriteria;
import ma.zsmart.engflexy.service.facade.admin.ProfAdminService;
import ma.zsmart.engflexy.ws.converter.ProfConverter;
import ma.zsmart.engflexy.ws.dto.ProfDto;
import ma.zsmart.engflexy.zynerator.controller.AbstractController;
import ma.zsmart.engflexy.zynerator.dto.AuditEntityDto;
import ma.zsmart.engflexy.zynerator.dto.FileTempDto;
import ma.zsmart.engflexy.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Api("Manages prof services")
@RestController
@RequestMapping("/api/admin/prof/")
public class ProfRestAdmin  extends AbstractController<Prof, ProfDto, ProfHistory, ProfCriteria, ProfHistoryCriteria, ProfAdminService, ProfConverter> {


    @ApiOperation("upload one prof")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple profs")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all profs")
    @GetMapping("")
    @Override
    public ResponseEntity<List<ProfDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all profs")
    @GetMapping("optimized")
    @Override
    public ResponseEntity<List<ProfDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a prof by id")
    @GetMapping("id/{id}")
    @Override
    public ResponseEntity<ProfDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  prof")
    @PostMapping("")
    @Override
    public ResponseEntity<ProfDto> save(@RequestBody ProfDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  prof")
    @PutMapping("")
    @Override
    public ResponseEntity<ProfDto> update(@RequestBody ProfDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of prof")
    @PostMapping("multiple")
    @Override
    public ResponseEntity<List<ProfDto>> delete(@RequestBody List<ProfDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified prof")
    @DeleteMapping("")
    @Override
    public ResponseEntity<ProfDto> delete(@RequestBody ProfDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified prof")
    @DeleteMapping("id/{id}")
    @Override
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple profs by ids")
    @DeleteMapping("multiple/id")
    @Override
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("find by parcours id")
    @GetMapping("parcours/id/{id}")
    public List<Prof> findByParcoursId(@PathVariable Long id){
        return service.findByParcoursId(id);
    }
    @ApiOperation("delete by parcours id")
    @DeleteMapping("parcours/id/{id}")
    public int deleteByParcoursId(@PathVariable Long id){
        return service.deleteByParcoursId(id);
    }
    @ApiOperation("find by categorieProf id")
    @GetMapping("categorieProf/id/{id}")
    public List<Prof> findByCategorieProfId(@PathVariable Long id){
        return service.findByCategorieProfId(id);
    }
    @ApiOperation("delete by categorieProf id")
    @DeleteMapping("categorieProf/id/{id}")
    public int deleteByCategorieProfId(@PathVariable Long id){
        return service.deleteByCategorieProfId(id);
    }
    @ApiOperation("find by typeTeacher id")
    @GetMapping("typeTeacher/id/{id}")
    public List<Prof> findByTypeTeacherId(@PathVariable Long id){
        return service.findByTypeTeacherId(id);
    }
    @ApiOperation("delete by typeTeacher id")
    @DeleteMapping("typeTeacher/id/{id}")
    public int deleteByTypeTeacherId(@PathVariable Long id){
        return service.deleteByTypeTeacherId(id);
    }
    @ApiOperation("Finds a prof and associated list by id")
    @GetMapping("detail/id/{id}")
    @Override
    public ResponseEntity<ProfDto> findWithAssociatedLists(@PathVariable Long id) {
        return super.findWithAssociatedLists(id);
    }

    @ApiOperation("Finds profs by criteria")
    @PostMapping("find-by-criteria")
    @Override
    public ResponseEntity<List<ProfDto>> findByCriteria(@RequestBody ProfCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated profs by criteria")
    @PostMapping("find-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody ProfCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports profs by criteria")
    @PostMapping("export")
    @Override
    public ResponseEntity<InputStreamResource> export(@RequestBody ProfCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets prof data size by criteria")
    @PostMapping("data-size-by-criteria")
    @Override
    public ResponseEntity<Integer> getDataSize(@RequestBody ProfCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets prof history by id")
    @GetMapping("history/id/{id}")
    @Override
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets prof paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody ProfHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports prof history by criteria")
    @PostMapping("export-history")
    @Override
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody ProfHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets prof history data size by criteria")
    @PostMapping("history-data-size")
    @Override
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody ProfHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public ProfRestAdmin (ProfAdminService service, ProfConverter converter) {
        super(service, converter);
    }


}