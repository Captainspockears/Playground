inp = [int(k) for k in input()][::-1]

dec = inp[0]
mult = 2

for i in inp[1:]:
  dec += i*mult
  mult = mult*2

print(dec)