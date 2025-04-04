package iuh.fit.week04_design_pattern.order_management.decorator;

import iuh.fit.week04_design_pattern.order_management.model.Order;

public class NotificationDecorator extends OrderDecorator{


    @Override
    public void decorate(Order order) {
        System.out.println("Order will receive a notification when state is changed.");
    }
}
