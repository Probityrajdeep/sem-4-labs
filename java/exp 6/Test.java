import java.util.Scanner;

class Box {
    double width, height, depth;

    double volume() {
        return width * height * depth;
    }
}

class Boxweight extends Box {
    double weight;

    double shippingCost(double distance, double costPerKm) {
        return distance * volume() * costPerKm;
    }
}

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Boxweight box = new Boxweight();

        System.out.print("Enter width: ");
        box.width = sc.nextDouble();

        System.out.print("Enter height: ");
        box.height = sc.nextDouble();

        System.out.print("Enter depth: ");
        box.depth = sc.nextDouble();

        System.out.print("Enter distance (in km): ");
        double distance = sc.nextDouble();

        System.out.print("Enter cost per km: ");
        double costPerKm = sc.nextDouble();

        double vol = box.volume();
        double cost = box.shippingCost(distance, costPerKm);

        System.out.println("Volume of Box = " + vol);
        System.out.println("Cost to Ship = " + cost);
    }
}