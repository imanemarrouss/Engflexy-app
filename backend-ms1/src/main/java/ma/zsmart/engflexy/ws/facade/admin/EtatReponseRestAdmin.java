package  ma.zsmart.engflexy.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.zsmart.engflexy.bean.core.EtatReponse;
import ma.zsmart.engflexy.bean.history.EtatReponseHistory;
import ma.zsmart.engflexy.dao.criteria.core.EtatReponseCriteria;
import ma.zsmart.engflexy.dao.criteria.history.EtatReponseHistoryCriteria;
import ma.zsmart.engflexy.service.facade.admin.EtatReponseAdminService;
import ma.zsmart.engflexy.ws.converter.EtatReponseConverter;
import ma.zsmart.engflexy.ws.dto.EtatReponseDto;
import ma.zsmart.engflexy.zynerator.controller.AbstractController;
import ma.zsmart.engflexy.zynerator.dto.AuditEntityDto;
import ma.zsmart.engflexy.zynerator.dto.FileTempDto;
import ma.zsmart.engflexy.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Api("Manages etatReponse services")
@RestController
@RequestMapping("/api/admin/etatReponse/")
public class EtatReponseRestAdmin  extends AbstractController<EtatReponse, EtatReponseDto, EtatReponseHistory, EtatReponseCriteria, EtatReponseHistoryCriteria, EtatReponseAdminService, EtatReponseConverter> {


    @ApiOperation("upload one etatReponse")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple etatReponses")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all etatReponses")
    @GetMapping("")
    @Override
    public ResponseEntity<List<EtatReponseDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all etatReponses")
    @GetMapping("optimized")
    @Override
    public ResponseEntity<List<EtatReponseDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a etatReponse by id")
    @GetMapping("id/{id}")
    @Override
    public ResponseEntity<EtatReponseDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  etatReponse")
    @PostMapping("")
    @Override
    public ResponseEntity<EtatReponseDto> save(@RequestBody EtatReponseDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  etatReponse")
    @PutMapping("")
    @Override
    public ResponseEntity<EtatReponseDto> update(@RequestBody EtatReponseDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of etatReponse")
    @PostMapping("multiple")
    @Override
    public ResponseEntity<List<EtatReponseDto>> delete(@RequestBody List<EtatReponseDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified etatReponse")
    @DeleteMapping("")
    @Override
    public ResponseEntity<EtatReponseDto> delete(@RequestBody EtatReponseDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified etatReponse")
    @DeleteMapping("id/{id}")
    @Override
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple etatReponses by ids")
    @DeleteMapping("multiple/id")
    @Override
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("Finds etatReponses by criteria")
    @PostMapping("find-by-criteria")
    @Override
    public ResponseEntity<List<EtatReponseDto>> findByCriteria(@RequestBody EtatReponseCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated etatReponses by criteria")
    @PostMapping("find-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody EtatReponseCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports etatReponses by criteria")
    @PostMapping("export")
    @Override
    public ResponseEntity<InputStreamResource> export(@RequestBody EtatReponseCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets etatReponse data size by criteria")
    @PostMapping("data-size-by-criteria")
    @Override
    public ResponseEntity<Integer> getDataSize(@RequestBody EtatReponseCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets etatReponse history by id")
    @GetMapping("history/id/{id}")
    @Override
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets etatReponse paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody EtatReponseHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports etatReponse history by criteria")
    @PostMapping("export-history")
    @Override
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody EtatReponseHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets etatReponse history data size by criteria")
    @PostMapping("history-data-size")
    @Override
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody EtatReponseHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public EtatReponseRestAdmin (EtatReponseAdminService service, EtatReponseConverter converter) {
        super(service, converter);
    }


}