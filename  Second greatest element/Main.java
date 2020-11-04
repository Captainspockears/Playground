def findsec(arr):
  first = arr[0]
  second = arr[1]

  if second > first:
    first, second = second, first

  for ele in arr[2:]:
    #print(ele, first, second)
    if ele > first:
      second = first
      first = ele
      #print(first, second)
    elif ele > second:
      second = ele
      #print(first, second)
      
  return first, second

length = input()
arr = [int(k) for k in input().split()]

if len(arr) < 2:
  print("Invalid Input")
  exit()

first, second = findsec(arr) 

if first == second:
  print("There is no second largest element")
else:
  print(second)