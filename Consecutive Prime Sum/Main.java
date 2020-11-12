import math
def g(n):
  for j in range(2,int(math.sqrt(n))+1):
    if(n%j==0):
      return 0
  else:
    return 1
r=int(input())
c=0
su=2
m=r
if(r>1000000 and r<100000000):
  r=r//1000
if(r>100000000):
  r=r//10000

for i in range(3,r+1):
  if(g(i)):
    su=su+i
    if(g(su) and su<=m):
      c=c+1
      #print(su)
print(c)