abstract class Shape {
    abstract void draw();

    void display() {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.display();
        c.draw();
    }
}
