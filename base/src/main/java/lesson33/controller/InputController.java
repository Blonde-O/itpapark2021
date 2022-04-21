package lesson33.controller;

import lesson33.dto.ResultDto;
import lesson33.service.ConverterService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequiredArgsConstructor
@RequestMapping("/converter")
public class InputController {

    @Value("Конвертер")
    private String application;
    private final ConverterService converterService;

    @PostMapping("/convert")
    public ResultDto multiply(@RequestParam("arg1") BigDecimal a, @RequestParam("arg3") String firstName, @RequestParam("arg2") String secondName) {
        return new ResultDto(application, converterService.multiply(a, firstName, secondName));
    }
}