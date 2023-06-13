package  ma.zsmart.engflexy.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.zsmart.engflexy.bean.core.EtudiantCours;
import ma.zsmart.engflexy.bean.history.EtudiantCoursHistory;
import ma.zsmart.engflexy.dao.criteria.core.EtudiantCoursCriteria;
import ma.zsmart.engflexy.dao.criteria.history.EtudiantCoursHistoryCriteria;
import ma.zsmart.engflexy.service.facade.admin.EtudiantCoursAdminService;
import ma.zsmart.engflexy.ws.converter.EtudiantCoursConverter;
import ma.zsmart.engflexy.ws.dto.EtudiantCoursDto;
import ma.zsmart.engflexy.zynerator.controller.AbstractController;
import ma.zsmart.engflexy.zynerator.dto.AuditEntityDto;
import ma.zsmart.engflexy.zynerator.dto.FileTempDto;
import ma.zsmart.engflexy.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Api("Manages etudiantCours services")
@RestController
@RequestMapping("/api/admin/etudiantCours/")
public class EtudiantCoursRestAdmin  extends AbstractController<EtudiantCours, EtudiantCoursDto, EtudiantCoursHistory, EtudiantCoursCriteria, EtudiantCoursHistoryCriteria, EtudiantCoursAdminService, EtudiantCoursConverter> {


    @ApiOperation("upload one etudiantCours")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple etudiantCourss")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all etudiantCourss")
    @GetMapping("")
    @Override
    public ResponseEntity<List<EtudiantCoursDto>> findAll() throws Exception {
        return super.findAll();
    }


    @ApiOperation("Finds a etudiantCours by id")
    @GetMapping("id/{id}")
    @Override
    public ResponseEntity<EtudiantCoursDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  etudiantCours")
    @PostMapping("")
    @Override
    public ResponseEntity<EtudiantCoursDto> save(@RequestBody EtudiantCoursDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  etudiantCours")
    @PutMapping("")
    @Override
    public ResponseEntity<EtudiantCoursDto> update(@RequestBody EtudiantCoursDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of etudiantCours")
    @PostMapping("multiple")
    @Override
    public ResponseEntity<List<EtudiantCoursDto>> delete(@RequestBody List<EtudiantCoursDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified etudiantCours")
    @DeleteMapping("")
    @Override
    public ResponseEntity<EtudiantCoursDto> delete(@RequestBody EtudiantCoursDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified etudiantCours")
    @DeleteMapping("id/{id}")
    @Override
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple etudiantCourss by ids")
    @DeleteMapping("multiple/id")
    @Override
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("find by etudiant id")
    @GetMapping("etudiant/id/{id}")
    public List<EtudiantCours> findByEtudiantId(@PathVariable Long id){
        return service.findByEtudiantId(id);
    }
    @ApiOperation("delete by etudiant id")
    @DeleteMapping("etudiant/id/{id}")
    public int deleteByEtudiantId(@PathVariable Long id){
        return service.deleteByEtudiantId(id);
    }
    @ApiOperation("find by prof id")
    @GetMapping("prof/id/{id}")
    public List<EtudiantCours> findByProfId(@PathVariable Long id){
        return service.findByProfId(id);
    }
    @ApiOperation("delete by prof id")
    @DeleteMapping("prof/id/{id}")
    public int deleteByProfId(@PathVariable Long id){
        return service.deleteByProfId(id);
    }
    @ApiOperation("find by cours id")
    @GetMapping("cours/id/{id}")
    public List<EtudiantCours> findByCoursId(@PathVariable Long id){
        return service.findByCoursId(id);
    }
    @ApiOperation("delete by cours id")
    @DeleteMapping("cours/id/{id}")
    public int deleteByCoursId(@PathVariable Long id){
        return service.deleteByCoursId(id);
    }
    @ApiOperation("Finds etudiantCourss by criteria")
    @PostMapping("find-by-criteria")
    @Override
    public ResponseEntity<List<EtudiantCoursDto>> findByCriteria(@RequestBody EtudiantCoursCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated etudiantCourss by criteria")
    @PostMapping("find-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody EtudiantCoursCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports etudiantCourss by criteria")
    @PostMapping("export")
    @Override
    public ResponseEntity<InputStreamResource> export(@RequestBody EtudiantCoursCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets etudiantCours data size by criteria")
    @PostMapping("data-size-by-criteria")
    @Override
    public ResponseEntity<Integer> getDataSize(@RequestBody EtudiantCoursCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets etudiantCours history by id")
    @GetMapping("history/id/{id}")
    @Override
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets etudiantCours paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody EtudiantCoursHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports etudiantCours history by criteria")
    @PostMapping("export-history")
    @Override
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody EtudiantCoursHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets etudiantCours history data size by criteria")
    @PostMapping("history-data-size")
    @Override
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody EtudiantCoursHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public EtudiantCoursRestAdmin (EtudiantCoursAdminService service, EtudiantCoursConverter converter) {
        super(service, converter);
    }


}