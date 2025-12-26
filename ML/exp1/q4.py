# Consider a list data type(1D) then reshape it into2D, 3D matrix using numpy 
import numpy as np
print("\n---- Reshaping Arrays ----")
lst = [1, 2, 3, 4, 5, 6]

arr1D = np.array(lst)
arr2D = arr1D.reshape(2, 3)
arr3D = arr1D.reshape(1, 2, 3)

print("1D Array:", arr1D)
print("2D Array:\n", arr2D)
print("3D Array:\n", arr3D)
