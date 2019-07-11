package in.conceptarchitect.banking;

public class BankingException extends Exception{

    int accountNumber;

    public BankingException(int accountNumber,String message) {
        super(message);
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}
