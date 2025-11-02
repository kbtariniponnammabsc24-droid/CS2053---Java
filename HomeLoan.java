package edu.bank;

public class HomeLoan implements Loan {
    public void interestRate() {
        System.out.println("Home Loan Interest Rate: 8%");
    }

    public static void main(String[] args) {
        Loan l1 = new HomeLoan();
        Loan l2 = new CarLoan();
        l1.interestRate();
        l2.interestRate();
    }
}