length = int(input())
arr = [int(k) for k in input().split()]
num = input().split()
n = int(num[0])
m = int(num[1])

for i, ele in enumerate(arr,0):
  dif = ele - n 
  
  if dif < m:
    arr[i] += 1
    
arr = " ".join([str(k) for k in arr])
print(arr)