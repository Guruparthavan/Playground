t=int(input())
s=float(input())
t=float(t)
a=float((t*s*60)/360)
h=int(a//60)
m=int(a-(h*60))
h=h%12
an=(11*m/2)-30*h
if(an<0):
  an=an+360
if(an>180):
  an=360-an
print("{:.2f}".format(an))