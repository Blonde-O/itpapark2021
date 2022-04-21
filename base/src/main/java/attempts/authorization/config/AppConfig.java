package attempts.authorization.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EntityScan({"attempts.authorization"})
public class AppConfig {
}
