a = int(input())
sum = 0
elelist = []

for i in range(1, 11):
  ele = a*i
  elelist.append(ele)
  sum += ele
  
print(" ".join([str(k) for k in elelist]))
print(sum)