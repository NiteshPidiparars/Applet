#include<iostream>
#include<fstream>
#include<conio.h>
using namespace std;
int main()
{
	ofstream fout;
	char ch;
	fout.open("abc.txt",ios::app);
	int pos;
	pos=fout.tellp();
	cout<<pos;
	fout<<"mySirg";
	pos=fout.tellp();
	cout<<pos;
	fout.close();
	getch();
}
