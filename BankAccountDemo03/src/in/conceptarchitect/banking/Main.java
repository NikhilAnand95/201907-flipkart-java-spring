package in.conceptarchitect.banking;

public class Main {

    static void showAccount(BankAccount account){
        System.out.println("Account Number:"+account.getAccountNumber());
        System.out.println("Name:"+account.getName());
        System.out.println("Balance:"+account.getBalance());
        System.out.println("Interest Rate:"+account.getInterestRate());
        System.out.println();
    }

    static void testTransfer(BankAccount source, BankAccount target, int amount, String password){

        if(BankAccount.transfer(source,target,amount,password))
            System.out.println("Transfer Success");
        else
            System.out.println("Transfer Failed");
    }


    public static void main(String[] args) {
	// write your code here
        BankAccount a1=new SavingsAccount("Vivek",20000, "p@ss");
        BankAccount a2=new BankAccount("Shivanshi",20000, "p@ss");

        testTransfer(a1,a2,1000,"p@ss");
        testTransfer(a1,a2,1000,"wrong-password");
        testTransfer(a1,a2,-1000,"p@ss");
        testTransfer(a1,a2,30000,"p@ss");





        //basicTest(a1);




    }

    private static void basicTest(BankAccount a1) {
        showAccount(a1);
        BankAccount.setInterestRate(18);
        a1.creditInterest();

        a1.deposit(10000);

        showAccount(a1);

        System.out.println(a1.withdraw(27000,"p@ss"));

        System.out.println(a1.withdraw(24000,"p@ss"));

        showAccount(a1);
    }
}
