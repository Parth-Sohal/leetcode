// sort of 0,1,2
#include<iostream>
using namespace std;
#include<vector>
#include<algorithm>
#include<limits.h>
#include<cmath>

int main(){
    vector<int> arr = {-3, 5, -1, 7, -4, 2, -6, 8};
    int low = 0;
    int mid = 0;
    while(mid<arr.size()){
        if(arr[mid]<0){
            swap(arr[mid],arr[low]);
            low++,mid++;
        }
        else{
            mid++;
        }
        for(auto i : arr){
            cout << i << " ";
        }
        cout << endl;
    }
}