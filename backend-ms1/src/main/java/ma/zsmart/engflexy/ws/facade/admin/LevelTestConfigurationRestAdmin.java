package  ma.zsmart.engflexy.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.zsmart.engflexy.bean.core.LevelTestConfiguration;
import ma.zsmart.engflexy.bean.history.LevelTestConfigurationHistory;
import ma.zsmart.engflexy.dao.criteria.core.LevelTestConfigurationCriteria;
import ma.zsmart.engflexy.dao.criteria.history.LevelTestConfigurationHistoryCriteria;
import ma.zsmart.engflexy.service.facade.admin.LevelTestConfigurationAdminService;
import ma.zsmart.engflexy.ws.converter.LevelTestConfigurationConverter;
import ma.zsmart.engflexy.ws.dto.LevelTestConfigurationDto;
import ma.zsmart.engflexy.zynerator.controller.AbstractController;
import ma.zsmart.engflexy.zynerator.dto.AuditEntityDto;
import ma.zsmart.engflexy.zynerator.dto.FileTempDto;
import ma.zsmart.engflexy.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Api("Manages levelTestConfiguration services")
@RestController
@RequestMapping("/api/admin/levelTestConfiguration/")
public class LevelTestConfigurationRestAdmin  extends AbstractController<LevelTestConfiguration, LevelTestConfigurationDto, LevelTestConfigurationHistory, LevelTestConfigurationCriteria, LevelTestConfigurationHistoryCriteria, LevelTestConfigurationAdminService, LevelTestConfigurationConverter> {


    @ApiOperation("upload one levelTestConfiguration")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple levelTestConfigurations")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all levelTestConfigurations")
    @GetMapping("")
    @Override
    public ResponseEntity<List<LevelTestConfigurationDto>> findAll() throws Exception {
        return super.findAll();
    }


    @ApiOperation("Finds a levelTestConfiguration by id")
    @GetMapping("id/{id}")
    @Override
    public ResponseEntity<LevelTestConfigurationDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  levelTestConfiguration")
    @PostMapping("")
    @Override
    public ResponseEntity<LevelTestConfigurationDto> save(@RequestBody LevelTestConfigurationDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  levelTestConfiguration")
    @PutMapping("")
    @Override
    public ResponseEntity<LevelTestConfigurationDto> update(@RequestBody LevelTestConfigurationDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of levelTestConfiguration")
    @PostMapping("multiple")
    @Override
    public ResponseEntity<List<LevelTestConfigurationDto>> delete(@RequestBody List<LevelTestConfigurationDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified levelTestConfiguration")
    @DeleteMapping("")
    @Override
    public ResponseEntity<LevelTestConfigurationDto> delete(@RequestBody LevelTestConfigurationDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified levelTestConfiguration")
    @DeleteMapping("id/{id}")
    @Override
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple levelTestConfigurations by ids")
    @DeleteMapping("multiple/id")
    @Override
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("find by parcours id")
    @GetMapping("parcours/id/{id}")

    public List<LevelTestConfiguration> findByParcoursId(@PathVariable Long id){
        return service.findByParcoursId(id);
    }
    @ApiOperation("delete by parcours id")
    @DeleteMapping("parcours/id/{id}")
    public int deleteByParcoursId(@PathVariable Long id){
        return service.deleteByParcoursId(id);
    }
    @ApiOperation("Finds levelTestConfigurations by criteria")
    @PostMapping("find-by-criteria")
    @Override
    public ResponseEntity<List<LevelTestConfigurationDto>> findByCriteria(@RequestBody LevelTestConfigurationCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated levelTestConfigurations by criteria")
    @PostMapping("find-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody LevelTestConfigurationCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports levelTestConfigurations by criteria")
    @PostMapping("export")
    @Override
    public ResponseEntity<InputStreamResource> export(@RequestBody LevelTestConfigurationCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets levelTestConfiguration data size by criteria")
    @PostMapping("data-size-by-criteria")
    @Override
    public ResponseEntity<Integer> getDataSize(@RequestBody LevelTestConfigurationCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets levelTestConfiguration history by id")
    @GetMapping("history/id/{id}")
    @Override
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets levelTestConfiguration paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody LevelTestConfigurationHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports levelTestConfiguration history by criteria")
    @PostMapping("export-history")
    @Override
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody LevelTestConfigurationHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets levelTestConfiguration history data size by criteria")
    @PostMapping("history-data-size")
    @Override
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody LevelTestConfigurationHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public LevelTestConfigurationRestAdmin (LevelTestConfigurationAdminService service, LevelTestConfigurationConverter converter) {
        super(service, converter);
    }


}