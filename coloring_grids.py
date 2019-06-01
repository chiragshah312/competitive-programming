# 1 x n grid, k colors. Determine the number of ways to color each cell if for any vertical line that divides the grid
# into two non-empty parts, the number of distinct colors on the right side must be equal to the number of distinct colors
# on the left side.
# e.g. input1 : 3 2
# output1 : 2
# input2 : 23455 235 
# output2 : 235


N = input().split(' ')
K = int(N[1])
N = int(N[0])
if N == 2:
    print((K * (K-1)) + K)
else:
    print(K)
