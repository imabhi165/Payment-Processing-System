package payment.service;

import payment.model.PaymentResult;

import java.util.Random;

public class PayPalPayment implements PaymentService {

    @Override
    public PaymentResult makePayment(double amount) {
        if (amount <= 0) {
            return new PaymentResult(false, "Invalid amount for PayPal payment");
        }
        // Simulate PayPal: slightly lower success to show difference
        boolean processed = new Random().nextInt(10) < 8; // 80% success
        String msg = processed ? "PayPal payment successful: ₹" + amount
                : "PayPal payment failed: account issue";
        return new PaymentResult(processed, msg);
    }
}