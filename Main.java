package bank;
public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("John", 1000);
        System.out.println("Account Holder: " + account.getaccountHolder());
        System.out.println("Current Balance: $" + account.getbalance());

        account.deposit(500);
        System.out.println("Balance after deposit: $" + account.getbalance());

        account.withdraw(200);
        System.out.println("Final Balance: $" + account.getbalance());
    }
}