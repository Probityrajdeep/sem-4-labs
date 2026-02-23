import sympy as sp
import numpy as np
import matplotlib.pyplot as plt
x = sp.symbols('x')
x,y = sp.symbols('x y')
x,y,z= sp.symbols('x y z')

f=x**2 + 3*x + 2
print(f)

print(" ")
f = x**2 + 4*x*y + y**2
print(f)