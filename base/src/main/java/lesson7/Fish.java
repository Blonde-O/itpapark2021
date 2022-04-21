package lesson7;

public class Fish {
    String name;
    int runDistance;
    int swimDistance;

    public Fish(String name, int runDistance, int swimDistance) {
        this.name = name;
        this.runDistance = runDistance;
        this.swimDistance = swimDistance;
    }

    public void runAndSwim() {
        if (runDistance > 0) {
            System.out.print("Где вы видели бегающих рыб?  " + name + "  не может бегать.\t");
        }
        if (swimDistance > 1000) {
            System.out.println(name + " не может столько плыть.");
        } else
            System.out.println(" Ура!  " + name + " проплыл " + swimDistance + " метров!");
    }
}
