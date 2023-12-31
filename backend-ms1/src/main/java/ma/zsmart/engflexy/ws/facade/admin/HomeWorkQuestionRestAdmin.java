package  ma.zsmart.engflexy.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.zsmart.engflexy.bean.core.HomeWorkQuestion;
import ma.zsmart.engflexy.bean.history.HomeWorkQuestionHistory;
import ma.zsmart.engflexy.dao.criteria.core.HomeWorkQuestionCriteria;
import ma.zsmart.engflexy.dao.criteria.history.HomeWorkQuestionHistoryCriteria;
import ma.zsmart.engflexy.service.facade.admin.HomeWorkQuestionAdminService;
import ma.zsmart.engflexy.ws.converter.HomeWorkQuestionConverter;
import ma.zsmart.engflexy.ws.dto.HomeWorkQuestionDto;
import ma.zsmart.engflexy.zynerator.controller.AbstractController;
import ma.zsmart.engflexy.zynerator.dto.AuditEntityDto;
import ma.zsmart.engflexy.zynerator.dto.FileTempDto;
import ma.zsmart.engflexy.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Api("Manages homeWorkQuestion services")
@RestController
@RequestMapping("/api/admin/homeWorkQuestion/")
public class HomeWorkQuestionRestAdmin  extends AbstractController<HomeWorkQuestion, HomeWorkQuestionDto, HomeWorkQuestionHistory, HomeWorkQuestionCriteria, HomeWorkQuestionHistoryCriteria, HomeWorkQuestionAdminService, HomeWorkQuestionConverter> {


    @ApiOperation("upload one homeWorkQuestion")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple homeWorkQuestions")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all homeWorkQuestions")
    @GetMapping("")
    @Override
    public ResponseEntity<List<HomeWorkQuestionDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all homeWorkQuestions")
    @GetMapping("optimized")
    @Override
    public ResponseEntity<List<HomeWorkQuestionDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a homeWorkQuestion by id")
    @GetMapping("id/{id}")
    @Override
    public ResponseEntity<HomeWorkQuestionDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  homeWorkQuestion")
    @PostMapping("")
    @Override
    public ResponseEntity<HomeWorkQuestionDto> save(@RequestBody HomeWorkQuestionDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  homeWorkQuestion")
    @PutMapping("")
    @Override
    public ResponseEntity<HomeWorkQuestionDto> update(@RequestBody HomeWorkQuestionDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of homeWorkQuestion")
    @PostMapping("multiple")
    @Override
    public ResponseEntity<List<HomeWorkQuestionDto>> delete(@RequestBody List<HomeWorkQuestionDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified homeWorkQuestion")
    @DeleteMapping("")
    @Override
    public ResponseEntity<HomeWorkQuestionDto> delete(@RequestBody HomeWorkQuestionDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified homeWorkQuestion")
    @DeleteMapping("id/{id}")
    @Override
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple homeWorkQuestions by ids")
    @DeleteMapping("multiple/id")
    @Override
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("find by typeDeQuestion id")
    @GetMapping("typeDeQuestion/id/{id}")
    public List<HomeWorkQuestion> findByTypeDeQuestionId(@PathVariable Long id){
        return service.findByTypeDeQuestionId(id);
    }
    @ApiOperation("delete by typeDeQuestion id")
    @DeleteMapping("typeDeQuestion/id/{id}")
    public int deleteByTypeDeQuestionId(@PathVariable Long id){
        return service.deleteByTypeDeQuestionId(id);
    }
    @ApiOperation("find by homeWork id")
    @GetMapping("homeWork/id/{id}")
    public List<HomeWorkQuestion> findByHomeWorkId(@PathVariable Long id){
        return service.findByHomeWorkId(id);
    }
    @ApiOperation("delete by homeWork id")
    @DeleteMapping("homeWork/id/{id}")
    public int deleteByHomeWorkId(@PathVariable Long id){
        return service.deleteByHomeWorkId(id);
    }
    @ApiOperation("Finds a homeWorkQuestion and associated list by id")
    @GetMapping("detail/id/{id}")
    public ResponseEntity<HomeWorkQuestionDto> findWithAssociatedLists(@PathVariable Long id) {
        return super.findWithAssociatedLists(id);
    }

    @ApiOperation("Finds homeWorkQuestions by criteria")
    @PostMapping("find-by-criteria")
    @Override
    public ResponseEntity<List<HomeWorkQuestionDto>> findByCriteria(@RequestBody HomeWorkQuestionCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated homeWorkQuestions by criteria")
    @PostMapping("find-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody HomeWorkQuestionCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports homeWorkQuestions by criteria")
    @PostMapping("export")
    @Override
    public ResponseEntity<InputStreamResource> export(@RequestBody HomeWorkQuestionCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets homeWorkQuestion data size by criteria")
    @PostMapping("data-size-by-criteria")
    @Override
    public ResponseEntity<Integer> getDataSize(@RequestBody HomeWorkQuestionCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets homeWorkQuestion history by id")
    @GetMapping("history/id/{id}")
    @Override
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets homeWorkQuestion paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody HomeWorkQuestionHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports homeWorkQuestion history by criteria")
    @PostMapping("export-history")
    @Override
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody HomeWorkQuestionHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets homeWorkQuestion history data size by criteria")
    @PostMapping("history-data-size")
    @Override
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody HomeWorkQuestionHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public HomeWorkQuestionRestAdmin (HomeWorkQuestionAdminService service, HomeWorkQuestionConverter converter) {
        super(service, converter);
    }


}