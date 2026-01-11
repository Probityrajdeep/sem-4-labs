import java.util.Scanner;

class Room {
    float length, breadth;

    float area(float a, float b) {
        length = a;
        breadth = b;
        return length * breadth;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Room r = new Room();

        System.out.print("Enter length: ");
        float a = sc.nextFloat();

        System.out.print("Enter breadth: ");
        float b = sc.nextFloat();

        System.out.println("Area of the room: " + r.area(a, b));
    }
}
