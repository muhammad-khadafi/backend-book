package com.tutorial.vue.books_app.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.tutorial.vue.books_app.model.Book;


@Service
public class BookServiceImpl implements BookService {

    private List<Book> books = new ArrayList<>();
    private Long currentId = 1L;

    @Override
    public List<Book> getAllBooks() {
        return books;
    }

    @Override
    public Book getBookById(Long id) {
        return books.stream()
                .filter(book -> book.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public Book createBook(Book book) {
        book.setId(currentId++);
        books.add(book);
        return book;
    }

    @Override
    public Book updateBook(Long id, Book updatedBook) {
        Optional<Book> existingBookOptional = books.stream()
                .filter(book -> book.getId().equals(id))
                .findFirst();

        if (existingBookOptional.isPresent()) {
            Book existingBook = existingBookOptional.get();
            existingBook.setKodeBuku(updatedBook.getKodeBuku());
            existingBook.setJudul(updatedBook.getJudul());
            existingBook.setGenre(updatedBook.getGenre());
            existingBook.setPenulis(updatedBook.getPenulis());
            existingBook.setHarga(updatedBook.getHarga());
            return existingBook;
        }

        return null;
    }

    @Override
    public void deleteBook(Long id) {
        books.removeIf(book -> book.getId().equals(id));
    }
}

