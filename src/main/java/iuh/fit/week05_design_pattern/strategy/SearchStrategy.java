package iuh.fit.week05_design_pattern.strategy;

import iuh.fit.week05_design_pattern.model.Book;

import java.util.List;

public interface SearchStrategy {
    List<Book> search(List<Book> books, String query);
}