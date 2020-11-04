class Tree:
  feet = 0
  inches = 0
  def __init__(self, feet, inches):
    self.feet = feet
    self.inches = inches

leng = int(input())
trees = []
for i in range(leng):
  inp = [int(k) for k in input().split()]
  feet = inp[0]
  inches = inp[1]
  t = Tree(feet, inches)
  trees.append(t)

sum = []

for tree in trees:
  total = tree.feet*12 + tree.inches
  sum.append(total)
print(max(sum))