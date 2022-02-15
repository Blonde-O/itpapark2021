package attempts.spring.two;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component("justsecondname")
public class SecondNamePrint implements Printable{

    private String name ="Залупачес";
    private String surName = "Хуипуталов";

    @Override
    public void print() {
        System.out.println("Ваша фамилия");
    }

    @Override
    public void reverse() {
        StringBuilder sb = new StringBuilder(summName());
        System.out.println(sb.reverse());
    }

    private String summName (){
        return name + " " + surName;
    }
}
