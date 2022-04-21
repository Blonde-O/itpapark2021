package lesson37.controller;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;

@ComponentScan({"lesson33","lesson39"})
@RestController
public class SecurityController {
}
