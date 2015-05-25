package companies.forgotten;

import java.util.Arrays;

public class PrintAllPermutationsOfAString {

    public void count(String string) {
        String[] letters = string.split("");
        count(letters, "");
    }

    private void count(String[] letters, String result) {
        if (letters.length == 0) {
            System.out.println(result);
            return;
        }

        for (final String letter : letters) {
            String[] newLetters = Arrays.stream(letters).filter(
                    x -> !x.equals(letter)
            ).toArray(String[]::new);
            count(newLetters, result + letter);
        }
    }
}
