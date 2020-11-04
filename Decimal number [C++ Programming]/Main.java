#include<iostream>
using namespace std;
int dec_to_oct(int n)
{	
  	int a[n], index=0;
    while(n!=0){
    	a[index] = n%8;
      	n=n/8;
      index++;    
    }
  
  	while(index--){
    
    	n = n*10 + a[index];
      
    }
  return n;
}
int main()
{
    int n;
    cin>>n;
    cout<<dec_to_oct(n);
}
