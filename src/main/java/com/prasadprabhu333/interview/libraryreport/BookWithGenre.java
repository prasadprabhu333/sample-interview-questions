package com.prasadprabhu333.interview.libraryreport;

import java.util.Set;

/**
 * This is for scale up 1
 */
public class BookWithGenre extends Book {

    Set<String> genres;

    public BookWithGenre(String name, String author, Set<String> genres) {
        super(name, author);
        this.genres = genres;
    }
}
