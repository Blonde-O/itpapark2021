package lesson39.logging;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

@Slf4j
@Aspect
@Component
public class LoggingAspect {
    private String userName;

    @Before(value = "execution(* lesson37.security.impl.UserDetailServiceImpl.loadUserByUsername(String))")
    public void checkBefore(JoinPoint joinPoint) {
        log.info("\n Стартанул аспект логирования из ДЗ№ 39");
        log.info("Прокси : " + joinPoint.getThis().getClass().getName());
        log.info("Класс : " + joinPoint.getTarget().getClass().getName());
        this.userName = Arrays.toString(joinPoint.getArgs());
        log.info("Пользователь {} авторизовался", this.userName);
    }

    @Before(value = "execution(* lesson33.controller.InputController.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        log.info("Прокси : " + joinPoint.getThis().getClass().getName());
        log.info("Класс : " + joinPoint.getTarget().getClass().getName());
        log.info("Метод : " + joinPoint.getSignature().getName());
        log.info("Пользователь {} ввел данные : {}", this.userName, Arrays.stream(joinPoint.getArgs())
                .map(Objects::toString)
                .collect(Collectors.joining(", ")));
        log.info("\n Логирование завершено");
    }

}
