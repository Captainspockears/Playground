i = int(input())

for a in range(1,i+1):
  print("*", end =" ")

print()
  
for a in range(1,i-1):
  print("*", end=" ")
  b = " " * ((i-2) + (i-2))
  print(b, end="")
  print("*", end="\n")
  
for a in range(1,i+1):
  print("*", end =" ")  