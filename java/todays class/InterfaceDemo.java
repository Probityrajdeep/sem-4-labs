interface MyInterface {
    void M1();
    void M2();
    void M3();
}

class MyClass implements MyInterface {

    public void M1() {
        System.out.println("Method M1 executed");
    }

    public void M2() {
        System.out.println("Method M2 executed");
    }

    public void M3() {
        System.out.println("Method M3 executed");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.M1();
        obj.M2();
        obj.M3();
    }
}
