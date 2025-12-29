//Wap to calculate the total grades achived for 5 number of subjects. Given the marks should range between 0 to 100.
//In addition a fail marks in a subjects will result in fail grade fot the overall program.
//The total marks for the subject with sessional program will be calculated out of 200.
import java.util.Scanner;

class grades {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalMarks = 0;
        int failCount = 0;

        System.out.println("Enter marks for 5 subjects (each out of 200):");

        for (int i = 1; i <= 5; i++) {

            System.out.print("Subject " + i + ": ");
            int marks = sc.nextInt();

            if (marks < 0 || marks > 200) {
                System.out.println("Invalid marks! Enter between 0 and 200.");
                return;
            }

            if (marks < 70) {
                failCount = failCount + 1;
            }

            totalMarks = totalMarks + marks;
        }


        if (failCount > 0) {
            System.out.println("\nOverall Result: FAIL");
        } 
        else {
            double percentage = totalMarks / 10.0;
            String grade;

            if (percentage >= 90)
                grade = "A+";
            else if (percentage >= 80)
                grade = "A";
            else if (percentage >= 70)
                grade = "B";
            else if (percentage >= 60)
                grade = "C";
            else if (percentage >= 50)
                grade = "D";
            else
                grade = "F";

            System.out.println("\nTotal Marks: " + totalMarks + " / 1000");
            System.out.printf("Percentage: %.2f%%\n", percentage);
            System.out.println("Overall Grade: " + grade);
        }

        sc.close();
    }
}
