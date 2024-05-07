package application;

import model.Vehicle;

import java.util.Date;
import java.util.HashSet;
import java.util.Vector;

public class CollectionManager {

    private HashSet<Vehicle> collection;
    private Date initTime;

    public CollectionManager(HashSet<Vehicle> collection) {
        this.collection = collection;
    }

    public HashSet<Vehicle> getCollection() {
        return collection;
    }

    public void setCollection(HashSet<Vehicle> collection) {
        this.collection = collection;
    }

    public Date getInitTime() {
        return initTime;
    }
}
