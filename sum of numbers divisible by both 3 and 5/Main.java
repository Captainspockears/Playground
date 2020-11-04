m = int(input())
n = int(input())

summ = 0

for i in range(m,n+1):
  if i%3==0 and i%5==0:
    summ += i
      
print(summ)