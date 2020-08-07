package com.prasadprabhu333.interview.libraryreport;

import java.util.List;

/**
 *
 * Original Question:
 * Imagine you have been asked to write a piece of software for your local library to help popularise reading.
 * The librarian wants to publish a weekly list of popular authors etc.
 * The librarian will give you a list of books checked out each week and you need to give
 * her back the most popular `n` authors that week.
 * Here is the original domain:
 * Book:
 *  - bookName
 *  - author
 */
public interface LibraryReports {

    /**
     *
     * Return a list of objects which contain the name of the author and the number of books by them that got checked out
     * in descending order of number of books.
     * @param books
     * @return
     */
    List<AuthorCount> getPopularAuthors(List<Book> books);


    /**
     * Scale up 1:
     * Now imagine that we wanted to associate a genre for the book and generate a similar report of popular genres with a count.
     * A book can belong to multiple genres.
     */
    List<GenreCount> getPopularGenres(List<BookWithGenre> booksWithGenres);


    /**
     * Scale up 2:
     * Our library has become extremely popular due to these reports. We now want to keep track of these reports by month.
     * @return
     */
    List<MonthlyReport> getMonthlyReports(List<Checkout> checkouts);



}
