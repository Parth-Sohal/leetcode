#include<iostream>
using namespace std;
#include<vector>
#include<algorithm>
#include<cmath>

int main(){
    vector<int> v{1,-2,3,-4,-5,6};
    for(int i = 0 ; i < v.size() ;i++){
        if(v[i] < 0){
            int index = i;
            for(int j = i+1 ;j < v.size() ;j++){
                if(v[j]<0){
                    index++;
                }
                else if(v[j] > 0){
                    swap(v[index],v[j]);
                    index++;
                }
            }
        }
    }
    for(auto i : v){
        cout << i << " ";
    }
    return 0;
}