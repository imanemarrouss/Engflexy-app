package  ma.zsmart.engflexy.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.zsmart.engflexy.bean.core.Langue;
import ma.zsmart.engflexy.bean.history.LangueHistory;
import ma.zsmart.engflexy.dao.criteria.core.LangueCriteria;
import ma.zsmart.engflexy.dao.criteria.history.LangueHistoryCriteria;
import ma.zsmart.engflexy.service.facade.admin.LangueAdminService;
import ma.zsmart.engflexy.ws.converter.LangueConverter;
import ma.zsmart.engflexy.ws.dto.LangueDto;
import ma.zsmart.engflexy.zynerator.controller.AbstractController;
import ma.zsmart.engflexy.zynerator.dto.AuditEntityDto;
import ma.zsmart.engflexy.zynerator.dto.FileTempDto;
import ma.zsmart.engflexy.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Api("Manages langue services")
@RestController
@RequestMapping("/api/admin/langue/")
public class LangueRestAdmin  extends AbstractController<Langue, LangueDto, LangueHistory, LangueCriteria, LangueHistoryCriteria, LangueAdminService, LangueConverter> {


    @ApiOperation("upload one langue")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple langues")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all langues")
    @GetMapping("")
    @Override
    public ResponseEntity<List<LangueDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all langues")
    @GetMapping("optimized")
    @Override
    public ResponseEntity<List<LangueDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a langue by id")
    @GetMapping("id/{id}")
    @Override
    public ResponseEntity<LangueDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  langue")
    @PostMapping("")
    @Override
    public ResponseEntity<LangueDto> save(@RequestBody LangueDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  langue")
    @PutMapping("")
    @Override
    public ResponseEntity<LangueDto> update(@RequestBody LangueDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of langue")
    @PostMapping("multiple")
    @Override
    public ResponseEntity<List<LangueDto>> delete(@RequestBody List<LangueDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified langue")
    @DeleteMapping("")
    @Override
    public ResponseEntity<LangueDto> delete(@RequestBody LangueDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified langue")
    @DeleteMapping("id/{id}")
    @Override
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple langues by ids")
    @DeleteMapping("multiple/id")
    @Override
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("Finds langues by criteria")
    @PostMapping("find-by-criteria")
    @Override
    public ResponseEntity<List<LangueDto>> findByCriteria(@RequestBody LangueCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated langues by criteria")
    @PostMapping("find-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody LangueCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports langues by criteria")
    @PostMapping("export")
    @Override
    public ResponseEntity<InputStreamResource> export(@RequestBody LangueCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets langue data size by criteria")
    @PostMapping("data-size-by-criteria")
    @Override
    public ResponseEntity<Integer> getDataSize(@RequestBody LangueCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets langue history by id")
    @GetMapping("history/id/{id}")
    @Override
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets langue paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody LangueHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports langue history by criteria")
    @PostMapping("export-history")
    @Override
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody LangueHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets langue history data size by criteria")
    @PostMapping("history-data-size")
    @Override
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody LangueHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public LangueRestAdmin (LangueAdminService service, LangueConverter converter) {
        super(service, converter);
    }


}