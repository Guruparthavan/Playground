n=int(input())
c=0
co=[0]
ind=[0]
s=[int(x) for x in input().split()][:n]
for i in range(1,n):
  if((s[i]>=s[i-1]) and (i!=(n-1))):
    c+=1
  elif((s[i]>=s[i-1]) and (i==(n-1))):
    c+=1
    co.append(c)
    ind.append(i+1)
  else:
    co.append(c)
    ind.append(i)
    c=0
a=co.index(max(co))
'''print(a)
print(co)
print(ind)'''

for i in range(ind[a-1],ind[a]):
  print(s[i],end=" ")
