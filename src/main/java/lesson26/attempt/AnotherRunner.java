package lesson26.attempt;

import lombok.SneakyThrows;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnotherRunner {
    @SneakyThrows
    public static void main(String[] args) {
        final AnnotationConfigApplicationContext lesson26 = new AnnotationConfigApplicationContext("lesson26.attempt");
        final Valute valute = lesson26.getBean(Valute.class);
        valute.setUriAddress("https://www.cbr-xml-daily.ru/daily_utf8.xml");
        valute.setValuteName("BYN");
        valute.getCurrentCourse();
        System.out.println(valute.getValue());
    }
}
