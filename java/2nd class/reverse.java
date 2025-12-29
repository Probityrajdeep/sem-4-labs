import java.util.Scanner;

class reverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = num;
        int reverse = 0;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum = sum + digit;
            reverse = reverse * 10 + digit;
            temp = temp / 10;
        }

        if (sum == reverse) {
            System.out.println("Sum of digits is equal to reverse.");
        } else {
            System.out.println("Sum of digits is not equal to reverse.");
        }

        sc.close();
    }
}
