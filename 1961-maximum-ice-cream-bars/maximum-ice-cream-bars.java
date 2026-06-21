class Solution {
    public int maxIceCream(int[] costs, int coins) {

        int max = Arrays.stream(costs).max().getAsInt();

        int[] arr = new int[max + 1];

        for(int i = 0 ; i < costs.length ; i++){
            arr[costs[i]]++;
        }
        int ans = 0 ;

        System.out.println(Arrays.toString(arr));

        for(int i = 0 ; i < arr.length ; i++){

            if(coins == 0 || i > coins){
                break;
            }

            if(arr[i] > 0){
                if(i * arr[i] <= coins){
                    ans +=  arr[i];
                    coins -= (i * arr[i]) ;
                }
                else{
                    ans += (coins / i);
                   break;
                }
            }


        }

        return ans ; 

    }
}