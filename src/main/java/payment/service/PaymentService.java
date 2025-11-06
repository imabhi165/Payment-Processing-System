package payment.service;

import payment.model.PaymentResult;

public interface PaymentService {
    /**
     *    @param amount amount to be paid
     * @return PaymentResult describing success/fai;ure and message
     */
    PaymentResult makePayment(double amount);

}
