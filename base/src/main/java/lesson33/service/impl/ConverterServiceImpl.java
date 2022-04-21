package lesson33.service.impl;

import lesson33.pojo.Valute;
import lesson33.service.ConverterService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static java.math.BigDecimal.*;

@Service
@RequiredArgsConstructor
public class ConverterServiceImpl implements ConverterService {
    private final Valute valute;

    @Override
    public BigDecimal multiply(BigDecimal inputValue, String firstValute, String secondValute) {
        BigDecimal firstCource;
        BigDecimal secondCource;
        BigDecimal proportion;
        if (firstValute.equals("RUB")) {
            firstCource = ONE;
        } else {
            firstCource = valute.getCurrentCourse(firstValute);
        }
        if (secondValute.equals("RUB")) {
            secondCource = ONE;
        } else {
            secondCource = valute.getCurrentCourse(secondValute);
        }
        if (firstValute.equals(secondValute)) {
            proportion = ONE;
        } else {
            proportion = firstCource.divide(secondCource, 4, RoundingMode.HALF_UP);
        }
        return inputValue.multiply(proportion);
    }
}