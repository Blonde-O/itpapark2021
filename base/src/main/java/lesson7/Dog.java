package lesson7;

public class Dog {
    String name;
    int runDistance;
    int swimDistance;

    public Dog(String name, int runDistance, int swimDistance) {
        this.name = name;
        this.runDistance = runDistance;
        this.swimDistance = swimDistance;
    }

    public void runAndSwim() {
        if (runDistance > 500) {
            System.out.print("Пожалейте собаку,  " + name + "  не может столько бежать.\t");
        } else
            System.out.print("Ура! " + name + "  пробежал " + runDistance + " метров\t");
        if (swimDistance > 10) {
            System.out.println("и не может столько плыть.");
        } else
            System.out.println(" и проплыл " + runDistance + " метров!");
        System.out.println("--------------------------------");
    }
}
