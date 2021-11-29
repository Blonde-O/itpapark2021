package lesson8;

public class Bird extends Animal {
    String kind = "Птица";
    String breed;

    public Bird(String name, String breed) {
        super(name);
        this.breed = breed;

    }

    public String getKind() {
        return this.kind;
    }

    @Override
    public void makeVoice() {
        switch (this.breed) {
            case "ворона" -> setVoice("\"Кар-кар\"");
            case "голубь" -> setVoice("\"Ур-ур\"");
            case "цапля" -> setVoice("\"Курлык-курлык\"");
            case "утка" -> setVoice("\"Кря-кря\"");
            case "курица" -> setVoice("\"Куд-куда\"");
            default -> setVoice("\"Шик-ширык\"");
        }
        super.makeVoice();
    }
}
