#include<bits/stdc++.h>
using namespace std;

int main()
{  
unsigned long long int fact = 1, n, i;
cin>>n;

for(i =1; i <= n; i++)
{
     fact = fact * i;
}

cout<<fact;  
return 0;
}
