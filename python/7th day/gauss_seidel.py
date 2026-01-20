def gauss_sedel(a1,b1,c1,d1, a2,b2,c2,d2, a3,b3,c3,d3):
    x,y,z=0,0,0
    for i in range(n):
        x=(d1 - b1*y - c1*z)/a1
        y=(d2 - a2*x - c2*z)/b2
        z=(d3 - a3*x - b3*y)/c3
    return x,y,z

n=10000
x_n,y_n,z_n=gauss_sedel(12,3,-5,1 ,2,5,1,1, 2,1,1,3,6)
print("The value of x,y,z are:", x_n, y_n, z_n)