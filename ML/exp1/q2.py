# Usage of attributes of array such as ndim, shape, size, methods such as sum(), mean(), sort(), sin() etc.
import numpy as np

arr = np.array([[1, 2, 3], [4, 5, 6]])

print("Array:")
print(arr)
print("Number of dimensions:", arr.ndim)
print("Shape of array:", arr.shape)
print("Size of array:", arr.size)
print("Sum of all elements:", np.sum(arr))
print("Mean of all elements:", np.mean(arr))
print("Sorted array:")
sorted_arr = np.sort(arr)
print(sorted_arr)
print("Sine of each element:")
sine_arr = np.sin(arr)
print(sine_arr)