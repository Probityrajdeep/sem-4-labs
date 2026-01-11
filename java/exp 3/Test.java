import java.util.Scanner;

class Test {

    int input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int a = sc.nextInt();

        System.out.print("Enter second integer: ");
        int b = sc.nextInt();

        int result = add(a, b);   // calling add function
        return result;           // returning result to main
    }

    int add(int x, int y) {
        return x + y;            // returns sum to input()
    }

    public static void main(String[] args) {
        Test obj = new Test();
        int sum = obj.input();
        System.out.println("Sum = " + sum);
    }
}
