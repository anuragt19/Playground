#include<iostream>
int main()
{
  int stones,remainder;
  std::cin>>stones;
  remainder=stones%2;
  if(remainder==0)
    std::cout<<"Possible";
  else
    std::cout<<"Not possible";
}