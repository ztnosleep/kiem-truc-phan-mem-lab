package iuh.fit.week04_design_pattern.order_management.decorator;

import iuh.fit.week04_design_pattern.order_management.model.Order;

public abstract class OrderDecorator {
    public abstract void decorate(Order order);
}
