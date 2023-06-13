package  ma.zsmart.engflexy.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.zsmart.engflexy.bean.core.Vocabulary;
import ma.zsmart.engflexy.bean.history.VocabularyHistory;
import ma.zsmart.engflexy.dao.criteria.core.VocabularyCriteria;
import ma.zsmart.engflexy.dao.criteria.history.VocabularyHistoryCriteria;
import ma.zsmart.engflexy.service.facade.admin.VocabularyAdminService;
import ma.zsmart.engflexy.ws.converter.VocabularyConverter;
import ma.zsmart.engflexy.ws.dto.VocabularyDto;
import ma.zsmart.engflexy.zynerator.controller.AbstractController;
import ma.zsmart.engflexy.zynerator.dto.AuditEntityDto;
import ma.zsmart.engflexy.zynerator.dto.FileTempDto;
import ma.zsmart.engflexy.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Api("Manages vocabulary services")
@RestController
@RequestMapping("/api/admin/vocabulary/")
public class VocabularyRestAdmin  extends AbstractController<Vocabulary, VocabularyDto, VocabularyHistory, VocabularyCriteria, VocabularyHistoryCriteria, VocabularyAdminService, VocabularyConverter> {


    @ApiOperation("upload one vocabulary")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple vocabularys")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all vocabularys")
    @GetMapping("")
    @Override
    public ResponseEntity<List<VocabularyDto>> findAll() throws Exception {
        return super.findAll();
    }


    @ApiOperation("Finds a vocabulary by id")
    @GetMapping("id/{id}")
    @Override
    public ResponseEntity<VocabularyDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  vocabulary")
    @PostMapping("")
    @Override
    public ResponseEntity<VocabularyDto> save(@RequestBody VocabularyDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  vocabulary")
    @PutMapping("")
    @Override
    public ResponseEntity<VocabularyDto> update(@RequestBody VocabularyDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of vocabulary")
    @PostMapping("multiple")
    @Override
    public ResponseEntity<List<VocabularyDto>> delete(@RequestBody List<VocabularyDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified vocabulary")
    @DeleteMapping("")
    @Override
    public ResponseEntity<VocabularyDto> delete(@RequestBody VocabularyDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified vocabulary")
    @DeleteMapping("id/{id}")
    @Override
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple vocabularys by ids")
    @DeleteMapping("multiple/id")
    @Override
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("find by section id")
    @GetMapping("section/id/{id}")
    public List<Vocabulary> findBySectionId(@PathVariable Long id){
        return service.findBySectionId(id);
    }
    @ApiOperation("delete by section id")
    @DeleteMapping("section/id/{id}")
    public int deleteBySectionId(@PathVariable Long id){
        return service.deleteBySectionId(id);
    }
    @ApiOperation("find by vocabularyQuiz id")
    @GetMapping("vocabularyQuiz/id/{id}")
    public List<Vocabulary> findByVocabularyQuizId(@PathVariable Long id){
        return service.findByVocabularyQuizId(id);
    }
    @ApiOperation("delete by vocabularyQuiz id")
    @DeleteMapping("vocabularyQuiz/id/{id}")
    public int deleteByVocabularyQuizId(@PathVariable Long id){
        return service.deleteByVocabularyQuizId(id);
    }
    @ApiOperation("Finds vocabularys by criteria")
    @PostMapping("find-by-criteria")
    @Override
    public ResponseEntity<List<VocabularyDto>> findByCriteria(@RequestBody VocabularyCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated vocabularys by criteria")
    @PostMapping("find-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody VocabularyCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports vocabularys by criteria")
    @PostMapping("export")
    @Override
    public ResponseEntity<InputStreamResource> export(@RequestBody VocabularyCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets vocabulary data size by criteria")
    @PostMapping("data-size-by-criteria")
    @Override
    public ResponseEntity<Integer> getDataSize(@RequestBody VocabularyCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets vocabulary history by id")
    @GetMapping("history/id/{id}")
    @Override
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets vocabulary paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody VocabularyHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports vocabulary history by criteria")
    @PostMapping("export-history")
    @Override
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody VocabularyHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets vocabulary history data size by criteria")
    @PostMapping("history-data-size")
    @Override
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody VocabularyHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public VocabularyRestAdmin (VocabularyAdminService service, VocabularyConverter converter) {
        super(service, converter);
    }


}