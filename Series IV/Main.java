#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,i;

scanf("%d",&n);

for(i=1;i<=n;i++)

{

 if(i%2!=0)

  printf("%d ",(i*i)-1);

 else

  printf("%d ",(i*i)-2);

}
}


