package payment.service;

import payment.model.PaymentResult;

import java.util.Random;

public class UPIPayment implements PaymentService {

    @Override
    public PaymentResult makePayment(double amount) {
        if (amount <= 0) {
            return new PaymentResult(false, "Invalid amount for UPI payment");
        }
        // Simulate UPI quick flow
        boolean processed = new Random().nextInt(10) < 9; // 90% success
        String msg = processed ? "UPI payment successful: ₹" + amount
                : "UPI payment failed: UPI timeout";
        return new PaymentResult(processed, msg);
    }
}