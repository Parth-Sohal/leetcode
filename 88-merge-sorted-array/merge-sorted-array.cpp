class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int put = nums1.size() - 1;
    int scnd = nums2.size() - 1;
    int first = m - 1;

    while(first >= 0 && scnd >= 0){

        if(nums2[scnd] >= nums1[first]){
            nums1[put] = nums2[scnd];
            scnd--;
            put--;
        }

        else{
            nums1[put] = nums1[first];
            put--;
            first--;
        } 

    }

    while (scnd >= 0) {
        nums1[put--] = nums2[scnd--];
    }
    }
};