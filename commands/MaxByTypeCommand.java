package commands;

import application.CollectionManager;
import model.Vehicle;
import model.VehicleType;

import java.util.HashSet;

public class MaxByTypeCommand {

    private CollectionManager collectionManager;

    public MaxByTypeCommand(CollectionManager collectionManager) {
        this.collectionManager = collectionManager;
    }

    public String execute() {
        HashSet<Vehicle> collection = collectionManager.getCollection();
        Vehicle maxVehicle = new Vehicle();
        for (Vehicle current : collection) {
            if (current.getType().compareTo(maxVehicle.getType()) > 0) {
                maxVehicle = current;
            }
        }
        return "One of max vehicles by type is: " + maxVehicle + "\n";
    }

}
