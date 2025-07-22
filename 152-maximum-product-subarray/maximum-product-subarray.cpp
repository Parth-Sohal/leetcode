class Solution {
public:
    int maxProduct(vector<int>& nums) {

        // long prod = 1;
        // long maxProd = INT_MIN;
        // int oddProd = 1, lastNeg = 1;
        // long totalProd = 1;
        // int count = 0;
        // int i = 0;

        // while (i < nums.size()) {
        //     totalProd = totalProd * nums[i];

        //     if (nums[i] == 0) {
        //         // cout << "here = > " << maxProd << endl;
        //         // maxProd = max(totalProd, maxProd);
        //         if (totalProd > maxProd) {
        //             maxProd = totalProd;
        //         }
        //         // cout << "here = > " << maxProd << endl;
        //         totalProd = 1;
        //         lastNeg = 1;
        //         prod = 1;
        //         count = 0;
        //     }

        //     else if (nums[i] < 0) {
        //         // int temp = prod ;
        //         if (count % 2 == 0) { // odd
        //             oddProd = lastNeg * nums[i] * prod;
        //             // maxProd = max(oddProd, maxProd);
        //             if (oddProd > maxProd) {
        //                 maxProd = oddProd;
        //             }
        //             lastNeg = prod * nums[i];
        //         } else { // even
        //             lastNeg = prod * nums[i];
        //             prod = totalProd;
        //             maxProd = prod;
        //         }
        //         count++;
        //         prod = 1;
        //         // cout << lastNeg << endl;
        //     }

        //     else if (nums[i] > 0) {
        //         prod = prod * nums[i];
        //         // maxProd = max(maxProd, prod);
        //         if (prod > maxProd) {
        //             maxProd = prod;
        
        //         }if(totalProd > maxProd){
        //             maxProd = totalProd ;
        //         }
        //     }

        //     i++;
        // }

        // return maxProd;


        int pref = 1 , suff = 1 , n = nums.size();
        int ans = INT_MIN;

        for(int i = 0 ; i < n ;i++){
            if(pref == 0)pref = 1;
            if(suff == 0)suff = 1;

            pref = pref * nums[i];
            suff = suff * nums[n - i - 1];

            ans = max(ans , max(pref,suff));
        }

        return ans;

    }
};