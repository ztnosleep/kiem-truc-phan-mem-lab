package iuh.fit.week04_design_pattern.order_management.strategy;

import iuh.fit.week04_design_pattern.order_management.model.Order;

public class CreditCardPayment implements PaymentStrategy{

    @Override
    public void payment(Order order) {
        System.out.println("Pay with CreditCard Payment method");
    }
}
