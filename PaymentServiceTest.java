import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.never;

@ExtendWith(MockitoExtension.class)
public class PaymentServiceTest {

    
    @Mock
    private PaymentStrategy mockPaymentStrategy;
    private PaymentDetails paymentDetails;

    @BeforeEach
    void setUp() {
        paymentDetails = new PaymentDetails(100.00, "EUR");
    }

    @Test
    void shouldProcessPaymentWithTheProvidedStrategy() {
        PaymentServiceTest paymentService = new CheckoutService(mockPaymentStrategy);
        paymentService.performCheckout(paymentDetails);
        verify(mockPaymentStrategy).processPayment(paymentDetails);
    }
    
    @Test
    void shouldNotProcessPaymentIfNoStrategyIsProvided() {
        PaymentServiceTest paymentService = new CheckoutService(null);
        paymentService.performCheckout(paymentDetails);
        verify(mockPaymentStrategy, never()).processPayment(paymentDetails);
    }
}
