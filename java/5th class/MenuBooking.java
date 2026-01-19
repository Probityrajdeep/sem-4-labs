import java.util.Scanner;

class MenuBooking {
    static String[][] room = new String[10][4];
    static int n = 0;

    static void book() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Date: ");
        room[n][0] = sc.next();
        System.out.print("Start Time: ");
        room[n][1] = sc.next();
        System.out.print("End Time: ");
        room[n][2] = sc.next();
        System.out.print("Name: ");
        room[n][3] = sc.next();
        n++;
        System.out.println("Booking Successful!");
    }

    static void check() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Date: ");
        String d = sc.next();
        System.out.print("Start Time: ");
        String s = sc.next();
        System.out.print("End Time: ");
        String e = sc.next();

        for (int i = 0; i < n; i++) {
            if (room[i][0].equals(d) && room[i][1].equals(s) && room[i][2].equals(e)) {
                System.out.println("Not Available (Booked by " + room[i][3] + ")");
                return;
            }
        }
        System.out.println("Room Available!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Book Room\n2. Check Availability\n3. Exit");
            int ch = sc.nextInt();
            switch (ch) {
                case 1: book(); break;
                case 2: check(); break;
                case 3: System.exit(0);
            }
        }
    }
}
