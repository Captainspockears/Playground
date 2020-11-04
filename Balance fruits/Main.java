list = [int(k) for k in input().split()]
a, m, rs = list[0], list[1], list[2]

if a>m:
  buy = a-m
  out = rs - buy
else:
  sell = m-a
  out = rs + sell
  
print(out)