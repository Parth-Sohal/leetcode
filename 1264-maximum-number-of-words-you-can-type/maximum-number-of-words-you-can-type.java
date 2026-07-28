class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {

        String[]  strs = text.split(" ");
        System.out.println(Arrays.toString(strs));
        
        int[] charArr = new int[26];

        for(int i = 0 ; i < brokenLetters.length() ; i++){
            charArr[brokenLetters.charAt(i) - 'a']++;
        }

        int ans = strs.length ; 

        for(int i = 0 ; i < strs.length ; i++){
            int j = 0 ; 
            while(j < strs[i].length()){
                char ch = strs[i].charAt(j);
                if(charArr[ch-'a'] > 0){
                    ans--;
                    break ; 
                }
                j++;
            }
        }

        return ans ; 

    }
}