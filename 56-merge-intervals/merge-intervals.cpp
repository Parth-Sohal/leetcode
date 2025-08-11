class Solution {
public:
    vector<vector<int>> merge(vector<vector<int>>& intervals) {

        sort(intervals.begin(), intervals.end());
        int start = intervals[0][0];
        int end = intervals[0][1];

        int row = intervals.size();

        int j = 1;

        vector<vector<int>> ans;

        while (j < row) {

            if (intervals[j][0] <= end) {
                if(intervals[j][1] > end){
                    end = intervals[j][1];
                }
                // end = intervals[j][1];
            }

            else {
                // cout << start << " " << end << endl;
                ans.push_back({start, end});
                start = intervals[j][0];
                end = intervals[j][1];
                // cout << "new start and end => ";
                // cout << start << " " << end << endl;
            }

            j++;
        }

        ans.push_back({start, end});

        return ans;
    }
};