#include <bits/stdc++.h>
using namespace std;

int main() 
{
  string str;
  char ch1,ch2;
  cin>>str>>ch1>>ch2;
  int i;
 int n=str.length();
  for(int i=0;i<n;i++)
  {
    if(str[i]==ch1)
    {
      str[i]=ch2;
    }
    else if(str[i]==ch2)
    {
      str[i]=ch1;
    }
  }
  cout<<str;
    return 0;
}