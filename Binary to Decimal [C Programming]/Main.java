#include<stdio.h>
int bin_to_dec(int n)
{
  	int dec = 0, dig;
  	int i=1;
    while(n>0){
      dig = n%10;
      dec = dec + dig*i;
      i = i*2;
      n /= 10;
      
    }  
  return dec;
}
int main()
{
    int n;
    scanf("%d",&n);
    printf("%d",bin_to_dec(n));
}