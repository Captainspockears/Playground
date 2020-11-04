#include<stdio.h>
int main() 
{
  
	int i,j,left,right,k,rightcount,count,rows,alpha;
	scanf("%d",&rows);
	count=0;
	left=rows;
	right=rows;
	for(i=rows;i>=1;i--) {
    	if(i!=1) {
        	for(k=1;k<=count;k++)
            	printf(" ");
        	for(j=1;j<left;j++)
            	printf("%c",j+64);
        	left--;
        	for(j=right;j>=1;j--)
            	printf("%c",j+64);
        	right--;
        	printf("\n");
        	count++;
    	}
}
  	count=rows;
	left=1;
	right=0;
	for(i=1;i<=rows;i++) {
	    for(k=1;k<count;k++)
	        printf(" ");
	    for(j=1;j<=left;j++)
	        printf("%c",j+64);
	    left++;
	        if(i!=1) {
	           for(j=right;j>=1;j--)
	                printf("%c",j+64);
	        }
	        right++;
	        printf("\n");
	        count--;
	}
    
}

