#include <stdio.h>
#include <string.h>
#include <math.h>

#define d 256

int main() {

    char T[100], P[100];
    int n, m, h = 1;
    int p = 0, t = 0;
    int q = 101;
    int i, s, j;

    printf("Enter Text: ");
    scanf("%s", T);

    printf("Enter Pattern: ");
    scanf("%s", P);

    n = strlen(T);
    m = strlen(P);

    for(i = 0; i < m-1; i++)
        h = (h * d) % q;
        
    for(i = 0; i < m; i++) {
        p = (d * p + P[i]) % q;
        t = (d * t + T[i]) % q;
    }

    // matching
    for(s = 0; s <= n - m; s++) {

        if(p == t) {
            for(j = 0; j < m; j++) {
                if(T[s + j] != P[j])
                    break;
            }

            if(j == m)
                printf("Pattern occurs with shift %d\n", s);
        }

        if(s < n - m) {
            t = (d * (t - T[s] * h) + T[s + m]) % q;

            if(t < 0)
                t = t + q;
        }
    }

    return 0;
}