import sys
def cal(can,m,v):
  table=[0]*(v+1)
  for i in range(1,v+1):
    table[i]=sys.maxsize
  for i in range(1,v+1):
    for j in range(m):
      if(can[j]<=i):
        z=table[i-can[j]]
        if(z!=sys.maxsize and z+1<table[i]):
          table[i]=z+1
  return table[v]
      


t=int(input())
while(t>0):
  t=t-1
  v=int(input())
  can=[1,5,7,10]
  m=4
  print(cal(can,m,v))
  