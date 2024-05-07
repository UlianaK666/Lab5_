package commands;

import application.CollectionManager;
import model.FuelType;
import model.Vehicle;
import model.VehicleType;

import java.util.HashSet;

public class RemoveAllByTypeCommand {

    private CollectionManager collectionManager;

    public RemoveAllByTypeCommand(CollectionManager collectionManager) {
        this.collectionManager = collectionManager;
    }

    public String execute(VehicleType fuelType) {
        HashSet<Vehicle> collection = collectionManager.getCollection();
        HashSet<Vehicle> copy = new HashSet<>();
        for (Vehicle current : collection) {
            if (!current.getType().equals(fuelType)) {
                copy.add(current);
            }
        }
        collectionManager.setCollection(copy);
        return "All items, type of which is equal for a given, has been removed.\n";
    }

}
