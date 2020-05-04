#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  //Type your code here.
  int x,y;
  double total_jumps,jumps1;
  std::cin>>x;
  std::cin>>y;
  total_jumps= ((x-3)*(x-3))+((y-4)*(y-4));
  jumps1=sqrt(total_jumps);
  int jumps= jumps1;
  std::cout<<jumps;
}