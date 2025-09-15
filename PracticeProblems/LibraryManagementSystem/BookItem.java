public class BookItem {
    private final String barcode;
    private final Book book;
    private BookStatus status;

    public BookItem(Book book, String barcode) {
        this.book = book;
        this.barcode = barcode;
        this.status = BookStatus.AVAILABLE;
    }

    public String getBarcode() {
        return barcode;
    }

    public Book getBook() {
        return book;
    }

    public BookStatus getStatus() {
        return status;
    }

    public void setStatus(BookStatus status) {
        this.status = status;
    }
}
