package  ma.zsmart.engflexy.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.zsmart.engflexy.bean.core.ReclamationProf;
import ma.zsmart.engflexy.bean.history.ReclamationProfHistory;
import ma.zsmart.engflexy.dao.criteria.core.ReclamationProfCriteria;
import ma.zsmart.engflexy.dao.criteria.history.ReclamationProfHistoryCriteria;
import ma.zsmart.engflexy.service.facade.admin.ReclamationProfAdminService;
import ma.zsmart.engflexy.ws.converter.ReclamationProfConverter;
import ma.zsmart.engflexy.ws.dto.ReclamationProfDto;
import ma.zsmart.engflexy.zynerator.controller.AbstractController;
import ma.zsmart.engflexy.zynerator.dto.AuditEntityDto;
import ma.zsmart.engflexy.zynerator.dto.FileTempDto;
import ma.zsmart.engflexy.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Api("Manages reclamationProf services")
@RestController
@RequestMapping("/api/admin/reclamationProf/")
public class ReclamationProfRestAdmin  extends AbstractController<ReclamationProf, ReclamationProfDto, ReclamationProfHistory, ReclamationProfCriteria, ReclamationProfHistoryCriteria, ReclamationProfAdminService, ReclamationProfConverter> {


    @ApiOperation("upload one reclamationProf")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple reclamationProfs")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all reclamationProfs")
    @GetMapping("")
    @Override
    public ResponseEntity<List<ReclamationProfDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all reclamationProfs")
    @GetMapping("optimized")
    @Override
    public ResponseEntity<List<ReclamationProfDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a reclamationProf by id")
    @GetMapping("id/{id}")
    @Override
    public ResponseEntity<ReclamationProfDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  reclamationProf")
    @PostMapping("")
    @Override
    public ResponseEntity<ReclamationProfDto> save(@RequestBody ReclamationProfDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  reclamationProf")
    @PutMapping("")
    @Override
    public ResponseEntity<ReclamationProfDto> update(@RequestBody ReclamationProfDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of reclamationProf")
    @PostMapping("multiple")
    @Override
    public ResponseEntity<List<ReclamationProfDto>> delete(@RequestBody List<ReclamationProfDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified reclamationProf")
    @DeleteMapping("")
    @Override
    public ResponseEntity<ReclamationProfDto> delete(@RequestBody ReclamationProfDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified reclamationProf")
    @DeleteMapping("id/{id}")
    @Override
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple reclamationProfs by ids")
    @DeleteMapping("multiple/id")
    @Override
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("find by admin id")
    @GetMapping("admin/id/{id}")
    public List<ReclamationProf> findByAdminId(@PathVariable Long id){
        return service.findByAdminId(id);
    }
    @ApiOperation("delete by admin id")
    @DeleteMapping("admin/id/{id}")
    public int deleteByAdminId(@PathVariable Long id){
        return service.deleteByAdminId(id);
    }
    @ApiOperation("find by prof id")
    @GetMapping("prof/id/{id}")
    public List<ReclamationProf> findByProfId(@PathVariable Long id){
        return service.findByProfId(id);
    }
    @ApiOperation("delete by prof id")
    @DeleteMapping("prof/id/{id}")
    public int deleteByProfId(@PathVariable Long id){
        return service.deleteByProfId(id);
    }
    @ApiOperation("find by typeReclamationProf id")
    @GetMapping("typeReclamationProf/id/{id}")
    public List<ReclamationProf> findByTypeReclamationProfId(@PathVariable Long id){
        return service.findByTypeReclamationProfId(id);
    }
    @ApiOperation("delete by typeReclamationProf id")
    @DeleteMapping("typeReclamationProf/id/{id}")
    public int deleteByTypeReclamationProfId(@PathVariable Long id){
        return service.deleteByTypeReclamationProfId(id);
    }
    @ApiOperation("Finds reclamationProfs by criteria")
    @PostMapping("find-by-criteria")
    @Override
    public ResponseEntity<List<ReclamationProfDto>> findByCriteria(@RequestBody ReclamationProfCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated reclamationProfs by criteria")
    @PostMapping("find-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody ReclamationProfCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports reclamationProfs by criteria")
    @PostMapping("export")
    @Override
    public ResponseEntity<InputStreamResource> export(@RequestBody ReclamationProfCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets reclamationProf data size by criteria")
    @PostMapping("data-size-by-criteria")
    @Override
    public ResponseEntity<Integer> getDataSize(@RequestBody ReclamationProfCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets reclamationProf history by id")
    @GetMapping("history/id/{id}")
    @Override
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets reclamationProf paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody ReclamationProfHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports reclamationProf history by criteria")
    @PostMapping("export-history")
    @Override
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody ReclamationProfHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets reclamationProf history data size by criteria")
    @PostMapping("history-data-size")
    @Override
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody ReclamationProfHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public ReclamationProfRestAdmin (ReclamationProfAdminService service, ReclamationProfConverter converter) {
        super(service, converter);
    }


}