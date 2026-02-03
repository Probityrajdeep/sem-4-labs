import numpy as np
def power_method(A,X0,n):
    X = X0              # initial non-zero vector
    for i in range(n):
        X = np.dot(A, X)
        X = X / np.linalg.norm(X)   # normalize the x(mandatory)
    AX = np.dot(A, X)
    eigenvalue = np.dot(AX,X) / np.dot(X,X) # Rayleigh quotient
    return eigenvalue, X

A=np.array([[2,-12],[1,-5]]) # for example-1
X0=np.array([[1],[1]]) # OR X=np.random.rand(2,1)
n = 10000

max_eigenvalue,max_eigenvector = power_method(A,X0,n)
print(max_eigenvalue)
print(max_eigenvector)
