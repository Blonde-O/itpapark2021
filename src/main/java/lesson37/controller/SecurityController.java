package lesson37.controller;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EntityScan({"lesson33"})
@ComponentScan("lesson33")
@RestController
public class SecurityController {
}
