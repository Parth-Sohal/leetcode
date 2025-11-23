class Solution {
    public int countCharacters(String[] words, String chars) {

        int[] arr = new int[26];

        int count = 0 ;

        for (int i = 0; i < chars.length(); i++) {
            arr[chars.charAt(i) - 'a']++;
        }
    

        for (int i = 0; i < words.length; i++) {
            int[] wor = new int[26];
            for (int j = 0; j < words[i].length(); j++) {
                wor[words[i].charAt(j) - 'a']++;
            }
            boolean ans = true;
            for (int k = 0; k < wor.length; k++) {
                if (wor[k] > arr[k]) {
                    ans = false;
                }
            }

            if (ans) {
                count+= words[i].length();
            }
        }

        return count ; 
    }
}