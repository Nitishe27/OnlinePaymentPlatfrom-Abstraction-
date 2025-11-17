package com.onlinepaymentplatform.service;
import com.onlinepaymentplatform.model.Payment;
import org.springframework.stereotype.Service;

public class PaymentServiceImpl implements PaymentService {

    @Override
    public String makePayment(Payment payment){
        payment.processPayment();
        return "Payment of " + payment.getAmount() + "processed successfully !";
    }
}
