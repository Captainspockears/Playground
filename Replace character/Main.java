inp = input()

s = inp.split()[0]
ch1 = inp.split()[1]
ch2 = inp.split()[2]

news = ''

for ch in s:
  if ch==ch1:
    news = news + ch2
  elif ch==ch2:
    news = news + ch1
  else:
    news = news + ch
    
print(news)