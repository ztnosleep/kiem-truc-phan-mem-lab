package iuh.fit.week04_design_pattern.sales_management.strategy;

import iuh.fit.week04_design_pattern.sales_management.model.Product;

public interface TaxStrategy {
    double calculateTax(Product product);
}
