n = 5
def fact_R(n):
    if n <= 1:
        return 1
    return n * fact_R(n - 1)

R = fact_R(n)
print(f"The factorial of {n} is {R}")