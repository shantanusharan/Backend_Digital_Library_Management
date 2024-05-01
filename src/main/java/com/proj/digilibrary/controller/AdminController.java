package com.proj.digilibrary.controller;

import com.proj.digilibrary.domain.Book;
import com.proj.digilibrary.service.impl.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AdminController {

    @Autowired
    BookService bookService;
    @PostMapping("/admin/book")

    public void createBook(@RequestBody Book book){
      bookService.addBook(book);
    }

    @PutMapping("/admin/book")
    public Book updateBook(@RequestParam("bookId") String id,@RequestBody Book book){
        bookService.updateBook(id,book);
    }
    @  DeleteMapping("/admin/book/")
    public void deleteBook(@RequestParam("bookID") String id){

    }
}
