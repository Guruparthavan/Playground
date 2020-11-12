n=int(input())
t=int(input())
a=[]
su=[]
w=[]
for i in range(n):
  a.append([int(j) for j in input().split()])
for i in range(n):
  su.append(0)
  w.append(0)
for j in range(2,t+1,2):
  ma=[]
  for i in range(n):
    su[i]=su[i]+((a[i][j-2]+a[i][j-1])*a[i][t])
    ma.append(su[i])
  v=max(ma)
  for i in range(n):
    if(v==ma[i]):
      w[i]=w[i]+1
ans=0
res=0
for i in range(n):
  if(ans<w[i]):
    ans=w[i]
    res=i
print(res+1)