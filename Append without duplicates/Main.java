l = []

while 1:
  ele = int(input())
  
  if ele < 0:
    break
  
  if ele not in l:
    l.append(ele)

if len(l) == 0:
  print("List is empty")
  exit()
    
for i in l:
  print(i)