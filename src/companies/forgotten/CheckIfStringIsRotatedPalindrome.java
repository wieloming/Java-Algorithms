package companies.forgotten;

import java.util.ArrayList;

public class CheckIfStringIsRotatedPalindrome {
    public boolean calculate(String string) {
        ArrayList<Character> chars = new ArrayList<Character>();
        for (char c : string.toCharArray()) {
            chars.add(c);
        }
        for (int i = 0; i < chars.size(); i++) {
            if (isPalindrome(chars)) {
                return true;
            }
            Character first = chars.remove(0);
            chars.add(first);
        }
        return false;
    }

    private boolean isPalindrome(ArrayList<Character> letters) {
        for (int i = 0; i < letters.size() / 2; i++) {
            if (!letters.get(i).equals(letters.get(letters.size() - 1 - i))) {
                return false;
            }
        }
        return true;
    }
}
