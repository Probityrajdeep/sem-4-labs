import numpy as np
import matplotlib.pyplot as plt

def plot_equations(D):
    x =[x for x in D]
    y1 =[-5*x/4-5/4 for x in D]
    y2 =[9*x/10+9/10 for x in D]
    plt.plot(x,y1,label='Eq1: -5x+-4y=5',color='blue',linewidth=1)
    plt.plot(x,y2,label='Eq2: 9x-10y=-9',color='red',linewidth=1)

    plt.axhline(0,color ='black',linewidth=1)
    plt.axvline(0,color ='black',linewidth=1)
    plt.xlabel('X-axis')
    plt.ylabel('Y-axis')
    plt.title('Graphical Representation of two linear Equations')
    plt.grid(linestyle='--')
    plt.legend()
    
    plt.show()

D = range(-10,11,1) #only int values
#D =np.arange(1,1,3)#float values allowed 
#D =np.linspace(1,-1,1)
plot_equations(D)
