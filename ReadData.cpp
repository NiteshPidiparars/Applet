#include<iostream>
#include<fstream>
#include<conio.h>
using namespace std;
int main()
{
    char ch;
    ifstream fin;
    fin.open("myfile.dat");
    fin>>ch;
    while(!fin.eof())
    {
        cout<<ch;
        fin>>ch;
    }
    fin.close();
    getch();
}                               
										                                            							
