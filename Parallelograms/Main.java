n=int(input())
a=[int(item) for item in input().split()][:n]
b=set(a)
c=[]
for i in b:
  if(a.count(i)>1):
    c.append(a.count(i))
res=0
for i in range(0,len(c)):
  for j in range(i+1,len(c)):
    res=res+(((c[i]*(c[i]-1))/2)*((c[j]*(c[j]-1))/2))
print(int(res))