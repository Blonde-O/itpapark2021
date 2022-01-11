package attempts.lombokAnnotations;

import lombok.*;

@RequiredArgsConstructor
@Setter
@Getter
@ToString
public class ClassProbe {
    private final String name;
    private final int age;
    private Gender sex;
}
