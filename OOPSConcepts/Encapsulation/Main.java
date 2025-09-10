package OOPSConcepts.Encapsulation;

public class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.deposit(500);
        System.out.println("Balance: " + acc.getBalance()); // ✅ Safe access
    }
}
