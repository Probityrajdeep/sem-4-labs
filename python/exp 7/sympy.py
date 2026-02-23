import sympy as sp
import numpy as np
import matplotlib.pyplot as plt
x, y = sp.symbols('x y')
sol = sp.solve(x**2 -49, x)
print(sol)
print(" ")

eq1= x+y-3
eq2= 2*x-y-4
sol = sp.solve((eq1, eq2), (x, y))
print(sol)
