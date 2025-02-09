#include <iostream>
using namespace std;
#include <vector>
#include <algorithm>
#include <cmath>

int main()
{
    // vector<int> arr{-1, 1, 0, -1, 0, 1, 1, -1};

    // int lowest = 0;
    // int middle = 0;
    // int high = arr.size() - 1;

    // while (middle <= high)
    // {
    //     if (arr[middle] == 0)
    //     {
    //         middle++;
    //     }
    //     else if (arr[middle] == 1)
    //     {
    //         swap(arr[middle], arr[high]);
    //         high--;
    //     }
    //     else if (arr[middle] == -1)
    //     {
    //         swap(arr[middle],arr[lowest]);
    //         middle++;
    //         lowest++;
    //     }
    // }
    // for(auto i : arr){
    //     cout << i << " ";
    // }


    vector<int> arr = {3, 1, 2, 4, 7, 6, 5, 8};
    int i = 0;
    int j = arr.size()-1;

    while(i<j){
        if(arr[i]%2==0){
            i++;
        }
        else if(arr[i]%2!=0 && arr[j]%2==0){
            swap(arr[i],arr[j]);
            i++;
            j--;
        }
        else if(arr[j]%2!=0){
            j--;
        }
        for(auto i : arr){
            cout << i << " ";
        }
        cout << endl;
    }




}