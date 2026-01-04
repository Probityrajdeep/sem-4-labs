import java.util.Scanner;

class empscanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.println("\nEnter details of Employee " + i);

            System.out.print("Employee ID: ");
            int id = sc.nextInt();

            sc.nextLine();

            System.out.print("Employee Name: ");
            String name = sc.nextLine();

            System.out.print("Employee Salary: ");
            double salary = sc.nextDouble();

            System.out.println("\nEmployee " + i + " Details:");
            System.out.println("ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Salary: " + salary);
        }

        sc.close();
    }
}