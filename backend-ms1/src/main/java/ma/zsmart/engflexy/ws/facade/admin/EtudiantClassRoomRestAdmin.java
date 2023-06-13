package  ma.zsmart.engflexy.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.zsmart.engflexy.bean.core.EtudiantClassRoom;
import ma.zsmart.engflexy.bean.history.EtudiantClassRoomHistory;
import ma.zsmart.engflexy.dao.criteria.core.EtudiantClassRoomCriteria;
import ma.zsmart.engflexy.dao.criteria.history.EtudiantClassRoomHistoryCriteria;
import ma.zsmart.engflexy.service.facade.admin.EtudiantClassRoomAdminService;
import ma.zsmart.engflexy.ws.converter.EtudiantClassRoomConverter;
import ma.zsmart.engflexy.ws.dto.EtudiantClassRoomDto;
import ma.zsmart.engflexy.zynerator.controller.AbstractController;
import ma.zsmart.engflexy.zynerator.dto.AuditEntityDto;
import ma.zsmart.engflexy.zynerator.dto.FileTempDto;
import ma.zsmart.engflexy.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Api("Manages etudiantClassRoom services")
@RestController
@RequestMapping("/api/admin/etudiantClassRoom/")
public class EtudiantClassRoomRestAdmin  extends AbstractController<EtudiantClassRoom, EtudiantClassRoomDto, EtudiantClassRoomHistory, EtudiantClassRoomCriteria, EtudiantClassRoomHistoryCriteria, EtudiantClassRoomAdminService, EtudiantClassRoomConverter> {


    @ApiOperation("upload one etudiantClassRoom")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple etudiantClassRooms")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all etudiantClassRooms")
    @GetMapping("")
    @Override
    public ResponseEntity<List<EtudiantClassRoomDto>> findAll() throws Exception {
        return super.findAll();
    }


    @ApiOperation("Finds a etudiantClassRoom by id")
    @GetMapping("id/{id}")
    @Override
    public ResponseEntity<EtudiantClassRoomDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  etudiantClassRoom")
    @PostMapping("")
    @Override
    public ResponseEntity<EtudiantClassRoomDto> save(@RequestBody EtudiantClassRoomDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  etudiantClassRoom")
    @PutMapping("")
    @Override
    public ResponseEntity<EtudiantClassRoomDto> update(@RequestBody EtudiantClassRoomDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of etudiantClassRoom")
    @PostMapping("multiple")
    @Override
    public ResponseEntity<List<EtudiantClassRoomDto>> delete(@RequestBody List<EtudiantClassRoomDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified etudiantClassRoom")
    @DeleteMapping("")
    @Override
    public ResponseEntity<EtudiantClassRoomDto> delete(@RequestBody EtudiantClassRoomDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified etudiantClassRoom")
    @DeleteMapping("id/{id}")
    @Override
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple etudiantClassRooms by ids")
    @DeleteMapping("multiple/id")
    @Override
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("find by classRoom id")
    @GetMapping("classRoom/id/{id}")

    public List<EtudiantClassRoom> findByClassRoomId(@PathVariable Long id){
        return service.findByClassRoomId(id);
    }
    @ApiOperation("delete by classRoom id")
    @DeleteMapping("classRoom/id/{id}")
    public int deleteByClassRoomId(@PathVariable Long id){
        return service.deleteByClassRoomId(id);
    }
    @ApiOperation("find by etudiant id")
    @GetMapping("etudiant/id/{id}")

    public List<EtudiantClassRoom> findByEtudiantId(@PathVariable Long id){
        return service.findByEtudiantId(id);
    }
    @ApiOperation("delete by etudiant id")
    @DeleteMapping("etudiant/id/{id}")
    public int deleteByEtudiantId(@PathVariable Long id){
        return service.deleteByEtudiantId(id);
    }
    @ApiOperation("Finds etudiantClassRooms by criteria")
    @PostMapping("find-by-criteria")
    @Override
    public ResponseEntity<List<EtudiantClassRoomDto>> findByCriteria(@RequestBody EtudiantClassRoomCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated etudiantClassRooms by criteria")
    @PostMapping("find-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody EtudiantClassRoomCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports etudiantClassRooms by criteria")
    @PostMapping("export")
    @Override
    public ResponseEntity<InputStreamResource> export(@RequestBody EtudiantClassRoomCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets etudiantClassRoom data size by criteria")
    @PostMapping("data-size-by-criteria")
    @Override
    public ResponseEntity<Integer> getDataSize(@RequestBody EtudiantClassRoomCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets etudiantClassRoom history by id")
    @GetMapping("history/id/{id}")
    @Override
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets etudiantClassRoom paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody EtudiantClassRoomHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports etudiantClassRoom history by criteria")
    @PostMapping("export-history")
    @Override
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody EtudiantClassRoomHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets etudiantClassRoom history data size by criteria")
    @PostMapping("history-data-size")
    @Override
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody EtudiantClassRoomHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public EtudiantClassRoomRestAdmin (EtudiantClassRoomAdminService service, EtudiantClassRoomConverter converter) {
        super(service, converter);
    }


}