package  ma.zsmart.engflexy.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.zsmart.engflexy.bean.core.FreeTrialTeacherEmailTemplate;
import ma.zsmart.engflexy.bean.history.FreeTrialTeacherEmailTemplateHistory;
import ma.zsmart.engflexy.dao.criteria.core.FreeTrialTeacherEmailTemplateCriteria;
import ma.zsmart.engflexy.dao.criteria.history.FreeTrialTeacherEmailTemplateHistoryCriteria;
import ma.zsmart.engflexy.service.facade.admin.FreeTrialTeacherEmailTemplateAdminService;
import ma.zsmart.engflexy.ws.converter.FreeTrialTeacherEmailTemplateConverter;
import ma.zsmart.engflexy.ws.dto.FreeTrialTeacherEmailTemplateDto;
import ma.zsmart.engflexy.zynerator.controller.AbstractController;
import ma.zsmart.engflexy.zynerator.dto.AuditEntityDto;
import ma.zsmart.engflexy.zynerator.dto.FileTempDto;
import ma.zsmart.engflexy.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Api("Manages freeTrialTeacherEmailTemplate services")
@RestController
@RequestMapping("/api/admin/freeTrialTeacherEmailTemplate/")
public class FreeTrialTeacherEmailTemplateRestAdmin  extends AbstractController<FreeTrialTeacherEmailTemplate, FreeTrialTeacherEmailTemplateDto, FreeTrialTeacherEmailTemplateHistory, FreeTrialTeacherEmailTemplateCriteria, FreeTrialTeacherEmailTemplateHistoryCriteria, FreeTrialTeacherEmailTemplateAdminService, FreeTrialTeacherEmailTemplateConverter> {


    @ApiOperation("upload one freeTrialTeacherEmailTemplate")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple freeTrialTeacherEmailTemplates")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all freeTrialTeacherEmailTemplates")
    @GetMapping("")
    @Override
    public ResponseEntity<List<FreeTrialTeacherEmailTemplateDto>> findAll() throws Exception {
        return super.findAll();
    }


    @ApiOperation("Finds a freeTrialTeacherEmailTemplate by id")
    @GetMapping("id/{id}")
    @Override
    public ResponseEntity<FreeTrialTeacherEmailTemplateDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  freeTrialTeacherEmailTemplate")
    @PostMapping("")
    @Override
    public ResponseEntity<FreeTrialTeacherEmailTemplateDto> save(@RequestBody FreeTrialTeacherEmailTemplateDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  freeTrialTeacherEmailTemplate")
    @PutMapping("")
    @Override
    public ResponseEntity<FreeTrialTeacherEmailTemplateDto> update(@RequestBody FreeTrialTeacherEmailTemplateDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of freeTrialTeacherEmailTemplate")
    @PostMapping("multiple")
    @Override
    public ResponseEntity<List<FreeTrialTeacherEmailTemplateDto>> delete(@RequestBody List<FreeTrialTeacherEmailTemplateDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified freeTrialTeacherEmailTemplate")
    @DeleteMapping("")
    @Override
    public ResponseEntity<FreeTrialTeacherEmailTemplateDto> delete(@RequestBody FreeTrialTeacherEmailTemplateDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified freeTrialTeacherEmailTemplate")
    @DeleteMapping("id/{id}")
    @Override
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple freeTrialTeacherEmailTemplates by ids")
    @DeleteMapping("multiple/id")
    @Override
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("Finds freeTrialTeacherEmailTemplates by criteria")
    @PostMapping("find-by-criteria")
    @Override
    public ResponseEntity<List<FreeTrialTeacherEmailTemplateDto>> findByCriteria(@RequestBody FreeTrialTeacherEmailTemplateCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated freeTrialTeacherEmailTemplates by criteria")
    @PostMapping("find-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody FreeTrialTeacherEmailTemplateCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports freeTrialTeacherEmailTemplates by criteria")
    @PostMapping("export")
    @Override
    public ResponseEntity<InputStreamResource> export(@RequestBody FreeTrialTeacherEmailTemplateCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets freeTrialTeacherEmailTemplate data size by criteria")
    @PostMapping("data-size-by-criteria")
    @Override
    public ResponseEntity<Integer> getDataSize(@RequestBody FreeTrialTeacherEmailTemplateCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets freeTrialTeacherEmailTemplate history by id")
    @GetMapping("history/id/{id}")
    @Override
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets freeTrialTeacherEmailTemplate paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody FreeTrialTeacherEmailTemplateHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports freeTrialTeacherEmailTemplate history by criteria")
    @PostMapping("export-history")
    @Override
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody FreeTrialTeacherEmailTemplateHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets freeTrialTeacherEmailTemplate history data size by criteria")
    @PostMapping("history-data-size")
    @Override
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody FreeTrialTeacherEmailTemplateHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public FreeTrialTeacherEmailTemplateRestAdmin (FreeTrialTeacherEmailTemplateAdminService service, FreeTrialTeacherEmailTemplateConverter converter) {
        super(service, converter);
    }


}