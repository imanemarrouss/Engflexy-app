package  ma.zsmart.engflexy.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.zsmart.engflexy.bean.core.ReponseEtudiantHomeWork;
import ma.zsmart.engflexy.bean.history.ReponseEtudiantHomeWorkHistory;
import ma.zsmart.engflexy.dao.criteria.core.ReponseEtudiantHomeWorkCriteria;
import ma.zsmart.engflexy.dao.criteria.history.ReponseEtudiantHomeWorkHistoryCriteria;
import ma.zsmart.engflexy.service.facade.admin.ReponseEtudiantHomeWorkAdminService;
import ma.zsmart.engflexy.ws.converter.ReponseEtudiantHomeWorkConverter;
import ma.zsmart.engflexy.ws.dto.ReponseEtudiantHomeWorkDto;
import ma.zsmart.engflexy.zynerator.controller.AbstractController;
import ma.zsmart.engflexy.zynerator.dto.AuditEntityDto;
import ma.zsmart.engflexy.zynerator.dto.FileTempDto;
import ma.zsmart.engflexy.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Api("Manages reponseEtudiantHomeWork services")
@RestController
@RequestMapping("/api/admin/reponseEtudiantHomeWork/")
public class ReponseEtudiantHomeWorkRestAdmin  extends AbstractController<ReponseEtudiantHomeWork, ReponseEtudiantHomeWorkDto, ReponseEtudiantHomeWorkHistory, ReponseEtudiantHomeWorkCriteria, ReponseEtudiantHomeWorkHistoryCriteria, ReponseEtudiantHomeWorkAdminService, ReponseEtudiantHomeWorkConverter> {


    @ApiOperation("upload one reponseEtudiantHomeWork")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple reponseEtudiantHomeWorks")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all reponseEtudiantHomeWorks")
    @GetMapping("")
    @Override
    public ResponseEntity<List<ReponseEtudiantHomeWorkDto>> findAll() throws Exception {
        return super.findAll();
    }


    @ApiOperation("Finds a reponseEtudiantHomeWork by id")
    @GetMapping("id/{id}")
    @Override
    public ResponseEntity<ReponseEtudiantHomeWorkDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  reponseEtudiantHomeWork")
    @PostMapping("")
    @Override
    public ResponseEntity<ReponseEtudiantHomeWorkDto> save(@RequestBody ReponseEtudiantHomeWorkDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  reponseEtudiantHomeWork")
    @PutMapping("")
    @Override
    public ResponseEntity<ReponseEtudiantHomeWorkDto> update(@RequestBody ReponseEtudiantHomeWorkDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of reponseEtudiantHomeWork")
    @PostMapping("multiple")
    @Override
    public ResponseEntity<List<ReponseEtudiantHomeWorkDto>> delete(@RequestBody List<ReponseEtudiantHomeWorkDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified reponseEtudiantHomeWork")
    @DeleteMapping("")
    @Override
    public ResponseEntity<ReponseEtudiantHomeWorkDto> delete(@RequestBody ReponseEtudiantHomeWorkDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified reponseEtudiantHomeWork")
    @DeleteMapping("id/{id}")
    @Override
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple reponseEtudiantHomeWorks by ids")
    @DeleteMapping("multiple/id")
    @Override
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("find by howeWorkQSTReponse id")
    @GetMapping("howeWorkQSTReponse/id/{id}")
    public List<ReponseEtudiantHomeWork> findByHoweWorkQSTReponseId(@PathVariable Long id){
        return service.findByHoweWorkQSTReponseId(id);
    }
    @ApiOperation("delete by howeWorkQSTReponse id")
    @DeleteMapping("howeWorkQSTReponse/id/{id}")
    public int deleteByHoweWorkQSTReponseId(@PathVariable Long id){
        return service.deleteByHoweWorkQSTReponseId(id);
    }
    @ApiOperation("find by homeWorkEtudiant id")
    @GetMapping("homeWorkEtudiant/id/{id}")
    public List<ReponseEtudiantHomeWork> findByHomeWorkEtudiantId(@PathVariable Long id){
        return service.findByHomeWorkEtudiantId(id);
    }
    @ApiOperation("delete by homeWorkEtudiant id")
    @DeleteMapping("homeWorkEtudiant/id/{id}")
    public int deleteByHomeWorkEtudiantId(@PathVariable Long id){
        return service.deleteByHomeWorkEtudiantId(id);
    }
    @ApiOperation("find by homeWorkQuestion id")
    @GetMapping("homeWorkQuestion/id/{id}")
    public List<ReponseEtudiantHomeWork> findByHomeWorkQuestionId(@PathVariable Long id){
        return service.findByHomeWorkQuestionId(id);
    }
    @ApiOperation("delete by homeWorkQuestion id")
    @DeleteMapping("homeWorkQuestion/id/{id}")
    public int deleteByHomeWorkQuestionId(@PathVariable Long id){
        return service.deleteByHomeWorkQuestionId(id);
    }
    @ApiOperation("Finds reponseEtudiantHomeWorks by criteria")
    @PostMapping("find-by-criteria")
    @Override
    public ResponseEntity<List<ReponseEtudiantHomeWorkDto>> findByCriteria(@RequestBody ReponseEtudiantHomeWorkCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated reponseEtudiantHomeWorks by criteria")
    @PostMapping("find-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody ReponseEtudiantHomeWorkCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports reponseEtudiantHomeWorks by criteria")
    @PostMapping("export")
    @Override
    public ResponseEntity<InputStreamResource> export(@RequestBody ReponseEtudiantHomeWorkCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets reponseEtudiantHomeWork data size by criteria")
    @PostMapping("data-size-by-criteria")
    @Override
    public ResponseEntity<Integer> getDataSize(@RequestBody ReponseEtudiantHomeWorkCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets reponseEtudiantHomeWork history by id")
    @GetMapping("history/id/{id}")
    @Override
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets reponseEtudiantHomeWork paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody ReponseEtudiantHomeWorkHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports reponseEtudiantHomeWork history by criteria")
    @PostMapping("export-history")
    @Override
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody ReponseEtudiantHomeWorkHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets reponseEtudiantHomeWork history data size by criteria")
    @PostMapping("history-data-size")
    @Override
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody ReponseEtudiantHomeWorkHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public ReponseEtudiantHomeWorkRestAdmin (ReponseEtudiantHomeWorkAdminService service, ReponseEtudiantHomeWorkConverter converter) {
        super(service, converter);
    }


}