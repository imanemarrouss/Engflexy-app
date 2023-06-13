package  ma.zsmart.engflexy.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.zsmart.engflexy.bean.core.ReclamationEtudiant;
import ma.zsmart.engflexy.bean.history.ReclamationEtudiantHistory;
import ma.zsmart.engflexy.dao.criteria.core.ReclamationEtudiantCriteria;
import ma.zsmart.engflexy.dao.criteria.history.ReclamationEtudiantHistoryCriteria;
import ma.zsmart.engflexy.service.facade.admin.ReclamationEtudiantAdminService;
import ma.zsmart.engflexy.ws.converter.ReclamationEtudiantConverter;
import ma.zsmart.engflexy.ws.dto.ReclamationEtudiantDto;
import ma.zsmart.engflexy.zynerator.controller.AbstractController;
import ma.zsmart.engflexy.zynerator.dto.AuditEntityDto;
import ma.zsmart.engflexy.zynerator.dto.FileTempDto;
import ma.zsmart.engflexy.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Api("Manages reclamationEtudiant services")
@RestController
@RequestMapping("/api/admin/reclamationEtudiant/")
public class ReclamationEtudiantRestAdmin  extends AbstractController<ReclamationEtudiant, ReclamationEtudiantDto, ReclamationEtudiantHistory, ReclamationEtudiantCriteria, ReclamationEtudiantHistoryCriteria, ReclamationEtudiantAdminService, ReclamationEtudiantConverter> {


    @ApiOperation("upload one reclamationEtudiant")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple reclamationEtudiants")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all reclamationEtudiants")
    @GetMapping("")
    @Override
    public ResponseEntity<List<ReclamationEtudiantDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all reclamationEtudiants")
    @GetMapping("optimized")
    @Override
    public ResponseEntity<List<ReclamationEtudiantDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a reclamationEtudiant by id")
    @GetMapping("id/{id}")
    @Override
    public ResponseEntity<ReclamationEtudiantDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  reclamationEtudiant")
    @PostMapping("")
    @Override
    public ResponseEntity<ReclamationEtudiantDto> save(@RequestBody ReclamationEtudiantDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  reclamationEtudiant")
    @PutMapping("")
    @Override
    public ResponseEntity<ReclamationEtudiantDto> update(@RequestBody ReclamationEtudiantDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of reclamationEtudiant")
    @PostMapping("multiple")
    @Override
    public ResponseEntity<List<ReclamationEtudiantDto>> delete(@RequestBody List<ReclamationEtudiantDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified reclamationEtudiant")
    @DeleteMapping("")
    @Override
    public ResponseEntity<ReclamationEtudiantDto> delete(@RequestBody ReclamationEtudiantDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified reclamationEtudiant")
    @DeleteMapping("id/{id}")
    @Override
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple reclamationEtudiants by ids")
    @DeleteMapping("multiple/id")
    @Override
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("find by typeReclamationEtudiant id")
    @GetMapping("typeReclamationEtudiant/id/{id}")
    public List<ReclamationEtudiant> findByTypeReclamationEtudiantId(@PathVariable Long id){
        return service.findByTypeReclamationEtudiantId(id);
    }
    @ApiOperation("delete by typeReclamationEtudiant id")
    @DeleteMapping("typeReclamationEtudiant/id/{id}")
    public int deleteByTypeReclamationEtudiantId(@PathVariable Long id){
        return service.deleteByTypeReclamationEtudiantId(id);
    }
    @ApiOperation("Finds reclamationEtudiants by criteria")
    @PostMapping("find-by-criteria")
    @Override
    public ResponseEntity<List<ReclamationEtudiantDto>> findByCriteria(@RequestBody ReclamationEtudiantCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated reclamationEtudiants by criteria")
    @PostMapping("find-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody ReclamationEtudiantCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports reclamationEtudiants by criteria")
    @PostMapping("export")
    @Override
    public ResponseEntity<InputStreamResource> export(@RequestBody ReclamationEtudiantCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets reclamationEtudiant data size by criteria")
    @PostMapping("data-size-by-criteria")
    @Override
    public ResponseEntity<Integer> getDataSize(@RequestBody ReclamationEtudiantCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets reclamationEtudiant history by id")
    @GetMapping("history/id/{id}")
    @Override
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets reclamationEtudiant paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody ReclamationEtudiantHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports reclamationEtudiant history by criteria")
    @PostMapping("export-history")
    @Override
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody ReclamationEtudiantHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets reclamationEtudiant history data size by criteria")
    @PostMapping("history-data-size")
    @Override
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody ReclamationEtudiantHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public ReclamationEtudiantRestAdmin (ReclamationEtudiantAdminService service, ReclamationEtudiantConverter converter) {
        super(service, converter);
    }


}