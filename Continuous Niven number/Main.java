def cal(v,b):
  ta=v
  z=[]
  while(v>0):
    z.append(v%b)
    v=v//b
  z.append(v)
  z1=0
  for i in range(len(z)-1,-1,-1):
    z1=z1*10+z[i]
    
    
  return int(z1)
def sod(k):
  su=0
  while(k>0):
    h=k%10
    su=su+h
    k=k//10
  return su
v,c=[int(x) for x in input().split()]
if(1):
  i=v
  co=0
  while(1):
    p=cal(i,v)
    cv=sod(p)
    #print(i," ",cv,p%cv)
    
    if(i%cv==0):
      co=co+1
    else:
      if(co==c):
        print(cal(i-c,v))
        break
      co=0
    i=i+1
else:
  print("Invalid Input")