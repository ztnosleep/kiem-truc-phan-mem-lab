package iuh.fit.week04_design_pattern.sales_management.decorator;

import iuh.fit.week04_design_pattern.sales_management.model.Product;

public abstract class ProductDecorator extends Product {
    protected Product product;
    public ProductDecorator(Product product) {
        super(product.getName(), product.getPrice());
        this.product = product;
    }
    @Override
    public void displayInfor(){
        product.displayInfor();
    }
}
