c = int(input())
a = int(input())
b = int(input())

switcher = {1: int(a+b),
           2: int(a-b),
           3: int(a*b),
           4: int(a/b)}

ans = switcher.get(c, "-1")

print(ans)