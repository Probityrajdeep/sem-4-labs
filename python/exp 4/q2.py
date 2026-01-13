##-----Upper triangle Matrix and Rank------##
##----------------start-----------------##

def upper_triangular(matrix):
    rows, cols = len(matrix), len(matrix[0])

    for i in range(min(rows, cols)):   
        if matrix[i][i] == 0:
            for j in range(i + 1, rows):
                if matrix[j][i] != 0:  
                    matrix[i], matrix[j] = matrix[j], matrix[i]
                    break
        for j in range(i + 1, rows):
            if matrix[j][i] != 0:     
                factor = matrix[j][i] / matrix[i][i]
                for k in range(i, cols):
                    matrix[j][k] = matrix[j][k] - factor * matrix[i][k]
    return matrix

def rank_of_matrix(matrix):
    U = upper_triangular(matrix)
    rank = 0
    for row in U:
        if any(abs(x) > 1e-6 for x in row):
            rank += 1
    return rank

a = [[1,2,3,4],[2,5,6,7],[3,6,8,9],[4,7,9,10]]
print("Upper Triangular Matrix A:", upper_triangular(a))
print("Rank of A:", rank_of_matrix(a))

b = [[1,2,3,4],[5,6,7,8]]
print("Upper Triangular Matrix B:", upper_triangular(b))
print("Rank of B:", rank_of_matrix(b))
