package service;

import model.Library;
import model.Persons;

public interface LibraryService {

    public void addRequest(Persons person);

    public void initializeBooks();

    public void processRequests();

    public void assignBook(Persons person, String bookName);

}
