import java.util.Scanner;

class checknum {
    static boolean prime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i < n; i++)
            if (n % i == 0) return false;
        return true;
    }

    static boolean armstrong(int n) {
        int s = 0, t = n;
        while (t > 0) {
            int d = t % 10;
            s += d * d * d;
            t /= 10;
        }
        return s == n;
    }

    static boolean perfect(int n) {
        int s = 0;
        for (int i = 1; i < n; i++)
            if (n % i == 0) s += i;
        return s == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        System.out.println("Sum: " + sum);
        System.out.println("Prime: " + prime(sum));
        System.out.println("Armstrong: " + armstrong(sum));
        System.out.println("Perfect: " + perfect(sum));
    }
}
