#include <iostream>
int main() 
{
	// Type your code here
  int n,r_number=0,remainder;
  std::cin>>n;
  while(n!=0)
  {
    remainder=n%10;
    r_number=r_number*10+remainder;
    n=n/10;
  }
    std::cout<<r_number;
	return 0;
}