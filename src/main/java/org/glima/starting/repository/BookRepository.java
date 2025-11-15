package org.glima.starting.repository;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.PathParam;
import org.glima.starting.Book;

import java.util.List;
import java.util.Optional;

@ApplicationScoped
public class BookRepository {

    public List<Book> getAllBooks() {
        return List.of(
                new Book(1, "Understanting Quarkus", "Antonio Goncalves", 2020, "IT"),
                new Book(2, "Practsing Quarkus", "Antonio Goncalves", 2020, "IT"),
                new Book(3, "Effective Java", "Josh Blocj", 2001, "IT"),
                new Book(3, "Thinking in Java", "Bruce Eckel", 1998, "IT")
        );
    }

    public int countAllBooks() {

        return getAllBooks().size();
    }

    public Optional<Book> getBook(@PathParam("id") int id) {

        return getAllBooks().stream()
                .filter(book -> book.id == id).findFirst();
    }
}
