#include<iostream>
using namespace std;
int add(int,int);
int main()
{
    int n1,n2,output;
    cout<<"Enter two number: ";
    cin>>n1;
    cin>>n2;
    output=add(n1,n2);
    cout<<"Addition of two number is: "<<n1<<"+"<<n2<<"="<<output<<"\n";
}
int add(int n1,int n2)
{
    int result;
    result=n1+n2;
    return result;
    return 0;
}
