package  ma.zsmart.engflexy.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.zsmart.engflexy.bean.core.FreeTrialStudentWhatsTemplate;
import ma.zsmart.engflexy.bean.history.FreeTrialStudentWhatsTemplateHistory;
import ma.zsmart.engflexy.dao.criteria.core.FreeTrialStudentWhatsTemplateCriteria;
import ma.zsmart.engflexy.dao.criteria.history.FreeTrialStudentWhatsTemplateHistoryCriteria;
import ma.zsmart.engflexy.service.facade.admin.FreeTrialStudentWhatsTemplateAdminService;
import ma.zsmart.engflexy.ws.converter.FreeTrialStudentWhatsTemplateConverter;
import ma.zsmart.engflexy.ws.dto.FreeTrialStudentWhatsTemplateDto;
import ma.zsmart.engflexy.zynerator.controller.AbstractController;
import ma.zsmart.engflexy.zynerator.dto.AuditEntityDto;
import ma.zsmart.engflexy.zynerator.dto.FileTempDto;
import ma.zsmart.engflexy.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Api("Manages freeTrialStudentWhatsTemplate services")
@RestController
@RequestMapping("/api/admin/freeTrialStudentWhatsTemplate/")
public class FreeTrialStudentWhatsTemplateRestAdmin  extends AbstractController<FreeTrialStudentWhatsTemplate, FreeTrialStudentWhatsTemplateDto, FreeTrialStudentWhatsTemplateHistory, FreeTrialStudentWhatsTemplateCriteria, FreeTrialStudentWhatsTemplateHistoryCriteria, FreeTrialStudentWhatsTemplateAdminService, FreeTrialStudentWhatsTemplateConverter> {


    @ApiOperation("upload one freeTrialStudentWhatsTemplate")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple freeTrialStudentWhatsTemplates")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all freeTrialStudentWhatsTemplates")
    @GetMapping("")
    @Override
    public ResponseEntity<List<FreeTrialStudentWhatsTemplateDto>> findAll() throws Exception {
        return super.findAll();
    }


    @ApiOperation("Finds a freeTrialStudentWhatsTemplate by id")
    @GetMapping("id/{id}")
    @Override
    public ResponseEntity<FreeTrialStudentWhatsTemplateDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  freeTrialStudentWhatsTemplate")
    @PostMapping("")
    @Override
    public ResponseEntity<FreeTrialStudentWhatsTemplateDto> save(@RequestBody FreeTrialStudentWhatsTemplateDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  freeTrialStudentWhatsTemplate")
    @PutMapping("")
    @Override
    public ResponseEntity<FreeTrialStudentWhatsTemplateDto> update(@RequestBody FreeTrialStudentWhatsTemplateDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of freeTrialStudentWhatsTemplate")
    @PostMapping("multiple")
    @Override
    public ResponseEntity<List<FreeTrialStudentWhatsTemplateDto>> delete(@RequestBody List<FreeTrialStudentWhatsTemplateDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified freeTrialStudentWhatsTemplate")
    @DeleteMapping("")
    @Override
    public ResponseEntity<FreeTrialStudentWhatsTemplateDto> delete(@RequestBody FreeTrialStudentWhatsTemplateDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified freeTrialStudentWhatsTemplate")
    @DeleteMapping("id/{id}")
    @Override
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple freeTrialStudentWhatsTemplates by ids")
    @DeleteMapping("multiple/id")
    @Override
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("Finds freeTrialStudentWhatsTemplates by criteria")
    @PostMapping("find-by-criteria")
    @Override
    public ResponseEntity<List<FreeTrialStudentWhatsTemplateDto>> findByCriteria(@RequestBody FreeTrialStudentWhatsTemplateCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated freeTrialStudentWhatsTemplates by criteria")
    @PostMapping("find-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody FreeTrialStudentWhatsTemplateCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports freeTrialStudentWhatsTemplates by criteria")
    @PostMapping("export")
    @Override
    public ResponseEntity<InputStreamResource> export(@RequestBody FreeTrialStudentWhatsTemplateCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets freeTrialStudentWhatsTemplate data size by criteria")
    @PostMapping("data-size-by-criteria")
    @Override
    public ResponseEntity<Integer> getDataSize(@RequestBody FreeTrialStudentWhatsTemplateCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets freeTrialStudentWhatsTemplate history by id")
    @GetMapping("history/id/{id}")
    @Override
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets freeTrialStudentWhatsTemplate paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody FreeTrialStudentWhatsTemplateHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports freeTrialStudentWhatsTemplate history by criteria")
    @PostMapping("export-history")
    @Override
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody FreeTrialStudentWhatsTemplateHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets freeTrialStudentWhatsTemplate history data size by criteria")
    @PostMapping("history-data-size")
    @Override
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody FreeTrialStudentWhatsTemplateHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public FreeTrialStudentWhatsTemplateRestAdmin (FreeTrialStudentWhatsTemplateAdminService service, FreeTrialStudentWhatsTemplateConverter converter) {
        super(service, converter);
    }


}