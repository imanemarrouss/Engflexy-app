package  ma.zsmart.engflexy.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.zsmart.engflexy.bean.core.TypeHomeWork;
import ma.zsmart.engflexy.bean.history.TypeHomeWorkHistory;
import ma.zsmart.engflexy.dao.criteria.core.TypeHomeWorkCriteria;
import ma.zsmart.engflexy.dao.criteria.history.TypeHomeWorkHistoryCriteria;
import ma.zsmart.engflexy.service.facade.admin.TypeHomeWorkAdminService;
import ma.zsmart.engflexy.ws.converter.TypeHomeWorkConverter;
import ma.zsmart.engflexy.ws.dto.TypeHomeWorkDto;
import ma.zsmart.engflexy.zynerator.controller.AbstractController;
import ma.zsmart.engflexy.zynerator.dto.AuditEntityDto;
import ma.zsmart.engflexy.zynerator.dto.FileTempDto;
import ma.zsmart.engflexy.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Api("Manages typeHomeWork services")
@RestController
@RequestMapping("/api/admin/typeHomeWork/")
public class TypeHomeWorkRestAdmin  extends AbstractController<TypeHomeWork, TypeHomeWorkDto, TypeHomeWorkHistory, TypeHomeWorkCriteria, TypeHomeWorkHistoryCriteria, TypeHomeWorkAdminService, TypeHomeWorkConverter> {


    @ApiOperation("upload one typeHomeWork")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple typeHomeWorks")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all typeHomeWorks")
    @GetMapping("")
    @Override
    public ResponseEntity<List<TypeHomeWorkDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all typeHomeWorks")
    @GetMapping("optimized")
    @Override
    public ResponseEntity<List<TypeHomeWorkDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a typeHomeWork by id")
    @GetMapping("id/{id}")
    @Override
    public ResponseEntity<TypeHomeWorkDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  typeHomeWork")
    @PostMapping("")
    @Override
    public ResponseEntity<TypeHomeWorkDto> save(@RequestBody TypeHomeWorkDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  typeHomeWork")
    @PutMapping("")
    @Override
    public ResponseEntity<TypeHomeWorkDto> update(@RequestBody TypeHomeWorkDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of typeHomeWork")
    @PostMapping("multiple")
    @Override
    public ResponseEntity<List<TypeHomeWorkDto>> delete(@RequestBody List<TypeHomeWorkDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified typeHomeWork")
    @DeleteMapping("")
    @Override
    public ResponseEntity<TypeHomeWorkDto> delete(@RequestBody TypeHomeWorkDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified typeHomeWork")
    @DeleteMapping("id/{id}")
    @Override
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple typeHomeWorks by ids")
    @DeleteMapping("multiple/id")
    @Override
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("Finds typeHomeWorks by criteria")
    @PostMapping("find-by-criteria")
    @Override
    public ResponseEntity<List<TypeHomeWorkDto>> findByCriteria(@RequestBody TypeHomeWorkCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated typeHomeWorks by criteria")
    @PostMapping("find-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody TypeHomeWorkCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports typeHomeWorks by criteria")
    @PostMapping("export")
    @Override
    public ResponseEntity<InputStreamResource> export(@RequestBody TypeHomeWorkCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets typeHomeWork data size by criteria")
    @PostMapping("data-size-by-criteria")
    @Override
    public ResponseEntity<Integer> getDataSize(@RequestBody TypeHomeWorkCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets typeHomeWork history by id")
    @GetMapping("history/id/{id}")
    @Override
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets typeHomeWork paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody TypeHomeWorkHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports typeHomeWork history by criteria")
    @PostMapping("export-history")
    @Override
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody TypeHomeWorkHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets typeHomeWork history data size by criteria")
    @PostMapping("history-data-size")
    @Override
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody TypeHomeWorkHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public TypeHomeWorkRestAdmin (TypeHomeWorkAdminService service, TypeHomeWorkConverter converter) {
        super(service, converter);
    }


}