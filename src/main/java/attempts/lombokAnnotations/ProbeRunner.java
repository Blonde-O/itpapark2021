package attempts.lombokAnnotations;

import java.util.Random;

public class ProbeRunner {
    public static void main(String[] args) {
        Random random = new Random();
        ClassProbe classProbe = new ClassProbe("Хуипутало", 15);
        System.out.println(classProbe);
        Gender [] genders = Gender.values();
        for (int i=0; i<100; i++) {
            int index = random.nextInt(genders.length);
            classProbe.setSex(genders[index]);
            System.out.println(classProbe);
        }
    }
}
