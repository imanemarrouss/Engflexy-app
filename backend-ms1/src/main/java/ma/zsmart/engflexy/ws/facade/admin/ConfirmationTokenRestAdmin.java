package  ma.zsmart.engflexy.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.zsmart.engflexy.bean.core.ConfirmationToken;
import ma.zsmart.engflexy.bean.history.ConfirmationTokenHistory;
import ma.zsmart.engflexy.dao.criteria.core.ConfirmationTokenCriteria;
import ma.zsmart.engflexy.dao.criteria.history.ConfirmationTokenHistoryCriteria;
import ma.zsmart.engflexy.service.facade.admin.ConfirmationTokenAdminService;
import ma.zsmart.engflexy.ws.converter.ConfirmationTokenConverter;
import ma.zsmart.engflexy.ws.dto.ConfirmationTokenDto;
import ma.zsmart.engflexy.zynerator.controller.AbstractController;
import ma.zsmart.engflexy.zynerator.dto.AuditEntityDto;
import ma.zsmart.engflexy.zynerator.dto.FileTempDto;
import ma.zsmart.engflexy.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Api("Manages confirmationToken services")
@RestController
@RequestMapping("/api/admin/confirmationToken/")
public class ConfirmationTokenRestAdmin  extends AbstractController<ConfirmationToken, ConfirmationTokenDto, ConfirmationTokenHistory, ConfirmationTokenCriteria, ConfirmationTokenHistoryCriteria, ConfirmationTokenAdminService, ConfirmationTokenConverter> {


    @ApiOperation("upload one confirmationToken")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple confirmationTokens")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all confirmationTokens")
    @GetMapping("")
    @Override
    public ResponseEntity<List<ConfirmationTokenDto>> findAll() throws Exception {
        return super.findAll();
    }


    @ApiOperation("Finds a confirmationToken by id")
    @GetMapping("id/{id}")
    @Override
    public ResponseEntity<ConfirmationTokenDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  confirmationToken")
    @PostMapping("")
    @Override
    public ResponseEntity<ConfirmationTokenDto> save(@RequestBody ConfirmationTokenDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  confirmationToken")
    @PutMapping("")
    @Override
    public ResponseEntity<ConfirmationTokenDto> update(@RequestBody ConfirmationTokenDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of confirmationToken")
    @PostMapping("multiple")
    @Override
    public ResponseEntity<List<ConfirmationTokenDto>> delete(@RequestBody List<ConfirmationTokenDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified confirmationToken")
    @DeleteMapping("")
    @Override
    public ResponseEntity<ConfirmationTokenDto> delete(@RequestBody ConfirmationTokenDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified confirmationToken")
    @DeleteMapping("id/{id}")
    @Override
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple confirmationTokens by ids")
    @DeleteMapping("multiple/id")
    @Override
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("find by etudiant id")
    @GetMapping("etudiant/id/{id}")

    public List<ConfirmationToken> findByEtudiantId(@PathVariable Long id){
        return service.findByEtudiantId(id);
    }
    @ApiOperation("delete by etudiant id")
    @DeleteMapping("etudiant/id/{id}")

    public int deleteByEtudiantId(@PathVariable Long id){
        return service.deleteByEtudiantId(id);
    }
    @ApiOperation("Finds confirmationTokens by criteria")
    @PostMapping("find-by-criteria")
    @Override
    public ResponseEntity<List<ConfirmationTokenDto>> findByCriteria(@RequestBody ConfirmationTokenCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated confirmationTokens by criteria")
    @PostMapping("find-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody ConfirmationTokenCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports confirmationTokens by criteria")
    @PostMapping("export")
    @Override
    public ResponseEntity<InputStreamResource> export(@RequestBody ConfirmationTokenCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets confirmationToken data size by criteria")
    @PostMapping("data-size-by-criteria")
    @Override
    public ResponseEntity<Integer> getDataSize(@RequestBody ConfirmationTokenCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets confirmationToken history by id")
    @GetMapping("history/id/{id}")
    @Override
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets confirmationToken paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody ConfirmationTokenHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports confirmationToken history by criteria")
    @PostMapping("export-history")
    @Override
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody ConfirmationTokenHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets confirmationToken history data size by criteria")
    @PostMapping("history-data-size")
    @Override
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody ConfirmationTokenHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public ConfirmationTokenRestAdmin (ConfirmationTokenAdminService service, ConfirmationTokenConverter converter) {
        super(service, converter);
    }


}