class Account {
    String accountHolder;
    double balance;

    Account(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void calculateInterest() {
        System.out.println("Calculating interest for generic account");
    }

    void displayBalance() {
        System.out.println(accountHolder + "'s current balance: " + balance);
    }
}

class SavingsAccount extends Account {
    SavingsAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    void calculateInterest() {
        double interest = balance * 0.05;
        balance += interest;
        System.out.println("Savings Account Interest Added: " + interest);
    }
}

class CurrentAccount extends Account {
    CurrentAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    void calculateInterest() {
        double interest = balance * 0.02;
        balance += interest;
        System.out.println("Current Account Interest Added: " + interest);
    }
}

public class Lab4 {
    public static void main(String[] args) {
        Account acc1 = new SavingsAccount("Tarini", 10000);
        Account acc2 = new CurrentAccount("Ash", 15000);

        acc1.calculateInterest(); 
        acc1.displayBalance();

        acc2.calculateInterest(); 
        acc2.displayBalance();
    }
}
