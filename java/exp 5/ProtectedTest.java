class Parent {
    protected String secret = "Protected Data";
}

class Child extends Parent {
    void showSecret() {
        System.out.println(secret); 
    }
}

public class ProtectedTest {
    public static void main(String[] args) {
        new Child().showSecret();
    }
}