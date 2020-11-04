def MoveHyphen(s):
  news = ''
  count = 0
  for char in s:
    if char=='-':
      count += 1
    else:
      news = news + str(char)
      
  news = str('-'*count) + news
  return news

s = input()
print(MoveHyphen(s))
      
      