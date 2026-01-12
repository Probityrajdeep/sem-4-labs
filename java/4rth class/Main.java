class A {
    int x = 10;

    void show() {
        System.out.println("This is class A method");
    }
}

class B extends A {
    int x = 20;

    void display() {
        System.out.println("Value of x in class B: " + x);
        System.out.println("Value of x in class A using super: " + super.x);

        System.out.print("Calling method of class A using super: ");
        super.show();
    }
}

class Main {
    public static void main(String[] args) {
        B obj = new B();
        obj.display();
    }
}
