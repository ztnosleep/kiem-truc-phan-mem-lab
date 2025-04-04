package iuh.fit.week04_design_pattern.sales_management.strategy;

import iuh.fit.week04_design_pattern.sales_management.model.Product;

public class VATTax implements TaxStrategy {
    @Override
    public double calculateTax(Product product) {
        return product.getPrice()*0.08;
    }
}
