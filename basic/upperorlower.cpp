#include<iostream>
#include<cmath>
using namespace std;

// int main(){
//     char ch;
//     cin >> ch;
//     if(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z'){
//         if(ch == 'a' || ch == 'e' || ch == 'i' || ch =='o' || ch =='u' ||ch == 'A' || ch == 'E' || ch == 'I' || ch =='O' || ch =='U' ){
//             cout << "Vowel";
//         }
//         else{
//             cout << "Consonant";
//         }
//     }
//     else if(ch >= '0' && ch <= '9'){
//         cout << "Number";
//     }
//     else{
//         cout << "special cha";
//     }    
// }

int main(){
    int num;
    cin >> num;
    int root = sqrt(num);
    cout << root << endl;
    if(root*root == num){
        cout << "yes";
    }
    else{
        cout << "no" ;
    }
}