#include<iostream>
using namespace std;
int main()
{
    int size,i,j;
    cout<<"Enter the number of character: "<<"\n";
    cin>>size;
    char ch[size];
    cout<<"Enter "<<size<<" character: "<<"\n";
    for(i=0;i<size;i++){
        cin>>ch[i];
    }
    char temp;
    for(i=0;i<size;i++){
        for(j=0;j<size-1;j++){
            if(ch[j+1]<ch[j]){
                temp=ch[j];
                ch[j]=ch[j+1];
                ch[j+1]=temp;
            }
        }
    }
    for(i=0;i<size;i++){
        cout<<ch[i]<<" ";
    }
    return 0;
}
