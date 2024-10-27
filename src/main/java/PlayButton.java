import model.Library;
import model.Persons;
import service.impl.LibraryServiceImpl;

public class PlayButton {

    public static void main(String[] args) {
// Create an instance of PersonServiceImpl
        LibraryServiceImpl library = new LibraryServiceImpl();

        // Initialize the library with books
        library.initializeBooks();

        // Add requests directly to the library's request queue
        library.addRequest(new Persons("Harry Potter", "Junior Student", 10));
        library.addRequest(new Persons("Harry Potter", "Senior Student", 3));
        library.addRequest(new Persons("Harry Potter", "Teacher", 5));

        // Process requests
        library.processRequests();
    }
}
