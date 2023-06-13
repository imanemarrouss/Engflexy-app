package  ma.zsmart.engflexy.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.zsmart.engflexy.bean.core.TrancheHoraireProf;
import ma.zsmart.engflexy.bean.history.TrancheHoraireProfHistory;
import ma.zsmart.engflexy.dao.criteria.core.TrancheHoraireProfCriteria;
import ma.zsmart.engflexy.dao.criteria.history.TrancheHoraireProfHistoryCriteria;
import ma.zsmart.engflexy.service.facade.admin.TrancheHoraireProfAdminService;
import ma.zsmart.engflexy.ws.converter.TrancheHoraireProfConverter;
import ma.zsmart.engflexy.ws.dto.TrancheHoraireProfDto;
import ma.zsmart.engflexy.zynerator.controller.AbstractController;
import ma.zsmart.engflexy.zynerator.dto.AuditEntityDto;
import ma.zsmart.engflexy.zynerator.dto.FileTempDto;
import ma.zsmart.engflexy.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Api("Manages trancheHoraireProf services")
@RestController
@RequestMapping("/api/admin/trancheHoraireProf/")
public class TrancheHoraireProfRestAdmin  extends AbstractController<TrancheHoraireProf, TrancheHoraireProfDto, TrancheHoraireProfHistory, TrancheHoraireProfCriteria, TrancheHoraireProfHistoryCriteria, TrancheHoraireProfAdminService, TrancheHoraireProfConverter> {


    @ApiOperation("upload one trancheHoraireProf")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple trancheHoraireProfs")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all trancheHoraireProfs")
    @GetMapping("")
    @Override
    public ResponseEntity<List<TrancheHoraireProfDto>> findAll() throws Exception {
        return super.findAll();
    }


    @ApiOperation("Finds a trancheHoraireProf by id")
    @GetMapping("id/{id}")
    @Override
    public ResponseEntity<TrancheHoraireProfDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  trancheHoraireProf")
    @PostMapping("")
    @Override
    public ResponseEntity<TrancheHoraireProfDto> save(@RequestBody TrancheHoraireProfDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  trancheHoraireProf")
    @PutMapping("")
    @Override
    public ResponseEntity<TrancheHoraireProfDto> update(@RequestBody TrancheHoraireProfDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of trancheHoraireProf")
    @PostMapping("multiple")
    @Override
    public ResponseEntity<List<TrancheHoraireProfDto>> delete(@RequestBody List<TrancheHoraireProfDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified trancheHoraireProf")
    @DeleteMapping("")
    @Override
    public ResponseEntity<TrancheHoraireProfDto> delete(@RequestBody TrancheHoraireProfDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified trancheHoraireProf")
    @DeleteMapping("id/{id}")
    @Override
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple trancheHoraireProfs by ids")
    @DeleteMapping("multiple/id")
    @Override
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("find by prof id")
    @GetMapping("prof/id/{id}")
    public List<TrancheHoraireProf> findByProfId(@PathVariable Long id){
        return service.findByProfId(id);
    }
    @ApiOperation("delete by prof id")
    @DeleteMapping("prof/id/{id}")
    public int deleteByProfId(@PathVariable Long id){
        return service.deleteByProfId(id);
    }
    @ApiOperation("Finds trancheHoraireProfs by criteria")
    @PostMapping("find-by-criteria")
    @Override
    public ResponseEntity<List<TrancheHoraireProfDto>> findByCriteria(@RequestBody TrancheHoraireProfCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated trancheHoraireProfs by criteria")
    @PostMapping("find-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody TrancheHoraireProfCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports trancheHoraireProfs by criteria")
    @PostMapping("export")
    @Override
    public ResponseEntity<InputStreamResource> export(@RequestBody TrancheHoraireProfCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets trancheHoraireProf data size by criteria")
    @PostMapping("data-size-by-criteria")
    @Override
    public ResponseEntity<Integer> getDataSize(@RequestBody TrancheHoraireProfCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets trancheHoraireProf history by id")
    @GetMapping("history/id/{id}")
    @Override
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets trancheHoraireProf paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody TrancheHoraireProfHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports trancheHoraireProf history by criteria")
    @PostMapping("export-history")
    @Override
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody TrancheHoraireProfHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets trancheHoraireProf history data size by criteria")
    @PostMapping("history-data-size")
    @Override
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody TrancheHoraireProfHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public TrancheHoraireProfRestAdmin (TrancheHoraireProfAdminService service, TrancheHoraireProfConverter converter) {
        super(service, converter);
    }


}