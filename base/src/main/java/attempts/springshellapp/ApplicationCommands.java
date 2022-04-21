/*
package attempts.springshellapp;

import org.springframework.shell.Availability;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellMethodAvailability;
import org.springframework.shell.standard.ShellOption;

import javax.validation.constraints.Size;
import java.util.Random;

@ShellComponent
public class ApplicationCommands {

    @ShellMethod(value = "add two numbers", key = {"sum", "s"})
    public int sum (int a, int b){
        return a+b;
    }

    @ShellMethod(value = "greet someone", key = {"greet", "g"})
    public String greeting (String name, @ShellOption (defaultValue = "Hello") String greeting){
       return greeting+" "+name;
    }

    @ShellMethod(value = "change password", key = {"change", "ch"})
    public String changePassword (@Size(min =4, max = 6) String pswd){
        return "Пароль успешно изменен";
    }
@ShellMethod (value = "check connection", key = {"check", "con"})
@ShellMethodAvailability
    public String checkConnection(){
        return isAvailble() ? Availability.available().getReason()
                : Availability.unavailable("Соединение не доступно").getReason();
    }

    private boolean isAvailble(){
        return new Random().nextBoolean();
    }

}
*/
