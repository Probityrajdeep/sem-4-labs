import java.util.Scanner;

public class EmailValidation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Email ID: ");
        String email = sc.nextLine();

        if (email.contains("@") && email.contains(".")) {

            int atIndex = email.indexOf("@");
            int dotIndex = email.lastIndexOf(".");

            if (atIndex > 0 && 
                dotIndex > atIndex + 1 && 
                dotIndex < email.length() - 1) {

                System.out.println("Correct Email ID");
            } else {
                System.out.println("Incorrect Email ID");
            }

        } else {
            System.out.println("Incorrect Email ID");
        }

        sc.close();
    }
}
