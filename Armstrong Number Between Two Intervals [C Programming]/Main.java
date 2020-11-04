#include<stdio.h>
int getdigits(int n)
{
    int c=0;
    while(n>0)
    {
        n/=10;
        c++;
    }
    return c;
}
int power(int rem, int p)
{
    int res=1,i;
    for(i=1;i<=p;i++)
        res*=rem;
    return res;
}
int armstr(int n)
{
  int dig= getdigits(n), tot=0, rem, term;
  int num=n;
   while(n!=0){
   	rem = n%10;
    term = power(rem, dig);
     tot = tot + term;
     n = n/10;
   
   }
  
  if(tot==num){
  	return 1;
  }
  return 0;
}

void print(int a, int b)
{
    int i;
    for(i=a;i<=b;i++)
    {
        if(armstr(i)==1)
            printf("%d ",i);
    }
}
int main()
{
    int a,b;
    scanf("%d %d",&a,&b);
    print(a,b);
    return 0;
}
