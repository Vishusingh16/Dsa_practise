class removeDuplicates {

    String removeDuplicate(String str) {

        StringBuilder resultBuilder = new StringBuilder();
        boolean[] seen = new boolean[256];

        for (char c : str.toCharArray()) {

            int index = (int) c;
            if (!seen[index]) {
                resultBuilder.append(c);
                seen[index] = true;
            }
        }

        return resultBuilder.toString();

    }

}
