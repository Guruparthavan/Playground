p=int(input())
t=int(input())
n1=int(input())
emia=[0]*n1
z=0
while(n1>0):
  n1=n1-1
  a,b=[float(x) for x in input().split()]
  emia[z]=p*(b/12)/(1-1/(1+(b/12))**(a*12))
  emia[z]=emia[z]*12*a
  z=z+1
y=0
n2=int(input())
emib=[0]*n2
while(n2>0):
  n2=n2-1
  a,b=[float(x) for x in input().split()]
  emib[y]=p*(b/12)/(1-1/(1+(b/12))**(a*12))
  emib[y]=emib[y]*12*a
  y=y+1
if(sum(emia)>sum(emib)):
  print("Bank B")
else:
  print("Bank A")