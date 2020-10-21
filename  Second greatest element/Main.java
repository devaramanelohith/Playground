#include <bits/stdc++.h>
using namespace std;

int main() 
{
  int i=0,first,second,n;
  cin>>n;
  int arr[n];
  if(n<2)
  {
    cout<<"Invalid Input";
    return 0;
  }

  for(int i=0;i<n;i++)
 {
   cin>>arr[i];
 }
  int largest = second =INT_MIN;
  
  //find the largest element
  for(int i=0;i<n;i++)
  {
    largest = max(largest,arr[i]);
  }
  for(int i=0;i<n;i++)
  {
    if(arr[i] != largest)
      second = max(second,arr[i]);
  }
  if(second==INT_MIN)
    cout<<"There is no second largest element";
  else
    cout<<second;
    return 0;
}