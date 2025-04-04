package iuh.fit.week04_design_pattern.order_management.strategy;

import iuh.fit.week04_design_pattern.order_management.model.Order;

public class StandardShipping implements ShipmentStrategy {

    @Override
    public void ship(Order order) {
        System.out.println("Delivered order by a standard shipment method");
    }
}
