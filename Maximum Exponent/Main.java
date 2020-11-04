def findexp(n):
  count = 0
  while n%2==0:
    count += 1
    n /= 2
  return count  
  
a = int(input())
b = int(input())
maxexp = 0
maxnum = a

for i in range(a, (b+1)):
  exp = findexp(i)
  if exp>maxexp:
    maxexp = exp
    maxnum = i

print(maxnum)