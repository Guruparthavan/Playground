h=int(input())
hl=[int(x) for x in input().split()]
b=int(input())
bl=[int(x) for x in input().split()]
c=[0]*h
for i in range(h):
  c[i]=i+1
#print(c)
#hl=hl[::-1]
#c=c[::-1]
for i in range(b):
  d=0
  for j in range(h-1,-1,-1):
    if(c[j]!=0 and hl[j]>=bl[i]):
      d=d+1
      print(j+1,end=" ")
      c[j]=c[j]-1
      break
  if(d==0):
    print("0",end=" ")