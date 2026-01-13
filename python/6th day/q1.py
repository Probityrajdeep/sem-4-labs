import numpy as np
A = np.array([[1, 1], [1, -1]])
B = np.array([3, 1])

DET=np.linalg.det(A)
print("Determinant of A= {int(DET)}")
x,y= np.linalg.solve(A,B)
print(f"Solution: x={int(x)}, y={int(y)}")