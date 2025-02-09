// sort of 0,1,2
#include<iostream>
using namespace std;
#include<vector>
#include<algorithm>
#include<limits.h>
#include<cmath>

int main(){
    vector<int> arr = {2,1,0,3,12};
    int low = 0;
    int mid = 0;
    while( mid<arr.size()){
        if(arr[mid]==0){
            mid++;
        }
        else if(arr[mid]!=0){
            swap(arr[mid],arr[low]);
            mid++,low++;
        }
        for(auto i : arr){
            cout << i << " ";
        }
        cout << endl;
    }
}