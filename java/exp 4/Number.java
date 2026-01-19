class One {

    void Print1() {
        System.out.println("Go");
    }
}

class Two extends One {

    void Print2() {
        System.out.println("Went");
    }
}

class Three extends Two {

    void Print3() {
        System.out.println("Gone");
    }
}

class Number {

    public static void main(String[] args) {

        Three t = new Three();

        t.Print1();
        t.Print2();
        t.Print3();
    }
}
