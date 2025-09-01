class Solution {
    public int countCharacters(String[] words, String chars) {
        int sum = 0;

        for (String word : words) {
            StringBuilder temp = new StringBuilder(chars); // copy of chars for this word
            boolean canForm = true;

            for (char c : word.toCharArray()) {
                int index = temp.indexOf(String.valueOf(c));
                if (index >= 0) {
                    temp.deleteCharAt(index); // remove used char
                } else {
                    canForm = false;
                    break;
                }
            }

            if (canForm) {
                sum += word.length();
            }
        }

        return sum;
    }
}
