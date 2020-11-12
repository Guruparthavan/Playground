def cal():
  try:
    r1,r2,n=[int(x) for x in input().split()]
    if(r1<=r2 and n>0 and r1>0 and r1<1000000 and r2>0 and r2<1000000):
      s=0
      c=0
      while(1):
        s=s+1
        a=s*(2*s-1)
        #print(a)
        if(a>=r1 and a<=r2):
          c+=1
        if(c==n):
          print(a)
          return
        if(a>r2):
          print("No number is present at this index")
          return
    else:
      print("Invalid Input")
  except:
    print("Invalid Input")
cal()
