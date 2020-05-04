#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int b_year,c_year,c_age;
  std::cin>>b_year;
  std::cin>>c_year;
  if(c_year==00)
    std::cout<<100-b_year;
  else if(b_year>c_year)
    std::cout<<((100-b_year)+c_year);
  else
    std::cout<<c_year-b_year;
  
  
}