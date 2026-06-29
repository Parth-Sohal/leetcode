class Solution {
    public int totalFruit(int[] fruits) {

        HashMap<Integer, Integer> map = new HashMap<>()  ;
        int maxLen = 0 ; 
        int start = 0 ; 

        for(int i = 0; i < fruits.length ; i++){
            
            int n = fruits[i] ;

            map.put(n , map.getOrDefault(n,0) + 1);

            if(map.size() > 2){

                int k = fruits[start] ;

                map.put(k , map.get(k) - 1);

                if(map.get(k) == 0){
                    map.remove(k);
                }

                start++; 
            }


            if(map.size() == 2){
                maxLen = Math.max(maxLen , i - start + 1);
            }

        }

        if(map.size() < 2)return fruits.length ; 
        return maxLen ; 
        
    }
}