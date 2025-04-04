package iuh.fit.week04_design_pattern.order_management.state;

import iuh.fit.week04_design_pattern.order_management.model.Order;

public interface OrderState {
    void handleOrder(Order order);
}
