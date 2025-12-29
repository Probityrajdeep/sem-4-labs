# Find eigen value and eigen vector of a matrix using scipy
from scipy import linalg

print("\n---- Eigen using SciPy ----")
eig_val_sp, eig_vec_sp = linalg.eig(matrix)

print("Eigen Values:", eig_val_sp)
print("Eigen Vectors:\n", eig_vec_sp)

print("\n---- Program Completed Successfully ----")
