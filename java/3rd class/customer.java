class customer{
    int id = 101;
    String name = "Rahul";
    double balance = 5000;

    void displayCustomerDetail() {
        System.out.println("Customer ID: " + id);
        System.out.println("Customer Name: " + name);
        System.out.println("Customer Balance: " + balance);
    }

    public static void main(String[] args) {
        customer c = new customer();
        c.displayCustomerDetail();
    }
}
