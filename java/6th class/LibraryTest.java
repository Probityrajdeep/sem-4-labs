class LibraryItem {
    void checkOut() { System.out.println("Item checked out."); }
    void returnItem() { System.out.println("Item returned."); }
}

class Book extends LibraryItem {}
class DVD extends LibraryItem {}
class Journal extends LibraryItem {}

public class LibraryTest {
    public static void main(String[] args) {
        Book b = new Book();
        b.checkOut();
        b.returnItem();
    }
}