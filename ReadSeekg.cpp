#include<iostream>
#include<fstream>
#include<conio.h>
using namespace std;
int main()
{
	ifstream fin;
	fin.open("abc.txt");
	cout<<fin.tellg();
	cout<<"\n"<<(char)fin.get();
	cout<<"\n"<<fin.get();
	cout<<"\n"<<fin.tellg();
	fin.seekg(0);
	cout<<"\n"<<fin.tellg();
	cout<<"\n"<<(char)fin.get();
	cout<<"\n"<<fin.tellg();
	fin.seekg(2,ios_base::beg);
	cout<<"\n"<<fin.tellg();
	cout<<"\n"<<(char)fin.get();
	getch();
}
