leng = int(input())
arr = [int(k) for k in input().split()]

inp = input().split()
pos = int(inp[0])-1
ele = int(inp[1])

newlist = arr[:pos] + [ele] + arr[pos:]

string = ' '.join([str(k) for k in newlist])    
print(string)