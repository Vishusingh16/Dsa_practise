import java.util.*;

class Permutation {

    public ArrayList<String> permutation(String S) {
        ArrayList<String> result = new ArrayList<>();
        char[] charArray = S.toCharArray();
        generatePermutations(charArray, 0, result);
        Collections.sort(result);
        return result;
    }

    private void generatePermutations(char[] charArray, int index, ArrayList<String> result) {
        if (index == charArray.length) {
            result.add(new String(charArray));
            return;
        }

        for (int i = index; i < charArray.length; i++) {
            swap(charArray, index, i);
            generatePermutations(charArray, index + 1, result);
            swap(charArray, index, i);
        }
    }

    private void swap(char[] charArray, int i, int j) {
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
    }

}