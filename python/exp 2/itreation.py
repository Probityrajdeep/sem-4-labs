def fact_I(n):
    res = 1
    for i in range(2, n + 1):
        res *= i
    return res

n = 5
I = fact_I(n)
print(f"The factorial of {n} is {I}")