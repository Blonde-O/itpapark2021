package lesson7;

public class Tiger {
    String name;
    int runDistance;
    int swimDistance;

    public Tiger(String name, int runDistance, int swimDistance) {
        this.name = name;
        this.runDistance = runDistance;
        this.swimDistance = swimDistance;
    }

    public void runAndSwim() {
        if (runDistance > 5000) {
            System.out.print("Пожалейте тигра,  " + name + "  не может столько бежать.\t");
        } else
            System.out.print("Ура! " + name + "  пробежал " + runDistance + " метров\t");
        if (swimDistance > 200) {
            System.out.println("и не может столько плыть.");
        } else
            System.out.println(" и проплыл " + runDistance + " метров!");
        System.out.println("--------------------------------");
    }
}
