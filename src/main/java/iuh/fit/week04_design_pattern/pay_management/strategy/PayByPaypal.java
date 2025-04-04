package iuh.fit.week04_design_pattern.pay_management.strategy;

public class PayByPaypal implements PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println("Pay By Paypal: "+ amount);
    }
}
