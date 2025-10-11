class Solution {
    public int maximumCandies(int[] candies, long k) {
        long low = 1 ;
        long high = Arrays.stream(candies).max().getAsInt();

        while(low <= high){
            long mid = (low + high)/2;
            long count = 0 ;

            for(int j = 0 ; j < candies.length ; j++){
                count += (candies[j] / mid);
            }

            if(count < k){
                high = mid - 1;
            }

            else{
                low = mid + 1;
            }
        }

        return (int)high ;


    }
}