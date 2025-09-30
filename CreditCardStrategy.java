public class CreditCardStrategy implements PaymentStrategy {
    @Override
    public void processPayment(PaymentDetails details) {
        System.out.println("✅ Processing Credit Card payment of " + details.getFormattedAmount());
    }
