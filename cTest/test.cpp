#include <iostream>

using namespace std;

int main() {
    int a = 203;
    int count = 0;
    if (a == 0)
        count = 1;
    while (a != 0) {
        count ++;
        a = a/10;
    }
    cout<<count<<endl;
    cout<<sizeof(a)<<endl;
}
