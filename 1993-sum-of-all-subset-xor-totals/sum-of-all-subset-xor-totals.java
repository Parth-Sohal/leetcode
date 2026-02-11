class Solution {

    public  int[] xorSubset(int[] arr , int currXor , int idx , int[] ans ){

        if(idx == arr.length){
            ans[0] += currXor;
            // System.out.println(ans[0] + " " + currXor);
            return ans;
        }

        xorSubset(arr , currXor , idx + 1, ans);

        xorSubset(arr , currXor ^ arr[idx] , idx + 1, ans);

        return ans ; 
        
    }


    public int subsetXORSum(int[] nums) {
        return xorSubset(nums , 0 , 0 , new int[1])[0];
    }
}