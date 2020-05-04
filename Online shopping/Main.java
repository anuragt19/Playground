#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int f_ashirt,f_discount,f_shipping;
  int s_ashirt,s_discount,s_shipping;
  int a_ashirt,a_discount,a_shipping;
  int f_tcost,s_tcost,a_tcost;
  std::cin>>f_ashirt>>f_discount>>f_shipping;
  std::cin>>s_ashirt>>s_discount>>s_shipping;
  std::cin>>a_ashirt>>a_discount>>a_shipping;
  f_tcost=(f_ashirt-(f_ashirt)*(f_discount*0.01))+f_shipping;
  s_tcost=(s_ashirt-(s_ashirt)*(s_discount*0.01))+s_shipping;
  a_tcost=(a_ashirt-(a_ashirt)*(a_discount*0.01))+a_shipping;
  std::cout<<"In Flipkart Rs."<<f_tcost;
  std::cout<<"\nIn Snapdeal Rs."<<s_tcost;
  std::cout<<"\nIn Amazon Rs."<<a_tcost<<"\n";
  if(f_tcost<s_tcost && f_tcost<a_tcost)
    std::cout<<"He will prefer Flipkart";
  else if(s_tcost<f_tcost && s_tcost<a_tcost)
    std::cout<<"He will prefer Snapdeal";
  else if(s_tcost==f_tcost && f_tcost>a_tcost && s_tcost>a_tcost)
    std::cout<<"He will prefer Amazon";
  else if(s_tcost==f_tcost && f_tcost<a_tcost && s_tcost<a_tcost)
    std::cout<<"He will prefer Flipkart";
  else
    std::cout<<"He will prefer Amazon";
}