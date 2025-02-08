#include<iostream>
using namespace std;
#include<vector>
#include<algorithm>
#include<cmath>

int main(){
    // for(int i = 0 ; i < v.size() ;i++){
    //     for(int j = i+1 ; j < v.size() ;j++){
    //         if(v[i] > v[j]){
    //             swap(v[i],v[j]);
    //         }
    //     }
    // }
    // for(auto num : v){
    //     cout << num << " ";
    // }

    // int count_0 = 0;
    // int count_1 = 0;
    // int count_2 = 0;
    // for(int i = 0 ; i < v.size();i++){
    //     if(v[i]==0) count_0++;
    //     else if(v[i]==1) count_1++;
    //     else count_2++;
    // }
    // cout << count_0 << " " << count_1 << " " << count_2;
    // cout << endl;

    // for(int i = 0 ;i<v.size() ;i++){
    //     if(i<count_0) v[i] = 0;
    //     else if(i<count_1+count_0) v[i] = 1;
    //     else v[i] = 2;
    // }

    // for(auto i : v){
    //     cout << i << " ";
    // }



    // vector<int> arr{2,0,2,1,1,0};
    // int low = 0;
    // int mid = 0 ;
    // int high = arr.size() - 1;
    
//    vector<int> arr{2,0,2,1,1,0};
    vector<int> arr{2, 2, 0, 1, 0, 1, 2, 0, 1};

    int low = 0;
    int mid = 0 ;
    int high = arr.size() - 1;
    
    while(mid<high){
        if(arr[mid]==1){
            mid++;
        }
        else if(arr[mid]==2){
            swap(arr[mid],arr[high]);
            high--;
        }
        else if(arr[mid]==0){
            swap(arr[low],arr[mid]);
            mid++;
            low++;
        }
        for(auto num : arr){
            cout << num << " ";
        }
        cout << endl;
    }
    

}