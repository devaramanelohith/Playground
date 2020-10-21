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

int hcf(int a, int b)
{
   //Type your code here
  if(a==0)
    return b;
  if(b == 0)
    return a;
  
  if(a == b)
    return a;
  
  if(a>b)
    return hcf(a-b,b);
  return hcf(a,b-a);
}