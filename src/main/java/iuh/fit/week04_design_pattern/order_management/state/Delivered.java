package iuh.fit.week04_design_pattern.order_management.state;

import iuh.fit.week04_design_pattern.order_management.model.Order;

public class Delivered implements OrderState{

    @Override
    public void handleOrder(Order order) {
        System.out.println("Update state of order is Delivered");
    }
}
