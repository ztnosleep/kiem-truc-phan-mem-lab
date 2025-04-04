package iuh.fit.week04_design_pattern.order_management.strategy;

import iuh.fit.week04_design_pattern.order_management.model.Order;

public class PaypalPayment implements PaymentStrategy{
    private String email;
    public PaypalPayment(String email) {
        this.email = email;
    }
    @Override
    public void payment(Order order) {
        System.out.println("Pay with Paypal");
    }
}
