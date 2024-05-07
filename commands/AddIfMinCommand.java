package commands;

import application.CollectionManager;
import model.Vehicle;

import java.util.HashSet;

public class AddIfMinCommand {

    private CollectionManager collectionManager;

    public AddIfMinCommand(CollectionManager collectionManager) {
        this.collectionManager = collectionManager;
    }

    public String execute(Vehicle vehicle) {
        HashSet<Vehicle> collection = collectionManager.getCollection();
        Vehicle minVehicle = new Vehicle();
        boolean isFirstVehicle = true;
        for (Vehicle current : collection) {
            if (isFirstVehicle == true) {
                minVehicle = current;
                isFirstVehicle = false;
                continue;
            }
            if (current.compareTo(minVehicle) < 0) {
                minVehicle = current;
            }
        }
        if (vehicle.compareTo(minVehicle) < 0) {
            collection.add(vehicle);
            return "Element has been added.\n";
        } else {
            return "Element has not been added, because it is not lower than maximal.\n";
        }
    }

}
