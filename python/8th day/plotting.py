import numpy as np
import matplotlib.pyplot as plt
x = np.linspace(0, 10, 100) 
y = x**2+2*x
plt.figure()
plt.plot(x,y,label='y=x^2+2x'
)