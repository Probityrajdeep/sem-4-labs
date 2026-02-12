#include <stdio.h>
#include <stdlib.h>

struct node {
    char data;
    int freq;
    struct node *left, *right;
};

// Create new node
struct node* newNode(char data, int freq) {
    struct node* temp = (struct node*)malloc(sizeof(struct node));
    temp->data = data;
    temp->freq = freq;
    temp->left = temp->right = NULL;
    return temp;
}

// Print Huffman Codes
void printCodes(struct node* root, int arr[], int top) {
    if (root->left) {
        arr[top] = 0;
        printCodes(root->left, arr, top + 1);
    }

    if (root->right) {
        arr[top] = 1;
        printCodes(root->right, arr, top + 1);
    }

    // Leaf node
    if (!root->left && !root->right) {
        printf("%c: ", root->data);
        for (int i = 0; i < top; i++)
            printf("%d", arr[i]);
        printf("\n");
    }
}

// Find two smallest nodes
void huffman(char data[], int freq[], int n) {
    struct node* nodes[20];

    for (int i = 0; i < n; i++)
        nodes[i] = newNode(data[i], freq[i]);

    int size = n;

    while (size > 1) {
        int min1 = 0, min2 = 1;

        if (nodes[min1]->freq > nodes[min2]->freq) {
            int t = min1;
            min1 = min2;
            min2 = t;
        }

        for (int i = 2; i < size; i++) {
            if (nodes[i]->freq < nodes[min1]->freq) {
                min2 = min1;
                min1 = i;
            }
            else if (nodes[i]->freq < nodes[min2]->freq) {
                min2 = i;
            }
        }

        struct node* left = nodes[min1];
        struct node* right = nodes[min2];

        struct node* parent = newNode('$', left->freq + right->freq);
        parent->left = left;
        parent->right = right;

        nodes[min1] = parent;
        nodes[min2] = nodes[size - 1];
        size--;
    }

    int arr[20];
    printCodes(nodes[0], arr, 0);
}

int main() {
    char data[] = {'a','b','c','d','e'};
    int freq[] = {2,3,4,5,8};
    int n = 5;

    huffman(data, freq, n);

    return 0;
}
