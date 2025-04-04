package iuh.fit.week04_design_pattern.pay_management.model;

import iuh.fit.week04_design_pattern.pay_management.strategy.PaymentMethod;

public class Pay {
    private PaymentMethod paymentMethod;

    public Pay(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void executePayment(double amount) {
        paymentMethod.pay(amount);
    }
}
