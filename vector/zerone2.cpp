#include<iostream>
using namespace std;
#include<vector>
#include<algorithm>
#include<cmath>

void sort(vector<int>& v){
    int count0 = 0 , count1 =0;
    for(int i = 0 ; i < v.size() ;i++){
        if(v[i] == 0 ) count0++;
        else count1++;
    }
    for(int i = 0 ;i < v.size() ;i++){
        if(i<count0) v[i] = 0;
        else v[i] = 1;
    }
}
int main() {
    vector<int> v{0,1,1,0,0,1};
    sort(v);
    for(auto i : v){
        cout << i << " ";
    }

}