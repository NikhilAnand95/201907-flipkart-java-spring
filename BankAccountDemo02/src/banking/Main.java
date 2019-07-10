package banking;

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
        BankAccount a1=new BankAccount(1,"Vivek",20000, "p@ss");
        BankAccount a2=new BankAccount(1,"Shivanshi",30000,"password1");

        showAccount(a1);
        showAccount(a2);

        //a1.setInterestRate(15);

        BankAccount.setInterestRate(18);



        showAccount(a1);
        showAccount(a2);




    }
}
