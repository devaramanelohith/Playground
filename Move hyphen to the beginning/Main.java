#include <bits/stdc++.h>
using namespace std;

int main() 
{
  string str;
  int n,count=0;
  cin>>str;
  n = str.length();
  string output="";
  for(int i=0;i<n;i++)
  {
    if(str[i]=='-')
    {
      count+=1;
    }
    else
    {
      output+=str[i];
    }
  }
  while(count)
  {
    cout<<'-';
    --count;
  }
  cout<<output;
    return 0;
}