package iuh.fit.week04_design_pattern.order_management.model;

import iuh.fit.week04_design_pattern.order_management.decorator.OrderDecorator;
import iuh.fit.week04_design_pattern.order_management.state.NewOrder;
import iuh.fit.week04_design_pattern.order_management.state.OrderState;
import iuh.fit.week04_design_pattern.order_management.strategy.PaymentStrategy;
import iuh.fit.week04_design_pattern.order_management.strategy.ShipmentStrategy;

public class Order {
    private OrderState state;
    private PaymentStrategy paymentStrategy;
    private ShipmentStrategy shipmentStrategy;
    private OrderDecorator decorator;

    public Order(){
        state = new NewOrder();
    }
    public void setState(OrderState state) {
        this.state = state;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void setShipmentStrategy(ShipmentStrategy shipmentStrategy) {
        this.shipmentStrategy = shipmentStrategy;
    }

    public void setDecorator(OrderDecorator decorator) {
        this.decorator = decorator;
    }

    public void handleOrder() {
        state.handleOrder(this);
    }
    public void processPayment() {
        paymentStrategy.payment(this);
    }
    public void shipOder() {
        shipmentStrategy.ship(this);
    }

    public void decorateOrder() {
        if (decorator != null) {
            decorator.decorate(this);
        }
    }
}
