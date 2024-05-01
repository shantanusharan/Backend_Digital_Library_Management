package com.proj.digilibrary.controller;

import com.proj.digilibrary.domain.Book;
import com.proj.digilibrary.domain.Review;
import com.proj.digilibrary.service.impl.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    BookService bookService;

    @GetMapping("/book")
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();

    }
    @GetMapping("/book/{id}")
    public Book getBook(@PathVariable("id") String bookId){
        return bookService.getBook(bookId);
    }
    @PostMapping("{bookId}/review")
    public void addReview(@PathVariable("bookId") String bookId, @RequestBody Review review){
        bookService.addReview(bookId,review);
    }
}
// Two ways to read from the GET API
