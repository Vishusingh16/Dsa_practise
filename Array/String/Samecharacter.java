package Array.String;

public class Samecharacter {

    int sameChar(String A, String B) {

        if (A.length() != B.length()) {
            throw new IllegalArgumentException("Input strings must have equal length");
        }

        int matchingCount = 0;

        for (int i = 0; i < A.length(); i++) {

            if (Character.toLowerCase(A.charAt(i)) == Character.toLowerCase(B.charAt(i))) {
                matchingCount++;
            }
        }

        return matchingCount;
    }
}
