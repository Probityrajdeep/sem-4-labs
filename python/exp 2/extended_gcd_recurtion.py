a = 60
b = 42
def extended_gcd(a, b):
    if b == 0:
        return a, 1, 0
    gcd, x1, y1 = extended_gcd(b, a % b)
    x = y1 - (a // b) * x1
    y = x1
    return gcd, x, y
g,x,y = extended_gcd(a, b)
print(f"GCD of {a} and {b} is {g}")
print(f"verification: {a} and {b}*({y}) = {a*x + b*y} ")