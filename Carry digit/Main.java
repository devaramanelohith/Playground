#include <bits/stdc++.h>
using namespace std;

int main() 
{
   int carry = 0, sum, p, q, count = 0,num1,num2;
  cin>>num1>>num2;

    while((num1!=0)&&(num2!=0))

    {

        p = num1 % 10;

        q = num2 % 10;

        sum = carry + p + q;

        if(sum>9)

        {

            carry = 1;

            count++;

        }

        else

        {

            carry = 0;

        }

        num1 = num1/10;

        num2 = num2/10;

    }
  cout<<count;

   
    return 0;
}