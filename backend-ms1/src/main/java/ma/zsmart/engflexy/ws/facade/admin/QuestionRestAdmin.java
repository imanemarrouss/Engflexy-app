package  ma.zsmart.engflexy.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.zsmart.engflexy.bean.core.Question;
import ma.zsmart.engflexy.bean.history.QuestionHistory;
import ma.zsmart.engflexy.dao.criteria.core.QuestionCriteria;
import ma.zsmart.engflexy.dao.criteria.history.QuestionHistoryCriteria;
import ma.zsmart.engflexy.service.facade.admin.QuestionAdminService;
import ma.zsmart.engflexy.ws.converter.QuestionConverter;
import ma.zsmart.engflexy.ws.dto.QuestionDto;
import ma.zsmart.engflexy.zynerator.controller.AbstractController;
import ma.zsmart.engflexy.zynerator.dto.AuditEntityDto;
import ma.zsmart.engflexy.zynerator.dto.FileTempDto;
import ma.zsmart.engflexy.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Api("Manages question services")
@RestController
@RequestMapping("/api/admin/question/")
public class QuestionRestAdmin  extends AbstractController<Question, QuestionDto, QuestionHistory, QuestionCriteria, QuestionHistoryCriteria, QuestionAdminService, QuestionConverter> {


    @ApiOperation("upload one question")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple questions")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all questions")
    @GetMapping("")
    @Override
    public ResponseEntity<List<QuestionDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all questions")
    @GetMapping("optimized")
    @Override
    public ResponseEntity<List<QuestionDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a question by id")
    @GetMapping("id/{id}")
    @Override
    public ResponseEntity<QuestionDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  question")
    @PostMapping("")
    @Override
    public ResponseEntity<QuestionDto> save(@RequestBody QuestionDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  question")
    @PutMapping("")
    @Override
    public ResponseEntity<QuestionDto> update(@RequestBody QuestionDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of question")
    @PostMapping("multiple")
    @Override
    public ResponseEntity<List<QuestionDto>> delete(@RequestBody List<QuestionDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified question")
    @DeleteMapping("")
    @Override
    public ResponseEntity<QuestionDto> delete(@RequestBody QuestionDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified question")
    @DeleteMapping("id/{id}")
    @Override
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple questions by ids")
    @DeleteMapping("multiple/id")
    @Override
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("find by typeDeQuestion id")
    @GetMapping("typeDeQuestion/id/{id}")
    public List<Question> findByTypeDeQuestionId(@PathVariable Long id){
        return service.findByTypeDeQuestionId(id);
    }
    @ApiOperation("delete by typeDeQuestion id")
    @DeleteMapping("typeDeQuestion/id/{id}")
    public int deleteByTypeDeQuestionId(@PathVariable Long id){
        return service.deleteByTypeDeQuestionId(id);
    }
    @ApiOperation("find by quiz id")
    @GetMapping("quiz/id/{id}")
    public List<Question> findByQuizId(@PathVariable Long id){
        return service.findByQuizId(id);
    }
    @ApiOperation("delete by quiz id")
    @DeleteMapping("quiz/id/{id}")
    public int deleteByQuizId(@PathVariable Long id){
        return service.deleteByQuizId(id);
    }
    @ApiOperation("find by homeWork id")
    @GetMapping("homeWork/id/{id}")
    public List<Question> findByHomeWorkId(@PathVariable Long id){
        return service.findByHomeWorkId(id);
    }
    @ApiOperation("delete by homeWork id")
    @DeleteMapping("homeWork/id/{id}")
    public int deleteByHomeWorkId(@PathVariable Long id){
        return service.deleteByHomeWorkId(id);
    }
    @ApiOperation("Finds a question and associated list by id")
    @GetMapping("detail/id/{id}")
    @Override
    public ResponseEntity<QuestionDto> findWithAssociatedLists(@PathVariable Long id) {
        return super.findWithAssociatedLists(id);
    }

    @ApiOperation("Finds questions by criteria")
    @PostMapping("find-by-criteria")
    @Override
    public ResponseEntity<List<QuestionDto>> findByCriteria(@RequestBody QuestionCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated questions by criteria")
    @PostMapping("find-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody QuestionCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports questions by criteria")
    @PostMapping("export")
    @Override
    public ResponseEntity<InputStreamResource> export(@RequestBody QuestionCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets question data size by criteria")
    @PostMapping("data-size-by-criteria")
    @Override
    public ResponseEntity<Integer> getDataSize(@RequestBody QuestionCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets question history by id")
    @GetMapping("history/id/{id}")
    @Override
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets question paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody QuestionHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports question history by criteria")
    @PostMapping("export-history")
    @Override
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody QuestionHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets question history data size by criteria")
    @PostMapping("history-data-size")
    @Override
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody QuestionHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public QuestionRestAdmin (QuestionAdminService service, QuestionConverter converter) {
        super(service, converter);
    }


}