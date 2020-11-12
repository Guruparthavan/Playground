t=int(input())
while(t):
  t=t-1
  a=input()
  b=input()
  x=[0]*150
  for i in b:
    x[ord(i)]+=1
  res=""
  for i in a:
    while(x[ord(i)]!=0):
      res=res+str(i)
      x[ord(i)]-=1
  print(res)
#print(x)