class Solution {
    public int numberOfSubstrings(String s) {
        
        int[] arr = new int[3];
        int ans = 0 , n = s.length() , start = 0 ;

        for(int i = 0 ; i < s.length() ; i++){

            char ch = s.charAt(i) ;
            arr[ch - 'a']++;

            while(arr[0] > 0 && arr[1] > 0 && arr[2] > 0){
                ans += (n - i) ;
                arr[s.charAt(start++) - 'a']--;
            }

        }

        return ans ; 



    }
}