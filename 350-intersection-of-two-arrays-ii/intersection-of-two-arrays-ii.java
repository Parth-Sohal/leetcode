class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer,Integer> mpp = new HashMap<>();

        for(int i : nums1){
            mpp.put(i , mpp.getOrDefault(i,0)+1);
        }


        ArrayList<Integer> list = new ArrayList<>();

        for(int i : nums2){
            if(mpp.containsKey(i) &&  mpp.get(i) != 0){
                list.add(i);
                mpp.put(i,mpp.get(i) - 1 ); 
            }
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();

    }
}