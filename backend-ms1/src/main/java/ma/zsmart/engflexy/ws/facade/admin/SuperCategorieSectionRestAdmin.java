package  ma.zsmart.engflexy.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.zsmart.engflexy.bean.core.SuperCategorieSection;
import ma.zsmart.engflexy.bean.history.SuperCategorieSectionHistory;
import ma.zsmart.engflexy.dao.criteria.core.SuperCategorieSectionCriteria;
import ma.zsmart.engflexy.dao.criteria.history.SuperCategorieSectionHistoryCriteria;
import ma.zsmart.engflexy.service.facade.admin.SuperCategorieSectionAdminService;
import ma.zsmart.engflexy.ws.converter.SuperCategorieSectionConverter;
import ma.zsmart.engflexy.ws.dto.SuperCategorieSectionDto;
import ma.zsmart.engflexy.zynerator.controller.AbstractController;
import ma.zsmart.engflexy.zynerator.dto.AuditEntityDto;
import ma.zsmart.engflexy.zynerator.dto.FileTempDto;
import ma.zsmart.engflexy.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Api("Manages superCategorieSection services")
@RestController
@RequestMapping("/api/admin/superCategorieSection/")
public class SuperCategorieSectionRestAdmin  extends AbstractController<SuperCategorieSection, SuperCategorieSectionDto, SuperCategorieSectionHistory, SuperCategorieSectionCriteria, SuperCategorieSectionHistoryCriteria, SuperCategorieSectionAdminService, SuperCategorieSectionConverter> {


    @ApiOperation("upload one superCategorieSection")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple superCategorieSections")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all superCategorieSections")
    @GetMapping("")
    @Override
    public ResponseEntity<List<SuperCategorieSectionDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all superCategorieSections")
    @GetMapping("optimized")
    @Override
    public ResponseEntity<List<SuperCategorieSectionDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a superCategorieSection by id")
    @GetMapping("id/{id}")
    @Override
    public ResponseEntity<SuperCategorieSectionDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  superCategorieSection")
    @PostMapping("")
    @Override
    public ResponseEntity<SuperCategorieSectionDto> save(@RequestBody SuperCategorieSectionDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  superCategorieSection")
    @PutMapping("")
    @Override
    public ResponseEntity<SuperCategorieSectionDto> update(@RequestBody SuperCategorieSectionDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of superCategorieSection")
    @PostMapping("multiple")
    @Override
    public ResponseEntity<List<SuperCategorieSectionDto>> delete(@RequestBody List<SuperCategorieSectionDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified superCategorieSection")
    @DeleteMapping("")
    @Override
    public ResponseEntity<SuperCategorieSectionDto> delete(@RequestBody SuperCategorieSectionDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified superCategorieSection")
    @DeleteMapping("id/{id}")
    @Override
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple superCategorieSections by ids")
    @DeleteMapping("multiple/id")
    @Override
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("Finds a superCategorieSection and associated list by id")
    @GetMapping("detail/id/{id}")
    @Override
    public ResponseEntity<SuperCategorieSectionDto> findWithAssociatedLists(@PathVariable Long id) {
        return super.findWithAssociatedLists(id);
    }

    @ApiOperation("Finds superCategorieSections by criteria")
    @PostMapping("find-by-criteria")
    @Override
    public ResponseEntity<List<SuperCategorieSectionDto>> findByCriteria(@RequestBody SuperCategorieSectionCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated superCategorieSections by criteria")
    @PostMapping("find-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody SuperCategorieSectionCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports superCategorieSections by criteria")
    @PostMapping("export")
    @Override
    public ResponseEntity<InputStreamResource> export(@RequestBody SuperCategorieSectionCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets superCategorieSection data size by criteria")
    @PostMapping("data-size-by-criteria")
    @Override
    public ResponseEntity<Integer> getDataSize(@RequestBody SuperCategorieSectionCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets superCategorieSection history by id")
    @GetMapping("history/id/{id}")
    @Override
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets superCategorieSection paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody SuperCategorieSectionHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports superCategorieSection history by criteria")
    @PostMapping("export-history")
    @Override
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody SuperCategorieSectionHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets superCategorieSection history data size by criteria")
    @PostMapping("history-data-size")
    @Override
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody SuperCategorieSectionHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public SuperCategorieSectionRestAdmin (SuperCategorieSectionAdminService service, SuperCategorieSectionConverter converter) {
        super(service, converter);
    }


}