#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int P,R,T;
  double intrest,amount,discount,settlement;
  std::cin>>P;
  std::cin>>R;
  std::cin>>T;
  intrest=(P*R*T)/100;
  amount=P + intrest;
  discount=intrest*0.02;
  settlement=amount-discount;
  std::cout<<intrest<<"\n";
  std::cout<<amount<<"\n";
  std::cout<<discount<<"\n";
  std::cout<<settlement<<"\n";
}