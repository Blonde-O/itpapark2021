package attempts.authorization.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Data
@NoArgsConstructor
@Entity
@Table(name = "USER")
public class User {

    public User(String login, String password, String name) {
        this.login = login;
        this.password = password;
        this.name = name;
    }

    @Id
    @Column(name = "login", nullable = false)
    private String login;
    @NotEmpty
    @Column(name = "password", nullable = false)
    private String password;
    @NotEmpty
    @Column(name = "name", nullable = false)
    private String name;
}
