package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LibraryTestSuite {

    @Test
    void testGetBooks() {
        //Given
        Library library = new Library("Private library 1");
        Book book1 = new Book("Title1", "Author1", LocalDate.of(1982,11,25));
        Book book2 = new Book("Title2", "Author2", LocalDate.of(1985,01,20));
        Book book3 = new Book("Title3", "Author3", LocalDate.of(1990,05,15));

        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        //making a shallow clone of object board
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Private library 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of object board
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Private library 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //Then
        library.books.remove(book1);

        //When
        System.out.println(library.getBooks());
        System.out.println(clonedLibrary.getBooks());
        System.out.println(deepClonedLibrary.getBooks());

        assertEquals(2, library.getBooks().size());
        assertEquals(2, clonedLibrary.getBooks().size());
        assertEquals(3, deepClonedLibrary.getBooks().size());
        assertEquals(clonedLibrary.getBooks(), library.getBooks());
        assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());
    }
}
