package  ma.zsmart.engflexy.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.zsmart.engflexy.bean.core.GroupeEtudiantDetail;
import ma.zsmart.engflexy.bean.history.GroupeEtudiantDetailHistory;
import ma.zsmart.engflexy.dao.criteria.core.GroupeEtudiantDetailCriteria;
import ma.zsmart.engflexy.dao.criteria.history.GroupeEtudiantDetailHistoryCriteria;
import ma.zsmart.engflexy.service.facade.admin.GroupeEtudiantDetailAdminService;
import ma.zsmart.engflexy.ws.converter.GroupeEtudiantDetailConverter;
import ma.zsmart.engflexy.ws.dto.GroupeEtudiantDetailDto;
import ma.zsmart.engflexy.zynerator.controller.AbstractController;
import ma.zsmart.engflexy.zynerator.dto.AuditEntityDto;
import ma.zsmart.engflexy.zynerator.dto.FileTempDto;
import ma.zsmart.engflexy.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Api("Manages groupeEtudiantDetail services")
@RestController
@RequestMapping("/api/admin/groupeEtudiantDetail/")
public class GroupeEtudiantDetailRestAdmin  extends AbstractController<GroupeEtudiantDetail, GroupeEtudiantDetailDto, GroupeEtudiantDetailHistory, GroupeEtudiantDetailCriteria, GroupeEtudiantDetailHistoryCriteria, GroupeEtudiantDetailAdminService, GroupeEtudiantDetailConverter> {


    @ApiOperation("upload one groupeEtudiantDetail")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple groupeEtudiantDetails")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all groupeEtudiantDetails")
    @GetMapping("")
    @Override
    public ResponseEntity<List<GroupeEtudiantDetailDto>> findAll() throws Exception {
        return super.findAll();
    }


    @ApiOperation("Finds a groupeEtudiantDetail by id")
    @GetMapping("id/{id}")
    @Override
    public ResponseEntity<GroupeEtudiantDetailDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  groupeEtudiantDetail")
    @PostMapping("")
    @Override
    public ResponseEntity<GroupeEtudiantDetailDto> save(@RequestBody GroupeEtudiantDetailDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  groupeEtudiantDetail")
    @PutMapping("")
    @Override
    public ResponseEntity<GroupeEtudiantDetailDto> update(@RequestBody GroupeEtudiantDetailDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of groupeEtudiantDetail")
    @PostMapping("multiple")
    @Override
    public ResponseEntity<List<GroupeEtudiantDetailDto>> delete(@RequestBody List<GroupeEtudiantDetailDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified groupeEtudiantDetail")
    @DeleteMapping("")
    @Override
    public ResponseEntity<GroupeEtudiantDetailDto> delete(@RequestBody GroupeEtudiantDetailDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified groupeEtudiantDetail")
    @DeleteMapping("id/{id}")
    @Override
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple groupeEtudiantDetails by ids")
    @DeleteMapping("multiple/id")
    @Override
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("find by groupeEtudiant id")
    @GetMapping("groupeEtudiant/id/{id}")

    public List<GroupeEtudiantDetail> findByGroupeEtudiantId(@PathVariable Long id){
        return service.findByGroupeEtudiantId(id);
    }
    @ApiOperation("delete by groupeEtudiant id")
    @DeleteMapping("groupeEtudiant/id/{id}")
    public int deleteByGroupeEtudiantId(@PathVariable Long id){
        return service.deleteByGroupeEtudiantId(id);
    }
    @ApiOperation("find by etudiant id")
    @GetMapping("etudiant/id/{id}")
    public List<GroupeEtudiantDetail> findByEtudiantId(@PathVariable Long id){
        return service.findByEtudiantId(id);
    }
    @ApiOperation("delete by etudiant id")
    @DeleteMapping("etudiant/id/{id}")
    public int deleteByEtudiantId(@PathVariable Long id){
        return service.deleteByEtudiantId(id);
    }
    @ApiOperation("Finds groupeEtudiantDetails by criteria")
    @PostMapping("find-by-criteria")
    @Override
    public ResponseEntity<List<GroupeEtudiantDetailDto>> findByCriteria(@RequestBody GroupeEtudiantDetailCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated groupeEtudiantDetails by criteria")
    @PostMapping("find-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody GroupeEtudiantDetailCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports groupeEtudiantDetails by criteria")
    @PostMapping("export")
    @Override
    public ResponseEntity<InputStreamResource> export(@RequestBody GroupeEtudiantDetailCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets groupeEtudiantDetail data size by criteria")
    @PostMapping("data-size-by-criteria")
    @Override
    public ResponseEntity<Integer> getDataSize(@RequestBody GroupeEtudiantDetailCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets groupeEtudiantDetail history by id")
    @GetMapping("history/id/{id}")
    @Override
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets groupeEtudiantDetail paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody GroupeEtudiantDetailHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports groupeEtudiantDetail history by criteria")
    @PostMapping("export-history")
    @Override
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody GroupeEtudiantDetailHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets groupeEtudiantDetail history data size by criteria")
    @PostMapping("history-data-size")
    @Override
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody GroupeEtudiantDetailHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public GroupeEtudiantDetailRestAdmin (GroupeEtudiantDetailAdminService service, GroupeEtudiantDetailConverter converter) {
        super(service, converter);
    }


}