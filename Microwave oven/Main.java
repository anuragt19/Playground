#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n_items;
  float h_time;
  std::cin>>n_items;
  std::cin>>h_time;
  if(n_items==2)
    std::cout<<(h_time)*(1.500);
  else if(n_items==3)
    std::cout<<2*h_time;
  else if(n_items>3)
    std::cout<<"Number of items is more";
}
