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

    public boolean deposit(double amount){
        if(amount>0) {
            balance += amount;
            return true;
        }
        else{
            return false;
        }
    }

    public boolean withdraw(double amount,String password){
        if(amount<0)
            return false;
        if (amount>balance)
            return false;
        if (authenticate(password))
            return false;
        balance-=amount;
        return true;
    }

    private boolean authenticate(String password) {
        if(! this.password.equals(password))
            return true;
        return false;
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

    public static boolean transfer(BankAccount source, BankAccount target, int amount, String password){

        if (source==null)
            return false;
        if(target==null)
            return false;
        if (!source.withdraw(amount,password))
            return false;

        return target.deposit(amount);


    }
}
