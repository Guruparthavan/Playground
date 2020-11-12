a=input()
a=list(a)
a.sort()
b=input()
b=list(b)
b.sort()
if(a==b):
  print("Anagram")
  #print(a,b)
else:
  print("Not anagrams")