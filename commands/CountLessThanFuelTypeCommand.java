package commands;

import application.CollectionManager;
import model.FuelType;
import model.Vehicle;
import model.VehicleType;

import java.util.HashSet;

public class CountLessThanFuelTypeCommand {

    private CollectionManager collectionManager;

    public CountLessThanFuelTypeCommand(CollectionManager collectionManager) {
        this.collectionManager = collectionManager;
    }

    public String execute(FuelType fuelType) {
        HashSet<Vehicle> collection = collectionManager.getCollection();
        int counter = 0;
        for (Vehicle current : collection) {
            if (current.getFuelType().compareTo(fuelType) < 0) {
                counter++;
            }
        }
        return "Number of items, fuel type of which lower than given, is : " + counter + "\n";
    }
}
