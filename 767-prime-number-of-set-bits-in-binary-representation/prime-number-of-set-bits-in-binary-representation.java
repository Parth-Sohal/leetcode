class Solution {


    public void primeNumbers(int[] arr){

        arr[0] = -1;
        arr[1] = -1;

        for(int i = 2 ; i*i < arr.length ; i++){

            if(arr[i] == -1)continue;

            else{

                for(int j = (i*i) ; j < arr.length ; j += i){
                    arr[j]  = -1;
                }

            }


        }

    }
     public int countPrimeSetBits(int left, int right , int[] arr) {

        int count = 0 ;
        for(int i = left ; i <= right ; i++){

            int n = Integer.bitCount(i);

            if(arr[n] == 0) {
                count++;
            }

        }

        return count ;

    }

    public int countPrimeSetBits(int left, int right) {
        int[] arr = new int[32];

        primeNumbers(arr);

        return countPrimeSetBits(left,right,arr);

    }
}