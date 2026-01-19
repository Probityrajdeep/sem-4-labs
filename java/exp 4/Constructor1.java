class Parent {

    Parent() {
        System.out.println("Parent constructor.....");
    }
}

class Child extends Parent {

    Child() {
        System.out.println("Child constructor......");
    }
}

public class Constructor1 {

    public static void main(String[] args) {

        Child c = new Child();
    }
}
