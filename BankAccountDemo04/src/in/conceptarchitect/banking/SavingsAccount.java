package in.conceptarchitect.banking;

public class SavingsAccount extends BankAccount{



    public SavingsAccount(String name, int amount, String password ) {//:BankAccount(name,amount,password)
        super(name,amount,password);

    }

    public void withdraw(double amount, String password){

        if(amount> balance+5000)
            throw new InsufficientBalanceException(getAccountNumber(),"Insufficient Min Balance", amount-balance-5000);
        super.withdraw(amount,password);

    }



}
