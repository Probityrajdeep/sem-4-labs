import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String A = sc.nextLine();

        System.out.print("Enter second string: ");
        String B = sc.nextLine();

        if (A.length() != B.length()) {
            System.out.println("False (Not Anagrams)");
        } else {

            char[] aArray = A.toCharArray();
            char[] bArray = B.toCharArray();

            Arrays.sort(aArray);
            Arrays.sort(bArray);

            if (Arrays.equals(aArray, bArray)) {
                System.out.println("True (Anagrams)");
            } else {
                System.out.println("False (Not Anagrams)");
            }
        }

        sc.close();
    }
}
