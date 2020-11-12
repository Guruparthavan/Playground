from itertools import permutations
def cal(a,b):
  if(len(a)<len(b)):
    print(-1)
    return
  else:
    per=permutations(a)
    for i in list(per):
      d=''.join(i)
      if(d>b):
        print(d)
        return
    print(-1)
v,c=(input().split())
v=int(v)
c=int(c)
a=str(v)
b=str(c)
a=''.join(sorted(a))
cal(a,b)

 
