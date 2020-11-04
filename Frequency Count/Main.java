def sorts(s):
  t = []
  l = len(s)
  
  for i in range(0,l):
    for j in range(0,l):
      if s[i]<s[j]:
        s[i], s[j] = s[j], s[i]

  return s

s = [k for k in input()]

d = dict(zip(set(s), [0]*len(s)))

for c in s:
  d[c] += 1

s = list(set(s))
s = sorts(s)
  
for c in s:
  print("{}{}".format(c,d[c]), end="")