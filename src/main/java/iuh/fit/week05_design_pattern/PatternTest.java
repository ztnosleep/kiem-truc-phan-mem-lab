package iuh.fit.week05_design_pattern;

import iuh.fit.week05_design_pattern.decorator.BasicBorrow;
import iuh.fit.week05_design_pattern.decorator.Borrowable;
import iuh.fit.week05_design_pattern.decorator.ExtendedBorrow;
import iuh.fit.week05_design_pattern.decorator.SpecialEditionBorrow;
import iuh.fit.week05_design_pattern.factory.BookFactory;
import iuh.fit.week05_design_pattern.model.Book;
import iuh.fit.week05_design_pattern.model.User;
import iuh.fit.week05_design_pattern.singleton.Library;
import iuh.fit.week05_design_pattern.strategy.SearchByAuthor;
import iuh.fit.week05_design_pattern.strategy.SearchByTitle;
import iuh.fit.week05_design_pattern.strategy.SearchStrategy;

import java.util.List;

public class PatternTest {
    public static void main(String[] args) {
        Library library = Library.getInstance();

        // Tạo người dùng (Observer)
        User user1 = new User("Alice");
        User user2 = new User("Bob");

        library.addObserver(user1);
        library.addObserver(user2);

        // Tạo sách (Factory Method)
        Book book1 = BookFactory.createBook("physical", "Harry Potter", "J.K. Rowling", "Fantasy");
        Book book2 = BookFactory.createBook("ebook", "Clean Code", "Robert C. Martin", "Programming");
        Book book3 = BookFactory.createBook("audiobook", "1984", "George Orwell", "Dystopian");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Chiến lược tìm kiếm (Strategy Pattern)
        SearchStrategy searchByTitle = new SearchByTitle();
        SearchStrategy searchByAuthor = new SearchByAuthor();

        System.out.println("Search by Title:");
        List<Book> result = searchByTitle.search(library.getBooks(), "Harry Potter");
        result.forEach(Book::displayInfo);

        System.out.println("\nSearch by Author:");
        result = searchByAuthor.search(library.getBooks(), "Robert C. Martin");
        result.forEach(Book::displayInfo);

        // Thêm Decorator Pattern
        System.out.println("\nBorrowing Books:");
        Borrowable basicBorrow = new BasicBorrow();
        basicBorrow.borrow();

        Borrowable extendedBorrow = new ExtendedBorrow(basicBorrow);
        extendedBorrow.borrow();

        Borrowable specialEditionBorrow = new SpecialEditionBorrow(basicBorrow);
        specialEditionBorrow.borrow();
    }
}
