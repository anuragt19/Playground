#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int c_units,cost;
  std::cin>>c_units;
  if(c_units<=200)
    cost=c_units*0.5;
  else if(c_units>200 && c_units<=400)
    cost=c_units*0.65+100;
  else if(c_units>400 && c_units<=600)
    cost=c_units*0.80+200;
  else
    cost=c_units*1.25+425;
 
  std::cout<<"Rs."<<cost;
}