package attempts.lombokAnnotations;

import java.util.Random;

public class ProbeRunner {
    public static void main(String[] args) {
        Random random = new Random();
        ClassProbe classProbe = new ClassProbe("Хуипутало");
        Gender [] genders = Gender.values();
        for (int i=0; i<100; i++) {
            classProbe.setSex(genders[random.nextInt(genders.length)]);
            classProbe.setAge(random.nextInt(100));
            System.out.println(classProbe);
        }
    }
}
