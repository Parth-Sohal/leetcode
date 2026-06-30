class Solution {
    public int minimumOperations(int[] nums) {

        if(nums.length <= 1)return 0 ; 

       HashMap<Integer,Integer> mapEven = new HashMap<>();
        HashMap<Integer,Integer> mapOdd = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++){

            if(i % 2 == 0){
                mapEven.put(nums[i],mapEven.getOrDefault(nums[i],0)+1);
            }
            else{
                mapOdd.put(nums[i],mapOdd.getOrDefault(nums[i],0)+1);
            }

        }

        int bestEven = 0 ;
        int scBestEven = 0 ;
        int numEven1 = 0 ;
        int numEven2 = 0 ;

        for(Integer key : mapEven.keySet()) {

            if(mapEven.get(key) > bestEven){
                numEven2 = numEven1;
                numEven1 = key ;
                scBestEven = bestEven;
                bestEven = mapEven.get(key);
            }
            else if(mapEven.get(key) > scBestEven){
                numEven2 = key ;
                scBestEven = mapEven.get(key);
            }

        }

        int bestOdd = 0 ;
        int numOdd1 = 0 ;
        int scBestOdd = 0 ;
        int numOdd2 = 0 ;

        for(Integer key : mapOdd.keySet()) {
            if(mapOdd.get(key) > bestOdd){
                numOdd2 = numOdd1;
                numOdd1 = key ;
                scBestOdd = bestOdd;
                bestOdd = mapOdd.get(key);
            }
            else if(mapOdd.get(key) > scBestOdd){
                numOdd2 = key;
                scBestOdd = mapOdd.get(key);
            }
        }

        int totalEven = (nums.length + 1) / 2;
        int totalOdd = nums.length / 2;
        

        if(numEven1 != numOdd1){
            return (totalEven - bestEven) + (totalOdd - bestOdd);
        }

        int option1 = (totalEven - bestEven) + (totalOdd - scBestOdd);
        int option2 = (totalEven - scBestEven) + (totalOdd - bestOdd);

        return Math.min(option1, option2);


    }
}