import java.util.Scanner;

class binaryhex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int num = n;
        String bin = "";
        while (num > 0) {
            bin = (num % 2) + bin;
            num /= 2;
        }

        num = n;
        String hex = "";
        char[] h = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while (num > 0) {
            hex = h[num % 16] + hex;
            num /= 16;
        }

        System.out.println("Binary: " + bin);
        System.out.println("Hexadecimal: " + hex);
    }
}
