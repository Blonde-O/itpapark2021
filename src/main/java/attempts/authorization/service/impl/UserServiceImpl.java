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
}
