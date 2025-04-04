package iuh.fit.week04_design_pattern.order_management.state;

import iuh.fit.week04_design_pattern.order_management.model.Order;

public class Cancelled implements OrderState{

    @Override
    public void handleOrder(Order order) {
        System.out.println("Cancel order and Refund");
    }
}
