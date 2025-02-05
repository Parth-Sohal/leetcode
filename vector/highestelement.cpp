#include<iostream>
using namespace std;
#include<vector>
#include<algorithm>
#include<cmath>

int main(){
    vector<int> v{10,20,30,40};
    for(int i = 0 ; i < v.size() ;i++){
        int max = -1;
        for(int j = i+1 ;j <v.size() ;j++){
            if(v[j] > max){
                max = v[j];
            }
        }
        v[i] = max;
    }
    for(auto i : v){
        cout << i << " ";
    }
    return 0;
}