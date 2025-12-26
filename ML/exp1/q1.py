# Usage of methods such as floor(), ceil(), sqrt(), isqrt(), gcd() etc.
import math
a = int(input("Enter the value of a = "))
m = int(input("Enter the value of m = "))
d = math.gcd(a, m)
print(f"The GCD of {a} and {m} is {d}")
e = math.isqrt(a)
print(f"The integer square root of {a} is {e}")
f = math.sqrt(a)
print(f"The square root of {a} is {f}")
g=math.floor(f)
print(f"The floor value of square root of {a} is {g}")
h=math.ceil(f)
print(f"The ceil value of square root of {a} is {h}")