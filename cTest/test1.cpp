#include <iostream>

using namespace std;

int fun(int n);
int fun1(int n);

int main()
{
    int n;
    cin>>n;
    cout<<fun(n)<<endl;
    return 0;
}

int fun(int n)
{
    if (n<0)
	return 0;
    if (n==1 || n==2)
	return n;
    return fun(n-1)+fun(n-2);
}

int fun1(int n)
{
    int r[2] = {0,1};
    if (n < 2)
	return r[n];
    long result;
    long t1=1,t2=2;
    for (int i = 0; i<n; i++)
    {
	result = t1 + t2;
	t1 = t2;
	t2 = result;
    }
    return result;


}

