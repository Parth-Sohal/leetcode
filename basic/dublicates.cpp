#include <iostream>
using namespace std;
#include <vector>
#include <algorithm>
#include<limits.h>
#include <cmath>

int main()
{
    int num = INT_m
    vector<int> nums = {1,2,2,3,4};
    int max = INT_MAX;
    int n = nums[0];
    int result = 0;
    for(int i = 1;i<nums.size();i++){
        if(n^nums[i] == 0){
            result = nums[i];
        }
        n = n ^ nums[i];
        cout << n << endl;
    }
    cout << result;
    
}