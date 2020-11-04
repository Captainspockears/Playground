#include <stdio.h>

int main() 
{
  
    int i = 65;
    int k = 120;
    printf("%d %d\n", i, k);

    i = i ^ k;
    k = k ^ i;
  	i = k ^ i;
    printf("%d %d", i, k);

    return 0;
    
}
