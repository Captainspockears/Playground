string = input()
rev = string[::-1]

mid = int(len(string)/2)
if string[:mid] == string[mid+1:]:
  print("NULL")
  exit()

count = 0
i = 0

#print(string, rev)

for ele in string:
  #print(ele, rev[i])
  if ele == rev[i]:
    i += 1
  else:
    count += 1
    
out = string[:count][::-1]
print(out)