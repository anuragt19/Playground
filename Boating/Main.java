#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int b_weight,n_adults,n_childrens;
  std::cin>>b_weight;
  std::cin>>n_adults;
  std::cin>>n_childrens;
  if((b_weight) > ((n_adults*75)+(n_childrens*30)))
    std::cout<<"Boat is stable";
  else if((b_weight)==((n_adults*75)+(n_childrens*30)))
    std::cout<<"Boat is stable";
  else
    std::cout<<"Boat will drow";
}