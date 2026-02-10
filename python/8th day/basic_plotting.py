import matplotlib.pyplot as plt

x=[1,2,3,4,5]
y=[1,4,9,16,25]

plt.scatter(x,y)
plt.scatter(x,y, color='red', marker='x',s=100, label='data points')
plt.plot(x,y, color='blue', linestyle='--', label='line plot')
plt.axvline(x=0, color='black', linestyle=':', label='vertical line at x=0')
plt.xlabel('X-axis')

plt.ylabel('Y-axis')
plt.figure()
plt.show()
