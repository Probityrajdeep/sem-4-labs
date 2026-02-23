class TestPropagation {
    void method1() {
        int result = 10 / 0; // ArithmeticException
    }

    void method2() {
        method1(); // Exception propagates here
    }

    void method3() {
        try {
            method2(); // Exception propagates here
        } catch (ArithmeticException e) {
            System.out.println("Exception handled in method3");
        }
    }

    public static void main(String[] args) {
        TestPropagation obj = new TestPropagation();
        obj.method3();
        System.out.println("Program continues...");
    }
}