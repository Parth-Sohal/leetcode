#include<iostream>
using namespace std;
#include<vector>
#include<algorithm>
#include<cmath>

int main(){
    vector<int> arr = {1,2,3,-1,-2,-3};
    vector<int> result(arr.size());
    int even = 0,odd = 1;
    for(int i = 0 ; i < arr.size() ;i++){
        if(arr[i]>= 0){
            result[even] = arr[i];
            even+=2;
        }
        else{
            result[odd] = arr[i];
            odd+=2;
        }
    }
    for(auto i : result){
        cout << i << " ";
    }
    return 0;

}