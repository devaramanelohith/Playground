#include <bits/stdc++.h>
using namespace std;

int main() 
{
  int a,b[15],i=0,n=0;
  cin>>a;
  while(a!=0)
  {
    b[i++] = a%10;
    a /= 10;
    n++;
  }
  sort(b,b+n);
  for(int i=0;i<n;i++)
  {
    cout<<b[i]<<" ";
  }
    return 0;
}