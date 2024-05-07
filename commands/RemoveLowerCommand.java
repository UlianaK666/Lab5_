package commands;

import application.CollectionManager;
import model.Vehicle;

import java.util.HashSet;

public class RemoveLowerCommand {

    private CollectionManager collectionManager;

    public RemoveLowerCommand(CollectionManager collectionManager) {
        this.collectionManager = collectionManager;
    }

    public String execute(Vehicle vehicle) {
        HashSet<Vehicle> collection = collectionManager.getCollection();
        HashSet<Vehicle> copy = new HashSet<>();
        for (Vehicle current : collection) {
            if (current.compareTo(vehicle) >= 0) {
                copy.add(current);
            }
        }
        collectionManager.setCollection(copy);
        return "All items which lower than given has been removed.\n";
    }

}