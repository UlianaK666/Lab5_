package commands;

import application.CollectionManager;
import model.Vehicle;

import java.util.HashSet;
import java.util.Vector;

public class ShowCommand {

    private CollectionManager collectionManager;

    public ShowCommand(CollectionManager collectionManager) {
        this.collectionManager = collectionManager;
    }

    public String execute() {
        StringBuilder answer = new StringBuilder();
        HashSet<Vehicle> collection = collectionManager.getCollection();
        for (Vehicle currentVehicle : collection) {
            answer.append(currentVehicle.toString());
            answer.append("\n");
        }
        return answer.toString();
    }

}
