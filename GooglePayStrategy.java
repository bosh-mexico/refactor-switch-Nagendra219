public class GooglePayStrategy implements PaymentStrategy {
    @Override
    public void processPayment(PaymentDetails details) {
        
        System.out.println("✅ Processing GooglePay payment of " + details.getFormattedAmount());
       
    }
}
