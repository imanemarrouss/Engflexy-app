package  ma.zsmart.engflexy.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.zsmart.engflexy.bean.core.HomeWork;
import ma.zsmart.engflexy.bean.history.HomeWorkHistory;
import ma.zsmart.engflexy.dao.criteria.core.HomeWorkCriteria;
import ma.zsmart.engflexy.dao.criteria.history.HomeWorkHistoryCriteria;
import ma.zsmart.engflexy.service.facade.admin.HomeWorkAdminService;
import ma.zsmart.engflexy.ws.converter.HomeWorkConverter;
import ma.zsmart.engflexy.ws.dto.HomeWorkDto;
import ma.zsmart.engflexy.zynerator.controller.AbstractController;
import ma.zsmart.engflexy.zynerator.dto.AuditEntityDto;
import ma.zsmart.engflexy.zynerator.dto.FileTempDto;
import ma.zsmart.engflexy.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Api("Manages homeWork services")
@RestController
@RequestMapping("/api/admin/homeWork/")
public class HomeWorkRestAdmin  extends AbstractController<HomeWork, HomeWorkDto, HomeWorkHistory, HomeWorkCriteria, HomeWorkHistoryCriteria, HomeWorkAdminService, HomeWorkConverter> {


    @ApiOperation("upload one homeWork")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple homeWorks")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all homeWorks")
    @GetMapping("")
    @Override
    public ResponseEntity<List<HomeWorkDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all homeWorks")
    @GetMapping("optimized")
    @Override
    public ResponseEntity<List<HomeWorkDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a homeWork by id")
    @GetMapping("id/{id}")
    @Override
    public ResponseEntity<HomeWorkDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  homeWork")
    @PostMapping("")
    @Override
    public ResponseEntity<HomeWorkDto> save(@RequestBody HomeWorkDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  homeWork")
    @PutMapping("")
    @Override
    public ResponseEntity<HomeWorkDto> update(@RequestBody HomeWorkDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of homeWork")
    @PostMapping("multiple")
    @Override
    public ResponseEntity<List<HomeWorkDto>> delete(@RequestBody List<HomeWorkDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified homeWork")
    @DeleteMapping("")
    @Override
    public ResponseEntity<HomeWorkDto> delete(@RequestBody HomeWorkDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified homeWork")
    @DeleteMapping("id/{id}")
    @Override
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple homeWorks by ids")
    @DeleteMapping("multiple/id")
    @Override
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("find by cours id")
    @GetMapping("cours/id/{id}")
    public List<HomeWork> findByCoursId(@PathVariable Long id){
        return service.findByCoursId(id);
    }
    @ApiOperation("delete by cours id")
    @DeleteMapping("cours/id/{id}")
    public int deleteByCoursId(@PathVariable Long id){
        return service.deleteByCoursId(id);
    }
    @ApiOperation("find by typeHomeWork id")
    @GetMapping("typeHomeWork/id/{id}")
    public List<HomeWork> findByTypeHomeWorkId(@PathVariable Long id){
        return service.findByTypeHomeWorkId(id);
    }
    @ApiOperation("delete by typeHomeWork id")
    @DeleteMapping("typeHomeWork/id/{id}")
    public int deleteByTypeHomeWorkId(@PathVariable Long id){
        return service.deleteByTypeHomeWorkId(id);
    }
    @ApiOperation("Finds a homeWork and associated list by id")
    @GetMapping("detail/id/{id}")
    public ResponseEntity<HomeWorkDto> findWithAssociatedLists(@PathVariable Long id) {
        return super.findWithAssociatedLists(id);
    }

    @ApiOperation("Finds homeWorks by criteria")
    @PostMapping("find-by-criteria")
    @Override
    public ResponseEntity<List<HomeWorkDto>> findByCriteria(@RequestBody HomeWorkCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated homeWorks by criteria")
    @PostMapping("find-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody HomeWorkCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports homeWorks by criteria")
    @PostMapping("export")
    @Override
    public ResponseEntity<InputStreamResource> export(@RequestBody HomeWorkCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets homeWork data size by criteria")
    @PostMapping("data-size-by-criteria")
    @Override
    public ResponseEntity<Integer> getDataSize(@RequestBody HomeWorkCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets homeWork history by id")
    @GetMapping("history/id/{id}")
    @Override
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets homeWork paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody HomeWorkHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports homeWork history by criteria")
    @PostMapping("export-history")
    @Override
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody HomeWorkHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets homeWork history data size by criteria")
    @PostMapping("history-data-size")
    @Override
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody HomeWorkHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public HomeWorkRestAdmin (HomeWorkAdminService service, HomeWorkConverter converter) {
        super(service, converter);
    }


}