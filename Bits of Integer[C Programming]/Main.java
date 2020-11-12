#include<stdio.h>
int dec_to_bin(int n)
{
  int c=0;
   while(n>0)
   {
     n=n/2;
     c++;
}
  return c;
}
int main()
{
    int n;
    scanf("%d",&n);
    printf("%d",dec_to_bin(n));
}
