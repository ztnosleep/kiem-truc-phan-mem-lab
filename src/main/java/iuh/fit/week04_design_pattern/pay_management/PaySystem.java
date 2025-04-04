package iuh.fit.week04_design_pattern.pay_management;

import iuh.fit.week04_design_pattern.pay_management.decorator.Fee;
import iuh.fit.week04_design_pattern.pay_management.decorator.Voucher;
import iuh.fit.week04_design_pattern.pay_management.model.Pay;
import iuh.fit.week04_design_pattern.pay_management.state.Completed;
import iuh.fit.week04_design_pattern.pay_management.state.PayState;
import iuh.fit.week04_design_pattern.pay_management.state.Processing;
import iuh.fit.week04_design_pattern.pay_management.strategy.PayByCredit;
import iuh.fit.week04_design_pattern.pay_management.strategy.PaymentMethod;

public class PaySystem {
    public static void main(String[] args) {
        PaymentMethod credit = new PayByCredit();
        Pay pay = new Pay(credit);
        PaymentMethod payFee = new Fee(credit);
        PaymentMethod payVoucher = new Voucher(payFee);

        pay.setPaymentMethod(payVoucher);
        pay.executePayment(2000);

        PayState state = new Processing();
        state.PayProcess();

        state = new Completed();
        state.PayProcess();
    }
}
