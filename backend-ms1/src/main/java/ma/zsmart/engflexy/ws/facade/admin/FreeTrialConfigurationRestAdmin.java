package  ma.zsmart.engflexy.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.zsmart.engflexy.bean.core.FreeTrialConfiguration;
import ma.zsmart.engflexy.bean.history.FreeTrialConfigurationHistory;
import ma.zsmart.engflexy.dao.criteria.core.FreeTrialConfigurationCriteria;
import ma.zsmart.engflexy.dao.criteria.history.FreeTrialConfigurationHistoryCriteria;
import ma.zsmart.engflexy.service.facade.admin.FreeTrialConfigurationAdminService;
import ma.zsmart.engflexy.ws.converter.FreeTrialConfigurationConverter;
import ma.zsmart.engflexy.ws.dto.FreeTrialConfigurationDto;
import ma.zsmart.engflexy.zynerator.controller.AbstractController;
import ma.zsmart.engflexy.zynerator.dto.AuditEntityDto;
import ma.zsmart.engflexy.zynerator.dto.FileTempDto;
import ma.zsmart.engflexy.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Api("Manages freeTrialConfiguration services")
@RestController
@RequestMapping("/api/admin/freeTrialConfiguration/")
public class FreeTrialConfigurationRestAdmin  extends AbstractController<FreeTrialConfiguration, FreeTrialConfigurationDto, FreeTrialConfigurationHistory, FreeTrialConfigurationCriteria, FreeTrialConfigurationHistoryCriteria, FreeTrialConfigurationAdminService, FreeTrialConfigurationConverter> {


    @ApiOperation("upload one freeTrialConfiguration")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple freeTrialConfigurations")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all freeTrialConfigurations")
    @GetMapping("")
    @Override
    public ResponseEntity<List<FreeTrialConfigurationDto>> findAll() throws Exception {
        return super.findAll();
    }


    @ApiOperation("Finds a freeTrialConfiguration by id")
    @GetMapping("id/{id}")
    @Override
    public ResponseEntity<FreeTrialConfigurationDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  freeTrialConfiguration")
    @PostMapping("")
    @Override
    public ResponseEntity<FreeTrialConfigurationDto> save(@RequestBody FreeTrialConfigurationDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  freeTrialConfiguration")
    @PutMapping("")
    @Override
    public ResponseEntity<FreeTrialConfigurationDto> update(@RequestBody FreeTrialConfigurationDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of freeTrialConfiguration")
    @PostMapping("multiple")
    @Override
    public ResponseEntity<List<FreeTrialConfigurationDto>> delete(@RequestBody List<FreeTrialConfigurationDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified freeTrialConfiguration")
    @DeleteMapping("")
    @Override
    public ResponseEntity<FreeTrialConfigurationDto> delete(@RequestBody FreeTrialConfigurationDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified freeTrialConfiguration")
    @DeleteMapping("id/{id}")
    @Override
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple freeTrialConfigurations by ids")
    @DeleteMapping("multiple/id")
    @Override
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("Finds freeTrialConfigurations by criteria")
    @PostMapping("find-by-criteria")
    @Override
    public ResponseEntity<List<FreeTrialConfigurationDto>> findByCriteria(@RequestBody FreeTrialConfigurationCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated freeTrialConfigurations by criteria")
    @PostMapping("find-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody FreeTrialConfigurationCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports freeTrialConfigurations by criteria")
    @PostMapping("export")
    @Override
    public ResponseEntity<InputStreamResource> export(@RequestBody FreeTrialConfigurationCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets freeTrialConfiguration data size by criteria")
    @PostMapping("data-size-by-criteria")
    @Override
    public ResponseEntity<Integer> getDataSize(@RequestBody FreeTrialConfigurationCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets freeTrialConfiguration history by id")
    @GetMapping("history/id/{id}")
    @Override
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets freeTrialConfiguration paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody FreeTrialConfigurationHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports freeTrialConfiguration history by criteria")
    @PostMapping("export-history")
    @Override
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody FreeTrialConfigurationHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets freeTrialConfiguration history data size by criteria")
    @PostMapping("history-data-size")
    @Override
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody FreeTrialConfigurationHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public FreeTrialConfigurationRestAdmin (FreeTrialConfigurationAdminService service, FreeTrialConfigurationConverter converter) {
        super(service, converter);
    }


}