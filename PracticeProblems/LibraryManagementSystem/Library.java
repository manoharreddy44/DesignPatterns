import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Library {
    private final Map<String, BookItem> bookItems;
    private final Map<String, Member> members;
    private final Map<String, Loan> activeLoans;

    public Library() {
        this.bookItems = new HashMap<>();
        this.members = new HashMap<>();
        this.activeLoans = new HashMap<>();
    }

    public void addBookItem(Book book, int quantity) {
        for (int i = 0; i < quantity; i++) {
            String barcode = UUID.randomUUID().toString();
            BookItem item = new BookItem(book, barcode);
            bookItems.put(barcode, item);
            System.out.println("Added book copy: " + book.getTitle() + " [Barcode: " + barcode + "]");
        }
    }

    public void registerMember(String name) {
        String memberId = "M" + (members.size() + 1);
        Member member = new Member(memberId, name);
        members.put(memberId, member);
        System.out.println("Registered new member: " + name + " [ID: " + memberId + "]");
    }

    public boolean borrowBook(String memberId, String barcode) {
        if (!members.containsKey(memberId)) {
            System.out.println("Error: Member ID not found.");
            return false;
        }
        if (!bookItems.containsKey(barcode)) {
            System.out.println("Error: Book with this barcode not found.");
            return false;
        }
        
        BookItem bookItem = bookItems.get(barcode);
        if (bookItem.getStatus() != BookStatus.AVAILABLE) {
            System.out.println("Error: Book '" + bookItem.getBook().getTitle() + "' is currently not available.");
            return false;
        }
        
        bookItem.setStatus(BookStatus.LOANED);
        Loan loan = new Loan(memberId, barcode);
        activeLoans.put(barcode, loan);
        System.out.println("Success: Member " + memberId + " borrowed '" + bookItem.getBook().getTitle() + "'. Due: " + loan.getDueDate());
        return true;
    }

    public boolean returnBook(String barcode) {
        if (!bookItems.containsKey(barcode)) {
            System.out.println("Error: Book with this barcode not found.");
            return false;
        }

        BookItem bookItem = bookItems.get(barcode);
        if (bookItem.getStatus() != BookStatus.LOANED || !activeLoans.containsKey(barcode)) {
            System.out.println("Error: This book was not on loan.");
            return false;
        }

        Loan loan = activeLoans.get(barcode);
        loan.setReturnDate(LocalDate.now());
        bookItem.setStatus(BookStatus.AVAILABLE);
        activeLoans.remove(barcode);

        System.out.println("Success: Book '" + bookItem.getBook().getTitle() + "' was returned.");
        
        long daysLate = ChronoUnit.DAYS.between(loan.getDueDate(), loan.getReturnDate());
        if (daysLate > 0) {
            double fine = daysLate * 0.50;
            System.out.println("A fine of $" + String.format("%.2f", fine) + " is due for returning the book " + daysLate + " day(s) late.");
        }
        return true;
    }
}
