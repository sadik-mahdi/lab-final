package pay;

public class CreditCard implements Payment {
	@Override
	public void makePayment(double amount) {
		System.out.println("Paid " + amount + " using Credit Card.");
	}
}
