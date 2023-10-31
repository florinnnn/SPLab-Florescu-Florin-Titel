package ro.uvt.info.designpatterlab2023.model;

import java.util.List;
import java.util.ArrayList;
public class Book {
    private String title;
    private List<Author> authors = new ArrayList<>();
    private List<TextElement> contents = new ArrayList<>();

    public Book(String title) {
        this.title = title;
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public void addContent(TextElement content) {
        contents.add(content);
    }

    public void print() {
        System.out.println("Book: " + title);
        System.out.println("Authors:");
        for (Author author : authors) {
            author.print();
        }
        for (TextElement content : contents) {
            content.print();
        }
    }
}