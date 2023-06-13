package  ma.zsmart.engflexy.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.zsmart.engflexy.bean.core.EtatEtudiant;
import ma.zsmart.engflexy.bean.history.EtatEtudiantHistory;
import ma.zsmart.engflexy.dao.criteria.core.EtatEtudiantCriteria;
import ma.zsmart.engflexy.dao.criteria.history.EtatEtudiantHistoryCriteria;
import ma.zsmart.engflexy.service.facade.admin.EtatEtudiantAdminService;
import ma.zsmart.engflexy.ws.converter.EtatEtudiantConverter;
import ma.zsmart.engflexy.ws.dto.EtatEtudiantDto;
import ma.zsmart.engflexy.zynerator.controller.AbstractController;
import ma.zsmart.engflexy.zynerator.dto.AuditEntityDto;
import ma.zsmart.engflexy.zynerator.dto.FileTempDto;
import ma.zsmart.engflexy.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Api("Manages etatEtudiant services")
@RestController
@RequestMapping("/api/admin/etatEtudiant/")
public class EtatEtudiantRestAdmin  extends AbstractController<EtatEtudiant, EtatEtudiantDto, EtatEtudiantHistory, EtatEtudiantCriteria, EtatEtudiantHistoryCriteria, EtatEtudiantAdminService, EtatEtudiantConverter> {


    @ApiOperation("upload one etatEtudiant")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple etatEtudiants")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all etatEtudiants")
    @GetMapping("")
    @Override
    public ResponseEntity<List<EtatEtudiantDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all etatEtudiants")
    @GetMapping("optimized")
    @Override
    public ResponseEntity<List<EtatEtudiantDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a etatEtudiant by id")
    @GetMapping("id/{id}")
    @Override
    public ResponseEntity<EtatEtudiantDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  etatEtudiant")
    @PostMapping("")
    @Override
    public ResponseEntity<EtatEtudiantDto> save(@RequestBody EtatEtudiantDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  etatEtudiant")
    @PutMapping("")
    @Override
    public ResponseEntity<EtatEtudiantDto> update(@RequestBody EtatEtudiantDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of etatEtudiant")
    @PostMapping("multiple")
    @Override
    public ResponseEntity<List<EtatEtudiantDto>> delete(@RequestBody List<EtatEtudiantDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified etatEtudiant")
    @DeleteMapping("")
    @Override
    public ResponseEntity<EtatEtudiantDto> delete(@RequestBody EtatEtudiantDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified etatEtudiant")
    @DeleteMapping("id/{id}")
    @Override
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple etatEtudiants by ids")
    @DeleteMapping("multiple/id")
    @Override
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("Finds etatEtudiants by criteria")
    @PostMapping("find-by-criteria")
    @Override
    public ResponseEntity<List<EtatEtudiantDto>> findByCriteria(@RequestBody EtatEtudiantCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated etatEtudiants by criteria")
    @PostMapping("find-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody EtatEtudiantCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports etatEtudiants by criteria")
    @PostMapping("export")
    @Override
    public ResponseEntity<InputStreamResource> export(@RequestBody EtatEtudiantCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets etatEtudiant data size by criteria")
    @PostMapping("data-size-by-criteria")
    @Override
    public ResponseEntity<Integer> getDataSize(@RequestBody EtatEtudiantCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets etatEtudiant history by id")
    @GetMapping("history/id/{id}")
    @Override
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets etatEtudiant paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody EtatEtudiantHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports etatEtudiant history by criteria")
    @PostMapping("export-history")
    @Override
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody EtatEtudiantHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets etatEtudiant history data size by criteria")
    @PostMapping("history-data-size")
    @Override
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody EtatEtudiantHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public EtatEtudiantRestAdmin (EtatEtudiantAdminService service, EtatEtudiantConverter converter) {
        super(service, converter);
    }


}