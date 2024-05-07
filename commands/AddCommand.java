package commands;

import application.CollectionManager;
import model.Vehicle;

import java.util.HashSet;

public class AddCommand {

    private CollectionManager collectionManager;

    public AddCommand(CollectionManager collectionManager) {
        this.collectionManager = collectionManager;
    }

    public String execute(Vehicle newVehicle) {
        HashSet<Vehicle> collection = this.collectionManager.getCollection();
        int initialSize = collection.size();
        collection.add(newVehicle);
        int currentSize = collection.size();
        if (currentSize == initialSize + 1) {
            return "Element has been added to collection.\n";
        } else {
            return "Element has not been added because it is already contains in set.\n";
        }
    }

}
