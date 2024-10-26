package model;

import util.RoleComparator;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Library {
    private Map<String, Integer> libraryCollection;
    private PriorityQueue<Persons> requestQueue;

    public Library() {

        libraryCollection = new HashMap<>();
        requestQueue = new PriorityQueue<>(new RoleComparator());


    }

    public PriorityQueue<Persons> getRequestQueue() {
        return requestQueue;
    }

    public Map<String, Integer> getLibraryCollection() {
        return libraryCollection;
    }

}
