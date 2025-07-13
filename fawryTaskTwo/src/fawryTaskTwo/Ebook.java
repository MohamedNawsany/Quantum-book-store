package fawryTaskTwo;

class EBook extends Book {
    private String filetype;

    public EBook(String isbn, String title, int year, double price, String author, String filetype) {
        super(isbn, title, year, price, author);
        this.filetype = filetype;
    }

    @Override
    public double buy(int quantity, String email, String address) {
        MailService.send(this.title, email);
        return price * quantity;
    }
}
