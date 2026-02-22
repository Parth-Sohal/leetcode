class Solution {

    static int[] arr = new int[5000001];
    static boolean built = false ;


    public static void primeNumbers(){

        if(built)return ;

        built = true ;

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

    public int countPrimes(int n) {

        primeNumbers();
        int count = 0 ;

        for(int i = 2 ; i < n ; i++){
            if(arr[i] == 0)count++;
        }
        return count ; 
    }
}