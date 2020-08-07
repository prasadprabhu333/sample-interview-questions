package com.prasadprabhu333.interview.libraryreport;

public class GenreCount {
    String genre;

    Integer count;

    public GenreCount(String genre, Integer count) {
        this.genre = genre;
        this.count = count;
    }

    @Override
    public String toString() {
        return "GenreCount{" +
                "genre='" + genre + '\'' +
                ", count=" + count +
                '}';
    }
}
