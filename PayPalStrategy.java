public class PayPalStrategy implements PaymentStrategy {
    @Override
    public void processPayment(PaymentDetails details) {
        
        System.out.println("✅ Processing PayPal payment of " + details.getFormattedAmount());
      
    }
}
