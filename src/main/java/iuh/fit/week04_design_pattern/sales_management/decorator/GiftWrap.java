package iuh.fit.week04_design_pattern.sales_management.decorator;

import iuh.fit.week04_design_pattern.sales_management.model.Product;

public class GiftWrap extends ProductDecorator{
    public GiftWrap(Product product) {
        super(product);
    }
    @Override
    public void displayInfor() {
        super.displayInfor();
        System.out.println("Gift wrapped");
    }
}
