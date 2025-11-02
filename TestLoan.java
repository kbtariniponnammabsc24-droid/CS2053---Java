import edu.bank.*;

public class TestLoan {
    public static void main(String[] args) {
        Loan h = new HomeLoan();   
        Loan c = new CarLoan();    

        h.interestRate();
        c.interestRate();

    }
}
