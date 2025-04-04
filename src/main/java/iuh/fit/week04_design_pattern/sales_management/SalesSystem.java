package iuh.fit.week04_design_pattern.sales_management;

import iuh.fit.week04_design_pattern.sales_management.decorator.GiftWrap;
import iuh.fit.week04_design_pattern.sales_management.decorator.SpecialPackaging;
import iuh.fit.week04_design_pattern.sales_management.model.Product;
import iuh.fit.week04_design_pattern.sales_management.state.AvailableState;
import iuh.fit.week04_design_pattern.sales_management.state.ProductState;
import iuh.fit.week04_design_pattern.sales_management.state.SoldOurState;
import iuh.fit.week04_design_pattern.sales_management.strategy.ConsumptionTax;
import iuh.fit.week04_design_pattern.sales_management.strategy.LuxuryTax;
import iuh.fit.week04_design_pattern.sales_management.strategy.TaxStrategy;
import iuh.fit.week04_design_pattern.sales_management.strategy.VATTax;

public class SalesSystem {
    public static void main(String[] args) {
        Product TV = new  Product("TV", 1000.0);

        TaxStrategy consumptionTax = new ConsumptionTax();
        TaxStrategy vatTax = new VATTax();
        TaxStrategy luxuryTax = new LuxuryTax();

        double consumptionTaxValue = consumptionTax.calculateTax(TV);
        double vatTaxValue = vatTax.calculateTax(TV);
        double luxuryTaxValue = luxuryTax.calculateTax(TV);

        System.out.println("Consumption Tax: " + consumptionTaxValue);
        System.out.println("Vat Tax: " + vatTaxValue);
        System.out.println("Luxury Tax: " + luxuryTaxValue);

        Product tvSpecial = new SpecialPackaging(TV);
        Product gift = new GiftWrap(tvSpecial);

        System.out.println("Product with Decorator: " );
        gift.displayInfor();

        ProductState availableState = new AvailableState();
        ProductState soldOut = new SoldOurState();

        System.out.println("State Pattern: ");
        availableState.handle(TV);
        soldOut.handle(TV);
    }
}
