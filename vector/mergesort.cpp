#include<iostream>
using namespace std;
#include<vector>
#include<algorithm>
#include<limits.h>
#include<cmath>

int main(){
    vector<int>arr1 = {1,2,3,0,0,0};
    vector<int>arr2 = {2,5,6};

    int m = 3 , n = 3;

    int current = n - 1 ; //  arr 2
    int put = m+n-1; // arr1 ke last 0 jaha se dalna shuru karunga
    int check  = m-1;

    while(current>=0 && check>=0){
        if(arr2[current]>arr1[check]){
            arr1[put] = arr2[current];
            current--;
        }
        else {
            arr1[put] = arr1[check]; // bada no aa gaya 
            check--;
        }
        put--;
        for(auto i : arr1){
            cout << i << " ";
        }
        cout << endl;
    }
    

}