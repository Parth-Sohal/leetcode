class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");

        HashMap<Character, String> mppStoT = new HashMap<>();
        HashMap<String, Character> mppTtoS = new HashMap<>();

        if (words.length != pattern.length()) {
            return false;
        }

        for (int i = 0; i < pattern.length(); i++) {

            char ch = pattern.charAt(i);
            String word = words[i];

            if (mppStoT.containsKey(ch) && !mppStoT.get(ch).equals(word)) {
                return false;
            }

            if (mppTtoS.containsKey(word) && mppTtoS.get(word) != ch) {
                return false;
            }

            mppStoT.put(ch, word);
            mppTtoS.put(word, ch);
        }

        return true;
    }
}
