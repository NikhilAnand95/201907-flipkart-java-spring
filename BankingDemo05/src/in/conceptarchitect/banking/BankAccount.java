package in.conceptarchitect.banking;

public class BankAccount {

    private int accountNumber;
    private String name;
    protected double balance;
    protected String password;
    private static  double interestRate;//=12;
    private static int accountCount=0;

    static{
        interestRate=12;
    }

    public BankAccount( String name, double balance, String password) {
        this.accountNumber = ++accountCount;
        this.name = name;
        this.balance = balance;
        this.password = password;
        //this.interestRate = interestRate;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void deposit(double amount) throws InvalidDenominationException {

        checkDenomination(amount);
        balance += amount;



    }

    private void authenticate(String password) throws InvalidCredentialsException {
        if(! this.password.equals(password))
            throw new InvalidCredentialsException(accountNumber,"Invalid Credentials");
    }

    public void withdraw(double amount,String password) throws InvalidCredentialsException, InsufficientBalanceException, InvalidDenominationException, BankingException {
        checkDenomination(amount);
        if (amount>balance)
            throw new InsufficientBalanceException(accountNumber,"Insufficient Balance", amount-balance);
        authenticate(password);
        balance-=amount;
    }

    public static void transfer(BankAccount source, BankAccount target,int amount, String password) throws BankingException{
        if(source==null)
            throw new BankingException(0,"Invalid Source Account");
        if (target==null)
            throw new BankingException(0,"Invalid Target Account");

        source.withdraw(amount,password);
        target.deposit(amount);

    }

    private void checkDenomination(double amount) throws InvalidDenominationException{
        if(amount<0)
            //return false;
            throw new InvalidDenominationException(accountNumber,"Amount Must be Positive");
    }





    public void creditInterest(){
        balance+=(balance*interestRate/1200);
    }


    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double rate){
        interestRate=rate;
    }
}
