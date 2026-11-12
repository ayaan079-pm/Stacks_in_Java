class BankAccountLinked {

    private double balance;

    private Example12LinkedStack<Double> history =
            new Example12LinkedStack<>();

    public BankAccountLinked(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {

        balance = balance + amount;

        history.push(amount);

        System.out.println("Deposit " + amount + " -> balance " + balance);
    }

    public void undoLastDeposit() {

        if (history.isEmpty()) {
            System.out.println("Nothing to undo");
            return;
        }

        double last = history.pop();

        balance = balance - last;

        System.out.println("Undo " + last + " -> balance " + balance);
    }
}

public class Example14BankLinkedStack {
    public static void main(String[] args) {

        BankAccountLinked acc = new BankAccountLinked(100);

        acc.deposit(50);
        acc.deposit(20);
        acc.deposit(30);

        acc.undoLastDeposit();
        acc.undoLastDeposit();
    }
}
