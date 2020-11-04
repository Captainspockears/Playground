leng = int(input())
arr = [int(k) for k in input().split()]
pos = int(input())

newarr = []

for ind, ele in enumerate(arr, 1):
  if ind != pos:
    newarr.append(ele)

print(" ".join([str(k) for k in newarr]))