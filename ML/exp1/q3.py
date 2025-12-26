import numpy as np
# Usage of methods such as det(), eig() etc. 
A = np.array([[1, 2, 3],
              [4, 5, 6],
              [7, 8, 9]])

det_A = np.linalg.det(A)
print(f"Determinant: {det_A}")

eigenvalues, eigenvectors = np.linalg.eig(A)
print(f"Eigenvalues: {eigenvalues}")
print(f"Eigenvectors:\n{eigenvectors}")


inv_A = np.linalg.inv(A)
print(f"Inverse:\n{inv_A}")

rank_A = np.linalg.matrix_rank(A)
print(f"Rank: {rank_A}")

trace_A = np.trace(A)
print(f"Trace: {trace_A}")