#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n_students,n_handshakes;
  std::cin>>n_students;
  n_handshakes=n_students*(n_students-1)/2;
  std::cout<<n_handshakes;
}