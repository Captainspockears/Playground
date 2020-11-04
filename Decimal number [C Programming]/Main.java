#include<stdio.h>
int dec_to_oct(int n)
{
    int pow=1, rem, dec = 0;
  	while(n>0){
    	
      rem = n%8;
      dec = dec + (rem*pow);
      pow = pow*10;
      n = n/8;
    
    }
  
  return dec;

}
int main()
{
    int n;
    scanf("%d",&n);
    printf("%d",dec_to_oct(n));
}
