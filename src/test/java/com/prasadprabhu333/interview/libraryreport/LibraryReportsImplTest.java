package com.prasadprabhu333.interview.libraryreport;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;


class LibraryReportsImplTest {


    public static void testGetPopularAuthors() {
        System.out.println("This is my test case");
        LibraryReports libraryReports = new LibraryReportsImpl();

        List<Book> bookList = Arrays.asList(new Book("Book 1", "author a"),
                            new Book("Book 2", "author b"),
        new Book("Book 3", "author b"));
        List<AuthorCount> authorCount = libraryReports.getPopularAuthors(bookList);
        System.out.println(authorCount);
    }

    public static void testGetGenericCounts() {

        System.out.println("This is my test case");
        LibraryReports libraryReports = new LibraryReportsImpl();

        List<BookWithGenre> bookList = Arrays.asList(new BookWithGenre("Book 1", "author a",
                        new HashSet<>(Arrays.asList("genre1", "genre2"))),
                new BookWithGenre("Book 2", "author a",
                        new HashSet<>(Arrays.asList("genre1"))),
                new BookWithGenre("Book 3", "author b",
                        new HashSet<>(Arrays.asList("genre1", "genre2", "genre3"))
                ));
        List<GenreCount> popularGenres = libraryReports.getPopularGenres(bookList);
        System.out.println(popularGenres);
    }

    public static void main(String []args) {
        testGetPopularAuthors();

        testGetGenericCounts();
    }
}