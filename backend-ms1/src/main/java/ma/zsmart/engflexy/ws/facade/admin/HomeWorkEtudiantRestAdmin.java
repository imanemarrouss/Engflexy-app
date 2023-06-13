package  ma.zsmart.engflexy.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.zsmart.engflexy.bean.core.HomeWorkEtudiant;
import ma.zsmart.engflexy.bean.history.HomeWorkEtudiantHistory;
import ma.zsmart.engflexy.dao.criteria.core.HomeWorkEtudiantCriteria;
import ma.zsmart.engflexy.dao.criteria.history.HomeWorkEtudiantHistoryCriteria;
import ma.zsmart.engflexy.service.facade.admin.HomeWorkEtudiantAdminService;
import ma.zsmart.engflexy.ws.converter.HomeWorkEtudiantConverter;
import ma.zsmart.engflexy.ws.dto.HomeWorkEtudiantDto;
import ma.zsmart.engflexy.zynerator.controller.AbstractController;
import ma.zsmart.engflexy.zynerator.dto.AuditEntityDto;
import ma.zsmart.engflexy.zynerator.dto.FileTempDto;
import ma.zsmart.engflexy.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Api("Manages homeWorkEtudiant services")
@RestController
@RequestMapping("/api/admin/homeWorkEtudiant/")
public class HomeWorkEtudiantRestAdmin  extends AbstractController<HomeWorkEtudiant, HomeWorkEtudiantDto, HomeWorkEtudiantHistory, HomeWorkEtudiantCriteria, HomeWorkEtudiantHistoryCriteria, HomeWorkEtudiantAdminService, HomeWorkEtudiantConverter> {


    @ApiOperation("upload one homeWorkEtudiant")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple homeWorkEtudiants")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all homeWorkEtudiants")
    @GetMapping("")
    @Override
    public ResponseEntity<List<HomeWorkEtudiantDto>> findAll() throws Exception {
        return super.findAll();
    }


    @ApiOperation("Finds a homeWorkEtudiant by id")
    @GetMapping("id/{id}")
    @Override
    public ResponseEntity<HomeWorkEtudiantDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  homeWorkEtudiant")
    @PostMapping("")
    @Override
    public ResponseEntity<HomeWorkEtudiantDto> save(@RequestBody HomeWorkEtudiantDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  homeWorkEtudiant")
    @PutMapping("")
    @Override
    public ResponseEntity<HomeWorkEtudiantDto> update(@RequestBody HomeWorkEtudiantDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of homeWorkEtudiant")
    @PostMapping("multiple")
    @Override
    public ResponseEntity<List<HomeWorkEtudiantDto>> delete(@RequestBody List<HomeWorkEtudiantDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified homeWorkEtudiant")
    @DeleteMapping("")
    @Override
    public ResponseEntity<HomeWorkEtudiantDto> delete(@RequestBody HomeWorkEtudiantDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified homeWorkEtudiant")
    @DeleteMapping("id/{id}")
    @Override
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple homeWorkEtudiants by ids")
    @DeleteMapping("multiple/id")
    @Override
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("find by etudiant id")
    @GetMapping("etudiant/id/{id}")

    public List<HomeWorkEtudiant> findByEtudiantId(@PathVariable Long id){
        return service.findByEtudiantId(id);
    }
    @ApiOperation("delete by etudiant id")
    @DeleteMapping("etudiant/id/{id}")
    public int deleteByEtudiantId(@PathVariable Long id){
        return service.deleteByEtudiantId(id);
    }
    @ApiOperation("find by homeWork id")
    @GetMapping("homeWork/id/{id}")
    public List<HomeWorkEtudiant> findByHomeWorkId(@PathVariable Long id){
        return service.findByHomeWorkId(id);
    }
    @ApiOperation("delete by homeWork id")
    @DeleteMapping("homeWork/id/{id}")
    public int deleteByHomeWorkId(@PathVariable Long id){
        return service.deleteByHomeWorkId(id);
    }
    @ApiOperation("find by resultatHomeWork id")
    @GetMapping("resultatHomeWork/id/{id}")
    public List<HomeWorkEtudiant> findByResultatHomeWorkId(@PathVariable Long id){
        return service.findByResultatHomeWorkId(id);
    }
    @ApiOperation("delete by resultatHomeWork id")
    @DeleteMapping("resultatHomeWork/id/{id}")
    public int deleteByResultatHomeWorkId(@PathVariable Long id){
        return service.deleteByResultatHomeWorkId(id);
    }
    @ApiOperation("Finds a homeWorkEtudiant and associated list by id")
    @GetMapping("detail/id/{id}")
    public ResponseEntity<HomeWorkEtudiantDto> findWithAssociatedLists(@PathVariable Long id) {
        return super.findWithAssociatedLists(id);
    }

    @ApiOperation("Finds homeWorkEtudiants by criteria")
    @PostMapping("find-by-criteria")
    @Override
    public ResponseEntity<List<HomeWorkEtudiantDto>> findByCriteria(@RequestBody HomeWorkEtudiantCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated homeWorkEtudiants by criteria")
    @PostMapping("find-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody HomeWorkEtudiantCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports homeWorkEtudiants by criteria")
    @PostMapping("export")
    @Override
    public ResponseEntity<InputStreamResource> export(@RequestBody HomeWorkEtudiantCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets homeWorkEtudiant data size by criteria")
    @PostMapping("data-size-by-criteria")
    @Override
    public ResponseEntity<Integer> getDataSize(@RequestBody HomeWorkEtudiantCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets homeWorkEtudiant history by id")
    @GetMapping("history/id/{id}")
    @Override
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets homeWorkEtudiant paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody HomeWorkEtudiantHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports homeWorkEtudiant history by criteria")
    @PostMapping("export-history")
    @Override
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody HomeWorkEtudiantHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets homeWorkEtudiant history data size by criteria")
    @PostMapping("history-data-size")
    @Override
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody HomeWorkEtudiantHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public HomeWorkEtudiantRestAdmin (HomeWorkEtudiantAdminService service, HomeWorkEtudiantConverter converter) {
        super(service, converter);
    }


}