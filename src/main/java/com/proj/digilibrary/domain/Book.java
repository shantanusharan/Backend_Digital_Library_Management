package com.proj.digilibrary.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Book {
    private String id;
    private String title;
    private String author;
    private Genre genre;
    private Double cost;
    private Double rating;
    private List<Review> reviewList;
    private Integer year;


}
