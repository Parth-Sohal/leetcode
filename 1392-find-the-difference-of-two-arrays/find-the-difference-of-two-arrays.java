class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>() ;

        Set<Integer> set1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> set2 = Arrays.stream(nums2).boxed().collect(Collectors.toSet());

        HashSet<Integer> temp1 = new HashSet<>() ;
        HashSet<Integer> temp2 = new HashSet<>() ; 


        for(int i : nums1){
            if(!set2.contains(i)){
                temp1.add(i);
            }
        }

        for(int i : nums2){
            if(!set1.contains(i)){
                temp2.add(i);
            }
        }

        ans.add(new ArrayList<>(temp1));
        ans.add(new ArrayList<>(temp2));

        return ans ; 



    }
}