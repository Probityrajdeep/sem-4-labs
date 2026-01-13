import matplotlib.pyplot as plt

def plot_equations(D):
    x =[x for x in D]
    y1 =[3-x for x in D]
    y2 =[x-1 for x in D]
    plt.plot(x,y1,label='Eq1: x+y=3',color='blue',linewidth=1)
    plt.plot(x,y2,label='Eq2: x-y=1',color='red',linewidth=1)

    plt.axhline(0,color ='black',linewidth=1)
    plt.axvline(0,color ='black',linewidth=1)
    plt.xlabel('X-axis')
    plt.ylabel('Y-axis')
    plt.title('Graphical Representation of two linear Equations')
    plt.grid(linestyle='--')
    plt.legend()
    
    plt.show()

D = range(-10,11,1)
plot_equations(D)