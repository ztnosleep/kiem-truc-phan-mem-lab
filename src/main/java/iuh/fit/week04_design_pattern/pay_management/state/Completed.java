package iuh.fit.week04_design_pattern.pay_management.state;

public class Completed implements PayState {
    @Override
    public void PayProcess() {
        System.out.println("Pay Success");
    }
}
