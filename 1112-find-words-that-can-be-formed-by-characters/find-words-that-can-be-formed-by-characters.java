class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] charCount = new int[26];
        for (char c : chars.toCharArray()) {
            charCount[c - 'a']++;
        }

        int sum = 0;

        for (String word : words) {
            int[] wordCount = new int[26];
            for (char c : word.toCharArray()) {
                wordCount[c - 'a']++;
            }

            boolean canForm = true;
            for (int i = 0; i < 26; i++) {
                if (wordCount[i] > charCount[i]) {
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
