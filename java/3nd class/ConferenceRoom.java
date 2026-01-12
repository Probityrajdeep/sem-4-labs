public class ConferenceRoom {

    // date, start time, end time, name
    static Object[][] bookings = new Object[5][4];
    static int count = 0;

    static void bookRoom(String date, int startTime, int endTime, String name) {

        for (int i = 0; i < count; i++) {
            if (bookings[i][0].equals(date)) {

                int bookedStart = (int) bookings[i][1];
                int bookedEnd = (int) bookings[i][2];

                if (startTime < bookedEnd && endTime > bookedStart) {
                    System.out.println("Room not available for this time slot.");
                    return;
                }
            }
        }

        bookings[count][0] = date;
        bookings[count][1] = startTime;
        bookings[count][2] = endTime;
        bookings[count][3] = name;
        count++;

        System.out.println("Room booked successfully!");
    }

    public static void main(String[] args) {
        bookRoom("2026-01-12", 10, 12, "Shreya");
        bookRoom("2026-01-12", 11, 13, "Aman");
    }
}