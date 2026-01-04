a = 55
b = 35
def extended_gcd_iterative(a, b):
    old_r, r = a, b
    old_s, s = 1, 0
    old_t, t = 0, 1
    
    while r != 0:
        quotient = old_r // r
        old_r, r = r, old_r - quotient * r
        old_s, s = s, old_s - quotient * s
        old_t, t = t, old_t - quotient * t
    
    return old_r, old_s, old_t

g, x, y = extended_gcd_iterative(a, b)
print(f"GCD of {a} and {b} is {g}")
print(f"verification: {a}*({x}) + {b}*({y}) = {a*x + b*y}")