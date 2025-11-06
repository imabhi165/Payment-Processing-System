package payment.processor;

import payment.model.PaymentResult;
import payment.service.PaymentService;

import java.util.Objects;

public class PaymentProcessor {
    private final PaymentService paymentService;

    // Constructor injection -> dependency provided from outside
    public PaymentProcessor(PaymentService paymentService) {
        this.paymentService = Objects.requireNonNull(paymentService, "paymentService cannot be null");
    }

    public PaymentResult process(double amount) {
        // Some pre-processing checks could go here (logging, validation, etc.)
        if (amount <= 0) {
            return new PaymentResult(false, "Amount must be greater than 0");
        }
        // Delegate to the injected PaymentService
        return paymentService.makePayment(amount);
    }
}
