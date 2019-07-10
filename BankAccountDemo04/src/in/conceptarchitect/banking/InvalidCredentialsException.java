package in.conceptarchitect.banking;

public class InvalidCredentialsException extends  BankingException{


    public InvalidCredentialsException(int accountNumber, String message) {
        super(accountNumber, message);
    }
}
