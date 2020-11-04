#include<iostream>
using namespace std;

void printpattern(int n)
{
	char a[] = "     ";
  	for(int i=0; i<n; i++){
      if(i%2==0){
       a[i]='*'; 
      }else{
       a[i]='#'; 
      }  
      cout<<a<<"\n";
    }  
}


int main()
{
    int a;
    cin>>a;
    printpattern(a);
    return 0;
}
