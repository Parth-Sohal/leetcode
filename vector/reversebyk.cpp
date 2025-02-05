#include<iostream>
using namespace std;
#include<vector>
#include<algorithm>
#include<cmath>

int main(){
    vector<int> arr{1,2,3,4,5};
    int k = 2;
    // cout << arr.end();
    reverse(arr.begin(),arr.end());
    for(auto i:arr){
        cout << i << " ";
    }
    cout << endl;

    reverse(arr.begin(),arr.begin()+arr.size()-k);
    for(auto i:arr){
        cout << i << " ";
    }

    cout << endl;
    
    reverse(arr.begin()+arr.size()-k,arr.end());
    for(auto i:arr){
        cout << i << " ";
    }

    
}