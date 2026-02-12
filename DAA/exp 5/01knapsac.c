#include <stdio.h>

int max(int a, int b){
    if(a > b)
        return a;
    else
        return b;
}

int main(){

    int n = 4;               
    int W = 7;          

    int weight[] = {1,3,4,5};
    int value[]  = {1,4,5,7};

    int T[10][10];          

    for(int i=0;i<=n;i++){
        for(int j=0;j<=W;j++){

            if(i==0 || j==0)
                T[i][j] = 0;


            else if(weight[i-1] <= j)
                T[i][j] = max(T[i-1][j],
                              value[i-1] + T[i-1][j-weight[i-1]]);

            else
                T[i][j] = T[i-1][j];
        }
    }

    printf("Maximum Profit = %d", T[n][W]);

    return 0;
}