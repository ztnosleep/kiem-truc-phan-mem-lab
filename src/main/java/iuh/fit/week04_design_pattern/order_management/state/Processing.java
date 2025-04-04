package iuh.fit.week04_design_pattern.order_management.state;

import iuh.fit.week04_design_pattern.order_management.model.Order;

public class Processing implements OrderState {

    @Override
    public void handleOrder(Order order) {
        System.out.println("Pack and Delivery");
        order.setState(new Delivered());
    }
}
