class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int n = gas.length;
        int[] diff= new int[gas.length];

        int temp = 0 ; 
        
        for(int i = 0; i < n ; i++){
            diff[i] = gas[i] - cost[i];
            temp += diff[i];
        }

        if(temp < 0){
            return -1 ; 
        }


        int currStart = -1 ;
        int sum = 0 ;

        

        for(int i = 0 ; i < n ;i++){

            
            sum +=  diff[i];
            
            if(sum < 0){
                currStart = -1;
                sum = 0 ; 
            }
            
            else if(sum >= 0 && currStart == -1){
                currStart = i;
            }

        }

        return currStart ; 
        
    }
}