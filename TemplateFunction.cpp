#include<iostream>
using namespace std;
template<typename T>
inline T const &Max(T const &val1,T const &val2)
{
    return val1<val2? val1:val2;
}
int main()
{
    int num1=9;
    int num2=210;
    cout<<"Max(num1,num2): "<<Max(num1,num2)<<endl;
    double d1=1.5;
    double d2=210.85;
    cout<<"Max(d1,d2): "<<Max(d1,d2)<<endl;
    string s1="Hey";
    string s2="Maximum here";
    cout<<"Max(s1,s2): "<<Max(s1,s2)<<endl;
    return 0;
}
