package commands;

import application.CollectionManager;
import model.Vehicle;

import java.util.HashSet;

public class AddIfMaxCommand {

    private CollectionManager collectionManager;

    public AddIfMaxCommand(CollectionManager collectionManager) {
        this.collectionManager = collectionManager;
    }

    public String execute(Vehicle vehicle) {
        HashSet<Vehicle> collection = collectionManager.getCollection();
        Vehicle maxVehicle = new Vehicle();
        boolean isFirstVehicle = true;
        for (Vehicle current : collection) {
            if (isFirstVehicle == true) {
                maxVehicle = current;
                isFirstVehicle = false;
                continue;
            }
            if (current.compareTo(maxVehicle) > 0) {
                maxVehicle = current;
            }
        }
        if (vehicle.compareTo(maxVehicle) > 0) {
            collection.add(vehicle);
            return "Element has been added.\n";
        } else {
            return "Element has not been added, because it is not greater than maximal.\n";
        }
    }

}