class Solution {
    public List<Integer> findLonely(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>() ;
        for(int i : nums){
            map.put(i , map.getOrDefault(i,0)+1);
        }

        List<Integer> ans = new ArrayList<>();

        for(Integer key : map.keySet()){
            if(!(map.get(key) > 1 || (map.containsKey(key-1) || map.containsKey(key+1)  ))){
                ans.add(key);
            }
        }


        return ans ;

    }
}