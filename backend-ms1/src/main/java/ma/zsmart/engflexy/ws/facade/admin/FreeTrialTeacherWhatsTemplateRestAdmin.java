package  ma.zsmart.engflexy.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.zsmart.engflexy.bean.core.FreeTrialTeacherWhatsTemplate;
import ma.zsmart.engflexy.bean.history.FreeTrialTeacherWhatsTemplateHistory;
import ma.zsmart.engflexy.dao.criteria.core.FreeTrialTeacherWhatsTemplateCriteria;
import ma.zsmart.engflexy.dao.criteria.history.FreeTrialTeacherWhatsTemplateHistoryCriteria;
import ma.zsmart.engflexy.service.facade.admin.FreeTrialTeacherWhatsTemplateAdminService;
import ma.zsmart.engflexy.ws.converter.FreeTrialTeacherWhatsTemplateConverter;
import ma.zsmart.engflexy.ws.dto.FreeTrialTeacherWhatsTemplateDto;
import ma.zsmart.engflexy.zynerator.controller.AbstractController;
import ma.zsmart.engflexy.zynerator.dto.AuditEntityDto;
import ma.zsmart.engflexy.zynerator.dto.FileTempDto;
import ma.zsmart.engflexy.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Api("Manages freeTrialTeacherWhatsTemplate services")
@RestController
@RequestMapping("/api/admin/freeTrialTeacherWhatsTemplate/")
public class FreeTrialTeacherWhatsTemplateRestAdmin  extends AbstractController<FreeTrialTeacherWhatsTemplate, FreeTrialTeacherWhatsTemplateDto, FreeTrialTeacherWhatsTemplateHistory, FreeTrialTeacherWhatsTemplateCriteria, FreeTrialTeacherWhatsTemplateHistoryCriteria, FreeTrialTeacherWhatsTemplateAdminService, FreeTrialTeacherWhatsTemplateConverter> {


    @ApiOperation("upload one freeTrialTeacherWhatsTemplate")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple freeTrialTeacherWhatsTemplates")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all freeTrialTeacherWhatsTemplates")
    @GetMapping("")
    @Override
    public ResponseEntity<List<FreeTrialTeacherWhatsTemplateDto>> findAll() throws Exception {
        return super.findAll();
    }


    @ApiOperation("Finds a freeTrialTeacherWhatsTemplate by id")
    @GetMapping("id/{id}")
    @Override
    public ResponseEntity<FreeTrialTeacherWhatsTemplateDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  freeTrialTeacherWhatsTemplate")
    @PostMapping("")
    @Override
    public ResponseEntity<FreeTrialTeacherWhatsTemplateDto> save(@RequestBody FreeTrialTeacherWhatsTemplateDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  freeTrialTeacherWhatsTemplate")
    @PutMapping("")
    @Override
    public ResponseEntity<FreeTrialTeacherWhatsTemplateDto> update(@RequestBody FreeTrialTeacherWhatsTemplateDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of freeTrialTeacherWhatsTemplate")
    @PostMapping("multiple")
    @Override
    public ResponseEntity<List<FreeTrialTeacherWhatsTemplateDto>> delete(@RequestBody List<FreeTrialTeacherWhatsTemplateDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified freeTrialTeacherWhatsTemplate")
    @DeleteMapping("")
    @Override
    public ResponseEntity<FreeTrialTeacherWhatsTemplateDto> delete(@RequestBody FreeTrialTeacherWhatsTemplateDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified freeTrialTeacherWhatsTemplate")
    @DeleteMapping("id/{id}")
    @Override
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple freeTrialTeacherWhatsTemplates by ids")
    @DeleteMapping("multiple/id")
    @Override
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("Finds freeTrialTeacherWhatsTemplates by criteria")
    @PostMapping("find-by-criteria")
    @Override
    public ResponseEntity<List<FreeTrialTeacherWhatsTemplateDto>> findByCriteria(@RequestBody FreeTrialTeacherWhatsTemplateCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated freeTrialTeacherWhatsTemplates by criteria")
    @PostMapping("find-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody FreeTrialTeacherWhatsTemplateCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports freeTrialTeacherWhatsTemplates by criteria")
    @PostMapping("export")
    @Override
    public ResponseEntity<InputStreamResource> export(@RequestBody FreeTrialTeacherWhatsTemplateCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets freeTrialTeacherWhatsTemplate data size by criteria")
    @PostMapping("data-size-by-criteria")
    @Override
    public ResponseEntity<Integer> getDataSize(@RequestBody FreeTrialTeacherWhatsTemplateCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets freeTrialTeacherWhatsTemplate history by id")
    @GetMapping("history/id/{id}")
    @Override
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @Override
    @ApiOperation("Gets freeTrialTeacherWhatsTemplate paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody FreeTrialTeacherWhatsTemplateHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports freeTrialTeacherWhatsTemplate history by criteria")
    @PostMapping("export-history")
    @Override
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody FreeTrialTeacherWhatsTemplateHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets freeTrialTeacherWhatsTemplate history data size by criteria")
    @PostMapping("history-data-size")
    @Override
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody FreeTrialTeacherWhatsTemplateHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public FreeTrialTeacherWhatsTemplateRestAdmin (FreeTrialTeacherWhatsTemplateAdminService service, FreeTrialTeacherWhatsTemplateConverter converter) {
        super(service, converter);
    }


}