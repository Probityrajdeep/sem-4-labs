import java.util.Scanner;

public class PasswordValidation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        // Remove leading and trailing spaces
        password = password.trim();

        // Check minimum length
        if (password.length() < 8) {
            System.out.println("Password must be at least 8 characters long.");
            return;
        }

        // Convert first character to uppercase if needed
        if (!Character.isUpperCase(password.charAt(0))) {
            password = Character.toUpperCase(password.charAt(0)) 
                       + password.substring(1);
        }

        boolean hasDigit = false;
        boolean hasSpecial = false;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isDigit(ch)) {
                hasDigit = true;
            }

            if (!Character.isLetterOrDigit(ch)) {
                hasSpecial = true;
            }
        }

        if (hasDigit && hasSpecial) {
            System.out.println("Valid Password: " + password);
        } else {
            System.out.println("Password must contain at least one digit and one special character.");
        }

        sc.close();
    }
}
