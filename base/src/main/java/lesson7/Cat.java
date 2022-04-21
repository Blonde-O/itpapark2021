package lesson7;

public class Cat {
    String name;
    int runDistance;
    int swimDistance;

    public Cat(String name, int runDistance, int swimDistance) {
        this.name = name;
        this.runDistance = runDistance;
        this.swimDistance = swimDistance;
    }

    public void runAndSwim() {
        if (runDistance > 200) {
            System.out.print("Пожалейте кошку,  " + name + "  не может столько бежать.\t");
        } else
            System.out.print("Ура! " + name + "  пробежала " + runDistance + " метров\t");
        if (swimDistance > 0)
            System.out.println(" Увы, кошки вообще не плавают");
        System.out.println("--------------------------------");
    }
}
