class Base {
    Base() { System.out.println("Base Constructor"); }
}

class Derived extends Base {
    Derived() {
        super();
        System.out.println("Derived Constructor");
    }
}

public class ConstructorTest {
    public static void main(String[] args) {
        new Derived(); 

    }
}