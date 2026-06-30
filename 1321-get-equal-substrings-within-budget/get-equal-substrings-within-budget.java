class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int max = 0 ; 
        int start = 0 ;
        int sum = 0 ; 
        
        for(int i = 0 ; i < s.length() ; i++){
            
            sum += Math.abs(s.charAt(i) - t.charAt(i));
            
            if( sum > maxCost){
                sum -= Math.abs(s.charAt(start) - t.charAt(start));
                start++;
            }
            
            if(sum <= maxCost) max = Math.max(max, i - start + 1);
            
            
        }

        return max ; 
    }
}