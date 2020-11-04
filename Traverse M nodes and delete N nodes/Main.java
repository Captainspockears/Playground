l = int(input())

s = input().split()
m = int(s[0])
n = int(s[1])

arr = [int(k) for k in input().split()]

ans = []

count=0

for i,e in enumerate(arr):
  if count<m:
    ans.append(e)
    count += 1
    continue
  if (count-m+1)==n:
    count=0
    continue
  count += 1
    
for i in ans:
  print(i, end=" ")