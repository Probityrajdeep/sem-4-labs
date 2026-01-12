import java.util.Scanner;

class ConferenceRoom {
    static String[][] bookings = new String[5][4]; // date, start, end, name
    static int count = 0;

    static void book(String d, String s, String e, String n) {
        bookings[count][0] = d;
        bookings[count][1] = s;
        bookings[count][2] = e;
        bookings[count][3] = n;
        count++;
        System.out.println("Room booked successfully!");
    }

    static void check(String d, String s, String e) {
        for (int i = 0; i < count; i++) {
            if (bookings[i][0].equals(d) && bookings[i][1].equals(s) && bookings[i][2].equals(e)) {
                System.out.println("Room already booked by " + bookings[i][3]);
                return;
            }
        }
        System.out.println("Room is available!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        book("10-01-2026", "10:00", "11:00", "Raj");
        check("10-01-2026", "10:00", "11:00");
    }
}
