t = int(input())

def checkRegex(full, sub, l):
  for i, c in enumerate(full):
    if c==sub[0]:
      if full[i:i+l] == sub:
        return True
  return False

for i in range(0,t):
  s = input().split()
  full = s[0]
  sub = s[1]
  l = len(sub)
  
  if checkRegex(full, sub, l):
    print("Yes")
  else:
    print("No")
    
      
    