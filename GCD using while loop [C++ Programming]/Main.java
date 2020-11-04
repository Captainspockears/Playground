#include <iostream>
using namespace std;

int gcd(int n1, int n2){
 
  int small;
  if(n1>n2){small = n2;}else{small=n1;}
  
  for(int i=small; i>=2; i--){
  	
    if((n1%i==0) && (n2%i==0)){
    	return i;
    }
  
  }
  
  return -1;
  
}  

int main()
{
    int n1, n2, ans;
    cin >> n1 >> n2;
    
    ans = gcd(n1,n2);
    cout <<ans;
    return 0;
}