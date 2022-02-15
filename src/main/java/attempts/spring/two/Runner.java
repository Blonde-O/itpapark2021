package attempts.spring.two;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Runner {
    public static void main(String[] args) {
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("attempts.spring.two");
         Printable printer = context.getBean("justsecondname", SecondNamePrint.class);
         Printable printerr = context.getBean(NamePrint.class);
        /*printer.print();
        printerr.print();
        printer.reverse();*/
        Printable [] printering = new Printable[] {printer, printerr};
        /*for (Printable printers : printering){
            printers.print();
            printers.reverse();
        }*/
        Stream<Printable> stream = Arrays.stream(printering);
        stream.peek(x -> {x.print();
            x.reverse();}).collect(Collectors.toList());

    }
}
