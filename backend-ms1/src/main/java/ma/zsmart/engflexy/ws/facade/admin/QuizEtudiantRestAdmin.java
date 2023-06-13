package  ma.zsmart.engflexy.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.zsmart.engflexy.bean.core.QuizEtudiant;
import ma.zsmart.engflexy.bean.history.QuizEtudiantHistory;
import ma.zsmart.engflexy.dao.criteria.core.QuizEtudiantCriteria;
import ma.zsmart.engflexy.dao.criteria.history.QuizEtudiantHistoryCriteria;
import ma.zsmart.engflexy.service.facade.admin.QuizEtudiantAdminService;
import ma.zsmart.engflexy.ws.converter.QuizEtudiantConverter;
import ma.zsmart.engflexy.ws.dto.QuizEtudiantDto;
import ma.zsmart.engflexy.zynerator.controller.AbstractController;
import ma.zsmart.engflexy.zynerator.dto.AuditEntityDto;
import ma.zsmart.engflexy.zynerator.dto.FileTempDto;
import ma.zsmart.engflexy.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Api("Manages quizEtudiant services")
@RestController
@RequestMapping("/api/admin/quizEtudiant/")
public class QuizEtudiantRestAdmin  extends AbstractController<QuizEtudiant, QuizEtudiantDto, QuizEtudiantHistory, QuizEtudiantCriteria, QuizEtudiantHistoryCriteria, QuizEtudiantAdminService, QuizEtudiantConverter> {


    @ApiOperation("upload one quizEtudiant")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple quizEtudiants")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all quizEtudiants")
    @GetMapping("")
    @Override
    public ResponseEntity<List<QuizEtudiantDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all quizEtudiants")
    @GetMapping("optimized")
    @Override
    public ResponseEntity<List<QuizEtudiantDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a quizEtudiant by id")
    @GetMapping("id/{id}")
    @Override
    public ResponseEntity<QuizEtudiantDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  quizEtudiant")
    @PostMapping("")
    @Override
    public ResponseEntity<QuizEtudiantDto> save(@RequestBody QuizEtudiantDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  quizEtudiant")
    @PutMapping("")
    @Override
    public ResponseEntity<QuizEtudiantDto> update(@RequestBody QuizEtudiantDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of quizEtudiant")
    @PostMapping("multiple")
    @Override
    public ResponseEntity<List<QuizEtudiantDto>> delete(@RequestBody List<QuizEtudiantDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified quizEtudiant")
    @DeleteMapping("")
    @Override
    public ResponseEntity<QuizEtudiantDto> delete(@RequestBody QuizEtudiantDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified quizEtudiant")
    @DeleteMapping("id/{id}")
    @Override
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple quizEtudiants by ids")
    @DeleteMapping("multiple/id")
    @Override
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("find by etudiant id")
    @GetMapping("etudiant/id/{id}")
    public List<QuizEtudiant> findByEtudiantId(@PathVariable Long id){
        return service.findByEtudiantId(id);
    }
    @ApiOperation("delete by etudiant id")
    @DeleteMapping("etudiant/id/{id}")
    public int deleteByEtudiantId(@PathVariable Long id){
        return service.deleteByEtudiantId(id);
    }
    @ApiOperation("find by quiz id")
    @GetMapping("quiz/id/{id}")
    public List<QuizEtudiant> findByQuizId(@PathVariable Long id){
        return service.findByQuizId(id);
    }
    @ApiOperation("delete by quiz id")
    @DeleteMapping("quiz/id/{id}")
    public int deleteByQuizId(@PathVariable Long id){
        return service.deleteByQuizId(id);
    }
    @ApiOperation("Finds a quizEtudiant and associated list by id")
    @GetMapping("detail/id/{id}")
    @Override
    public ResponseEntity<QuizEtudiantDto> findWithAssociatedLists(@PathVariable Long id) {
        return super.findWithAssociatedLists(id);
    }

    @ApiOperation("Finds quizEtudiants by criteria")
    @PostMapping("find-by-criteria")
    @Override
    public ResponseEntity<List<QuizEtudiantDto>> findByCriteria(@RequestBody QuizEtudiantCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated quizEtudiants by criteria")
    @PostMapping("find-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody QuizEtudiantCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports quizEtudiants by criteria")
    @PostMapping("export")
    @Override
    public ResponseEntity<InputStreamResource> export(@RequestBody QuizEtudiantCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets quizEtudiant data size by criteria")
    @PostMapping("data-size-by-criteria")
    @Override
    public ResponseEntity<Integer> getDataSize(@RequestBody QuizEtudiantCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets quizEtudiant history by id")
    @GetMapping("history/id/{id}")
    @Override
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets quizEtudiant paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody QuizEtudiantHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports quizEtudiant history by criteria")
    @PostMapping("export-history")
    @Override
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody QuizEtudiantHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets quizEtudiant history data size by criteria")
    @PostMapping("history-data-size")
    @Override
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody QuizEtudiantHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public QuizEtudiantRestAdmin (QuizEtudiantAdminService service, QuizEtudiantConverter converter) {
        super(service, converter);
    }


}