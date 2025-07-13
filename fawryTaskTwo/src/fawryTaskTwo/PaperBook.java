package fawryTaskTwo;

class PaperBook extends Book {
    private int stock;

    public PaperBook(String isbn, String title, int year, double price, String author, int stock) {
        super(isbn, title, year, price, author);
        this.stock = stock;
    }

    @Override
    public double buy(int quantity, String email, String address) {
        if (stock < quantity) {
            throw new IllegalArgumentException("Quantum book store: Not enough stock");
        }
        stock -= quantity;
        ShippingService.send(this.title, address);
        return price * quantity;
    }
}