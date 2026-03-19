#include <stdio.h>

#define N 4

int board[N][N];

int isSafe(int row, int col)
{
    int i, j;

    // check column
    for(i = 0; i < row; i++)
        if(board[i][col])
            return 0;

    // check left diagonal
    for(i=row, j=col; i>=0 && j>=0; i--, j--)
        if(board[i][j])
            return 0;

    // check right diagonal
    for(i=row, j=col; i>=0 && j<N; i--, j++)
        if(board[i][j])
            return 0;

    return 1;
}

int solveNQueen(int row)
{
    if(row == N)
        return 1;

    for(int col = 0; col < N; col++)
    {
        if(isSafe(row, col))
        {
            board[row][col] = 1;

            if(solveNQueen(row + 1))
                return 1;

            board[row][col] = 0; // backtrack
        }
    }

    return 0;
}

void printBoard()
{
    for(int i = 0; i < N; i++)
    {
        for(int j = 0; j < N; j++)
            printf("%d ", board[i][j]);
        printf("\n");
    }
}

int main()
{
    if(solveNQueen(0))
        printBoard();
    else
        printf("No solution exists");

    return 0;
}