package in.conceptarchitect.banking;

public class InvalidDenominationException extends BankingException{

    public InvalidDenominationException(int accountNumber, String message) {
        super(accountNumber, message);
    }
}
