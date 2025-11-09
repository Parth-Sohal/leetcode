class Solution {
    public int numberOfSteps(int num) {
        if(num == 0){
            return 0;
        }
        int ans;

        if(num%2 == 0){
           return ans =  numberOfSteps(num/2) + 1;
        }
        
        else{
           return ans =  numberOfSteps(num - 1) + 1;
        }
    }
}