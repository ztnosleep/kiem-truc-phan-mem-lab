package iuh.fit.week04_design_pattern.pay_management.decorator;

import iuh.fit.week04_design_pattern.pay_management.strategy.PaymentMethod;

public abstract class PayDecorator implements PaymentMethod {
    protected PaymentMethod pay;

    public PayDecorator(PaymentMethod pay) {
        this.pay = pay;
    }

    public abstract void pay(double amount);
}
