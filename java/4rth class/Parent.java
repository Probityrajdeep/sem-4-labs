public class Parent {
    int num = 100;
}

class Child extends Parent {
    int num = 200;
    
    void display() {
        System.out.println("Child num: " + num);
        System.out.println("Parent num: " + super.num);
    }
    
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
    }
}