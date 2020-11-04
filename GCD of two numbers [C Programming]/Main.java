#include<stdio.h>
int gcd(int a,int b)
{
  int gcd = 1;
  int div = 2;
  int small;
  if(a>b){small=b;}else{small=a;}
   while(div<=small){
     if((a%div==0)&&(b%div==0)){
       gcd *= div;
       a /= div;
       b /= div;
     }else{
      div++; 
     }  
   }  
  return gcd;
}
int main()
{
    int a,b;
    scanf("%d %d",&a,&b);
    printf("%d ",gcd(a,b));
    return 0;
}
