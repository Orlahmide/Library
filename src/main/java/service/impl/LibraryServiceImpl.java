package service.impl;

import model.Library;
import model.Persons;
import service.LibraryService;

public class LibraryServiceImpl extends Library implements LibraryService{

    @Override
    public void addRequest(Persons person) {
        getRequestQueue().add(person);
    }

    @Override
    public void initializeBooks() {
        getLibraryCollection().put("Things Fall Apart", 19);
        getLibraryCollection().put("Harry Potter", 13);
        getLibraryCollection().put("Getting Rich", 10);
        getLibraryCollection().put("Being Happy", 9);
        getLibraryCollection().put("Becoming The Best", 28);
        getLibraryCollection().put("Joys of coding", 7);
    }

    @Override
    public void processRequests() {
        while (!getRequestQueue().isEmpty()) {
            Persons person = getRequestQueue().poll();
            String requestedBook = person.getBookName();
            assignBook(person, requestedBook);
        }
    }

    @Override
    public void assignBook(Persons person, String bookName) {
        int requestedCopies = person.getRequestedCopies(); // Get the requested number of copies
        if (getLibraryCollection().containsKey(bookName) && getLibraryCollection().get(bookName) >= requestedCopies) {
            getLibraryCollection().put(bookName, getLibraryCollection().get(bookName) - requestedCopies); // Decrement by the requested number of copies
            System.out.println("The " + person.getRole() + " " + " has been assigned " + requestedCopies + " copies of the book: " + bookName);
        } else {
            System.out.println("Sorry, " + requestedCopies + " copies of " + bookName + " are unavailable for " + person.getRole());
        }
    }

    @Override
    public void addFirstInFirstOut(Persons person) {
        getFifo().add(person);
    }

    @Override
    public void processRequestFifo() {
        while (!getFifo().isEmpty()) {
            Persons person = getFifo().removeFirst();
            String requestedBook = person.getBookName();
            assignBooks(person, requestedBook);
        }
    }

    @Override
    public void assignBooks(Persons person, String bookName) {
        assignBook(person,bookName);
    }
}
