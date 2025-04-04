package iuh.fit.week04_design_pattern.sales_management.state;

import iuh.fit.week04_design_pattern.sales_management.model.Product;

public class SoldOurState implements ProductState {

    @Override
    public void handle(Product product) {
        System.out.println(product.getName() + " is sold out");
    }
}
