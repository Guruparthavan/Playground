def chk(m,n,a):
  k=0
  c=[(0,0)]
  l=0
  val=1
  while(k<m and l<n):
    for i in range(l,n):
      if((val%11)==0):
        c.append((k,i))
      a[k][i]=val
      val+=1
    k=k+1
    for i in range(k,m):
      if((val%11)==0):
        c.append((i,n-1))
      a[i][n-1]=val
      val+=1
    n=n-1
    if(k<m):
      for i in range(n-1,l-1,-1):
        if((val%11)==0):
          c.append((m-1,i))
        a[m-1][i]=val
        val+=1
      m=m-1
    if(l<n):
      for i in range(m-1,k-1,-1):
        if((val%11)==0):
          c.append((i,l))
        a[i][l]=val
        val+=1
      l=l+1
  return c
m=int(input())
n=m
a=[[0]*m for i in range(n)]
cd=chk(m,n,a)
for i in range(m):
  for j in range(n):
    print(a[i][j],end="\t")
  print()
print("Total Power points :",len(cd))
for i in range(0,len(cd)):
  print(cd[i])