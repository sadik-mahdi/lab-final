package bank;
public class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double balance){
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount){
        if(amount > 0){
            this.balance += amount;
        }
    }
    public void withdraw(double amount){
        if(amount > 0){
            this.balance -= amount;
        }
    };

    public double getbalance(){
        return this.balance;
    };

    public String getaccountHolder(){
        return this.accountHolder;
    };

}
