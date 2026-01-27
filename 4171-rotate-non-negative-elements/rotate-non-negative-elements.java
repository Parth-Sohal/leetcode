class Solution {
    public int[] rotateElements(int[] nums, int k) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i : nums) {
            if (i >= 0)
                list.add(i);
        }

        // System.out.println(list);

        Collections.reverse(list);

        if(list.size() == 0)return nums;

        k = k % list.size();
        if (k == 0 || list.size() == 1) {
            return nums;
        }

        k = list.size() - k;

        int i = 0;
        int j = k - 1;

        while (i < j) {
            int temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;
            j--;
        }

        i = k;
        j = list.size() - 1;

        while (i < j) {
            int temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;
            j--;
        }

        // System.out.println(list);

        i = 0;

        for (int it = 0; it < nums.length; it++) {
            if (nums[it] >= 0) {
                nums[it] = list.get(i++);
            }
        }

        // System.out.println(Arrays.toString(nums));
        return nums;
    }
}