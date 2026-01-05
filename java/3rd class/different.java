import java.util.Scanner;

class different {
    float length, breadth, area;

    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = sc.nextFloat();
        System.out.print("Enter breadth: ");
        breadth = sc.nextFloat();
    }

    void calculate() {
        area = length * breadth;
    }

    void display() {
        System.out.println("Area of the room: " + area);
    }

    public static void main(String[] args) {
        different r = new different();
        r.getData();
        r.calculate();
        r.display();
    }
}
