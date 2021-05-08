#include<iostream>
#include<fstream>
#include<conio.h>
using namespace std;
int main()
{
	ofstream fout;
	fout.open("abc.txt",ios::ate|ios::app);
	cout<<fout.tellp();
	fout<<"ABCDEFG";"
	cout<<fout.tellp();
	fout.seekp(2,ios_base::beg);
	cout<<"\n"<<fout.tellp();
	fout.close();
	getch();
}
