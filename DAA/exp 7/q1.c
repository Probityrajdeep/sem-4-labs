#include <stdio.h>
#include <limits.h>
#define V 5   // A, B, C, D, E

// Function to find vertex with minimum distance
int minDistance(int dist[], int visited[]) {
    int min = INT_MAX, min_index;

    for (int v = 0; v < V; v++) {
        if (visited[v] == 0 && dist[v] <= min) {
            min = dist[v];
            min_index = v;
        }
    }
    return min_index;
}

// Function to print path recursively
void printPath(int parent[], int j) {
    if (parent[j] == -1)
        return;

    printPath(parent, parent[j]);
    printf(" -> %c", j + 'A');
}

// Dijkstra Algorithm
void dijkstra(int graph[V][V], int src) {

    int dist[V];        // Shortest distances
    int visited[V];     // Visited set
    int parent[V];      // To store shortest path

    for (int i = 0; i < V; i++) {
        dist[i] = INT_MAX;
        visited[i] = 0;
        parent[i] = -1;
    }

    dist[src] = 0;

    for (int count = 0; count < V - 1; count++) {

        int u = minDistance(dist, visited);
        visited[u] = 1;

        for (int v = 0; v < V; v++) {

            if (!visited[v] && graph[u][v] &&
                dist[u] != INT_MAX &&
                dist[u] + graph[u][v] < dist[v]) {

                parent[v] = u;
                dist[v] = dist[u] + graph[u][v];
            }
        }
    }

    // Printing output like slide
    printf("Vertex\tDistance\tPath\n");

    for (int i = 0; i < V; i++) {
        printf("%c\t%d\t\t%c", i + 'A', dist[i], src + 'A');
        printPath(parent, i);
        printf("\n");
    }
}

int main() {

    int graph[V][V] = {
        //A  B  C  D  E
        { 0, 3, 1, 0, 0 }, // A
        { 3, 0, 7, 5, 1 }, // B
        { 1, 7, 0, 2, 0 }, // C
        { 0, 5, 2, 0, 7 }, // D
        { 0, 1, 0, 7, 0 }  // E
    };

    int source = 2;   // C

    dijkstra(graph, source);

    return 0;
}