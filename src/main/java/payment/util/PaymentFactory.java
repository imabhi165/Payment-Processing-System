package payment.util;


import payment.service.CreditCardPayment;
import payment.service.PayPalPayment;
import payment.service.PaymentService;
import payment.service.UPIPayment;

public final class PaymentFactory {

    private PaymentFactory() {}

    /**
     * Create PaymentService based on type string.
     * You could replace this with reflection or config-based wiring.
     */
    public static PaymentService create(String type) {
        switch (type.toLowerCase()) {
            case "card":
            case "1":
                return new CreditCardPayment();
            case "upi":
            case "2":
                return new UPIPayment();
            case "paypal":
            case "3":
                return new PayPalPayment();
            default:
                throw new IllegalArgumentException("Unknown payment type: " + type);
        }
    }
}