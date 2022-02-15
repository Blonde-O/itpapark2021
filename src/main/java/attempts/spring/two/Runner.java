package attempts.spring.two;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String[] args) {
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("attempts.spring.two");
         Printable printer = context.getBean("justsecondname", SecondNamePrint.class);
         Printable printerr = context.getBean(NamePrint.class);
        printer.print();
        printerr.print();
        printer.reverse();
    }
}
