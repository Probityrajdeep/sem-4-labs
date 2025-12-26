import math
a = int(input("Enter the value of a = "))
b = int(input("Enter the value of b = "))
m = int(input("Enter the value of m = "))
d = math.gcd(a, m)
def gcd(a, b):
    while(b):
        a, b = b, a % b
    return a
d = gcd(a, m)
if d == 1:
    print(f"The equation {a}x ≡ {b} (mod {m}) has a unique solution.")
elif b % d == 0:
    print(f"The equation {a}x ≡ {b} (mod {m}) has {d} solutions.")
else:
    
    print(f"Solution of the equation {a}x ≡ {b} (mod {m}) does not exist.")
