//Wrapping data (fields) and methods inside a class.
//keep fields private, expose them via getters/setters


package OOPSConcepts.Encapsulation;

class BankAccount {
    private double balance; // private -> can't access directly

    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}
