#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float mileage;
  int l_petrol,distance;
  std::cin>>mileage>>l_petrol>>distance;
  int m_mileage=mileage*l_petrol;
  if(m_mileage >= distance)
    std::cout<<"Can reach";
  else
    std::cout<<"Cannot reach";
}