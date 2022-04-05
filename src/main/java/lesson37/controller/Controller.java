package lesson37.controller;

import lesson33.dto.ResultDto;
import lesson33.service.ConverterService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@EntityScan({"lesson33"})
@ComponentScan({"lesson33/service", "lesson33/dto", "lesson33/pojo"})
@RestController
@RequiredArgsConstructor
@RequestMapping("converter")
public class Controller {

    @Value("Конвертер")
    private String application;
    private final ConverterService converterService;

    @PostMapping("/convert")
    public ResultDto multiply(@RequestParam("arg1") BigDecimal a, @RequestParam("arg3") String firstName, @RequestParam("arg2") String secondName) {
        return new ResultDto(application, converterService.multiply(a, firstName, secondName));
    }
}