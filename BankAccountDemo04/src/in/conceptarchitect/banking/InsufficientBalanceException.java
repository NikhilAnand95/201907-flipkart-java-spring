package in.conceptarchitect.banking;

public class InsufficientBalanceException extends BankingException{

    double deficit;


    public InsufficientBalanceException(int accountNumber, String message, double deficit) {
        super(accountNumber, message);
        this.deficit=deficit;
    }

    public double getDeficit() {
        return deficit;
    }
}
