package pay;

public class Paypal implements Payment{
    public void makePayment(double amount){
        System.out.println("Paid" + amount + "Using Paypal");
    }
    
}
