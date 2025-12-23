a = int(input("Enter the value of a = "))
b = int(input("Enter the value of b = "))
m = int(input("Enter the value of m = "))

# find gcd
def gcd(a,b):
    a,b = abs(a),abs(b)
    while b != 0:
        a,b = b,a%b
    return a

def solve_congruance(a,b,m):
    d = gcd(a,m)
    if b%d != 0:
        print(f"Solution of the equation does not exist.")
        
    else:
        solutions = []
        for x in range (m):
            if (a*x-b)%m == 0:
                solutions = solutions+[x]
        print(f"The solution has {d} solution \nand the solution is x={solutions} (mod{m}).")

solve_congruance(a,b,m)