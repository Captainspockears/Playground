s = input()
mask = input()
news = []

for c in s:
  if c not in mask:
    news.append(c)
    
news = "".join(news)

print(news)