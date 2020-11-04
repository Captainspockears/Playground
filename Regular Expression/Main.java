inp1 = input()
arr = [str(k) for k in input()]
unique = set(arr)

arrdict = dict(zip(unique, [0]*len(unique)))

for ele in arr:
  arrdict[ele] += 1

for k in arrdict:
  if arrdict[k] > 1:
    arrdict[k] = 1
  else:
    arrdict[k] = 0

reguni = inp1.split('+')
regdict = dict(zip(reguni, [0]*len(unique)))

for i in range(0, len(inp1)-1):
  if inp1[i+1] == '+':
    regdict[inp1[i]] = 1

if arrdict == regdict:
  print("Matched")
else:
  print("Not Matched")