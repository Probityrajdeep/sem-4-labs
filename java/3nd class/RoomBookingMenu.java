import java.util.Scanner;

public class RoomBookingMenu {

    // date, start time, end time, name
    static String[][] bookings = new String[10][4];
    static int count = 0;
    static Scanner sc = new Scanner(System.in);

    static void bookRoom() {
        System.out.print("Enter Date (YYYY-MM-DD): ");
        String date = sc.nextLine();

        System.out.print("Enter Start Time: ");
        String start = sc.nextLine();

        System.out.print("Enter End Time: ");
        String end = sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        int startTime = Integer.valueOf(start);
        int endTime = Integer.valueOf(end);

        for (int i = 0; i < count; i++) {
            if (bookings[i][0].equals(date)) {

                int bookedStart = Integer.valueOf(bookings[i][1]);
                int bookedEnd = Integer.valueOf(bookings[i][2]);

                if (startTime < bookedEnd && endTime > bookedStart) {
                    System.out.println("Room not available!");
                    return;
                }
            }
        }

        bookings[count][0] = date;
        bookings[count][1] = start;
        bookings[count][2] = end;
        bookings[count][3] = name;
        count++;

        System.out.println("Room booked successfully!");
    }

    static void checkAvailability() {
        System.out.print("Enter Date (YYYY-MM-DD): ");
        String date = sc.nextLine();

        System.out.print("Enter Start Time: ");
        int startTime = Integer.valueOf(sc.nextLine());

        System.out.print("Enter End Time: ");
        int endTime = Integer.valueOf(sc.nextLine());

        for (int i = 0; i < count; i++) {
            if (bookings[i][0].equals(date)) {

                int bookedStart = Integer.valueOf(bookings[i][1]);
                int bookedEnd = Integer.valueOf(bookings[i][2]);

                if (startTime < bookedEnd && endTime > bookedStart) {
                    System.out.println("Room not available!");
                    return;
                }
            }
        }

        System.out.println("Room available!");
    }

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n1. Book Room");
            System.out.println("2. Check Availability");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int choice = Integer.valueOf(sc.nextLine());

            switch (choice) {
                case 1:
                    bookRoom();
                    break;
                case 2:
                    checkAvailability();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}