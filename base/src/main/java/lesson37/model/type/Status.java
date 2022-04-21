package lesson37.model.type;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;


public enum Status {

    BLOCKED, OK, LOGIN_EXPIRED, PASSWORD_EXPIRED;

}
