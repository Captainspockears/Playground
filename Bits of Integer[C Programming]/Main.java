#include<stdio.h>
int dec_to_bin(int n)
{
  int count = 0;
   while (n>=1){
     n = (int) n/2;
	count++;
	     	
   }
  
  return count;
}
int main()
{
    int n;
    scanf("%d",&n);
    printf("%d",dec_to_bin(n));
}
