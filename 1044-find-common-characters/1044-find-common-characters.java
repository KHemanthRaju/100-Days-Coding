class Solution {
    public List<String> commonChars(String[] words) {
        // minFreq[i] will hold the smallest count of ('a'+i) seen across all words
        int[] minFreq = new int[26];
        Arrays.fill(minFreq, Integer.MAX_VALUE);

        // 1️⃣  Count letter-frequencies word by word & keep the minima
        for (String w : words) {
            int[] freq = new int[26];
            for (char c : w.toCharArray()) {
                freq[c - 'a']++;
            }
            for (int i = 0; i < 26; i++) {
                minFreq[i] = Math.min(minFreq[i], freq[i]);
            }
        }

        // 2️⃣  Build the answer list, repeating each letter minFreq[i] times
        List<String> res = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            for (int k = 0; k < minFreq[i]; k++) {
                res.add(String.valueOf((char) ('a' + i)));
            }
        }
        return res;
    }
}