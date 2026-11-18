class Solution {
    public int minChanges(String s) {

        int ans = 0 ; 

        for(int i = 1 ; i < s.length() ; i+=2)
        {

            if(s.charAt(i) != s.charAt(i-1)){
                ans++;
            }

        }

        return ans ; 
        
    }
}


// 1 0 1 0 1 1 0 0 0 0 0 1


// "1 1 0 0 0 1  1  1"