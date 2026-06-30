class Solution {
    public int numberOfSubstrings(String s) {
        
        int ans = 0 ; 
        int n = s.length() ;
        
        int[] arr = new int[3];
        int start = 0 ; 
        
        for(int i = 0 ; i < s.length() ; i++){
            
            char ch = s.charAt(i);
            
            arr[ch - 'a']++ ;
            
            while(arr[0] > 0  && arr[1] > 0 && arr[2] > 0){
                ans += (n - i);
                char c = s.charAt(start++);
                arr[c - 'a']--;
            }
            
        }
        
        
        
        return ans ; 


    }
}