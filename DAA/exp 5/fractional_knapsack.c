#include <stdio.h>
#include <stdlib.h>

typedef struct {
    float weight;
    float value;
    float ratio;
} Item;

int compare(const void *a, const void *b) {
    return ((Item *)b)->ratio - ((Item *)a)->ratio;
}

int main() {
    int n;
    printf("Enter number of items: ");
    scanf("%d", &n);
    
    Item items[n];
    float capacity;
    
    printf("Enter knapsack capacity: ");
    scanf("%f", &capacity);
    
    for (int i = 0; i < n; i++) {
        printf("Item %d - Weight: ", i + 1);
        scanf("%f", &items[i].weight);
        printf("Item %d - Value: ", i + 1);
        scanf("%f", &items[i].value);
        items[i].ratio = items[i].value / items[i].weight;
    }
    
    qsort(items, n, sizeof(Item), compare);
    
    float totalValue = 0;
    float remainingCapacity = capacity;
    
    for (int i = 0; i < n; i++) {
        if (items[i].weight <= remainingCapacity) {
            totalValue += items[i].value;
            remainingCapacity -= items[i].weight;
        } else {
            totalValue += (remainingCapacity / items[i].weight) * items[i].value;
            break;
        }
    }
    
    printf("Maximum value: %.2f\n", totalValue);
    return 0;
}