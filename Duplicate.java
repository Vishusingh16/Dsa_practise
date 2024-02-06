import java.util.HashSet;

public class Duplicate {
    String removeDups(String Str) {

        HashSet<Character> set = new HashSet<>();
        StringBuilder result = new StringBuilder();
        for (char ch : Str.toCharArray()) {
            if (set.add(ch)) {
                result.append(ch);

            }
        }
        return result.toString();

    }
}
