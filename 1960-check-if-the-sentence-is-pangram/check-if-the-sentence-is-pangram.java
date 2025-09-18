class Solution {
    public boolean checkIfPangram(String sentence) {
        int l  = sentence.length();

        int[] arr = new int[26] ;

        char[] ch = sentence.toCharArray();

        for(int i = 0 ; i < ch.length ; i++ ){
            int n = (int)(ch[i]) - 'a';
            arr[n]++;
        }

        for(int i = 0 ; i < 26 ; i++ ){
            if(arr[i] == 0){
                return false;
            }
        }

        return true;
    }
}