inp = int(input())

res = inp
binlist = []

while res >= 1:
  quo = int(res/2)
  rem = res%2
  binlist.append(rem)
  res = quo

binlist = binlist[::-1]
binstr = str(''.join([str(k) for k in binlist]))
print(binstr)