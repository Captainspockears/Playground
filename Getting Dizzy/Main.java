#m[y][x]

def move(m, dir="r"):
  ser = []
  x = len(m[0])
  y = len(m)
  
  if dir=="r":
    for i in range(0,x):
      ser.append(m[0][i])
    m = m[1:][:]
    return (ser, m)
  elif dir=="l":
    for i in range(x-1,-1,-1):
      ser.append(m[y-1][i])
    m = m[:-1][:]
    return (ser, m)
  elif dir=="u":
    for i in range(y-1,-1,-1):
      ser.append(m[i][0])
    for row in m:
      del row[0]
    return (ser, m)
  else:
    for i in range(0,y):
      ser.append(m[i][x-1])
    for row in m:
      del row[x-1]
    return (ser, m)

l = int(input())
m = []

for i in range(0,l):
  m.append([int(k) for k in input().split()])

mid = l//2
ser = []

'''
(s, m) = move(m, dir="r")
print(s,m)
(s, m) = move(m, dir="d")
print(s,m)
(s, m) = move(m, dir="l")
print(s,m)
(s, m) = move(m, dir="u")
print(s,m)
(s, m) = move(m, dir="r")
print(s,m)
'''

directions = ["r", "d", "l", "u"]
dirite = iter(directions)

while len(m) != 0:
  try:
  	direction = next(dirite)
  except:
    dirite = iter(directions)
    direction = next(dirite)
  (s, m) = move(m, dir=direction)
  ser = ser + s
  
for i in ser:
  print(i, end=" ")