n=int(input())
a=[]
c=0
for i in range(n):
  a.append(int(input()))
t=int(input())
for i in range(n):
  for j in range(i+1,n):
    for k in range(j+1,n):
      #print(i,j,k)
      if((a[i]+a[j]+a[k])==t):
        c=1
        break
if(c==0):
  print("FALSE")
else:
  print("TRUE")
  