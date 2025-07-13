package fawryTaskTwo;

public class QuantumBookstoreFullTest {
    public static void main(String[] args) {
        QuantumBookstore store = new QuantumBookstore();

        Book b1 = new PaperBook("123", "Java Basics", 2015, 100.0, "Mohamed", 10);
        Book b2 = new EBook("456", "Advanced Java", 2022, 50.0, "Ahmed", "PDF");
        Book b3 = new ShowcaseBook("789", "Java Showcase", 2010, 0.0, "Nawsany");

        store.addBook(b1);
        store.addBook(b2);
        store.addBook(b3);

        store.buyBook("123", 2, "dnawsany@gmail.com", "123 Street");
        store.buyBook("456", 1, "dnawsany@gmail.com", "NA");

        store.removeOutdatedBook(5);

        try {
            store.buyBook("789", 1, "dnawsany@gmail.com", "NA");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
