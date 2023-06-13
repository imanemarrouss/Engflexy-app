package  ma.zsmart.engflexy.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.zsmart.engflexy.bean.core.Price;
import ma.zsmart.engflexy.bean.history.PriceHistory;
import ma.zsmart.engflexy.dao.criteria.core.PriceCriteria;
import ma.zsmart.engflexy.dao.criteria.history.PriceHistoryCriteria;
import ma.zsmart.engflexy.service.facade.admin.PriceAdminService;
import ma.zsmart.engflexy.ws.converter.PriceConverter;
import ma.zsmart.engflexy.ws.dto.PriceDto;
import ma.zsmart.engflexy.zynerator.controller.AbstractController;
import ma.zsmart.engflexy.zynerator.dto.AuditEntityDto;
import ma.zsmart.engflexy.zynerator.dto.FileTempDto;
import ma.zsmart.engflexy.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Api("Manages price services")
@RestController
@RequestMapping("/api/admin/price/")
public class PriceRestAdmin  extends AbstractController<Price, PriceDto, PriceHistory, PriceCriteria, PriceHistoryCriteria, PriceAdminService, PriceConverter> {


    @ApiOperation("upload one price")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple prices")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    @Override
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all prices")
    @GetMapping("")
    @Override
    public ResponseEntity<List<PriceDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all prices")
    @GetMapping("optimized")
    @Override
    public ResponseEntity<List<PriceDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a price by id")
    @GetMapping("id/{id}")
    @Override
    public ResponseEntity<PriceDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  price")
    @PostMapping("")
    @Override
    public ResponseEntity<PriceDto> save(@RequestBody PriceDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  price")
    @PutMapping("")
    @Override
    public ResponseEntity<PriceDto> update(@RequestBody PriceDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of price")
    @PostMapping("multiple")
    @Override
    public ResponseEntity<List<PriceDto>> delete(@RequestBody List<PriceDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified price")
    @DeleteMapping("")
    @Override
    public ResponseEntity<PriceDto> delete(@RequestBody PriceDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified price")
    @DeleteMapping("id/{id}")
    @Override
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple prices by ids")
    @DeleteMapping("multiple/id")
    @Override
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("Finds prices by criteria")
    @PostMapping("find-by-criteria")
    @Override
    public ResponseEntity<List<PriceDto>> findByCriteria(@RequestBody PriceCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated prices by criteria")
    @PostMapping("find-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody PriceCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports prices by criteria")
    @PostMapping("export")
    @Override
    public ResponseEntity<InputStreamResource> export(@RequestBody PriceCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets price data size by criteria")
    @PostMapping("data-size-by-criteria")
    @Override
    public ResponseEntity<Integer> getDataSize(@RequestBody PriceCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets price history by id")
    @GetMapping("history/id/{id}")
    @Override
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets price paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    @Override
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody PriceHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports price history by criteria")
    @PostMapping("export-history")
    @Override
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody PriceHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets price history data size by criteria")
    @PostMapping("history-data-size")
    @Override
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody PriceHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public PriceRestAdmin (PriceAdminService service, PriceConverter converter) {
        super(service, converter);
    }


}