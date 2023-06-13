package  ma.zsmart.engflexy.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.zsmart.engflexy.bean.core.Reponse;
import ma.zsmart.engflexy.bean.history.ReponseHistory;
import ma.zsmart.engflexy.dao.criteria.core.ReponseCriteria;
import ma.zsmart.engflexy.dao.criteria.history.ReponseHistoryCriteria;
import ma.zsmart.engflexy.service.facade.admin.ReponseAdminService;
import ma.zsmart.engflexy.ws.converter.ReponseConverter;
import ma.zsmart.engflexy.ws.dto.ReponseDto;
import ma.zsmart.engflexy.zynerator.controller.AbstractController;
import ma.zsmart.engflexy.zynerator.dto.AuditEntityDto;
import ma.zsmart.engflexy.zynerator.dto.FileTempDto;
import ma.zsmart.engflexy.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Api("Manages reponse services")
@RestController
@RequestMapping("/api/admin/reponse/")
public class ReponseRestAdmin  extends AbstractController<Reponse, ReponseDto, ReponseHistory, ReponseCriteria, ReponseHistoryCriteria, ReponseAdminService, ReponseConverter> {


    @ApiOperation("upload one reponse")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple reponses")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all reponses")
    @GetMapping("")
    @Override
    public ResponseEntity<List<ReponseDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all reponses")
    @GetMapping("optimized")
    @Override
    public ResponseEntity<List<ReponseDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a reponse by id")
    @GetMapping("id/{id}")
    @Override
    public ResponseEntity<ReponseDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  reponse")
    @PostMapping("")
    @Override
    public ResponseEntity<ReponseDto> save(@RequestBody ReponseDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  reponse")
    @PutMapping("")
    @Override
    public ResponseEntity<ReponseDto> update(@RequestBody ReponseDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of reponse")
    @PostMapping("multiple")
    @Override
    public ResponseEntity<List<ReponseDto>> delete(@RequestBody List<ReponseDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified reponse")
    @DeleteMapping("")
    @Override
    public ResponseEntity<ReponseDto> delete(@RequestBody ReponseDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified reponse")
    @DeleteMapping("id/{id}")
    @Override
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple reponses by ids")
    @DeleteMapping("multiple/id")
    @Override
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("find by etatReponse id")
    @GetMapping("etatReponse/id/{id}")
    public List<Reponse> findByEtatReponseId(@PathVariable Long id){
        return service.findByEtatReponseId(id);
    }
    @ApiOperation("delete by etatReponse id")
    @DeleteMapping("etatReponse/id/{id}")
    public int deleteByEtatReponseId(@PathVariable Long id){
        return service.deleteByEtatReponseId(id);
    }
    @ApiOperation("find by question id")
    @GetMapping("question/id/{id}")
    public List<Reponse> findByQuestionId(@PathVariable Long id){
        return service.findByQuestionId(id);
    }
    @ApiOperation("delete by question id")
    @DeleteMapping("question/id/{id}")
    public int deleteByQuestionId(@PathVariable Long id){
        return service.deleteByQuestionId(id);
    }
    @ApiOperation("Finds reponses by criteria")
    @PostMapping("find-by-criteria")
    @Override
    public ResponseEntity<List<ReponseDto>> findByCriteria(@RequestBody ReponseCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated reponses by criteria")
    @PostMapping("find-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody ReponseCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports reponses by criteria")
    @PostMapping("export")
    @Override
    public ResponseEntity<InputStreamResource> export(@RequestBody ReponseCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets reponse data size by criteria")
    @PostMapping("data-size-by-criteria")
    @Override
    public ResponseEntity<Integer> getDataSize(@RequestBody ReponseCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets reponse history by id")
    @GetMapping("history/id/{id}")
    @Override
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets reponse paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody ReponseHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports reponse history by criteria")
    @PostMapping("export-history")
    @Override
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody ReponseHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets reponse history data size by criteria")
    @PostMapping("history-data-size")
    @Override
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody ReponseHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public ReponseRestAdmin (ReponseAdminService service, ReponseConverter converter) {
        super(service, converter);
    }


}