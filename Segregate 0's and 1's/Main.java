a = int(input())
arr = [int(k) for k in input().split()]

zero = 0
one = 0

for i in arr:
  if i==0:
    zero += 1
  else:
    one += 1

stri = "0"*zero + "1"*one    
print(stri)