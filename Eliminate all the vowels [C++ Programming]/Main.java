#include<iostream>
#include<stdlib.h>
#include<string.h>
using namespace std;

char* consonants(char *str)
{	
  	char a[100];
  	char v[10] = {'a','e','i','o','u','A','E','I','O','U'};
  	bool vflag;
  	int count = 0;
  	int len = strlen(str);
  	for(int i=0; i<len; i++){
      vflag = false;
      for(int j=0; j<10; j++){
        if(str[i] == v[j]){
         	
          vflag = true;
          
        }
      }
      if (! vflag){
        a[count] = str[i];
        count++;
      }  
    }
  	cout<<a;
    return a;
}

int main()
{
    char str[100];
    scanf("%s",str);
    consonants(str);
    return 0;
}


