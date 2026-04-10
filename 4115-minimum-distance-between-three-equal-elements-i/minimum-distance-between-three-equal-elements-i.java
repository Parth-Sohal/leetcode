class Solution {
    public int minimumDistance(int[] arr) {
        int n = arr.length ;
        if(n < 3)return -1 ; 

        int minDist = Integer.MAX_VALUE;
        
        
        for(int i = 0 ; i < arr.length ; i++){
            int val = arr[i]; 
            
            for(int j = i+1 ; j < arr.length ; j++){
                if(arr[j] == val){
                    for(int k = j+1 ; k < arr.length ; k++){
                        if(arr[k] == val){
                            int dist = Math.abs(j-k) + Math.abs(i-k) + Math.abs(j-i) ;
                            minDist = Math.min(minDist,dist);
                            break ;
                        }
                    }
                }
            }
            
        }

        return minDist == Integer.MAX_VALUE ? -1 : minDist ; 



    }
}