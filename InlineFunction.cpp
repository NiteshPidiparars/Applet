#include<iostream>
using namespace std;
inline int add(int n1,int n2)
{
    return n1+n2;
}
inline int sub(int n1,int n2)
{
    return n1-n2;
}
inline int multi(int n1,int n2)
{
    return n1*n2;
}
inline int div(int n1,int n2)
{
    return n1/n2;
}
inline int mod(int n1,int n2)
{
    return n1%n2;
}
int main()
{
    cout<<"add(20,10): "<<add(20,10)<<"\n";
    cout<<"sub(1220,200): "<<sub(1220,200)<<"\n";
    cout<<"multi(100,1010): "<<multi(100,1010)<<"\n";
    cout<<"div(20,10): "<<div(20,10)<<"\n";
    cout<<"mod(20,10): "<<mod(20,10)<<"\n";
}
