package payment.service;

import payment.model.PaymentResult;

import java.util.Random;

public class CreditCardPayment implements PaymentService {

    @Override
    public PaymentResult makePayment(double amount) {
        if(amount<=0){
            return new PaymentResult(false,"Invalid amount for credit card Payment");
        }
        boolean processed = new Random().nextInt(10)<9;    //90% success
        String msg = processed ? "Credit Card Payement Successful: RS" +amount
                : "Credit Card Payment failed due to bank Error";
        return new PaymentResult(processed,msg);
    }
}
