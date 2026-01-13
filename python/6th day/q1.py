import numpy as np
A = np.array([[4, 1], [5, -2]])
B = np.array([50, 30])

det=np.linalg.det(A)
print("Determinant of A= {int(det)}")
x,y= np.linalg.solve(A,B)
print(f"Solution: x={int(x)}, y={int(y)}")