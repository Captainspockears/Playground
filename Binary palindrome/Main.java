def tobin(ele):
  b = []
  rem = 0
  
  while ele>0:
    rem = ele%2
    b.append(rem)
    ele = ele//2
  
  b = b[::-1]
  return b

ele = int(input())
ele = tobin(ele)
l = len(ele)

if l%2==0:
  mid = l//2
  fir = ele[:mid]
  sec = (ele[mid:])[::-1]

  if fir==sec:
    print("Yes")
  else:
    print("No")
else:
  mid = (l//2)
  fir = ele[:mid]
  sec = (ele[mid+1:])[::-1]
  
  if fir==sec:
    print("Yes")
  else:
    print("No")