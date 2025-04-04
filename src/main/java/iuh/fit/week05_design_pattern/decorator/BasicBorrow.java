package iuh.fit.week05_design_pattern.decorator;

public class BasicBorrow implements Borrowable{
    @Override
    public void borrow() {
        System.out.println("Borrowing a book...");
    }
}
