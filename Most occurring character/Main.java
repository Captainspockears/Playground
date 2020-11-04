s = input().lower()

maxkey = ''
maxvalue = 0

sdict = dict(zip(list(s), [0]*len(s)))

for char in s:
  sdict[char] += 1
  
for char in s:
  v = sdict[char]
  if v > maxvalue:
    maxvalue = v
    maxkey = char

#print(sdict)
print(maxkey)