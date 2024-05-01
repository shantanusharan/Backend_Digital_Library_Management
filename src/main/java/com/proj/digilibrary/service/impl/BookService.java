package com.proj.digilibrary.service.impl;

import com.proj.digilibrary.domain.Book;
import com.proj.digilibrary.domain.Review;

import java.util.List;

public interface BookService {

    public void addBook(Book book);
    public List<Book> getAllBooks();
    public Book getBook(String Id);

    public void deleteBook(String Id);

    public Book updateBook(String Id, Book book);
    public void addReview(String bookId, Review review);

}
