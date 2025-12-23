#solve the following congruence equation 11x ≡ 22 (mod 33)
import math
a = int(input("Enter the value of a = "))   
b = int(input("Enter the value of b = "))   
m = int(input("Enter the value of m = "))

def gcd(a,b):
    a,b = abs(a),abs(b)
    while b != 0:
        a,b = b,a%b
    return a

def cong_solution(a,b,m):
    d = gcd(a,m)
    if b%d != 0:
        print(f"Solution of the equation does not exist.")
        
    else:
        for x in range(0,m):
            if(a*x-b)%m ==0:
                m1 =int(m/d)
                final_solution = [x + j*m1 for j in range(0,d)]
                break
        print(f"The equation has {d} solution \nand the solution is x = {final_solution} (mod{m}).")
cong_solution(a,b,m)
#fsafsafs
#you are great