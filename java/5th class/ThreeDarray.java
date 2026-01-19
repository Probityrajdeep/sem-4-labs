class ThreeDArray {
    public static void main(String[] args) {
        int[][][] seats = new int[2][3][4]; // Floors, Rows, Seats

        seats[0][1][2] = 1; // booked
        System.out.println("Seat status: " + seats[0][1][2]);
    }
}
