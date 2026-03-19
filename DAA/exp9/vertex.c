#include <stdio.h>

#define MAX 100

int main() {
    int n, m;
    int u[MAX], v[MAX];
    int used[MAX] = {0};
    int removed[MAX] = {0};

    printf("Enter number of vertices and edges: ");
    scanf("%d %d", &n, &m);

    printf("Enter edges (u v):\n");
    for(int i = 0; i < m; i++) {
        scanf("%d %d", &u[i], &v[i]);
    }

    for(int i = 0; i < m; i++) {
        if(removed[i] == 0) {
            int a = u[i];
            int b = v[i];

            used[a] = 1;
            used[b] = 1;

            for(int j = 0; j < m; j++) {
                if(!removed[j] && (u[j] == a || v[j] == a || u[j] == b || v[j] == b)) {
                    removed[j] = 1;
                }
            }
        }
    }
    printf("Vertex Cover: ");
    for(int i = 0; i < n; i++) {
        if(used[i])
            printf("%d ", i);
    }

    return 0;
}