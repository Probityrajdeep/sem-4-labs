class fibonacci {

    static int fibRec(int n) {
        if (n <= 1) return n;
        return fibRec(n - 1) + fibRec(n - 2);
    }

    public static void main(String[] args) {
        int n = 7;

        System.out.println("Non-Recursive:");
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }

        System.out.println("\nRecursive:");
        for (int i = 0; i < n; i++)
            System.out.print(fibRec(i) + " ");
    }
}
