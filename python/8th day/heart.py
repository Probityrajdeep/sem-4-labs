import numpy as np
import matplotlib.pyplot as plt
# Generate heart curve using parametric equation
t = np.linspace(0, 2*np.pi, 1000)
x = 16 * np.sin(t)**3
y = 13 * np.cos(t) - 5 * np.cos(2*t) - 2 * np.cos(3*t) - np.cos(4*t)

# Plot the heart
plt.figure(figsize=(8, 8))
plt.plot(x, y, 'r-', linewidth=2)
plt.fill(x, y, color='red', alpha=0.7)
plt.axis('equal')
plt.axis('off')
plt.title('Heart')
plt.show()