n = int(input())
arr = [int(k) for k in input().split()]
k = int(input())

def maxpile(arr):
  maxnum = 0
  maxind = 0
  
  for i, a in enumerate(arr):
    if a > maxnum:
      maxnum = a
      maxind = i
      
  return maxind

for i in range(0,k):
  ind = maxpile(arr)
  arr[ind] = int(arr[ind]**0.5)
  
print(sum(arr))