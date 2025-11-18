class Solution {

    private int count(int n  , int count){

        if( n== 0){
            return count ;
        }


        if( n % 2 == 0){
            return count(n/2,++count);
        }


        return count(n - 1, ++count);

    }


    public int numberOfSteps(int num) {

        return count(num,0);

    }
}