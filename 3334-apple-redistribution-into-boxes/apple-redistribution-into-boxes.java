class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum = Arrays.stream(apple).sum() ;
        Arrays.sort(capacity) ;

        int count = 0 , i = capacity.length - 1 ; 

        while(sum > 0){
            sum -= capacity[i] ;
            i--;
            count++;
        }

        return count ; 
    }
}