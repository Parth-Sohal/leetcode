class Solution {
    private int value(int[] potions ,  int val , long success){
        int low = 0 ;
        int high = potions.length-1;
        int ans = potions.length;

        while(low <= high){
            int mid =  low + (high-low)/2;
            long prod = (long) potions[mid] * val;

            if(prod >= success){
                ans = mid ;
                high = mid - 1;
            }else{
                low = mid + 1;
            }

        }

        return ans;
    }
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(potions);

        for (int i = 0; i < spells.length; i++) {
            int ans = value(potions,spells[i],success);
            ans = potions.length - ans;
            list.add(ans);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}