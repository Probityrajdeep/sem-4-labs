class A {

    void In() {
        System.out.println("Eating.....");
    }
}

class D extends A {

    void In1() {
        System.out.println("Barking.....");
    }
}

class T {

    public static void main(String[] args) {

        D d = new D();

        d.In();
        d.In1();
    }
}
