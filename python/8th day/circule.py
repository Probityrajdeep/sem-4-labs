import numpy as np
import matplotlib.pyplot as plt

# Create spiral data
theta = np.linspace(0, 8*np.pi, 1000)
r = theta

# Create figure with dark background (Breaking Bad style)
fig, (ax1, ax2) = plt.subplots(1, 2, figsize=(14, 6))
fig.patch.set_facecolor('#000000')

# First spiral plot
ax1.plot(theta, r, color='#00FF00', linewidth=2)
ax1.set_facecolor('#1a1a1a')
ax1.set_title('Spiral Pattern', color='white', fontsize=14, fontweight='bold')
ax1.tick_params(colors='white')
ax1.spines['bottom'].set_color('white')
ax1.spines['left'].set_color('white')
ax1.spines['top'].set_visible(False)
ax1.spines['right'].set_visible(False)

# Two spirals with Breaking Bad colors
x = r * np.cos(theta)
y = r * np.sin(theta)

ax2.plot(x, y, color='#FF6B00', linewidth=2.5, label='Spiral 1')
ax2.plot(-x, -y, color='#00CCFF', linewidth=2.5, label='Spiral 2')
ax2.set_facecolor('#1a1a1a')
ax2.set_title('Two Spirals', color='white', fontsize=14, fontweight='bold')
ax2.axis('equal')
ax2.legend(loc='upper right', labelcolor='white')
ax2.tick_params(colors='white')
ax2.spines['bottom'].set_color('white')
ax2.spines['left'].set_color('white')
ax2.spines['top'].set_visible(False)
ax2.spines['right'].set_visible(False)

plt.tight_layout()
plt.show()
