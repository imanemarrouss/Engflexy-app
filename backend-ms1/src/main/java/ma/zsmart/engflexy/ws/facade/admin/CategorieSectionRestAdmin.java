package  ma.zsmart.engflexy.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.zsmart.engflexy.bean.core.CategorieSection;
import ma.zsmart.engflexy.bean.history.CategorieSectionHistory;
import ma.zsmart.engflexy.dao.criteria.core.CategorieSectionCriteria;
import ma.zsmart.engflexy.dao.criteria.history.CategorieSectionHistoryCriteria;
import ma.zsmart.engflexy.service.facade.admin.CategorieSectionAdminService;
import ma.zsmart.engflexy.ws.converter.CategorieSectionConverter;
import ma.zsmart.engflexy.ws.dto.CategorieSectionDto;
import ma.zsmart.engflexy.zynerator.controller.AbstractController;
import ma.zsmart.engflexy.zynerator.dto.AuditEntityDto;
import ma.zsmart.engflexy.zynerator.dto.FileTempDto;
import ma.zsmart.engflexy.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Api("Manages categorieSection services")
@RestController
@RequestMapping("/api/admin/categorieSection/")
public class CategorieSectionRestAdmin  extends AbstractController<CategorieSection, CategorieSectionDto, CategorieSectionHistory, CategorieSectionCriteria, CategorieSectionHistoryCriteria, CategorieSectionAdminService, CategorieSectionConverter> {


    @ApiOperation("upload one categorieSection")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple categorieSections")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all categorieSections")
    @GetMapping("")
    @Override
    public ResponseEntity<List<CategorieSectionDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all categorieSections")
    @GetMapping("optimized")
    @Override
    public ResponseEntity<List<CategorieSectionDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a categorieSection by id")
    @GetMapping("id/{id}")
    @Override
    public ResponseEntity<CategorieSectionDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  categorieSection")
    @PostMapping("")
    @Override
    public ResponseEntity<CategorieSectionDto> save(@RequestBody CategorieSectionDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  categorieSection")
    @PutMapping("")
    @Override
    public ResponseEntity<CategorieSectionDto> update(@RequestBody CategorieSectionDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of categorieSection")
    @PostMapping("multiple")
    @Override
    public ResponseEntity<List<CategorieSectionDto>> delete(@RequestBody List<CategorieSectionDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified categorieSection")
    @DeleteMapping("")
    @Override
    public ResponseEntity<CategorieSectionDto> delete(@RequestBody CategorieSectionDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified categorieSection")
    @DeleteMapping("id/{id}")
    @Override
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple categorieSections by ids")
    @DeleteMapping("multiple/id")
    @Override
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("find by superCategorieSection id")
    @GetMapping("superCategorieSection/id/{id}")

    public List<CategorieSection> findBySuperCategorieSectionId(@PathVariable Long id){
        return service.findBySuperCategorieSectionId(id);
    }
    @ApiOperation("delete by superCategorieSection id")
    @DeleteMapping("superCategorieSection/id/{id}")

    public int deleteBySuperCategorieSectionId(@PathVariable Long id){
        return service.deleteBySuperCategorieSectionId(id);
    }
    @ApiOperation("Finds a categorieSection and associated list by id")
    @GetMapping("detail/id/{id}")
    @Override
    public ResponseEntity<CategorieSectionDto> findWithAssociatedLists(@PathVariable Long id) {
        return super.findWithAssociatedLists(id);
    }

    @ApiOperation("Finds categorieSections by criteria")
    @PostMapping("find-by-criteria")
    @Override
    public ResponseEntity<List<CategorieSectionDto>> findByCriteria(@RequestBody CategorieSectionCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated categorieSections by criteria")
    @PostMapping("find-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody CategorieSectionCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports categorieSections by criteria")
    @PostMapping("export")
    @Override
    public ResponseEntity<InputStreamResource> export(@RequestBody CategorieSectionCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets categorieSection data size by criteria")
    @PostMapping("data-size-by-criteria")
    @Override
    public ResponseEntity<Integer> getDataSize(@RequestBody CategorieSectionCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets categorieSection history by id")
    @GetMapping("history/id/{id}")
    @Override
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets categorieSection paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody CategorieSectionHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports categorieSection history by criteria")
    @PostMapping("export-history")
    @Override
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody CategorieSectionHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets categorieSection history data size by criteria")
    @PostMapping("history-data-size")
    @Override
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody CategorieSectionHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public CategorieSectionRestAdmin (CategorieSectionAdminService service, CategorieSectionConverter converter) {
        super(service, converter);
    }


}