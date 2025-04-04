package iuh.fit.week04_design_pattern.order_management;

import iuh.fit.week04_design_pattern.order_management.factory.OrderManager;
import iuh.fit.week04_design_pattern.order_management.model.Order;

public class OrderSystem {
    public static void main(String[] args) {
        OrderManager orderManager = new OrderManager();
        Order order = orderManager.createOrder();

        order.handleOrder();
        order.processPayment();
        order.shipOder();
        order.decorateOrder();
        order.handleOrder();
        order.handleOrder();
    }
}
