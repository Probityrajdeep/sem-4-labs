# Find the determinant of a matrix using scipy 
import numpy as np
from scipy import linalg
print("\n---- Determinant using SciPy ----")
matrix_scipy = np.array([[2, 1],
                         [5, 3]])

det_scipy = linalg.det(matrix_scipy)

print("Matrix:\n", matrix_scipy)
print("Determinant:", det_scipy)

