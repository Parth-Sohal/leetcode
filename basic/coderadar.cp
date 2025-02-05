#include<iostream>
using namespace std;
bool leapYear(int year){
    if(year%400==0){
        return true;
    }
    if(year%4==0 && year%100!=0){
        return true;
    }
    else{
        return false;
    }
}
int main(){
    int a;
    cin >> a;
    cout << leapYear(a);
    return 0;
}