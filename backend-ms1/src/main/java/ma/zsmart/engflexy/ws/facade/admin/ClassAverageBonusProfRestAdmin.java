package  ma.zsmart.engflexy.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.zsmart.engflexy.bean.core.ClassAverageBonusProf;
import ma.zsmart.engflexy.bean.history.ClassAverageBonusProfHistory;
import ma.zsmart.engflexy.dao.criteria.core.ClassAverageBonusProfCriteria;
import ma.zsmart.engflexy.dao.criteria.history.ClassAverageBonusProfHistoryCriteria;
import ma.zsmart.engflexy.service.facade.admin.ClassAverageBonusProfAdminService;
import ma.zsmart.engflexy.ws.converter.ClassAverageBonusProfConverter;
import ma.zsmart.engflexy.ws.dto.ClassAverageBonusProfDto;
import ma.zsmart.engflexy.zynerator.controller.AbstractController;
import ma.zsmart.engflexy.zynerator.dto.AuditEntityDto;
import ma.zsmart.engflexy.zynerator.dto.FileTempDto;
import ma.zsmart.engflexy.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Api("Manages classAverageBonusProf services")
@RestController
@RequestMapping("/api/admin/classAverageBonusProf/")
public class ClassAverageBonusProfRestAdmin  extends AbstractController<ClassAverageBonusProf, ClassAverageBonusProfDto, ClassAverageBonusProfHistory, ClassAverageBonusProfCriteria, ClassAverageBonusProfHistoryCriteria, ClassAverageBonusProfAdminService, ClassAverageBonusProfConverter> {


    @ApiOperation("upload one classAverageBonusProf")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @Override
    @ApiOperation("upload multiple classAverageBonusProfs")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }
    @Override
    @ApiOperation("Finds a list of all classAverageBonusProfs")
    @GetMapping("")
    public ResponseEntity<List<ClassAverageBonusProfDto>> findAll() throws Exception {
        return super.findAll();
    }

    @Override
    @ApiOperation("Finds a classAverageBonusProf by id")
    @GetMapping("id/{id}")
    public ResponseEntity<ClassAverageBonusProfDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @Override
    @ApiOperation("Saves the specified  classAverageBonusProf")
    @PostMapping("")
    public ResponseEntity<ClassAverageBonusProfDto> save(@RequestBody ClassAverageBonusProfDto dto) throws Exception {
        return super.save(dto);
    }
    @Override
    @ApiOperation("Updates the specified  classAverageBonusProf")
    @PutMapping("")
    public ResponseEntity<ClassAverageBonusProfDto> update(@RequestBody ClassAverageBonusProfDto dto) throws Exception {
        return super.update(dto);
    }
    @Override
    @ApiOperation("Delete list of classAverageBonusProf")
    @PostMapping("multiple")
    public ResponseEntity<List<ClassAverageBonusProfDto>> delete(@RequestBody List<ClassAverageBonusProfDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @Override
    @ApiOperation("Delete the specified classAverageBonusProf")
    @DeleteMapping("")
    public ResponseEntity<ClassAverageBonusProfDto> delete(@RequestBody ClassAverageBonusProfDto dto) throws Exception {
            return super.delete(dto);
    }
    @Override
    @ApiOperation("Delete the specified classAverageBonusProf")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @Override
    @ApiOperation("Delete multiple classAverageBonusProfs by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }

    @ApiOperation("find by prof id")
    @GetMapping("prof/id/{id}")
    public List<ClassAverageBonusProf> findByProfId(@PathVariable Long id){
        return service.findByProfId(id);
    }

    @ApiOperation("delete by prof id")
    @DeleteMapping("prof/id/{id}")
    public int deleteByProfId(@PathVariable Long id){
        return service.deleteByProfId(id);
    }

    @ApiOperation("find by salary id")
    @GetMapping("salary/id/{id}")
    public List<ClassAverageBonusProf> findBySalaryId(@PathVariable Long id){
        return service.findBySalaryId(id);
    }
    @ApiOperation("delete by salary id")
    @DeleteMapping("salary/id/{id}")
    public int deleteBySalaryId(@PathVariable Long id){
        return service.deleteBySalaryId(id);
    }
    @Override
    @ApiOperation("Finds classAverageBonusProfs by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<ClassAverageBonusProfDto>> findByCriteria(@RequestBody ClassAverageBonusProfCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }
    @Override
    @ApiOperation("Finds paginated classAverageBonusProfs by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody ClassAverageBonusProfCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }
    @Override
    @ApiOperation("Exports classAverageBonusProfs by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody ClassAverageBonusProfCriteria criteria) throws Exception {
        return super.export(criteria);
    }
    @Override
    @ApiOperation("Gets classAverageBonusProf data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody ClassAverageBonusProfCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }
    @Override
    @ApiOperation("Gets classAverageBonusProf history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }
    @Override
    @ApiOperation("Gets classAverageBonusProf paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody ClassAverageBonusProfHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }
    @Override
    @ApiOperation("Exports classAverageBonusProf history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody ClassAverageBonusProfHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }
    @Override
    @ApiOperation("Gets classAverageBonusProf history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody ClassAverageBonusProfHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public ClassAverageBonusProfRestAdmin (ClassAverageBonusProfAdminService service, ClassAverageBonusProfConverter converter) {
        super(service, converter);
    }


}