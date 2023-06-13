package  ma.zsmart.engflexy.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.zsmart.engflexy.bean.core.FaqType;
import ma.zsmart.engflexy.bean.history.FaqTypeHistory;
import ma.zsmart.engflexy.dao.criteria.core.FaqTypeCriteria;
import ma.zsmart.engflexy.dao.criteria.history.FaqTypeHistoryCriteria;
import ma.zsmart.engflexy.service.facade.admin.FaqTypeAdminService;
import ma.zsmart.engflexy.ws.converter.FaqTypeConverter;
import ma.zsmart.engflexy.ws.dto.FaqTypeDto;
import ma.zsmart.engflexy.zynerator.controller.AbstractController;
import ma.zsmart.engflexy.zynerator.dto.AuditEntityDto;
import ma.zsmart.engflexy.zynerator.dto.FileTempDto;
import ma.zsmart.engflexy.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Api("Manages faqType services")
@RestController
@RequestMapping("/api/admin/faqType/")
public class FaqTypeRestAdmin  extends AbstractController<FaqType, FaqTypeDto, FaqTypeHistory, FaqTypeCriteria, FaqTypeHistoryCriteria, FaqTypeAdminService, FaqTypeConverter> {


    @ApiOperation("upload one faqType")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple faqTypes")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all faqTypes")
    @GetMapping("")
    @Override
    public ResponseEntity<List<FaqTypeDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all faqTypes")
    @GetMapping("optimized")
    @Override
    public ResponseEntity<List<FaqTypeDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a faqType by id")
    @GetMapping("id/{id}")
    @Override
    public ResponseEntity<FaqTypeDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  faqType")
    @PostMapping("")
    @Override
    public ResponseEntity<FaqTypeDto> save(@RequestBody FaqTypeDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  faqType")
    @PutMapping("")
    @Override
    public ResponseEntity<FaqTypeDto> update(@RequestBody FaqTypeDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of faqType")
    @PostMapping("multiple")
    @Override
    public ResponseEntity<List<FaqTypeDto>> delete(@RequestBody List<FaqTypeDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified faqType")
    @DeleteMapping("")
    @Override
    public ResponseEntity<FaqTypeDto> delete(@RequestBody FaqTypeDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified faqType")
    @DeleteMapping("id/{id}")
    @Override
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple faqTypes by ids")
    @DeleteMapping("multiple/id")
    @Override
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("Finds faqTypes by criteria")
    @PostMapping("find-by-criteria")
    @Override
    public ResponseEntity<List<FaqTypeDto>> findByCriteria(@RequestBody FaqTypeCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated faqTypes by criteria")
    @PostMapping("find-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody FaqTypeCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports faqTypes by criteria")
    @PostMapping("export")
    @Override
    public ResponseEntity<InputStreamResource> export(@RequestBody FaqTypeCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets faqType data size by criteria")
    @PostMapping("data-size-by-criteria")
    @Override
    public ResponseEntity<Integer> getDataSize(@RequestBody FaqTypeCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets faqType history by id")
    @GetMapping("history/id/{id}")
    @Override
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets faqType paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody FaqTypeHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports faqType history by criteria")
    @PostMapping("export-history")
    @Override
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody FaqTypeHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets faqType history data size by criteria")
    @PostMapping("history-data-size")
    @Override
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody FaqTypeHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public FaqTypeRestAdmin (FaqTypeAdminService service, FaqTypeConverter converter) {
        super(service, converter);
    }


}