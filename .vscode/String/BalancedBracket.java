import java.util.*;

public class BalancedBracket {
    public static boolean isBalanced(String x) {
        Stack<Character> S = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();
        map.put(")", "(");
        map.put("{", "}");
        map.put('[', ']');
        for (char c : x.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                S.push();

            } else {
                if (S.isempty() || S != map.get(c)) {
                    return false;
                }
                S.pop();

            }
        }

        class Main {
            public static void main(String[] args) {
                Solution solution = new Solution();
                String example = "{[()]}";
                boolean result = BalancedBracket.isBalanced(example);
                System.out.println(result); // Output: true
            }
        }
    }
}