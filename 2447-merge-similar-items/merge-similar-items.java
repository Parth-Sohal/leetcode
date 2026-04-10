class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        

        int[] weights = new int[1001]; 

        for(int[] items : items1){
            weights[items[0]] += items[1];
        }

        for(int[] items : items2){
            weights[items[0]] += items[1];
        }


        List<List<Integer>> list = new ArrayList<>();

        for(int i = 0 ; i <= 1000 ; i++){
            if(weights[i] > 0){
                list.add(Arrays.asList(i ,weights[i]));
            }
        }

        return list ;

    }
}