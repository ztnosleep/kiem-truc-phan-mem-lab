package iuh.fit.week04_design_pattern.sales_management.state;

import iuh.fit.week04_design_pattern.sales_management.model.Product;

public interface ProductState {
    void handle(Product product);
}
