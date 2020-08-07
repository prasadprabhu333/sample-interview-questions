package com.prasadprabhu333.interview.libraryreport;

public class AuthorCount {
    String authorName;

    int numberOfBooks;

    public AuthorCount() {
    }

    public AuthorCount(String authorName, int numberOfBooks) {
        this.authorName = authorName;
        this.numberOfBooks = numberOfBooks;
    }

    @Override
    public String toString() {
        return "AuthorCount{" +
                "authorName='" + authorName + '\'' +
                ", numberOfBooks=" + numberOfBooks +
                '}';
    }
}
