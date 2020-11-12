t=int(input())
if(t>0 and t<11):
  while(t>0):
    t=t-1
    n=int(input())
    s=[int(x) for x in input().split()]
    if(n>0 and n<=10000):
      #s.sort()
      su=0
      for i in range(0,n):
        su=su+s[i]*(n-i)
      print(su-s[0])
    else:
      print("Invalid Input")
else:
  print("Invalid Input")