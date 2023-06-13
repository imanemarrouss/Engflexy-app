package  ma.zsmart.engflexy.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.zsmart.engflexy.bean.core.StatutSocial;
import ma.zsmart.engflexy.bean.history.StatutSocialHistory;
import ma.zsmart.engflexy.dao.criteria.core.StatutSocialCriteria;
import ma.zsmart.engflexy.dao.criteria.history.StatutSocialHistoryCriteria;
import ma.zsmart.engflexy.service.facade.admin.StatutSocialAdminService;
import ma.zsmart.engflexy.ws.converter.StatutSocialConverter;
import ma.zsmart.engflexy.ws.dto.StatutSocialDto;
import ma.zsmart.engflexy.zynerator.controller.AbstractController;
import ma.zsmart.engflexy.zynerator.dto.AuditEntityDto;
import ma.zsmart.engflexy.zynerator.dto.FileTempDto;
import ma.zsmart.engflexy.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Api("Manages statutSocial services")
@RestController
@RequestMapping("/api/admin/statutSocial/")
public class StatutSocialRestAdmin  extends AbstractController<StatutSocial, StatutSocialDto, StatutSocialHistory, StatutSocialCriteria, StatutSocialHistoryCriteria, StatutSocialAdminService, StatutSocialConverter> {


    @ApiOperation("upload one statutSocial")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple statutSocials")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all statutSocials")
    @GetMapping("")
    @Override
    public ResponseEntity<List<StatutSocialDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all statutSocials")
    @GetMapping("optimized")
    @Override
    public ResponseEntity<List<StatutSocialDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a statutSocial by id")
    @GetMapping("id/{id}")
    @Override
    public ResponseEntity<StatutSocialDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  statutSocial")
    @PostMapping("")
    @Override
    public ResponseEntity<StatutSocialDto> save(@RequestBody StatutSocialDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  statutSocial")
    @PutMapping("")
    @Override
    public ResponseEntity<StatutSocialDto> update(@RequestBody StatutSocialDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of statutSocial")
    @PostMapping("multiple")
    @Override
    public ResponseEntity<List<StatutSocialDto>> delete(@RequestBody List<StatutSocialDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified statutSocial")
    @DeleteMapping("")
    @Override
    public ResponseEntity<StatutSocialDto> delete(@RequestBody StatutSocialDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified statutSocial")
    @DeleteMapping("id/{id}")
    @Override
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple statutSocials by ids")
    @DeleteMapping("multiple/id")
    @Override
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("Finds statutSocials by criteria")
    @PostMapping("find-by-criteria")
    @Override
    public ResponseEntity<List<StatutSocialDto>> findByCriteria(@RequestBody StatutSocialCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated statutSocials by criteria")
    @PostMapping("find-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody StatutSocialCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports statutSocials by criteria")
    @PostMapping("export")
    @Override
    public ResponseEntity<InputStreamResource> export(@RequestBody StatutSocialCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets statutSocial data size by criteria")
    @PostMapping("data-size-by-criteria")
    @Override
    public ResponseEntity<Integer> getDataSize(@RequestBody StatutSocialCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets statutSocial history by id")
    @GetMapping("history/id/{id}")
    @Override
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets statutSocial paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody StatutSocialHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports statutSocial history by criteria")
    @PostMapping("export-history")
    @Override
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody StatutSocialHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets statutSocial history data size by criteria")
    @PostMapping("history-data-size")
    @Override
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody StatutSocialHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public StatutSocialRestAdmin (StatutSocialAdminService service, StatutSocialConverter converter) {
        super(service, converter);
    }


}