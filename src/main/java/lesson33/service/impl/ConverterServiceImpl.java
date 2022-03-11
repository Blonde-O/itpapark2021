package lesson33.service.impl;

import lesson33.pojo.Valute;
import lesson33.service.ConverterService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
@Service
@RequiredArgsConstructor
public class ConverterServiceImpl implements ConverterService {
    private final Valute valute;


    @Override
    public BigDecimal multiply(BigDecimal inputValue, String valuteName) {
        return inputValue.multiply(valute.getCurrentCourse(valuteName));
    }
}
