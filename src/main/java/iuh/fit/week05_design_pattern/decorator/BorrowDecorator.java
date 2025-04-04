package iuh.fit.week05_design_pattern.decorator;

public abstract class BorrowDecorator implements Borrowable {
    protected Borrowable borrowable;

    public BorrowDecorator(Borrowable borrowable) {
        this.borrowable = borrowable;
    }

    @Override
    public void borrow() {
        borrowable.borrow();
    }
}
