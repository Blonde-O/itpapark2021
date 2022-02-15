package attempts.spring.two;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component("justsecondname")
public class SecondNamePrint implements Printable{

    @Override
    public void print() {
        System.out.println("Ваша фамилия");
    }

    @Override
    public void reverse() {
     String secondName = "Ваша фамилия";
        StringBuilder sb = new StringBuilder(secondName);
        System.out.println(sb.reverse());
    }
}
