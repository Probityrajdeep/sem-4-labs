import math
def diagonally_dominant(A):
    n = len(A)

    for i in range(n):
        diag_ele =abs(A[i][i])
        diag_sum = sum(abs(A[i][j]) for j in range(n) if j != i)
        if diag_ele < diag_sum:
            return False
    return True

A=[[1, 2, 3],[4, 5, 6],[7, 8, 9]]
print("diagonally dominant:", diagonally_dominant(A))