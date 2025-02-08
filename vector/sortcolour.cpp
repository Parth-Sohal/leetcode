#include<iostream>
using namespace std;
#include<vector>
#include<algorithm>
#include<cmath>

int main(){
    vector<int> v{2,0,2,1,1,0};
    for(int i = 0 ; i < v.size() ;i++){
        for(int j = i+1 ; j < v.size() ;j++){
            if(v[i] > v[j]){
                swap(v[i],v[j]);
            }
        }
    }
    for(auto num : v){
        cout << num << " ";
    }
}