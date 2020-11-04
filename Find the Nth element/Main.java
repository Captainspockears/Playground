length = int(input())
arr = [int(k) for k in input().split()]
pos = int(input())

if pos>length:
  print("No node found")
else:
  print(arr[pos-1])