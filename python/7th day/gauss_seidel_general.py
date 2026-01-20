def gauss_sedial(A, B,ite):
    n = len(A)
    x = [0,0]*n

    for _ in range(ite):
        for i in range(n):
            d=B[i]
            for j in range(n):
                if j != i:
                    d -= A[i][j] * x[j]
        x[i] = d / A[i][i]
    return x
A,B = [[4, -1, 0], [-1, 4, -1], [0, -1, 4]], [3, 7, 5]
ite=10000
x,y,z = gauss_sedial(A, B, ite)
print("The value of x,y,z are:", x[0], x[1], x[2])

        