class Solution {

    private int divisor(int n){

        int count = 0 ;
        int sum = 0 ;

        for(int i = 1 ; i*i <= n ; i++){
            if((n % i) == 0){
                if(n / i == i ){
                    count++;
                }
                else {
                    count+=2 ; 
                    sum += n/i ;
                }
                sum += i ;

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