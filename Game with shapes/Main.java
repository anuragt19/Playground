#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,s;
  std::cin>>r>>s;
  if(s>=(2*r))
    std::cout<<"circle can be inside a square";
  else
    std::cout<<"circle cannot be inside a square";
}