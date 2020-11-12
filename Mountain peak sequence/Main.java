def cal(n):
  s=2
  if(n>2):
    if(n==3):
      return s
    else:
      for i in range(1,n-2):
        s=((s*2)+2)%10000000007
      return s
  else:
    return 0

n=int(input())
print(cal(n))
