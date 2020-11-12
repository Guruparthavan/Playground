n=int(input())
a=input()
a=list(a)
a.sort()
for i in a:
  if(i!=" "):
    print(i,end="")