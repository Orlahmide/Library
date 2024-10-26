package model;

public class Persons {

    private String name;
    private String role;
    private int requestedCopies;

    public Persons(String name, String role, int requestedCopies) {
        this.name = name;
        this.role = role;
        this.requestedCopies = requestedCopies;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public int getRequestedCopies() {
        return requestedCopies;
    }

    @Override
    public String toString() {
        return "Persons{" +
                "name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", requestedCopies=" + requestedCopies +
                '}';
    }
}
