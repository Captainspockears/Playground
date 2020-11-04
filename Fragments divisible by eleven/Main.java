ele = int(input())

elelist = [int(k) for k in str(ele)]

l = []

for ind, i in enumerate(elelist):
  currlist = elelist[ind:]
  while currlist != []:
    add = l.append(''.join([str(k) for k in currlist]))
    currlist.pop()

final = [int(k) for k in set(l)]

count = 0

for i in final:
  if i%11==0:
    count += 1
    
print(count)