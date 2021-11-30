package lesson8.lesson8_1;

public class Animal {
    private final String name;
    private String voice;
    private String kind;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getKind() {
        return kind;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public void makeVoice() {
        System.out.println(" говорит " +this.voice);
    }
}
