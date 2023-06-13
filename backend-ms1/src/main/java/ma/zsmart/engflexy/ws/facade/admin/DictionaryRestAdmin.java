package  ma.zsmart.engflexy.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.zsmart.engflexy.bean.core.Dictionary;
import ma.zsmart.engflexy.bean.history.DictionaryHistory;
import ma.zsmart.engflexy.dao.criteria.core.DictionaryCriteria;
import ma.zsmart.engflexy.dao.criteria.history.DictionaryHistoryCriteria;
import ma.zsmart.engflexy.service.facade.admin.DictionaryAdminService;
import ma.zsmart.engflexy.ws.converter.DictionaryConverter;
import ma.zsmart.engflexy.ws.dto.DictionaryDto;
import ma.zsmart.engflexy.zynerator.controller.AbstractController;
import ma.zsmart.engflexy.zynerator.dto.AuditEntityDto;
import ma.zsmart.engflexy.zynerator.dto.FileTempDto;
import ma.zsmart.engflexy.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Api("Manages dictionary services")
@RestController
@RequestMapping("/api/admin/dictionary/")
public class DictionaryRestAdmin  extends AbstractController<Dictionary, DictionaryDto, DictionaryHistory, DictionaryCriteria, DictionaryHistoryCriteria, DictionaryAdminService, DictionaryConverter> {


    @ApiOperation("upload one dictionary")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple dictionarys")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all dictionarys")
    @GetMapping("")
    @Override
    public ResponseEntity<List<DictionaryDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all dictionarys")
    @GetMapping("optimized")
    @Override
    public ResponseEntity<List<DictionaryDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a dictionary by id")
    @GetMapping("id/{id}")
    @Override
    public ResponseEntity<DictionaryDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  dictionary")
    @PostMapping("")
    @Override
    public ResponseEntity<DictionaryDto> save(@RequestBody DictionaryDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  dictionary")
    @PutMapping("")
    @Override
    public ResponseEntity<DictionaryDto> update(@RequestBody DictionaryDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of dictionary")
    @PostMapping("multiple")
    @Override
    public ResponseEntity<List<DictionaryDto>> delete(@RequestBody List<DictionaryDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified dictionary")
    @DeleteMapping("")
    @Override
    public ResponseEntity<DictionaryDto> delete(@RequestBody DictionaryDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified dictionary")
    @DeleteMapping("id/{id}")
    @Override
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple dictionarys by ids")
    @DeleteMapping("multiple/id")
    @Override
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("find by etudiant id")
    @GetMapping("etudiant/id/{id}")
    public List<Dictionary> findByEtudiantId(@PathVariable Long id){
        return service.findByEtudiantId(id);
    }
    @ApiOperation("delete by etudiant id")
    @DeleteMapping("etudiant/id/{id}")
    public int deleteByEtudiantId(@PathVariable Long id){
        return service.deleteByEtudiantId(id);
    }
    @ApiOperation("Finds dictionarys by criteria")
    @PostMapping("find-by-criteria")
    @Override
    public ResponseEntity<List<DictionaryDto>> findByCriteria(@RequestBody DictionaryCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated dictionarys by criteria")
    @PostMapping("find-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody DictionaryCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports dictionarys by criteria")
    @PostMapping("export")
    @Override
    public ResponseEntity<InputStreamResource> export(@RequestBody DictionaryCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets dictionary data size by criteria")
    @PostMapping("data-size-by-criteria")
    @Override
    public ResponseEntity<Integer> getDataSize(@RequestBody DictionaryCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets dictionary history by id")
    @GetMapping("history/id/{id}")
    @Override
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets dictionary paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody DictionaryHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports dictionary history by criteria")
    @PostMapping("export-history")
    @Override
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody DictionaryHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets dictionary history data size by criteria")
    @PostMapping("history-data-size")
    @Override
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody DictionaryHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public DictionaryRestAdmin (DictionaryAdminService service, DictionaryConverter converter) {
        super(service, converter);
    }


}