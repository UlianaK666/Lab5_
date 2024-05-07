package commands;

import application.CollectionManager;
import model.Vehicle;

import java.util.HashSet;

public class UpdateCommand {

    private CollectionManager collectionManager;

    public UpdateCommand(CollectionManager collectionManager) {
        this.collectionManager = collectionManager;
    }

    public String execute(Long id, Vehicle newVehicle) {
        HashSet<Vehicle> collection = collectionManager.getCollection();
        boolean wasFound = false;
        for (Vehicle current : collection) {
            if (current.getId().equals(id)) {
                wasFound = true;
                break;
            }
        }
        if (wasFound == true) {
            newVehicle.setId(id);
            collection.add(newVehicle);
            return "Element has been updated.\n";
        } else {
            return "Element has not been updated because given ID is not exists in the collection\n";
        }


    }
}
