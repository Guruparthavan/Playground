import math
d1=int(input())
d2=int(input())
v1=int(input())
v2=int(input())
if(v1>0 and v2>0 and d1>0 and d2>0):
  ca=[0]*(max(d1//v1,d2//v2)+3)
  for i in range(len(ca)):
    ca[i]=math.sqrt(d1*d1+d2*d2)
    d1-=v1
    d2-=v2
  print(round(min(ca),11))
else:
  print("Invalid Input")