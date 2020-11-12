import math
s=int(input())
a=s
n=int(input())
r=float(input())
r=r/float(1200)
#print(p)
for i in range(n):
  s=a+s/(1+r)
  #print(s)
s=s-a
z=math.ceil(s-0.5)
if(z>s):
  z=math.ceil(s)
else:
  z=math.floor(s)
print(z)