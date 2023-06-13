package  ma.zsmart.engflexy.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.zsmart.engflexy.bean.core.FreeTrialformule;
import ma.zsmart.engflexy.bean.history.FreeTrialformuleHistory;
import ma.zsmart.engflexy.dao.criteria.core.FreeTrialformuleCriteria;
import ma.zsmart.engflexy.dao.criteria.history.FreeTrialformuleHistoryCriteria;
import ma.zsmart.engflexy.service.facade.admin.FreeTrialformuleAdminService;
import ma.zsmart.engflexy.ws.converter.FreeTrialformuleConverter;
import ma.zsmart.engflexy.ws.dto.FreeTrialformuleDto;
import ma.zsmart.engflexy.zynerator.controller.AbstractController;
import ma.zsmart.engflexy.zynerator.dto.AuditEntityDto;
import ma.zsmart.engflexy.zynerator.dto.FileTempDto;
import ma.zsmart.engflexy.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Api("Manages freeTrialformule services")
@RestController
@RequestMapping("/api/admin/freeTrialformule/")
public class FreeTrialformuleRestAdmin  extends AbstractController<FreeTrialformule, FreeTrialformuleDto, FreeTrialformuleHistory, FreeTrialformuleCriteria, FreeTrialformuleHistoryCriteria, FreeTrialformuleAdminService, FreeTrialformuleConverter> {


    @ApiOperation("upload one freeTrialformule")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple freeTrialformules")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all freeTrialformules")
    @GetMapping("")
    @Override
    public ResponseEntity<List<FreeTrialformuleDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all freeTrialformules")
    @GetMapping("optimized")
    @Override
    public ResponseEntity<List<FreeTrialformuleDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a freeTrialformule by id")
    @GetMapping("id/{id}")
    @Override
    public ResponseEntity<FreeTrialformuleDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  freeTrialformule")
    @PostMapping("")
    @Override
    public ResponseEntity<FreeTrialformuleDto> save(@RequestBody FreeTrialformuleDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  freeTrialformule")
    @PutMapping("")
    @Override
    public ResponseEntity<FreeTrialformuleDto> update(@RequestBody FreeTrialformuleDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of freeTrialformule")
    @PostMapping("multiple")
    @Override
    public ResponseEntity<List<FreeTrialformuleDto>> delete(@RequestBody List<FreeTrialformuleDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified freeTrialformule")
    @DeleteMapping("")
    @Override
    public ResponseEntity<FreeTrialformuleDto> delete(@RequestBody FreeTrialformuleDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified freeTrialformule")
    @DeleteMapping("id/{id}")
    @Override
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple freeTrialformules by ids")
    @DeleteMapping("multiple/id")
    @Override
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("find by inscription id")
    @GetMapping("inscription/id/{id}")

    public List<FreeTrialformule> findByInscriptionId(@PathVariable Long id){
        return service.findByInscriptionId(id);
    }
    @ApiOperation("delete by inscription id")
    @DeleteMapping("inscription/id/{id}")
    public int deleteByInscriptionId(@PathVariable Long id){
        return service.deleteByInscriptionId(id);
    }
    @ApiOperation("Finds freeTrialformules by criteria")
    @PostMapping("find-by-criteria")
    @Override
    public ResponseEntity<List<FreeTrialformuleDto>> findByCriteria(@RequestBody FreeTrialformuleCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated freeTrialformules by criteria")
    @PostMapping("find-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody FreeTrialformuleCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports freeTrialformules by criteria")
    @PostMapping("export")
    @Override
    public ResponseEntity<InputStreamResource> export(@RequestBody FreeTrialformuleCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets freeTrialformule data size by criteria")
    @PostMapping("data-size-by-criteria")
    @Override
    public ResponseEntity<Integer> getDataSize(@RequestBody FreeTrialformuleCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets freeTrialformule history by id")
    @GetMapping("history/id/{id}")
    @Override
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets freeTrialformule paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody FreeTrialformuleHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports freeTrialformule history by criteria")
    @PostMapping("export-history")
    @Override
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody FreeTrialformuleHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets freeTrialformule history data size by criteria")
    @PostMapping("history-data-size")
    @Override
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody FreeTrialformuleHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public FreeTrialformuleRestAdmin (FreeTrialformuleAdminService service, FreeTrialformuleConverter converter) {
        super(service, converter);
    }


}