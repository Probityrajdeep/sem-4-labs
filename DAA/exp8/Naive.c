#include <stdio.h>
#include <string.h>
#include <time.h>

int main() {
    char text[100], pattern[100];
    int i, j, n, m, found = 0;
    clock_t start, end;
    double time_taken;

    printf("Enter the text: ");
    scanf("%s", text);

    printf("Enter the pattern: ");
    scanf("%s", pattern);

    start = clock();

    n = strlen(text);
    m = strlen(pattern);

    for(i = 0; i <= n - m; i++) {
        for(j = 0; j < m; j++) {
            if(text[i + j] != pattern[j])
                break;
        }

        if(j == m) {
            printf("Pattern found at position %d\n", i);
            found = 1;
        }
    }

    if(!found)
        printf("Pattern not found\n");

    end = clock();   // end time

    time_taken = ((double)(end - start)) / CLOCKS_PER_SEC;
    printf("Execution Time: %f seconds\n", time_taken);

    return 0;
}