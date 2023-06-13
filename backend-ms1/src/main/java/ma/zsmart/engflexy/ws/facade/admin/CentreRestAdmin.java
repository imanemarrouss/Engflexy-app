package  ma.zsmart.engflexy.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.zsmart.engflexy.bean.core.Centre;
import ma.zsmart.engflexy.bean.history.CentreHistory;
import ma.zsmart.engflexy.dao.criteria.core.CentreCriteria;
import ma.zsmart.engflexy.dao.criteria.history.CentreHistoryCriteria;
import ma.zsmart.engflexy.service.facade.admin.CentreAdminService;
import ma.zsmart.engflexy.ws.converter.CentreConverter;
import ma.zsmart.engflexy.ws.dto.CentreDto;
import ma.zsmart.engflexy.zynerator.controller.AbstractController;
import ma.zsmart.engflexy.zynerator.dto.AuditEntityDto;
import ma.zsmart.engflexy.zynerator.dto.FileTempDto;
import ma.zsmart.engflexy.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Api("Manages centre services")
@RestController
@RequestMapping("/api/admin/centre/")
public class CentreRestAdmin  extends AbstractController<Centre, CentreDto, CentreHistory, CentreCriteria, CentreHistoryCriteria, CentreAdminService, CentreConverter> {


    @ApiOperation("upload one centre")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple centres")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all centres")
    @GetMapping("")
    @Override
    public ResponseEntity<List<CentreDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all centres")
    @GetMapping("optimized")
    @Override
    public ResponseEntity<List<CentreDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a centre by id")
    @GetMapping("id/{id}")
    @Override
    public ResponseEntity<CentreDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  centre")
    @PostMapping("")
    @Override
    public ResponseEntity<CentreDto> save(@RequestBody CentreDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  centre")
    @PutMapping("")
    @Override
    public ResponseEntity<CentreDto> update(@RequestBody CentreDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of centre")
    @PostMapping("multiple")
    @Override
    public ResponseEntity<List<CentreDto>> delete(@RequestBody List<CentreDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified centre")
    @DeleteMapping("")
    @Override
    public ResponseEntity<CentreDto> delete(@RequestBody CentreDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified centre")
    @DeleteMapping("id/{id}")
    @Override
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple centres by ids")
    @DeleteMapping("multiple/id")
    @Override
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("Finds a centre and associated list by id")
    @GetMapping("detail/id/{id}")
    @Override
    public ResponseEntity<CentreDto> findWithAssociatedLists(@PathVariable Long id) {
        return super.findWithAssociatedLists(id);
    }

    @ApiOperation("Finds centres by criteria")
    @PostMapping("find-by-criteria")
    @Override
    public ResponseEntity<List<CentreDto>> findByCriteria(@RequestBody CentreCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated centres by criteria")
    @PostMapping("find-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody CentreCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports centres by criteria")
    @PostMapping("export")
    @Override
    public ResponseEntity<InputStreamResource> export(@RequestBody CentreCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets centre data size by criteria")
    @PostMapping("data-size-by-criteria")
    @Override
    public ResponseEntity<Integer> getDataSize(@RequestBody CentreCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets centre history by id")
    @GetMapping("history/id/{id}")
    @Override
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets centre paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody CentreHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports centre history by criteria")
    @PostMapping("export-history")
    @Override
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody CentreHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets centre history data size by criteria")
    @PostMapping("history-data-size")
    @Override
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody CentreHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public CentreRestAdmin (CentreAdminService service, CentreConverter converter) {
        super(service, converter);
    }


}