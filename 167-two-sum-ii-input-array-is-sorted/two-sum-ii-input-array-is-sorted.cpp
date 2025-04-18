class Solution {
public:
    vector<int> twoSum(vector<int>& numbers, int target) {
        int start = 0;
        int end = numbers.size() - 1;
        vector<int> v(2);
        while(start<end){
            if(numbers[start] + numbers[end] == target){
                v[0] = start+1;
                v[1] = end+1;
                break;
            }
            else if(numbers[start] + numbers[end] < target){
                start++;
            }
            else{
                end--;
            }
        }
        return v;
    }
};