def checkpal(a):
  mid = int(len(a)/2)
  
  if len(a)%2==0:
    list1 = a[0:mid]
    list2 = a[mid:]
  else:
    list1 = a[0:mid]
    list2 = a[mid+1:]

  if list1 == list2[::-1]:
    return True
  return False

def numtolist(a):
  return [int(k) for k in str(a)]

a = int(input())
b = int(input())
pallist = []

for i in range(a,b+1):
  if checkpal(numtolist(i)):
    pallist.append(i)
    
print(" ".join([str(k) for k in pallist]))