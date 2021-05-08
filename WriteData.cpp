#include<iostream>
#include<conio.h>
#include<stdio.h>
#include<fstream>
using namespace std;
int main()
{
    ofstream fout;
    fout.open("myFile.dat");
    fout<<"hello";
    getch();
    fout.close();
    getch();
}

