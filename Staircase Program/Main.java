def cal(n):
  a=[1,2,3]
  if(n<3):
    return a[n-1]
  for i in range(3,n):
    a.append(a[i-1]+a[i-2])
  return a[n-1]


n=int(input())
print(cal(n))
