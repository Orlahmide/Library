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
        library.addRequest(new Persons("Harry Potter", "Teacher", 2));

//        Add requests to the ArrayList
        library.addFirstInFirstOut(new Persons("Becoming The Best", "Junior Student", 10));
        library.addFirstInFirstOut(new Persons("Becoming The Best", "Teacher", 5));
        library.addFirstInFirstOut(new Persons("Becoming The Best", "Senior Student", 8));
        library.addFirstInFirstOut(new Persons("Becoming The Best", "Teacher Student", 10));

        // Process requests
        System.out.println();
        System.out.println("This is the first implementation on Priority bases: ");
        library.processRequests();

        System.out.println();
        System.out.println("This is the second implementation on First in First Out: ");

        library.processRequestFifo();
    }
}
