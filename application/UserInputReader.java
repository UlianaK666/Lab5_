package application;

import model.Coordinates;
import model.VehicleType;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class UserInputReader {

    public String receiveName() {
        try {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                try {
                    System.out.println("Enter a name of vehicle. It cannot be empty:");
                    String name = scanner.nextLine();
                    if (name.isEmpty()) {
                        System.out.println("Name cannot be empty. Try again.");
                    } else {
                        return name;
                    }
                } catch (InputMismatchException inputMismatchException) {
                    System.out.println("Enter must be a string. Try again.");
                }
            }
        } catch (NoSuchElementException noSuchElementException) {
            System.out.println("Program will be finished now.");
            System.exit(0);
            return null;
        }
    }

    public Integer receiveX() {
        try {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                try {
                    System.out.println("Enter x coordinate:");
                    Integer x = scanner.nextInt();
                    return x;
                } catch (InputMismatchException inputMismatchException) {
                    System.out.println("Enter must be an integer number. Try again.");
                }
            }
        } catch (NoSuchElementException noSuchElementException) {
            System.out.println("Program will be finished now.");
            System.exit(0);
            return null;
        }
    }

    public Float receiveY() {
        try {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                try {
                    System.out.println("Enter y coordinate:");
                    Float y = scanner.nextFloat();
                    if (y > 351) {
                        System.out.println("Max value is 351. Try again,");
                        continue;
                    }
                    return y;
                } catch (InputMismatchException inputMismatchException) {
                    System.out.println("Enter must be an integer number. Try again.");
                }
            }
        } catch (NoSuchElementException noSuchElementException) {
            System.out.println("Program will be finished now.");
            System.exit(0);
            return null;
        }
    }

    public Coordinates receiveCoordinates() {
        Integer x = receiveX();
        Float y = receiveY();
        Coordinates coordinates = new Coordinates(x, y);
        return coordinates;
    }

    public Float receiveEnginePower() {
        try {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                try {
                    System.out.println("Enter an engine power:");
                    Float enginePower = scanner.nextFloat();
                    if (enginePower <= 0) {
                        System.out.println("Value must be positive. Try again,");
                        continue;
                    }
                    return enginePower;
                } catch (InputMismatchException inputMismatchException) {
                    System.out.println("Enter must be an integer number. Try again.");
                }
            }
        } catch (NoSuchElementException noSuchElementException) {
            System.out.println("Program will be finished now.");
            System.exit(0);
            return null;
        }
    }


//    public VehicleType receiveVehicleType() {
//        try {
//            Scanner scanner = new Scanner(System.in);
//            while (true) {
//                try {
//                    System.out.println("Enter vehicle type. Va");
//                    Float enginePower = scanner.nextFloat();
//                    if (enginePower <= 0) {
//                        System.out.println("Value must be positive. Try again,");
//                        continue;
//                    }
//                    return enginePower;
//                } catch (InputMismatchException inputMismatchException) {
//                    System.out.println("Enter must be an integer number. Try again.");
//                }
//            }
//        } catch (NoSuchElementException noSuchElementException) {
//            System.out.println("Program will be finished now.");
//            System.exit(0);
//            return null;
//        }
//    }



}
