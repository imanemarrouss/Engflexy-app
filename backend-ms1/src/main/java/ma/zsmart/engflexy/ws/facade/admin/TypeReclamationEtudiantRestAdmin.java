package  ma.zsmart.engflexy.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.zsmart.engflexy.bean.core.TypeReclamationEtudiant;
import ma.zsmart.engflexy.bean.history.TypeReclamationEtudiantHistory;
import ma.zsmart.engflexy.dao.criteria.core.TypeReclamationEtudiantCriteria;
import ma.zsmart.engflexy.dao.criteria.history.TypeReclamationEtudiantHistoryCriteria;
import ma.zsmart.engflexy.service.facade.admin.TypeReclamationEtudiantAdminService;
import ma.zsmart.engflexy.ws.converter.TypeReclamationEtudiantConverter;
import ma.zsmart.engflexy.ws.dto.TypeReclamationEtudiantDto;
import ma.zsmart.engflexy.zynerator.controller.AbstractController;
import ma.zsmart.engflexy.zynerator.dto.AuditEntityDto;
import ma.zsmart.engflexy.zynerator.dto.FileTempDto;
import ma.zsmart.engflexy.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Api("Manages typeReclamationEtudiant services")
@RestController
@RequestMapping("/api/admin/typeReclamationEtudiant/")
public class TypeReclamationEtudiantRestAdmin  extends AbstractController<TypeReclamationEtudiant, TypeReclamationEtudiantDto, TypeReclamationEtudiantHistory, TypeReclamationEtudiantCriteria, TypeReclamationEtudiantHistoryCriteria, TypeReclamationEtudiantAdminService, TypeReclamationEtudiantConverter> {


    @ApiOperation("upload one typeReclamationEtudiant")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple typeReclamationEtudiants")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all typeReclamationEtudiants")
    @GetMapping("")
    @Override
    public ResponseEntity<List<TypeReclamationEtudiantDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all typeReclamationEtudiants")
    @GetMapping("optimized")
    @Override
    public ResponseEntity<List<TypeReclamationEtudiantDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a typeReclamationEtudiant by id")
    @GetMapping("id/{id}")
    @Override
    public ResponseEntity<TypeReclamationEtudiantDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  typeReclamationEtudiant")
    @PostMapping("")
    @Override
    public ResponseEntity<TypeReclamationEtudiantDto> save(@RequestBody TypeReclamationEtudiantDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  typeReclamationEtudiant")
    @PutMapping("")
    @Override
    public ResponseEntity<TypeReclamationEtudiantDto> update(@RequestBody TypeReclamationEtudiantDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of typeReclamationEtudiant")
    @PostMapping("multiple")
    @Override
    public ResponseEntity<List<TypeReclamationEtudiantDto>> delete(@RequestBody List<TypeReclamationEtudiantDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified typeReclamationEtudiant")
    @DeleteMapping("")
    @Override
    public ResponseEntity<TypeReclamationEtudiantDto> delete(@RequestBody TypeReclamationEtudiantDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified typeReclamationEtudiant")
    @DeleteMapping("id/{id}")
    @Override
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple typeReclamationEtudiants by ids")
    @DeleteMapping("multiple/id")
    @Override
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("Finds typeReclamationEtudiants by criteria")
    @PostMapping("find-by-criteria")
    @Override
    public ResponseEntity<List<TypeReclamationEtudiantDto>> findByCriteria(@RequestBody TypeReclamationEtudiantCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated typeReclamationEtudiants by criteria")
    @PostMapping("find-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody TypeReclamationEtudiantCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports typeReclamationEtudiants by criteria")
    @PostMapping("export")
    @Override
    public ResponseEntity<InputStreamResource> export(@RequestBody TypeReclamationEtudiantCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets typeReclamationEtudiant data size by criteria")
    @PostMapping("data-size-by-criteria")
    @Override
    public ResponseEntity<Integer> getDataSize(@RequestBody TypeReclamationEtudiantCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets typeReclamationEtudiant history by id")
    @GetMapping("history/id/{id}")
    @Override
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets typeReclamationEtudiant paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody TypeReclamationEtudiantHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports typeReclamationEtudiant history by criteria")
    @PostMapping("export-history")
    @Override
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody TypeReclamationEtudiantHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets typeReclamationEtudiant history data size by criteria")
    @PostMapping("history-data-size")
    @Override
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody TypeReclamationEtudiantHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public TypeReclamationEtudiantRestAdmin (TypeReclamationEtudiantAdminService service, TypeReclamationEtudiantConverter converter) {
        super(service, converter);
    }


}