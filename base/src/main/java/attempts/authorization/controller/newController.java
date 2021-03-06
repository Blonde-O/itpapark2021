package attempts.authorization.controller;

import attempts.authorization.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/authorization")
public class newController {
    private final UserService userService;

    @PostMapping("/aut")
    public String authorization (@RequestParam("arg1") String login,
                                 @RequestParam("arg2") String password){
        return userService.find(login,password);
    }
}