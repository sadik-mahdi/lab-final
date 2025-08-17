package pay;

public class Main {
    public static void main(String[] args) {
        CreditCard creditCardPayment = new CreditCard();
        Paypal payPalPayment = new Paypal();

        creditCardPayment.makePayment(100.0);
        payPalPayment.makePayment(100.0);

        System.out.println(); 

        Circle circle = new Circle(5.0);
        Square square = new Square(4.0);
        
        System.out.println("Circle Info:");
        circle.showinfo();
        System.out.println("Circle Area: " + circle.getArea());

        System.out.println("\nSquare Info:");
        square.showinfo();
        System.out.println("Square Area: " + square.getArea());
        
    }

}
