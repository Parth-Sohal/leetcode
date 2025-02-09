#include<iostream>
using namespace std;
#include<vector>
#include<algorithm>
#include<cmath>

int main(){
    vector<int> arr = {1,2,2,3,3,3,4,5,5};
    int i = 0,j = i+1 , count = 0;
    // while(j<arr.size()){
    //     if(arr[i] == arr[j]){
    //         arr[j] = -1;
    //         count++;
    //         j++;
    //         i++;
    //     }
    //     else{
    //         // i++;
    //         swap(arr[i],arr[j]);
    //         j++;
    //     }
    // }
    while(j<arr.size()){
        if(arr[i] == arr[j]){
            j++;
        }
        else{
            count++;
            swap(arr[++i],arr[j]);
            j++;
        }
    }
    for(auto i : arr){
        cout << i << " ";
    }
    cout << count+1;
}