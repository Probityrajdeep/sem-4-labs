##-----Upper triangle Matrix and rank------##
##----------------start-----------------##

def upper_triangular(matrix):
    rows, cols = len(matrix), len(matrix[0])

    for i in range(min(rows, cols)):   
        if matrix[i][i] == 0:
            for j in range(i + 1, rows):
                if matrix[j][i] != 0:  
                    matrix[i], matrix[j] = matrix[j], matrix[i]
                    break
                else:
                    continue 
        for j in range(i + 1, rows):
            if matrix[j][i] != 0:     
                factor = matrix[j][i] / matrix[i][i]
                for k in range(i, cols):
                    matrix[j][k] = matrix[j][k] - factor * matrix[i][k]

    return matrix
a = [[1,2,3,4],[2,5,6,7],[3,6,8,9],[4,7,9,10]]
print(upper_triangular(a))

b = [[1,2,3,4],[5,6,7,8]]
print(upper_triangular(b))