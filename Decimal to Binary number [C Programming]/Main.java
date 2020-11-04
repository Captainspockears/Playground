#include<stdio.h>
int dec_to_bin(int n)
{
   //Your code goes here
  int rev = 0;
  int pow = 1;
  int rem = 0;
  while(n!=0){
  	rem = n%2;
    rev = rev + rem*pow;
    n = n/2;
    pow = pow *10;
  
  }
  return rev;
}
int main()
{
    int n;
    scanf("%d",&n);
    printf("%d",dec_to_bin(n));
}
