def gauss_sedel(a1,b1,c1,d1, a2,b2,c2,d2, a3,b3,c3,d3):
    x,y,z=0,0,0
    for i in range(n):
        x=(d1 - b1*y - c1*z)/a1
        y=(d2 - a2*x - c2*z)/b2
        z=(d3 - a3*x - b3*y)/c3
    return x,y,z

n=2
x_n,y_n,z_n=gauss_sedel(5,2,1,12, 3,8,2,25, 2,3,9,31)
print("The value of x,y,z are:", x_n, y_n, z_n)