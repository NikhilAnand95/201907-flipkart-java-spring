package in.conceptarchitect.banking;

public class Main {

    static void showAccount(BankAccount account){
        System.out.println("Account Number:"+account.getAccountNumber());
        System.out.println("Balance:"+account.getBalance());

    }

    public static void main(String[] args) {
	// write your code here
        BankAccount a1=new BankAccount(1,20000, "p@ss",12);

        a1.creditInterest();

        System.out.println(a1.getBalance());

        System.out.println(a1.withdraw(30000,"p@ss"));
        System.out.println(a1.withdraw(20000,"pass"));

        System.out.println(a1.withdraw(20000,"p@ss"));

        System.out.println(a1.getBalance());


        showAccount(a1);


    }
}
