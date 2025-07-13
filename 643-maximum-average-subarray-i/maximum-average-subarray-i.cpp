class Solution {
public:
    double findMaxAverage(vector<int>& nums, int k) {
        double avg = 0 ;
        double sum = 0 ;
        long start = 0;
        for(int i = 0 ; i < k ; i++){
            sum += nums[i] ;
        }
        int i = k - 1;

        avg = sum / k ;

        while(i < nums.size()){
            
            double newAvg = sum / k ;

            if(newAvg > avg){
                avg = newAvg ;
            }

            sum -= nums[start];
            start++;
            i++;

            if(i < nums.size()){
                sum+=nums[i];
            }
        }

        return avg ;
    }
};