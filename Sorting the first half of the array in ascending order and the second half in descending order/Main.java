def asc(a):
  for i in range(0, len(a)):
    for j in range(i+1, len(a)):
      if a[i]>a[j]:
        a[i], a[j] = a[j], a[i]
  return a
  
def des(a):
  for i in range(0, len(a)):
    for j in range(i, len(a)):
      if a[i]<a[j]:
        a[i], a[j] = a[j], a[i]
  return a
  
leng = int(input())
if leng == 0:
  print("")
  exit()
arr = [int(k) for k in input().split()]
mid = int(leng/2)

if leng%2==0:
  arr1 = arr[0:mid]
  arr2 = arr[mid:]
  
  arr1 = asc(arr1)
  arr2 = des(arr2)
  
  arr = arr1 + arr2
  
else:
  arr1 = arr[0:mid]
  arr2 = arr[mid:]
  
  arr1 = asc(arr1)
  arr2 = des(arr2)
  
  arr = arr1 + arr2
  
print(" ".join([str(k) for k in arr]))