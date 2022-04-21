package lesson35.controller.rest;

import lesson35.dto.ResultDto;
import lesson35.service.RegionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RegionController {

    private final RegionService regionService;

    @DeleteMapping("/regions/{code}")
    public ResponseEntity<?> delete(@PathVariable("code") String regionCode) {
        regionService.deleteByCode(regionCode);
        return ResponseEntity.ok(new ResultDto());
    }
}
