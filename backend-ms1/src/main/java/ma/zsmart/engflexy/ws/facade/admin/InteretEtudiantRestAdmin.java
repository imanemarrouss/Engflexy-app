package  ma.zsmart.engflexy.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.zsmart.engflexy.bean.core.InteretEtudiant;
import ma.zsmart.engflexy.bean.history.InteretEtudiantHistory;
import ma.zsmart.engflexy.dao.criteria.core.InteretEtudiantCriteria;
import ma.zsmart.engflexy.dao.criteria.history.InteretEtudiantHistoryCriteria;
import ma.zsmart.engflexy.service.facade.admin.InteretEtudiantAdminService;
import ma.zsmart.engflexy.ws.converter.InteretEtudiantConverter;
import ma.zsmart.engflexy.ws.dto.InteretEtudiantDto;
import ma.zsmart.engflexy.zynerator.controller.AbstractController;
import ma.zsmart.engflexy.zynerator.dto.AuditEntityDto;
import ma.zsmart.engflexy.zynerator.dto.FileTempDto;
import ma.zsmart.engflexy.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Api("Manages interetEtudiant services")
@RestController
@RequestMapping("/api/admin/interetEtudiant/")
public class InteretEtudiantRestAdmin  extends AbstractController<InteretEtudiant, InteretEtudiantDto, InteretEtudiantHistory, InteretEtudiantCriteria, InteretEtudiantHistoryCriteria, InteretEtudiantAdminService, InteretEtudiantConverter> {


    @ApiOperation("upload one interetEtudiant")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple interetEtudiants")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all interetEtudiants")
    @GetMapping("")
    @Override
    public ResponseEntity<List<InteretEtudiantDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all interetEtudiants")
    @GetMapping("optimized")
    @Override
    public ResponseEntity<List<InteretEtudiantDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a interetEtudiant by id")
    @GetMapping("id/{id}")
    @Override
    public ResponseEntity<InteretEtudiantDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  interetEtudiant")
    @PostMapping("")
    @Override
    public ResponseEntity<InteretEtudiantDto> save(@RequestBody InteretEtudiantDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  interetEtudiant")
    @PutMapping("")
    @Override
    public ResponseEntity<InteretEtudiantDto> update(@RequestBody InteretEtudiantDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of interetEtudiant")
    @PostMapping("multiple")
    @Override
    public ResponseEntity<List<InteretEtudiantDto>> delete(@RequestBody List<InteretEtudiantDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified interetEtudiant")
    @DeleteMapping("")
    @Override
    public ResponseEntity<InteretEtudiantDto> delete(@RequestBody InteretEtudiantDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified interetEtudiant")
    @DeleteMapping("id/{id}")
    @Override
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple interetEtudiants by ids")
    @DeleteMapping("multiple/id")
    @Override
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("Finds interetEtudiants by criteria")
    @PostMapping("find-by-criteria")
    @Override
    public ResponseEntity<List<InteretEtudiantDto>> findByCriteria(@RequestBody InteretEtudiantCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated interetEtudiants by criteria")
    @PostMapping("find-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody InteretEtudiantCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports interetEtudiants by criteria")
    @PostMapping("export")
    @Override
    public ResponseEntity<InputStreamResource> export(@RequestBody InteretEtudiantCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets interetEtudiant data size by criteria")
    @PostMapping("data-size-by-criteria")
    @Override
    public ResponseEntity<Integer> getDataSize(@RequestBody InteretEtudiantCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets interetEtudiant history by id")
    @GetMapping("history/id/{id}")
    @Override
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets interetEtudiant paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody InteretEtudiantHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports interetEtudiant history by criteria")
    @PostMapping("export-history")
    @Override
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody InteretEtudiantHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets interetEtudiant history data size by criteria")
    @PostMapping("history-data-size")
    @Override
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody InteretEtudiantHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public InteretEtudiantRestAdmin (InteretEtudiantAdminService service, InteretEtudiantConverter converter) {
        super(service, converter);
    }


}