#include<stdio.h>
int pattern(int n)
{
  int i,j;
   for(i=1;i<=n;i++)
   {
     for(j=1;j<=n;j++)
     {
       if(i==1  || j==1 || i==n  || j==n)
         printf("%d",1);
       else
         printf(" ");
     }
     printf("\n");
   }
}
void main()
{
    int n;
    scanf("%d",&n);
    pattern(n);
}
