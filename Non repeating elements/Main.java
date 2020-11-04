lengths = input()
len1 = int(lengths.split()[0])
len2 = int(lengths.split()[1])

arr1 = [int(k) for k in input().split()]
arr2 = [int(k) for k in input().split()]

unique = []

for ele in arr1:
  if ele not in arr2:
    unique.append(ele)
  else:
    arr2.remove(ele)

unique.extend(arr2)    
    
print(' '.join([str(k) for k in unique]))
print(len(unique))
    
