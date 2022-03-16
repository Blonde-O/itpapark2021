package attempts.authorization.service;

public interface UserService {

    void add (String login, String password, String name);
    String find (String login, String password);
}
