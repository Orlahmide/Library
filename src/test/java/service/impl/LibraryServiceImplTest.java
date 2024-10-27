package service.impl;

import model.Persons;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryServiceImplTest {

    private LibraryServiceImpl library;

    @BeforeEach

    void setUp() {
        library = new LibraryServiceImpl();
        library.initializeBooks(); // Initialize the library with books
    }


    @Test
    void testBookAvailableAndAssignIt() {
        Persons teacher = new Persons("Harry Potter", "Teacher", 5);
        library.assignBook(teacher,"Harry Potter");

        assertEquals(8, library.getLibraryCollection().get("Harry Potter"));
    }


    @Test
    void testAssignBookAvailableButNotEnoughCopies() {
        Persons student = new Persons("Senior Student", "Getting Rich", 15);
        library.assignBook(student, "Getting Rich");

        assertEquals(10, library.getLibraryCollection().get("Getting Rich"));
    }

}