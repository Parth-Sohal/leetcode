class Solution {
    public String[] findRelativeRanks(int[] score) {

        Map<Integer,Integer> map = new HashMap<>() ;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int count = 0 ; 

        for(int i = 0 ; i < score.length ; i++){
            map.put(score[i] , i);
            pq.add(score[i]);
        }

        String[] ans = new String[score.length]; 
        while(!pq.isEmpty()){
            count++;
            int num = pq.poll();
            if(count == 1){
                ans[map.get(num)] = "Gold Medal";
            }else if(count == 2){
                ans[map.get(num)] = "Silver Medal";
            }else if(count == 3){
                ans[map.get(num)] = "Bronze Medal";
            }else{
                ans[map.get(num)] = String.valueOf(count);
            }
        }

        return ans ; 

        
    }
}