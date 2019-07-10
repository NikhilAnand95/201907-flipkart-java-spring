package in.conceptarchitect.banking;

import in.conceptarchitect.utils.Input;

public class Main {

    static void showAccount(BankAccount account){
        System.out.println("Account Number:"+account.getAccountNumber());
        System.out.println("Name:"+account.getName());
        System.out.println("Balance:"+account.getBalance());
        System.out.println("Interest Rate:"+account.getInterestRate());
        System.out.println();
    }

    public static void main(String[] args) {
	// write your code here
        BankAccount a1=new SavingsAccount("Vivek",20000, "p@ss");




        tryWithdraw(a1);

        showAccount(a1);




    }

    private static void tryWithdraw(BankAccount a1) {


        try {
            String password= Input.readString("password?");
            int amount=Input.readInt("Amount?");
            a1.withdraw(amount, password);
            System.out.println("Amount withdrawn successfully");
        }catch(InsufficientBalanceException ex){
            System.out.printf("Error with Account %d: Insufficient Balance. Deficit= %f\n", ex.getAccountNumber(), ex.getDeficit());
        }
        catch(BankingException ex){
            System.out.printf("Error with Account %d: %s\n", ex.getAccountNumber(), ex.getMessage());

        }
        finally{
            System.out.println("witdraw workflow finally");
        }

        System.out.println("witdraw workflow completed");
    }


    private static void tryWithdraw2(BankAccount a1) {
        try {
            String password= Input.readString("password?");
            int amount=Input.readInt("Amount?");
            a1.withdraw(amount, password);
            System.out.println("Amount withdrawn successfully");
        }catch(RuntimeException ex){
            System.out.println("Error: "+ex.getMessage());
        }

    }

    private static void tryWithdraw1(BankAccount a1) {
        try {
            String password= Input.readString("password?");
            int amount=Input.readInt("Amount?");
            a1.withdraw(amount, password);
            System.out.println("Amount withdrawn successfully");
        }catch(InvalidCredentialsException ex){
            System.out.println("Error: Invalid Credentials");
        }
        catch(InsufficientBalanceException ex){
            System.out.println("Error: Insufficient Balance");
        }
        catch(InvalidDenominationException ex){
            System.out.println("Error: Invalid Amount");
        }
    }
}
