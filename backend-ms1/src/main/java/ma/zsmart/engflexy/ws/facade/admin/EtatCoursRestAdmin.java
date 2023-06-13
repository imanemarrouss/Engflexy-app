package  ma.zsmart.engflexy.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.zsmart.engflexy.bean.core.EtatCours;
import ma.zsmart.engflexy.bean.history.EtatCoursHistory;
import ma.zsmart.engflexy.dao.criteria.core.EtatCoursCriteria;
import ma.zsmart.engflexy.dao.criteria.history.EtatCoursHistoryCriteria;
import ma.zsmart.engflexy.service.facade.admin.EtatCoursAdminService;
import ma.zsmart.engflexy.ws.converter.EtatCoursConverter;
import ma.zsmart.engflexy.ws.dto.EtatCoursDto;
import ma.zsmart.engflexy.zynerator.controller.AbstractController;
import ma.zsmart.engflexy.zynerator.dto.AuditEntityDto;
import ma.zsmart.engflexy.zynerator.dto.FileTempDto;
import ma.zsmart.engflexy.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Api("Manages etatCours services")
@RestController
@RequestMapping("/api/admin/etatCours/")
public class EtatCoursRestAdmin  extends AbstractController<EtatCours, EtatCoursDto, EtatCoursHistory, EtatCoursCriteria, EtatCoursHistoryCriteria, EtatCoursAdminService, EtatCoursConverter> {


    @ApiOperation("upload one etatCours")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple etatCourss")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all etatCourss")
    @GetMapping("")
    @Override
    public ResponseEntity<List<EtatCoursDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all etatCourss")
    @GetMapping("optimized")
    @Override
    public ResponseEntity<List<EtatCoursDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a etatCours by id")
    @GetMapping("id/{id}")
    @Override
    public ResponseEntity<EtatCoursDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  etatCours")
    @PostMapping("")
    @Override
    public ResponseEntity<EtatCoursDto> save(@RequestBody EtatCoursDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  etatCours")
    @PutMapping("")
    @Override
    public ResponseEntity<EtatCoursDto> update(@RequestBody EtatCoursDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of etatCours")
    @PostMapping("multiple")
    @Override
    public ResponseEntity<List<EtatCoursDto>> delete(@RequestBody List<EtatCoursDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified etatCours")
    @DeleteMapping("")
    @Override
    public ResponseEntity<EtatCoursDto> delete(@RequestBody EtatCoursDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified etatCours")
    @DeleteMapping("id/{id}")
    @Override
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple etatCourss by ids")
    @DeleteMapping("multiple/id")
    @Override
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("Finds etatCourss by criteria")
    @PostMapping("find-by-criteria")
    @Override
    public ResponseEntity<List<EtatCoursDto>> findByCriteria(@RequestBody EtatCoursCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated etatCourss by criteria")
    @PostMapping("find-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody EtatCoursCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports etatCourss by criteria")
    @PostMapping("export")
    @Override
    public ResponseEntity<InputStreamResource> export(@RequestBody EtatCoursCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets etatCours data size by criteria")
    @PostMapping("data-size-by-criteria")
    @Override
    public ResponseEntity<Integer> getDataSize(@RequestBody EtatCoursCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets etatCours history by id")
    @GetMapping("history/id/{id}")
    @Override
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets etatCours paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody EtatCoursHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports etatCours history by criteria")
    @PostMapping("export-history")
    @Override
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody EtatCoursHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets etatCours history data size by criteria")
    @PostMapping("history-data-size")
    @Override
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody EtatCoursHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public EtatCoursRestAdmin (EtatCoursAdminService service, EtatCoursConverter converter) {
        super(service, converter);
    }


}