package iuh.fit.week05_design_pattern.factory;

import iuh.fit.week05_design_pattern.model.AudioBook;
import iuh.fit.week05_design_pattern.model.Book;
import iuh.fit.week05_design_pattern.model.EBook;
import iuh.fit.week05_design_pattern.model.PhysicalBook;

public class BookFactory {
    public static Book createBook(String type, String title, String author, String genre) {
        return switch (type.toLowerCase()) {
            case "physical" -> new PhysicalBook(title, author, genre);
            case "ebook" -> new EBook(title, author, genre);
            case "audiobook" -> new AudioBook(title, author, genre);
            default -> throw new IllegalArgumentException("Invalid book type: " + type);
        };
    }
}
