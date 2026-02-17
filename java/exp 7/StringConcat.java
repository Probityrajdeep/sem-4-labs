import java.util.Scanner;

public class StringConcat {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First String: ");
        String str1 = sc.nextLine();

        System.out.print("Enter Second String: ");
        String str2 = sc.nextLine();

        char lastChar = str1.charAt(str1.length() - 1);
        char firstChar = str2.charAt(0);

        if (lastChar == firstChar) {
            System.out.println("Output: " + str1 + str2.substring(1));
        } else {
            System.out.println("Condition not satisfied.");
        }

        sc.close();
    }
}
