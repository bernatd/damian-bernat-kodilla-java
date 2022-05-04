package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    public void testPublicationYearMedian() {
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();
        Book book1 = new Book("Author1", "Title1", 2010, "Signature1");
        Book book2 = new Book("Author2", "Title2", 2005, "Signature2");
        Book book3 = new Book("Author3", "Title3", 1990, "Signature3");
        Set<Book> books = new HashSet<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        //When
        int median = medianAdapter.publicationYearMedian(books);
        System.out.println(median);
        //Then
        assertEquals(2005, median);
    }
}
