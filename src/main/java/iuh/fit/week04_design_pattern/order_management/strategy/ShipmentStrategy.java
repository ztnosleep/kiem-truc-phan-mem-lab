package iuh.fit.week04_design_pattern.order_management.strategy;

import iuh.fit.week04_design_pattern.order_management.model.Order;

public interface ShipmentStrategy {
    void ship(Order order);
}
