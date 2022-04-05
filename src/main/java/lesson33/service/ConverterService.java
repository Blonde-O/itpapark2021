package lesson33.service;

import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;

public interface ConverterService {

    BigDecimal multiply (BigDecimal inputValue, String firstValute, String secondValute);
}
