package attempts.authorization.service.impl;

import attempts.authorization.model.User;
import attempts.authorization.repository.UserRepository;
import attempts.authorization.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public void add(String login, String password, String name) {
        User user = new User(login, password, name);
        userRepository.save(user);

    }

    @Override
    public String find(String login, String password) {
        String message;
        //login = "ZiZi";
        if(userRepository.findById(login).isPresent()){

            String basedPassword = userRepository.findById(login).get().getPassword();
            if(password.equals(basedPassword)){
                message = "Вы успешно авторизованы";
            }
            else{
                message = "Неверный пароль";
            }
        }
        else{
            message = "Пользователь не найден";
        }
        return message;
    }

    /*@Override
    public String find(String login, String password) {
        String message = "Пользователь не найден";
       Optional<User> user = userRepository.findById(login);
        if(user.isPresent()){
            String basedPassword = user.get().getPassword();
            if(password.equals(basedPassword)){
                message = "Вы успешно авторизованы";
            }
            else{
                message = "Неверный пароль";
            }
        }
        return message;
    }*/
}
