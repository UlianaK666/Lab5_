package commands;

import application.CollectionManager;
import model.Vehicle;

import java.util.HashSet;

public class RemoveByIdCommand {

    private CollectionManager collectionManager;

    public RemoveByIdCommand(CollectionManager collectionManager) {
        this.collectionManager = collectionManager;
    }

    public String execute(Long id) {
        HashSet<Vehicle> collection = collectionManager.getCollection();
        boolean wasFound = false;
        for (Vehicle current : collection) {
            if (current.getId().equals(id)) {
                wasFound = true;
                collection.remove(current);
                break;
            }
        }
        if (wasFound == true) {
            return "Element has been removed.\n";
        } else {
            return "Element has not been removed because given ID is not exists in the collection\n";
        }
    }

}
