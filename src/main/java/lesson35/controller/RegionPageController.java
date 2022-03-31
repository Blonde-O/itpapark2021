package lesson35.controller;

import lesson35.dto.RegionDto;
import lesson35.dto.RegionPageDto;
import lesson35.service.RegionService;
import lesson35.validator.PositiveOrZero;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.constraints.Positive;

@Controller
@Validated
@RequiredArgsConstructor
public class RegionPageController {
    private final RegionService regionService;

    @GetMapping("/regions")
    public String index(Model model,
                        @PositiveOrZero(originValue = 15) @RequestParam(required = false, defaultValue = "0") Integer page,
                        @Positive @RequestParam(required = false, defaultValue = "5") Integer size) {
        RegionPageDto allRegions = regionService.getPage(PageRequest.of(page, size));
        model.addAttribute("regions", allRegions);
        return "region/regions";
    }

    @GetMapping("/region/add")
    public String newRegion(Model model) {
        return "region/region";
    }

    @GetMapping("/region/edit")
    public String currentRegion(@RequestParam("code") String regionCode, Model model) {
        RegionDto currentRegion = regionService.getByCode(regionCode)
                .orElseThrow(() -> new IllegalArgumentException("Non existed region"));
        model.addAttribute("region", currentRegion);
        return "region/region";
    }

    @PostMapping("/region/save")
    public String saveRegion(RegionDto region) {
        regionService.save(region);
        return "redirect:/regions";
    }

}
