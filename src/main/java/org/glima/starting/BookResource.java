package org.glima.starting;


import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;
import java.util.Optional;

@Path("/api/books")
public class BookResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Book> getAllBooks() {
        return List.of(
                new Book(1, "Understanting Quarkus", "Antonio Goncalves", 2020, "IT"),
                new Book(2, "Practsing Quarkus", "Antonio Goncalves", 2020, "IT"),
                new Book(3, "Effective Java", "Josh Blocj", 2001, "IT"),
                new Book(3, "Thinking in Java", "Bruce Eckel", 1998, "IT")
        );
    }

    @GET
    @Path("/count")
    @Produces(MediaType.TEXT_PLAIN)
    public int countAllBooks() {

        return getAllBooks().size();
    }

    @GET
    @Path("{id}")
    public Optional<Book> getBook(@PathParam("id") int id) {

        return getAllBooks().stream()
                .filter(book -> book.id == id).findFirst();
    }
}
