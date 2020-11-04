l = int(input())
arr = [int(k) for k in input().split()]

odd = [arr[k] for k in range(0,l) if k%2==0]
even = [arr[k] for k in range(0,l) if k%2!=0]

even = even[::-1]

arr = odd + even

for i in arr:
  print(i, end=" ")