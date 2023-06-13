package  ma.zsmart.engflexy.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.zsmart.engflexy.bean.core.TeacherLocality;
import ma.zsmart.engflexy.bean.history.TeacherLocalityHistory;
import ma.zsmart.engflexy.dao.criteria.core.TeacherLocalityCriteria;
import ma.zsmart.engflexy.dao.criteria.history.TeacherLocalityHistoryCriteria;
import ma.zsmart.engflexy.service.facade.admin.TeacherLocalityAdminService;
import ma.zsmart.engflexy.ws.converter.TeacherLocalityConverter;
import ma.zsmart.engflexy.ws.dto.TeacherLocalityDto;
import ma.zsmart.engflexy.zynerator.controller.AbstractController;
import ma.zsmart.engflexy.zynerator.dto.AuditEntityDto;
import ma.zsmart.engflexy.zynerator.dto.FileTempDto;
import ma.zsmart.engflexy.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Api("Manages teacherLocality services")
@RestController
@RequestMapping("/api/admin/teacherLocality/")
public class TeacherLocalityRestAdmin  extends AbstractController<TeacherLocality, TeacherLocalityDto, TeacherLocalityHistory, TeacherLocalityCriteria, TeacherLocalityHistoryCriteria, TeacherLocalityAdminService, TeacherLocalityConverter> {


    @ApiOperation("upload one teacherLocality")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple teacherLocalitys")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all teacherLocalitys")
    @GetMapping("")
    @Override
    public ResponseEntity<List<TeacherLocalityDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all teacherLocalitys")
    @GetMapping("optimized")
    @Override
    public ResponseEntity<List<TeacherLocalityDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a teacherLocality by id")
    @GetMapping("id/{id}")
    @Override
    public ResponseEntity<TeacherLocalityDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  teacherLocality")
    @PostMapping("")
    @Override
    public ResponseEntity<TeacherLocalityDto> save(@RequestBody TeacherLocalityDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  teacherLocality")
    @PutMapping("")
    @Override
    public ResponseEntity<TeacherLocalityDto> update(@RequestBody TeacherLocalityDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of teacherLocality")
    @PostMapping("multiple")
    @Override
    public ResponseEntity<List<TeacherLocalityDto>> delete(@RequestBody List<TeacherLocalityDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified teacherLocality")
    @DeleteMapping("")
    @Override
    public ResponseEntity<TeacherLocalityDto> delete(@RequestBody TeacherLocalityDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified teacherLocality")
    @DeleteMapping("id/{id}")
    @Override
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple teacherLocalitys by ids")
    @DeleteMapping("multiple/id")
    @Override
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("Finds teacherLocalitys by criteria")
    @PostMapping("find-by-criteria")
    @Override
    public ResponseEntity<List<TeacherLocalityDto>> findByCriteria(@RequestBody TeacherLocalityCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated teacherLocalitys by criteria")
    @PostMapping("find-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody TeacherLocalityCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports teacherLocalitys by criteria")
    @PostMapping("export")
    @Override
    public ResponseEntity<InputStreamResource> export(@RequestBody TeacherLocalityCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets teacherLocality data size by criteria")
    @PostMapping("data-size-by-criteria")
    @Override
    public ResponseEntity<Integer> getDataSize(@RequestBody TeacherLocalityCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets teacherLocality history by id")
    @GetMapping("history/id/{id}")
    @Override
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets teacherLocality paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody TeacherLocalityHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports teacherLocality history by criteria")
    @PostMapping("export-history")
    @Override
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody TeacherLocalityHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets teacherLocality history data size by criteria")
    @PostMapping("history-data-size")
    @Override
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody TeacherLocalityHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    @ApiOperation("Gets teacherLocality next ordre value")
    @GetMapping(value = "/getNextOrdre")

    public ResponseEntity<Long> getNextOrdre() {
        Long nextOrdre = service.getNextOrdre();
        return new ResponseEntity<>(nextOrdre, HttpStatus.OK);
    }
    public TeacherLocalityRestAdmin (TeacherLocalityAdminService service, TeacherLocalityConverter converter) {
        super(service, converter);
    }


}