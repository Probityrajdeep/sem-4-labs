import java.util.Scanner;

class scannerClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 1st number");
        int num1 = sc.nextInt();

        System.out.println("Enter the 2nd number");
        int num2 = sc.nextInt();

        System.out.println("Enter the 3rd number");
        int num3 = sc.nextInt();

        System.out.println("Enter the 4th number");
        int num4 = sc.nextInt();

        System.out.println("Enter the 5th number");
        int num5 = sc.nextInt();

        System.out.println("Entered numbers are:");
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);

        sc.close();
    }
}
