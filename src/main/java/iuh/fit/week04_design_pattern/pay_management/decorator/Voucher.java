package iuh.fit.week04_design_pattern.pay_management.decorator;

import iuh.fit.week04_design_pattern.pay_management.strategy.PaymentMethod;

public class Voucher extends PayDecorator{

    public Voucher(PaymentMethod pay) {
        super(pay);
    }
    public void pay(double amount) {
        double discount = amount * 0.1;
        pay.pay(amount - discount);
        System.out.println("Fee successfully paid with discount " + discount);
    }
}
