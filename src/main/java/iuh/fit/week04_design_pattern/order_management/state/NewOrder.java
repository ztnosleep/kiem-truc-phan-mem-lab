package iuh.fit.week04_design_pattern.order_management.state;

import iuh.fit.week04_design_pattern.order_management.model.Order;

public class NewOrder implements OrderState{

    @Override
    public void handleOrder(Order order) {
        System.out.println("Ckeck information for new order");
        order.setState(new Processing());
    }
}
