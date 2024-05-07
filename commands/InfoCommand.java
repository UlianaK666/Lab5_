package commands;

import application.CollectionManager;
import model.Vehicle;

import java.util.HashSet;

public class InfoCommand {

    private CollectionManager collectionManager;

    public InfoCommand(CollectionManager collectionManager) {
        this.collectionManager = collectionManager;
    }

    public String execute() {
        StringBuilder answer = new StringBuilder();
        HashSet<Vehicle> collection = collectionManager.getCollection();
        answer.append("Type of collection: ").append(collection.getClass()).append("\n");
        answer.append("Time of initialization: ").append(collectionManager.getInitTime()).append("\n");
        answer.append("Number of items: ").append(collection.size()).append("\n");
        return answer.toString();
    }

}
