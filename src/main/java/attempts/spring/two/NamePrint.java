package attempts.spring.two;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component("justname")
public class NamePrint implements Printable{

    @Override
    public void print() {
        System.out.println("Ваше имя");
    }

    @Override
    public void reverse() {

    }
}
