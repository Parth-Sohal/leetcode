#include <iostream>
using namespace std;
#include <vector>
#include <algorithm>
#include <cmath>

int main()
{
    vector<int> v{0, 1};

    for (int i = 0; i < v.size(); i++)
    {
        if (v[i] == 0)
        {
            int start = i;
            for (int j = i + 1; j < v.size(); j++)
            {
                swap(v[start], v[j]);
                start++;
            }
        }
    }

    for (auto i : v)
    {
        cout << i << " ";
    }
    return 0;
}