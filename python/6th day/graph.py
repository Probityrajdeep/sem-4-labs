import matplotlib.pyplot as plt
x = [0,5,10,15] # x value listed
y=[-10,20,20,-10] # y value listed

plt.scatter(x,y) #plot the points only
plt.plot(x,y) #plot the line
plt.grid() #add grid
plt.legend(loc='upper right',labels=['points','curve'],title='legend Title') #add legend
plt.show() #show the graph
