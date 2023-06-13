package  ma.zsmart.engflexy.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.zsmart.engflexy.bean.core.ClassAverageBonus;
import ma.zsmart.engflexy.bean.history.ClassAverageBonusHistory;
import ma.zsmart.engflexy.dao.criteria.core.ClassAverageBonusCriteria;
import ma.zsmart.engflexy.dao.criteria.history.ClassAverageBonusHistoryCriteria;
import ma.zsmart.engflexy.service.facade.admin.ClassAverageBonusAdminService;
import ma.zsmart.engflexy.ws.converter.ClassAverageBonusConverter;
import ma.zsmart.engflexy.ws.dto.ClassAverageBonusDto;
import ma.zsmart.engflexy.zynerator.controller.AbstractController;
import ma.zsmart.engflexy.zynerator.dto.AuditEntityDto;
import ma.zsmart.engflexy.zynerator.dto.FileTempDto;
import ma.zsmart.engflexy.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Api("Manages classAverageBonus services")
@RestController
@RequestMapping("/api/admin/classAverageBonus/")
public class ClassAverageBonusRestAdmin  extends AbstractController<ClassAverageBonus, ClassAverageBonusDto, ClassAverageBonusHistory, ClassAverageBonusCriteria, ClassAverageBonusHistoryCriteria, ClassAverageBonusAdminService, ClassAverageBonusConverter> {


    @ApiOperation("upload one classAverageBonus")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple classAverageBonuss")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all classAverageBonuss")
    @GetMapping("")
    @Override
    public ResponseEntity<List<ClassAverageBonusDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all classAverageBonuss")
    @GetMapping("optimized")
    @Override
    public ResponseEntity<List<ClassAverageBonusDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a classAverageBonus by id")
    @GetMapping("id/{id}")
    @Override
    public ResponseEntity<ClassAverageBonusDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  classAverageBonus")
    @PostMapping("")
    @Override
    public ResponseEntity<ClassAverageBonusDto> save(@RequestBody ClassAverageBonusDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  classAverageBonus")
    @PutMapping("")
    @Override
    public ResponseEntity<ClassAverageBonusDto> update(@RequestBody ClassAverageBonusDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of classAverageBonus")
    @PostMapping("multiple")
    @Override
    public ResponseEntity<List<ClassAverageBonusDto>> delete(@RequestBody List<ClassAverageBonusDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified classAverageBonus")
    @DeleteMapping("")
    @Override
    public ResponseEntity<ClassAverageBonusDto> delete(@RequestBody ClassAverageBonusDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified classAverageBonus")
    @DeleteMapping("id/{id}")
    @Override
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple classAverageBonuss by ids")
    @DeleteMapping("multiple/id")
    @Override
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("Finds classAverageBonuss by criteria")
    @PostMapping("find-by-criteria")
    @Override
    public ResponseEntity<List<ClassAverageBonusDto>> findByCriteria(@RequestBody ClassAverageBonusCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated classAverageBonuss by criteria")
    @PostMapping("find-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody ClassAverageBonusCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports classAverageBonuss by criteria")
    @PostMapping("export")
    @Override
    public ResponseEntity<InputStreamResource> export(@RequestBody ClassAverageBonusCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets classAverageBonus data size by criteria")
    @PostMapping("data-size-by-criteria")
    @Override
    public ResponseEntity<Integer> getDataSize(@RequestBody ClassAverageBonusCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets classAverageBonus history by id")
    @GetMapping("history/id/{id}")
    @Override
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets classAverageBonus paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody ClassAverageBonusHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports classAverageBonus history by criteria")
    @PostMapping("export-history")
    @Override
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody ClassAverageBonusHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets classAverageBonus history data size by criteria")
    @PostMapping("history-data-size")
    @Override
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody ClassAverageBonusHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public ClassAverageBonusRestAdmin (ClassAverageBonusAdminService service, ClassAverageBonusConverter converter) {
        super(service, converter);
    }


}