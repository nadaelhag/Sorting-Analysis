package assignment;
import java.io.*;
import java.util.*;

class Car {
	//class car with 3 attributes
    String vin;
    String name;
    String dob;

    //constructor
    public Car(String vin, String name, String dob) {
        this.vin = vin;
        this.name = name;
        this.dob = dob;
    }
}

public class Cars {
    public static void main(String[] args) {
    	//write in Driver class
    }

    public static void readCars(Car[] cars) {
    	int i = 0;
		int length = cars.length;
		//read from excel file and save into cars array 
        try (Scanner scanner = new Scanner(new File("src\\cars.csv"))) {
            if (scanner.hasNextLine()) {
                scanner.nextLine();
                //this is to skip the header
                while(scanner.hasNext() && i < length) {
                    String line = scanner.nextLine();
                    String[] values = line.split(","); //split for commas
                    String vin = values[0];
                    String name = values[1];
                    String dob = values[2];
                    //save values 
                    
                    //add car
                    cars[i++] = new Car(vin, name, dob);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void writeCars(Car[] cars, String filename) {
    	//pass car object and filename to create
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            writer.printf("%-4s %-20s %-12s %-20s%n", "No.", "Name", "DOB", "VIN");
            //print in format 
            int num = 81; //ku id + 1 so 80 + 1

            for (int i = 0; i < cars.length; i++) {
            	//loop through cars array and save into car
                Car car = cars[i];
                String newvin = car.vin.substring(0, car.vin.length() - 2) + 80;
                //print car info 
                writer.printf("%-4s %-20s %-12s %-20s%n", num, car.name, car.dob, newvin);
                num++;
                //increase column number
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
