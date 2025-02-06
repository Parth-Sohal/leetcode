#include<iostream>
using namespace std;
#include<vector>
#include<algorithm>
#include<cmath>

int main(){
    vector<int> v{1,1,0,1,0,1,1,0};
    int i = 0;
    int j = v.size()-1;
    while(i<j){
        if((v[i] == 1 && v[j] == 0 )){
            swap(v[i],v[j]);
            i++;
            j--;
        }
        if(v[i] == 0){
            i++;
        }
        if(v[j]==1){
            j--;
        }

    }
    for(auto i:v){
        cout << i << " ";
    }
    return 0;
}