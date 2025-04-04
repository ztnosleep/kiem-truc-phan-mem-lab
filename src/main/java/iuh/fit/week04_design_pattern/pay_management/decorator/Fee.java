package iuh.fit.week04_design_pattern.pay_management.decorator;

import iuh.fit.week04_design_pattern.pay_management.strategy.PaymentMethod;

public class Fee extends PayDecorator {
    public Fee(PaymentMethod pay) {
        super(pay);
    }
    @Override
    public void pay(double amount) {
        double fee = 0.05 * amount;
        pay.pay(amount+fee);
        System.out.println("Fee successfully paid with fee " + fee);
    }
}
