package iuh.fit.week04_design_pattern.order_management.factory;

import iuh.fit.week04_design_pattern.order_management.decorator.NotificationDecorator;
import iuh.fit.week04_design_pattern.order_management.model.Order;
import iuh.fit.week04_design_pattern.order_management.state.NewOrder;
import iuh.fit.week04_design_pattern.order_management.strategy.CreditCardPayment;
import iuh.fit.week04_design_pattern.order_management.strategy.StandardShipment;

public class OrderManager {
    public Order createOrder(){
        Order order = new Order();
        order.setState(new NewOrder());
        order.setPaymentStrategy(new CreditCardPayment());
        order.setShipmentStrategy(new StandardShipment());
        order.setDecorator(new NotificationDecorator());
        return order;
    }
}
