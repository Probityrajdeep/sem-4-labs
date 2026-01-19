class Parent {

    int x = 10;
}

class Child extends Parent {

    int x = 20;

    void display() {

        System.out.println("Child's x: " + x);
        System.out.println("Parent's x: " + super.x);
    }
}

public class Main2 {

    public static void main(String[] args) {

        Child c = new Child();
        c.display();
    }
}
