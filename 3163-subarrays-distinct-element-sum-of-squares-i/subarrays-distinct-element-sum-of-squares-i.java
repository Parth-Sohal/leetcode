class Solution {
    public int sumCounts(List<Integer> nums) {

        int sum = 0 , n = nums.size()  ; 
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0 ; i < n ; i++){

            for(int j = i ; j < n; j++){

                set.add(nums.get(j));
                sum += (set.size() * set.size()) ;

            }

            set.clear();

        }

        return sum ; 

    }
}