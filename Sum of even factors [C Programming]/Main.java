#include<stdio.h>
void main()
{
  
    int num, even = 0;
    scanf("%d", &num);
    for (int i = 1; i < num; i++)
    {
        if (num%i == 0)
        {
            if(i%2==0)
            {
               even += i; 
            }
        }
    }
    printf("%d", even);
    return 0;
    
}
