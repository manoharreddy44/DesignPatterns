import java.time.LocalDate;

public class Loan {
    private final String memberId;
    private final String barcode;
    private final LocalDate checkoutDate;
    private final LocalDate dueDate;
    private LocalDate returnDate;

    public Loan(String memberId, String barcode) {
        this.memberId = memberId;
        this.barcode = barcode;
        this.checkoutDate = LocalDate.now();
        this.dueDate = this.checkoutDate.plusWeeks(2);
    }

    public String getMemberId() {
        return memberId;
    }
    
    public String getBarcode() {
        return barcode;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }
    
    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }
}
