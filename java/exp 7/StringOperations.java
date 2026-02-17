import java.util.Scanner;

public class StringOperations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Case Conversion
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.println("Lowercase: " + input.toLowerCase());
        System.out.println("Uppercase: " + input.toUpperCase());

        // Remove Spaces
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        String noSpace = sentence.replace(" ", "");
        System.out.println("After removing spaces: " + noSpace);

        sc.close();
    }
}
