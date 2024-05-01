package com.proj.digilibrary.service.impl;

import com.proj.digilibrary.domain.Book;
import com.proj.digilibrary.domain.Review;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl implements BookService{

    private List<Book> bookList = new ArrayList<>();



    public void addBook(Book book){
        bookList.add(book);
    }
    public List<Book> getAllBooks(){
        return bookList;
    }

    public Book getBook(String Id){

        for(int i=0; i<bookList.size();i++){
            if(bookList.get(i).getId().equals(Id)){
               return bookList.get(i);

            }
        }
      return null;
        }

    public void deleteBook(String Id){
        int index=-1;
        for(int i=0; i<bookList.size();i++){
            if(bookList.get(i).getId().equals(Id)){
                index=i;
                break;
            }
        }
        if(index!= -1){
            bookList.remove(index);
        }
    }

    public Book updateBook(String Id, Book book){
        int index=-1;
        for(int i=0; i<bookList.size();i++){
            if(bookList.get(i).getId().equals(Id)){
                index=i;
                break;
            }
        }
        if(index!= -1){
            bookList.set(index, book);
            return book;
        }
        return null;
    }

    @Override
    public void addReview(String bookId, Review review) {
        int index=-1;
        for(int i=0; i<bookList.size();i++){
            if(bookList.get(i).getId().equals(bookId)){
                index=i;
                break;
            }
        }
        if(index!= -1){
            bookList.get(index).getReviewList().add(review);

        }

    }

}
