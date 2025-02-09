#include<iostream>
using namespace std;
#include<vector>
#include<algorithm>
#include<limits.h>
#include<cmath>
//3 pointers questionm 

int main(){
    vector<int> arr1{0};
    vector<int> arr2{1};
    int m = 0;
    int n = 1;
    
    // pointers ->
    int current = n-1;
    int put = m+n-1;
    int check = m-1;

    while(current>=0 && check>=0){
        if(arr2[current] > arr1[check]){
            arr1[put] = arr2[current];
            current--;
            put--;
        }
        else{
            arr1[put] = arr1[check];
            put--;
            check--;
        }
        for(auto i : arr1){
            cout << i << " ";
        }
        cout << endl;
    }
    while(current >= 0){
        arr1[put--] = arr2[current--];
    }
    for(auto i : arr1){
        cout << i << " ";
    }
    cout << endl;
}