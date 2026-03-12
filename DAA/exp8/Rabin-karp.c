#include <stdio.h>
#include <string.h>
#include <time.h>

#define d 256

int main() {
    char text[100], pattern[100];
    int i, j, n, m, p = 0, t = 0, h = 1;
    int q = 101;  
    clock_t start, end;
    double time_taken;

    printf("Enter the text: ");
    scanf("%s", text);

    printf("Enter the pattern: ");
    scanf("%s", pattern);

    start = clock();

    n = strlen(text);
    m = strlen(pattern);

    for(i = 0; i < m-1; i++)
        h = (h * d) % q;

    for(i = 0; i < m; i++) {
        p = (d * p + pattern[i]) % q;
        t = (d * t + text[i]) % q;
    }

    for(i = 0; i <= n - m; i++) {

        if(p == t) {
            for(j = 0; j < m; j++) {
                if(text[i+j] != pattern[j])
                    break;
            }

            if(j == m)
                printf("Pattern found at position %d\n", i);
        }

        if(i < n - m) {
            t = (d * (t - text[i] * h) + text[i + m]) % q;

            if(t < 0)
                t = t + q;
        }
    }

    end = clock();

    time_taken = ((double)(end - start)) / CLOCKS_PER_SEC;
    printf("Execution Time: %f seconds\n", time_taken);

    return 0;
}