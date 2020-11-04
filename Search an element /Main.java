length = int(input())
arr = [int(k) for k in input().split()]
ele = int(input())

for index,i in enumerate(arr, 0):
  if i==ele:
    print("index = {}".format(index))
    exit()
    
print(-1)
    