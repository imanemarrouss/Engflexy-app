package  ma.zsmart.engflexy.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.zsmart.engflexy.bean.core.EtatInscription;
import ma.zsmart.engflexy.bean.history.EtatInscriptionHistory;
import ma.zsmart.engflexy.dao.criteria.core.EtatInscriptionCriteria;
import ma.zsmart.engflexy.dao.criteria.history.EtatInscriptionHistoryCriteria;
import ma.zsmart.engflexy.service.facade.admin.EtatInscriptionAdminService;
import ma.zsmart.engflexy.ws.converter.EtatInscriptionConverter;
import ma.zsmart.engflexy.ws.dto.EtatInscriptionDto;
import ma.zsmart.engflexy.zynerator.controller.AbstractController;
import ma.zsmart.engflexy.zynerator.dto.AuditEntityDto;
import ma.zsmart.engflexy.zynerator.dto.FileTempDto;
import ma.zsmart.engflexy.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Api("Manages etatInscription services")
@RestController
@RequestMapping("/api/admin/etatInscription/")
public class EtatInscriptionRestAdmin  extends AbstractController<EtatInscription, EtatInscriptionDto, EtatInscriptionHistory, EtatInscriptionCriteria, EtatInscriptionHistoryCriteria, EtatInscriptionAdminService, EtatInscriptionConverter> {


    @ApiOperation("upload one etatInscription")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple etatInscriptions")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all etatInscriptions")
    @GetMapping("")
    @Override
    public ResponseEntity<List<EtatInscriptionDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all etatInscriptions")
    @GetMapping("optimized")
    @Override
    public ResponseEntity<List<EtatInscriptionDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a etatInscription by id")
    @GetMapping("id/{id}")
    @Override
    public ResponseEntity<EtatInscriptionDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  etatInscription")
    @PostMapping("")
    @Override
    public ResponseEntity<EtatInscriptionDto> save(@RequestBody EtatInscriptionDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  etatInscription")
    @PutMapping("")
    @Override
    public ResponseEntity<EtatInscriptionDto> update(@RequestBody EtatInscriptionDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of etatInscription")
    @PostMapping("multiple")
    @Override
    public ResponseEntity<List<EtatInscriptionDto>> delete(@RequestBody List<EtatInscriptionDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified etatInscription")
    @DeleteMapping("")
    @Override
    public ResponseEntity<EtatInscriptionDto> delete(@RequestBody EtatInscriptionDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified etatInscription")
    @DeleteMapping("id/{id}")
    @Override
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple etatInscriptions by ids")
    @DeleteMapping("multiple/id")
    @Override
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("Finds etatInscriptions by criteria")
    @PostMapping("find-by-criteria")
    @Override
    public ResponseEntity<List<EtatInscriptionDto>> findByCriteria(@RequestBody EtatInscriptionCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated etatInscriptions by criteria")
    @PostMapping("find-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody EtatInscriptionCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports etatInscriptions by criteria")
    @PostMapping("export")
    @Override
    public ResponseEntity<InputStreamResource> export(@RequestBody EtatInscriptionCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets etatInscription data size by criteria")
    @PostMapping("data-size-by-criteria")
    @Override
    public ResponseEntity<Integer> getDataSize(@RequestBody EtatInscriptionCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets etatInscription history by id")
    @GetMapping("history/id/{id}")
    @Override
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets etatInscription paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody EtatInscriptionHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports etatInscription history by criteria")
    @PostMapping("export-history")
    @Override
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody EtatInscriptionHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets etatInscription history data size by criteria")
    @PostMapping("history-data-size")
    @Override
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody EtatInscriptionHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public EtatInscriptionRestAdmin (EtatInscriptionAdminService service, EtatInscriptionConverter converter) {
        super(service, converter);
    }


}