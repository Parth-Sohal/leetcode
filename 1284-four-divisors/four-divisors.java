class Solution {

    private int divisor(int n){

        int count = 0 ;
        int sum = 0 ;

        for(int i = 1 ; i <= n ; i++){
            if((n % i) == 0){
                sum += i ;
                count++;
            }

            if(count > 4){
                return -1;
            }
        }

        if(count < 4)return -1;

        return sum ;
       

    }


    public int sumFourDivisors(int[] nums) {
        
        int sum = 0 ;

        for(int i = 0 ; i <  nums.length ; i++){
            int a = divisor(nums[i]);
            if(a != -1)sum+=a;
        }

        return sum ;


    }
}