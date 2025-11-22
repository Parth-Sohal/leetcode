class Solution {
    public int sumOfNumbers(int n, int sum) {

        if( n == 0 && sum < 10)
        {
            return sum ;
        }

        else if(n == 0 && sum >= 10){
            n = sum ;
            return sumOfNumbers(n , 0);
        }

        else{
            return sumOfNumbers(n/10 , sum += n%10);
        }

    }
    public int addDigits(int num) {
        return sumOfNumbers(num , 0 );
    }
}