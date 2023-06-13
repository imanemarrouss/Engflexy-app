package  ma.zsmart.engflexy.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.zsmart.engflexy.bean.core.Quiz;
import ma.zsmart.engflexy.bean.history.QuizHistory;
import ma.zsmart.engflexy.dao.criteria.core.QuizCriteria;
import ma.zsmart.engflexy.dao.criteria.history.QuizHistoryCriteria;
import ma.zsmart.engflexy.service.facade.admin.QuizAdminService;
import ma.zsmart.engflexy.ws.converter.QuizConverter;
import ma.zsmart.engflexy.ws.dto.QuizDto;
import ma.zsmart.engflexy.zynerator.controller.AbstractController;
import ma.zsmart.engflexy.zynerator.dto.AuditEntityDto;
import ma.zsmart.engflexy.zynerator.dto.FileTempDto;
import ma.zsmart.engflexy.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Api("Manages quiz services")
@RestController
@RequestMapping("/api/admin/quiz/")
public class QuizRestAdmin  extends AbstractController<Quiz, QuizDto, QuizHistory, QuizCriteria, QuizHistoryCriteria, QuizAdminService, QuizConverter> {


    @ApiOperation("upload one quiz")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple quizs")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all quizs")
    @GetMapping("")
    @Override
    public ResponseEntity<List<QuizDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all quizs")
    @GetMapping("optimized")
    @Override
    public ResponseEntity<List<QuizDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a quiz by id")
    @GetMapping("id/{id}")
    @Override
    public ResponseEntity<QuizDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  quiz")
    @PostMapping("")
    @Override
    public ResponseEntity<QuizDto> save(@RequestBody QuizDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  quiz")
    @PutMapping("")
    @Override
    public ResponseEntity<QuizDto> update(@RequestBody QuizDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of quiz")
    @PostMapping("multiple")
    @Override
    public ResponseEntity<List<QuizDto>> delete(@RequestBody List<QuizDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified quiz")
    @DeleteMapping("")
    @Override
    public ResponseEntity<QuizDto> delete(@RequestBody QuizDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified quiz")
    @DeleteMapping("id/{id}")
    @Override
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple quizs by ids")
    @DeleteMapping("multiple/id")
    @Override
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("find by section id")
    @GetMapping("section/id/{id}")
    public List<Quiz> findBySectionId(@PathVariable Long id){
        return service.findBySectionId(id);
    }
    @ApiOperation("delete by section id")
    @DeleteMapping("section/id/{id}")
    public int deleteBySectionId(@PathVariable Long id){
        return service.deleteBySectionId(id);
    }
    @ApiOperation("Finds a quiz and associated list by id")
    @GetMapping("detail/id/{id}")
    @Override
    public ResponseEntity<QuizDto> findWithAssociatedLists(@PathVariable Long id) {
        return super.findWithAssociatedLists(id);
    }

    @ApiOperation("Finds quizs by criteria")
    @PostMapping("find-by-criteria")
    @Override
    public ResponseEntity<List<QuizDto>> findByCriteria(@RequestBody QuizCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated quizs by criteria")
    @PostMapping("find-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody QuizCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports quizs by criteria")
    @PostMapping("export")
    @Override
    public ResponseEntity<InputStreamResource> export(@RequestBody QuizCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets quiz data size by criteria")
    @PostMapping("data-size-by-criteria")
    @Override
    public ResponseEntity<Integer> getDataSize(@RequestBody QuizCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets quiz history by id")
    @GetMapping("history/id/{id}")
    @Override
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets quiz paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody QuizHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports quiz history by criteria")
    @PostMapping("export-history")
    @Override
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody QuizHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets quiz history data size by criteria")
    @PostMapping("history-data-size")
    @Override
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody QuizHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public QuizRestAdmin (QuizAdminService service, QuizConverter converter) {
        super(service, converter);
    }


}