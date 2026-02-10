import numpy as np
import matplotlib.pyplot as plt

x1 = np.array([1, 2, 3, 4, 5])
x2 = [i for i in range(1,10,2)]
x3 = [i for i in range(0.5,10,0.2)]
x4 = np.linspace(-10,10,400)

y1=[i for i in x1]
y2=[i**2 for i in x2]
y3=[i**3 for i in x3]
y4=[i**4 for i in x4]

plt.subplot(2,2,1)
plt.plot(x1,x1)
plt.subplot(2,2,2)
plt.plot(x2,y2)
plt.subplot(2,2,3)
plt.plot(x3,y3)
plt.subplot(2,2,4)
plt.plot(x4,y4)

plt.show()
