#include<iostream>
using namespace std;
#include<vector>
#include<algorithm>
#include<cmath>

int main(){
    vector<int> arr{1,2,3,4,5,6};
    int i = 0;
    int j = arr.size() - 1;
    reverse(arr.begin(),arr.end());
    for(auto i: arr){
        cout << i << " ";
    }
}