package com.prasadprabhu333.interview.libraryreport;

import java.util.*;
import java.util.stream.Collectors;

public class LibraryReportsImpl implements LibraryReports {

    public List<AuthorCount> getPopularAuthors(List<Book> books) {

        Map<String, Integer> authorCount = new HashMap<String, Integer>();
        for(Book book: books) {
            String authorName = book.author;
            Integer countOfBooks = authorCount.getOrDefault(authorName, 0);
            countOfBooks += 1;
            authorCount.put(authorName, countOfBooks);
        }

        List<AuthorCount> authorCountList = authorCount.entrySet()
                .stream()
                .map(stringIntegerEntry ->  new AuthorCount(stringIntegerEntry.getKey(), stringIntegerEntry.getValue()))
                .collect(Collectors.toList());

        Collections.sort(authorCountList, (o1, o2) -> new Integer(o2.numberOfBooks).compareTo(new Integer(o1.numberOfBooks)) );

        return authorCountList;
    }

    @Override
    public List<GenreCount> getPopularGenres(List<BookWithGenre> booksWithGenres) {
        Map<String, Integer> genreCount = new HashMap<String, Integer>();
        for(BookWithGenre book: booksWithGenres) {
            Set<String> genres = book.genres;
            genres.stream().forEach( genre -> {
                Integer countOfBooks = genreCount.getOrDefault(genre, 0);
                countOfBooks += 1;
                genreCount.put(genre, countOfBooks);

            });

        }

        List<GenreCount> genreCounts = genreCount.entrySet()
                .stream()
                .map(stringIntegerEntry ->  new GenreCount(stringIntegerEntry.getKey(), stringIntegerEntry.getValue()))
                .collect(Collectors.toList());

        Collections.sort(genreCounts, (o1, o2) -> new Integer(o2.count).compareTo(new Integer(o1.count)) );

        return genreCounts;
    }

    @Override
    public List<MonthlyReport> getMonthlyReports(List<Checkout> checkouts) {
        return new ArrayList<>();
    }
}
