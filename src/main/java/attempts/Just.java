package attempts;

import java.util.function.Consumer;

public class Just {
    public static void main(String[] args) {
        Consumer<String> print = System.out::println;
        print.accept("Хуяк хуяк");
    }
}
