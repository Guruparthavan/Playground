def pri(n):
  if(n==1):
    return 0
  if(n==2):
    return 1
  if(n>2):
    for i in range(2,n//2+1):
      if (n%i==0):
        return 0
    return 1
def cal(m):
  while(m!=1 and m!=4):
    m=str(m)
    s=0
    for i in range(0,len(m)):
      s=s+int(m[i])**2
    m=int(s)
  if(m==1):
    return 1
  if(m==4):
    return 0
r1=int(input())
r2=int(input())
a=int(input())
b=[]
if(r1<=r2 and r1>0 and a>0):
  for i in range(r1,r2+1):
    if(pri(i)):
      #print(i)
      if(cal(i)==1):
        if(len(b)<a):
          b.append(i)
        if(len(b)==a):
          print(i)
          break
  if(a>len(b)):
    print("No number is present at this index")
else:
  print("Invalid Input")