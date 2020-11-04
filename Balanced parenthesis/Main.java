def ispair(a,b):
  if a=="{" and b=="}":
    return True
  elif a=="[" and b=="]":
    return True
  elif a=="(" and b==")":
    return True
  return False

s = [k for k in input()]

stack = []
stackp = 0

for i, c in enumerate(s):
  #print(stack, stackp, c)
  
  if stackp < 0:
    stackp = 0
    stack.append(c)
    continue

  if i==0:
    stack.append(c)
    continue
    
  if ispair(stack[stackp], c):
    stack.pop(stackp)
    stackp -= 1
  else:
    stack.append(c)
    stackp += 1

if len(stack)==0:
  print("Balanced")
else:
  print("Not Balanced")