def cal2(a,m,n,r,c,b,t):
  if((r>=m) or (c>=n) or r<0 or c<0):
    return
  if(a[r][c]=='W'):
    return
  if((b[r][c]!=-5) and (t>=b[r][c])):
    return
  b[r][c]=t
  cal2(a,m,n,r,c+1,b,t+1)
  cal2(a,m,n,r,c-1,b,t+1)
  cal2(a,m,n,r+1,c,b,t+1)
  cal2(a,m,n,r-1,c,b,t+1)
  cal2(a,m,n,r+1,c+1,b,t+1)
  cal2(a,m,n,r-1,c+1,b,t+1)
  cal2(a,m,n,r-1,c-1,b,t+1)
  cal2(a,m,n,r+1,c-1,b,t+1)
  return

def cal1(a,m,n,r,c):
  b=[0]*m
  for i in range(m):
    b[i]=[0]*n
    for j in range(n):
      b[i][j]=-5
  cal2(a,m,n,r,c,b,1)
  ma=0
  for i in range(0,m):
    for j in range(0,n):
      if((b[i][j]!=-5)and(ma<b[i][j])):
        ma=b[i][j]
  return ma


m,n=[int(x) for x in input().split()]
r,c=[int(x) for x in input().split()]
a=[]
for i in range(0,m):
  a.append(list(input().rstrip().split()))
time=cal1(a,m,n,r-1,c-1)
print(time)