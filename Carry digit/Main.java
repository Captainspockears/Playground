def findCarry(a, b):
  #print(a,b)
  a = a[::-1]
  b = b[::-1]
  carry = 0
  count = 0
  for i, item in enumerate(a, 0):
    #print(int(item), int(b[i]), carry)
    if (int(item) + int(b[i]) + carry) >= 10:
      carry = 1
      count += 1
      #print(count)
    else:
      carry = 0
      
  return count

def pad(s, x):
  n = len(s)
  dif = x-n
  newlist = ['0'] * dif
  newlist.extend(s)
  return newlist

nums = input()
num1 = nums.split()[0]
num2 = nums.split()[1]

x = len(num1)
y = len(num2)

list1 = list(str(num1))
list2 = list(str(num2))

if x>y:
  list2 = pad(list2, x)
  ans = findCarry(list1, list2)
elif y>x:
  list1 = pad(list1, y)
  ans = findCarry(list2, list1)
else:
  ans = findCarry(list1, list2)
  
print(ans)