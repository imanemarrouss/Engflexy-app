package  ma.zsmart.engflexy.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.zsmart.engflexy.bean.core.WorkloadBonusProf;
import ma.zsmart.engflexy.bean.history.WorkloadBonusProfHistory;
import ma.zsmart.engflexy.dao.criteria.core.WorkloadBonusProfCriteria;
import ma.zsmart.engflexy.dao.criteria.history.WorkloadBonusProfHistoryCriteria;
import ma.zsmart.engflexy.service.facade.admin.WorkloadBonusProfAdminService;
import ma.zsmart.engflexy.ws.converter.WorkloadBonusProfConverter;
import ma.zsmart.engflexy.ws.dto.WorkloadBonusProfDto;
import ma.zsmart.engflexy.zynerator.controller.AbstractController;
import ma.zsmart.engflexy.zynerator.dto.AuditEntityDto;
import ma.zsmart.engflexy.zynerator.dto.FileTempDto;
import ma.zsmart.engflexy.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Api("Manages workloadBonusProf services")
@RestController
@RequestMapping("/api/admin/workloadBonusProf/")
public class WorkloadBonusProfRestAdmin  extends AbstractController<WorkloadBonusProf, WorkloadBonusProfDto, WorkloadBonusProfHistory, WorkloadBonusProfCriteria, WorkloadBonusProfHistoryCriteria, WorkloadBonusProfAdminService, WorkloadBonusProfConverter> {


    @ApiOperation("upload one workloadBonusProf")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple workloadBonusProfs")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all workloadBonusProfs")
    @GetMapping("")
    @Override
    public ResponseEntity<List<WorkloadBonusProfDto>> findAll() throws Exception {
        return super.findAll();
    }


    @ApiOperation("Finds a workloadBonusProf by id")
    @GetMapping("id/{id}")
    @Override
    public ResponseEntity<WorkloadBonusProfDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  workloadBonusProf")
    @PostMapping("")
    @Override
    public ResponseEntity<WorkloadBonusProfDto> save(@RequestBody WorkloadBonusProfDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  workloadBonusProf")
    @PutMapping("")
    @Override
    public ResponseEntity<WorkloadBonusProfDto> update(@RequestBody WorkloadBonusProfDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of workloadBonusProf")
    @PostMapping("multiple")
    @Override
    public ResponseEntity<List<WorkloadBonusProfDto>> delete(@RequestBody List<WorkloadBonusProfDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified workloadBonusProf")
    @DeleteMapping("")
    @Override
    public ResponseEntity<WorkloadBonusProfDto> delete(@RequestBody WorkloadBonusProfDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified workloadBonusProf")
    @DeleteMapping("id/{id}")
    @Override
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple workloadBonusProfs by ids")
    @DeleteMapping("multiple/id")
    @Override
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("find by workloadBonus id")
    @GetMapping("workloadBonus/id/{id}")
    public List<WorkloadBonusProf> findByWorkloadBonusId(@PathVariable Long id){
        return service.findByWorkloadBonusId(id);
    }
    @ApiOperation("delete by workloadBonus id")
    @DeleteMapping("workloadBonus/id/{id}")
    public int deleteByWorkloadBonusId(@PathVariable Long id){
        return service.deleteByWorkloadBonusId(id);
    }
    @ApiOperation("find by prof id")
    @GetMapping("prof/id/{id}")
    public List<WorkloadBonusProf> findByProfId(@PathVariable Long id){
        return service.findByProfId(id);
    }
    @ApiOperation("delete by prof id")
    @DeleteMapping("prof/id/{id}")
    public int deleteByProfId(@PathVariable Long id){
        return service.deleteByProfId(id);
    }
    @ApiOperation("find by salary id")
    @GetMapping("salary/id/{id}")
    public List<WorkloadBonusProf> findBySalaryId(@PathVariable Long id){
        return service.findBySalaryId(id);
    }
    @ApiOperation("delete by salary id")
    @DeleteMapping("salary/id/{id}")
    public int deleteBySalaryId(@PathVariable Long id){
        return service.deleteBySalaryId(id);
    }
    @ApiOperation("Finds workloadBonusProfs by criteria")
    @PostMapping("find-by-criteria")
    @Override
    public ResponseEntity<List<WorkloadBonusProfDto>> findByCriteria(@RequestBody WorkloadBonusProfCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated workloadBonusProfs by criteria")
    @PostMapping("find-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody WorkloadBonusProfCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports workloadBonusProfs by criteria")
    @PostMapping("export")
    @Override
    public ResponseEntity<InputStreamResource> export(@RequestBody WorkloadBonusProfCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets workloadBonusProf data size by criteria")
    @PostMapping("data-size-by-criteria")
    @Override
    public ResponseEntity<Integer> getDataSize(@RequestBody WorkloadBonusProfCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets workloadBonusProf history by id")
    @GetMapping("history/id/{id}")
    @Override
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets workloadBonusProf paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody WorkloadBonusProfHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports workloadBonusProf history by criteria")
    @PostMapping("export-history")
    @Override
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody WorkloadBonusProfHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets workloadBonusProf history data size by criteria")
    @PostMapping("history-data-size")
    @Override
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody WorkloadBonusProfHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public WorkloadBonusProfRestAdmin (WorkloadBonusProfAdminService service, WorkloadBonusProfConverter converter) {
        super(service, converter);
    }


}