package commands;

import application.CollectionManager;
import model.Vehicle;

import java.util.HashSet;

public class ClearCommand {

    private CollectionManager collectionManager;

    public ClearCommand(CollectionManager collectionManager) {
        this.collectionManager = collectionManager;
    }

    public String execute() {
        HashSet<Vehicle> collection = collectionManager.getCollection();
        collection.clear();
        return "Collection has been cleared.\n";
    }
}
