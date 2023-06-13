package  ma.zsmart.engflexy.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.zsmart.engflexy.bean.core.EtatEtudiantSchedule;
import ma.zsmart.engflexy.bean.history.EtatEtudiantScheduleHistory;
import ma.zsmart.engflexy.dao.criteria.core.EtatEtudiantScheduleCriteria;
import ma.zsmart.engflexy.dao.criteria.history.EtatEtudiantScheduleHistoryCriteria;
import ma.zsmart.engflexy.service.facade.admin.EtatEtudiantScheduleAdminService;
import ma.zsmart.engflexy.ws.converter.EtatEtudiantScheduleConverter;
import ma.zsmart.engflexy.ws.dto.EtatEtudiantScheduleDto;
import ma.zsmart.engflexy.zynerator.controller.AbstractController;
import ma.zsmart.engflexy.zynerator.dto.AuditEntityDto;
import ma.zsmart.engflexy.zynerator.dto.FileTempDto;
import ma.zsmart.engflexy.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Api("Manages etatEtudiantSchedule services")
@RestController
@RequestMapping("/api/admin/etatEtudiantSchedule/")
public class EtatEtudiantScheduleRestAdmin  extends AbstractController<EtatEtudiantSchedule, EtatEtudiantScheduleDto, EtatEtudiantScheduleHistory, EtatEtudiantScheduleCriteria, EtatEtudiantScheduleHistoryCriteria, EtatEtudiantScheduleAdminService, EtatEtudiantScheduleConverter> {


    @ApiOperation("upload one etatEtudiantSchedule")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple etatEtudiantSchedules")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all etatEtudiantSchedules")
    @GetMapping("")
    @Override
    public ResponseEntity<List<EtatEtudiantScheduleDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all etatEtudiantSchedules")
    @GetMapping("optimized")
    public ResponseEntity<List<EtatEtudiantScheduleDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a etatEtudiantSchedule by id")
    @GetMapping("id/{id}")
    @Override
    public ResponseEntity<EtatEtudiantScheduleDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  etatEtudiantSchedule")
    @PostMapping("")
    @Override
    public ResponseEntity<EtatEtudiantScheduleDto> save(@RequestBody EtatEtudiantScheduleDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  etatEtudiantSchedule")
    @PutMapping("")
    @Override
    public ResponseEntity<EtatEtudiantScheduleDto> update(@RequestBody EtatEtudiantScheduleDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of etatEtudiantSchedule")
    @PostMapping("multiple")
    @Override
    public ResponseEntity<List<EtatEtudiantScheduleDto>> delete(@RequestBody List<EtatEtudiantScheduleDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified etatEtudiantSchedule")
    @DeleteMapping("")
    @Override
    public ResponseEntity<EtatEtudiantScheduleDto> delete(@RequestBody EtatEtudiantScheduleDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified etatEtudiantSchedule")
    @DeleteMapping("id/{id}")
    @Override
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple etatEtudiantSchedules by ids")
    @DeleteMapping("multiple/id")
    @Override
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("Finds etatEtudiantSchedules by criteria")
    @PostMapping("find-by-criteria")
    @Override
    public ResponseEntity<List<EtatEtudiantScheduleDto>> findByCriteria(@RequestBody EtatEtudiantScheduleCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated etatEtudiantSchedules by criteria")
    @PostMapping("find-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody EtatEtudiantScheduleCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports etatEtudiantSchedules by criteria")
    @PostMapping("export")
    @Override
    public ResponseEntity<InputStreamResource> export(@RequestBody EtatEtudiantScheduleCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets etatEtudiantSchedule data size by criteria")
    @PostMapping("data-size-by-criteria")
    @Override
    public ResponseEntity<Integer> getDataSize(@RequestBody EtatEtudiantScheduleCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets etatEtudiantSchedule history by id")
    @GetMapping("history/id/{id}")
    @Override
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets etatEtudiantSchedule paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody EtatEtudiantScheduleHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports etatEtudiantSchedule history by criteria")
    @PostMapping("export-history")
    @Override
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody EtatEtudiantScheduleHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets etatEtudiantSchedule history data size by criteria")
    @PostMapping("history-data-size")
    @Override
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody EtatEtudiantScheduleHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public EtatEtudiantScheduleRestAdmin (EtatEtudiantScheduleAdminService service, EtatEtudiantScheduleConverter converter) {
        super(service, converter);
    }


}