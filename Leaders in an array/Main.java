def isleader(lead, arr):
  #print(lead, arr)
  if len(arr)==0:
    return True
  for i in arr:
    if i>lead:
      return False
  return True

t = int(input())

for i in range(0,t):
  
  l = int(input())
  arr = [int(k) for k in input().split()]
  leaders = []
  
  for ind, ele in enumerate(arr):
    if isleader(ele, arr[ind+1:]):
      leaders.append(ele)
      
  for leader in leaders:
    print(leader, end=" ")
    
  print()
      