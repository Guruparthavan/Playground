k,n,t=[int(x) for x in input().split()]
c=0
f=[]
for i in range(n):
  f.append(list(map(int,input().split())))
p=[int(x) for x in input().split()]
r=[int(x) for x in input().split()]
for i in range(n):
  z=0
  for j in range(n):
    f[i][j]=f[i][j]*p[z]
    z+=1
for i in range(n):
  v=p[i]
  tc=v*r[i]
  for j in range(n):
    if(v>=k and tc<=t):
      c+=1
      break
    tc+=f[i][j]*r[i]
    v+=f[i][j]
  v=0
  tc=0
print(c)