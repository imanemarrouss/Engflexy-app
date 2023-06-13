package  ma.zsmart.engflexy.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.zsmart.engflexy.bean.core.TypeReclamationProf;
import ma.zsmart.engflexy.bean.history.TypeReclamationProfHistory;
import ma.zsmart.engflexy.dao.criteria.core.TypeReclamationProfCriteria;
import ma.zsmart.engflexy.dao.criteria.history.TypeReclamationProfHistoryCriteria;
import ma.zsmart.engflexy.service.facade.admin.TypeReclamationProfAdminService;
import ma.zsmart.engflexy.ws.converter.TypeReclamationProfConverter;
import ma.zsmart.engflexy.ws.dto.TypeReclamationProfDto;
import ma.zsmart.engflexy.zynerator.controller.AbstractController;
import ma.zsmart.engflexy.zynerator.dto.AuditEntityDto;
import ma.zsmart.engflexy.zynerator.dto.FileTempDto;
import ma.zsmart.engflexy.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Api("Manages typeReclamationProf services")
@RestController
@RequestMapping("/api/admin/typeReclamationProf/")
public class TypeReclamationProfRestAdmin  extends AbstractController<TypeReclamationProf, TypeReclamationProfDto, TypeReclamationProfHistory, TypeReclamationProfCriteria, TypeReclamationProfHistoryCriteria, TypeReclamationProfAdminService, TypeReclamationProfConverter> {


    @ApiOperation("upload one typeReclamationProf")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple typeReclamationProfs")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all typeReclamationProfs")
    @GetMapping("")
    @Override
    public ResponseEntity<List<TypeReclamationProfDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all typeReclamationProfs")
    @GetMapping("optimized")
    @Override
    public ResponseEntity<List<TypeReclamationProfDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a typeReclamationProf by id")
    @GetMapping("id/{id}")
    @Override
    public ResponseEntity<TypeReclamationProfDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  typeReclamationProf")
    @PostMapping("")
    @Override
    public ResponseEntity<TypeReclamationProfDto> save(@RequestBody TypeReclamationProfDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  typeReclamationProf")
    @PutMapping("")
    @Override
    public ResponseEntity<TypeReclamationProfDto> update(@RequestBody TypeReclamationProfDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of typeReclamationProf")
    @PostMapping("multiple")
    @Override
    public ResponseEntity<List<TypeReclamationProfDto>> delete(@RequestBody List<TypeReclamationProfDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified typeReclamationProf")
    @DeleteMapping("")
    @Override
    public ResponseEntity<TypeReclamationProfDto> delete(@RequestBody TypeReclamationProfDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified typeReclamationProf")
    @DeleteMapping("id/{id}")
    @Override
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple typeReclamationProfs by ids")
    @DeleteMapping("multiple/id")
    @Override
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("Finds typeReclamationProfs by criteria")
    @PostMapping("find-by-criteria")
    @Override
    public ResponseEntity<List<TypeReclamationProfDto>> findByCriteria(@RequestBody TypeReclamationProfCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated typeReclamationProfs by criteria")
    @PostMapping("find-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody TypeReclamationProfCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports typeReclamationProfs by criteria")
    @PostMapping("export")
    @Override
    public ResponseEntity<InputStreamResource> export(@RequestBody TypeReclamationProfCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets typeReclamationProf data size by criteria")
    @PostMapping("data-size-by-criteria")
    @Override
    public ResponseEntity<Integer> getDataSize(@RequestBody TypeReclamationProfCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets typeReclamationProf history by id")
    @GetMapping("history/id/{id}")
    @Override
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets typeReclamationProf paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody TypeReclamationProfHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports typeReclamationProf history by criteria")
    @PostMapping("export-history")
    @Override
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody TypeReclamationProfHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets typeReclamationProf history data size by criteria")
    @PostMapping("history-data-size")
    @Override
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody TypeReclamationProfHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public TypeReclamationProfRestAdmin (TypeReclamationProfAdminService service, TypeReclamationProfConverter converter) {
        super(service, converter);
    }


}