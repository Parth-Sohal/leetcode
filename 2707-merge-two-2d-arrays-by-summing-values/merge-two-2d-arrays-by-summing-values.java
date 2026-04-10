class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {

        int i = 0;
        int j = 0;
        ArrayList<int[]> ans = new ArrayList<>();

        while (i < nums1.length && j < nums2.length) {

            int a = nums1[i][0];
            int b = nums2[j][0];

            if (a == b) {

                int[] arr = 
                        { a, nums1[i][1] + nums2[j][1] }
                ;

                ans.add(arr);
                i++;
                j++;
            }

            else if (a < b) {
                int[] arr =  { a, nums1[i][1] } ;
                ans.add(arr);
                i++;
            }

            else {
                int[] arr = {  b, nums2[j][1]  };
                ans.add(arr);
                j++;
            }

        }

        while (i < nums1.length) {
            int[] arr = { nums1[i][0], nums1[i][1]  };
            ans.add(arr);
            i++;
        }

        while (j < nums2.length) {
            int[] arr = {  nums2[j][0], nums2[j][1]  };
            ans.add(arr);
            j++;
        }

        return ans.toArray(new int[ans.size()][]);

    }
}