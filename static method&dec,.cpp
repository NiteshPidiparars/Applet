#include<iostream>
using namespace std;
//class declaration
class StaticDemo
{
private:
    //static variable declaration
    static int sum;
    //normal variable declaration
    int x;
public :
    //construct of class
    StaticDemo()
    {
        sum=sum+1;
        x=sum;
    }
    //static function static function()define with keyword static
    static void StaticFunction()
    {
        cout<<"\nResult is: "<<sum;
    }
    //normal function normal functionNumber()
    void normalFunctionNumber()
    {
        cout<<"\nNumber is: "<<x;
    }
};
int StaticDemo::sum=0;
int main()
{
    cout<<"This is how static variable and method work: \n";
    StaticDemo stat;//creation of object
    //static function StaticFunction() accessed using class name staticDemo and the scope resolution operator:: staticDemo::staticFunction
    StaticDemo stat1,stat2,stat3;
    StaticDemo::StaticFunction();
    stat.normalFunctionNumber();
    //Normal function using access using object stat and dot member access operator
    stat1.normalFunctionNumber();
    stat2.normalFunctionNumber();
    stat3.normalFunctionNumber();
    return 0;
}
