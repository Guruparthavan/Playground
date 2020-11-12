t=int(input())
while(t>0):
  t=t-1
  n=int(input())
  x=[int(s) for s in input().split()][:n]
  a=[]
  for i in range(n):
    a.append(i+1)
  c=a
  b=[0]*n
  z=0
  while(1):
    for i in range(n):
      b[x[i]-1]=a[i]
    a=b
    b=[0]*n
    z=z+1
    #print(a)
    if(a==c):
      print(z)
      break
    