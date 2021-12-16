package attempts;

import java.util.Random;

public class StringGenerator {

    public static void main(String[] args) {

            int leftLimit = 1040; // letter 'a'
            int rightLimit = 1103; // letter 'z'
            int targetStringLength = 3;
            Random random = new Random();

            String generatedString = random.ints(leftLimit, rightLimit + 1).limit(targetStringLength)
                    .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                    .toString();

            System.out.println(generatedString);

    }
}
