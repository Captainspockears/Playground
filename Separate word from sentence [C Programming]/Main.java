#include <stdio.h>
#include <string.h>
int main()
{
  
	char str[100];
 	scanf("%[^\n]s",str);
	int init_size = strlen(str);
	char delim[] = " ";
	char *ptr = strtok(str, delim);
	while (ptr != NULL)
	{
		printf("%s\n", ptr);
		ptr = strtok(NULL, delim);
	}
	return 0;
    
}
