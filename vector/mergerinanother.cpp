#include<iostream>
using namespace std;
#include<vector>
#include<algorithm>
#include<cmath>

int main(){
    vector<int> arr1 = {};
    vector<int> arr2 = {1};
    vector<int> arr3(arr1.size()+arr2.size());
    int i = 0 , j = 0 , k = 0;
    while(i<arr1.size() && j<arr2.size()){
        if(arr1[i]<=arr2[j]){
            arr3[k] = arr1[i];
            i++,k++;
        }
        else{
            arr3[k] = arr2[j];
            j++,k++;
        }
    }
    while(i<arr1.size()){
        arr3[k++] = arr1[i++];
    }
    while(j<arr2.size()){
        arr3[k++] = arr2[j++];
    }
    arr1 = arr3;
    for(auto num : arr1){
        cout << num << " ";
    }
}