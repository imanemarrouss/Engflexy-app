package  ma.zsmart.engflexy.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.zsmart.engflexy.bean.core.ClassRoom;
import ma.zsmart.engflexy.bean.history.ClassRoomHistory;
import ma.zsmart.engflexy.dao.criteria.core.ClassRoomCriteria;
import ma.zsmart.engflexy.dao.criteria.history.ClassRoomHistoryCriteria;
import ma.zsmart.engflexy.service.facade.admin.ClassRoomAdminService;
import ma.zsmart.engflexy.ws.converter.ClassRoomConverter;
import ma.zsmart.engflexy.ws.dto.ClassRoomDto;
import ma.zsmart.engflexy.zynerator.controller.AbstractController;
import ma.zsmart.engflexy.zynerator.dto.AuditEntityDto;
import ma.zsmart.engflexy.zynerator.dto.FileTempDto;
import ma.zsmart.engflexy.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Api("Manages classRoom services")
@RestController
@RequestMapping("/api/admin/classRoom/")
public class ClassRoomRestAdmin  extends AbstractController<ClassRoom, ClassRoomDto, ClassRoomHistory, ClassRoomCriteria, ClassRoomHistoryCriteria, ClassRoomAdminService, ClassRoomConverter> {


    @ApiOperation("upload one classRoom")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple classRooms")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all classRooms")
    @GetMapping("")
    @Override
    public ResponseEntity<List<ClassRoomDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all classRooms")
    @GetMapping("optimized")
    @Override
    public ResponseEntity<List<ClassRoomDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a classRoom by id")
    @GetMapping("id/{id}")
    @Override
    public ResponseEntity<ClassRoomDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  classRoom")
    @PostMapping("")
    @Override
    public ResponseEntity<ClassRoomDto> save(@RequestBody ClassRoomDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  classRoom")
    @PutMapping("")
    @Override
    public ResponseEntity<ClassRoomDto> update(@RequestBody ClassRoomDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of classRoom")
    @PostMapping("multiple")
    @Override
    public ResponseEntity<List<ClassRoomDto>> delete(@RequestBody List<ClassRoomDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified classRoom")
    @DeleteMapping("")
    @Override
    public ResponseEntity<ClassRoomDto> delete(@RequestBody ClassRoomDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified classRoom")
    @DeleteMapping("id/{id}")
    @Override
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple classRooms by ids")
    @DeleteMapping("multiple/id")
    @Override
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("find by prof id")
    @GetMapping("prof/id/{id}")

    public List<ClassRoom> findByProfId(@PathVariable Long id){
        return service.findByProfId(id);
    }
    @ApiOperation("delete by prof id")
    @DeleteMapping("prof/id/{id}")

    public int deleteByProfId(@PathVariable Long id){
        return service.deleteByProfId(id);
    }
    @ApiOperation("Finds a classRoom and associated list by id")
    @GetMapping("detail/id/{id}")
    @Override
    public ResponseEntity<ClassRoomDto> findWithAssociatedLists(@PathVariable Long id) {
        return super.findWithAssociatedLists(id);
    }

    @ApiOperation("Finds classRooms by criteria")
    @PostMapping("find-by-criteria")
    @Override
    public ResponseEntity<List<ClassRoomDto>> findByCriteria(@RequestBody ClassRoomCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated classRooms by criteria")
    @PostMapping("find-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody ClassRoomCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports classRooms by criteria")
    @PostMapping("export")
    @Override
    public ResponseEntity<InputStreamResource> export(@RequestBody ClassRoomCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets classRoom data size by criteria")
    @PostMapping("data-size-by-criteria")
    @Override
    public ResponseEntity<Integer> getDataSize(@RequestBody ClassRoomCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets classRoom history by id")
    @GetMapping("history/id/{id}")
    @Override
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets classRoom paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody ClassRoomHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports classRoom history by criteria")
    @PostMapping("export-history")
    @Override
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody ClassRoomHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets classRoom history data size by criteria")
    @PostMapping("history-data-size")
    @Override
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody ClassRoomHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public ClassRoomRestAdmin (ClassRoomAdminService service, ClassRoomConverter converter) {
        super(service, converter);
    }


}