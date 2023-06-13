package  ma.zsmart.engflexy.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.zsmart.engflexy.bean.core.WorkloadBonus;
import ma.zsmart.engflexy.bean.history.WorkloadBonusHistory;
import ma.zsmart.engflexy.dao.criteria.core.WorkloadBonusCriteria;
import ma.zsmart.engflexy.dao.criteria.history.WorkloadBonusHistoryCriteria;
import ma.zsmart.engflexy.service.facade.admin.WorkloadBonusAdminService;
import ma.zsmart.engflexy.ws.converter.WorkloadBonusConverter;
import ma.zsmart.engflexy.ws.dto.WorkloadBonusDto;
import ma.zsmart.engflexy.zynerator.controller.AbstractController;
import ma.zsmart.engflexy.zynerator.dto.AuditEntityDto;
import ma.zsmart.engflexy.zynerator.dto.FileTempDto;
import ma.zsmart.engflexy.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Api("Manages workloadBonus services")
@RestController
@RequestMapping("/api/admin/workloadBonus/")
public class WorkloadBonusRestAdmin  extends AbstractController<WorkloadBonus, WorkloadBonusDto, WorkloadBonusHistory, WorkloadBonusCriteria, WorkloadBonusHistoryCriteria, WorkloadBonusAdminService, WorkloadBonusConverter> {


    @ApiOperation("upload one workloadBonus")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple workloadBonuss")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all workloadBonuss")
    @GetMapping("")
    @Override
    public ResponseEntity<List<WorkloadBonusDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all workloadBonuss")
    @GetMapping("optimized")
    @Override
    public ResponseEntity<List<WorkloadBonusDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a workloadBonus by id")
    @GetMapping("id/{id}")
    @Override
    public ResponseEntity<WorkloadBonusDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  workloadBonus")
    @PostMapping("")
    @Override
    public ResponseEntity<WorkloadBonusDto> save(@RequestBody WorkloadBonusDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  workloadBonus")
    @PutMapping("")
    @Override
    public ResponseEntity<WorkloadBonusDto> update(@RequestBody WorkloadBonusDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of workloadBonus")
    @PostMapping("multiple")
    @Override
    public ResponseEntity<List<WorkloadBonusDto>> delete(@RequestBody List<WorkloadBonusDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified workloadBonus")
    @DeleteMapping("")
    @Override
    public ResponseEntity<WorkloadBonusDto> delete(@RequestBody WorkloadBonusDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified workloadBonus")
    @DeleteMapping("id/{id}")
    @Override
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple workloadBonuss by ids")
    @DeleteMapping("multiple/id")
    @Override
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("Finds workloadBonuss by criteria")
    @PostMapping("find-by-criteria")
    @Override
    public ResponseEntity<List<WorkloadBonusDto>> findByCriteria(@RequestBody WorkloadBonusCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated workloadBonuss by criteria")
    @PostMapping("find-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody WorkloadBonusCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports workloadBonuss by criteria")
    @PostMapping("export")
    @Override
    public ResponseEntity<InputStreamResource> export(@RequestBody WorkloadBonusCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets workloadBonus data size by criteria")
    @PostMapping("data-size-by-criteria")
    @Override
    public ResponseEntity<Integer> getDataSize(@RequestBody WorkloadBonusCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets workloadBonus history by id")
    @GetMapping("history/id/{id}")
    @Override
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets workloadBonus paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody WorkloadBonusHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports workloadBonus history by criteria")
    @PostMapping("export-history")
    @Override
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody WorkloadBonusHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets workloadBonus history data size by criteria")
    @PostMapping("history-data-size")
    @Override
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody WorkloadBonusHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public WorkloadBonusRestAdmin (WorkloadBonusAdminService service, WorkloadBonusConverter converter) {
        super(service, converter);
    }


}