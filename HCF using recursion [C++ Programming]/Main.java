#include <iostream>
using namespace std;

int hcf(int n1, int n2);

int main()
{
   int n1, n2;
   cin >> n1 >> n2;
   cout <<hcf(n1, n2);
   return 0;
}

int hcf(int n1, int n2)
{
   int fact = 2;
   int hcfno = 1;
	while (fact<=10){
  		if((n1%fact==0) && (n2%fact==0)){
        
          	n1 = n1/fact;
          	n2 = n2/fact;
          	hcfno = hcfno*fact;
        
        }else{
        
          fact++;
        
        }
    }
  return hcfno;
}