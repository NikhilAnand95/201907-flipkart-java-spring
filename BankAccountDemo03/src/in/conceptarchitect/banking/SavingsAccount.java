package in.conceptarchitect.banking;

public class SavingsAccount extends BankAccount{



    public SavingsAccount(String name, int amount, String password ) {//:BankAccount(name,amount,password)
        super(name,amount,password);

    }

    public boolean withdraw(double amount, String password){

        if(amount> balance-5000)
            return false;
        else
            //do whatever you were doing earlier
            return super.withdraw(amount,password);

//        if(amount<0)
//            return false;
//        if (amount>balance)
//            return false;
//        if(! this.password.equals(password))
//            return false;
//        balance-=amount;
//        return true;
    }



}
