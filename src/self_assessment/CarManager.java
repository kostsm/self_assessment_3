package self_assessment;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CarManager {
	public static void main(String[] args) {
		List<Car> cars = new ArrayList<>();
        
		//System.out.println("Current working directory: " + System.getProperty("user.dir"));

		cars.add(new Car(1, "Volkswagen", "Polo", 2013, "Black", 9000.0, "HEB099"));
		cars.add(new Car(2, "Ferrari", "Purosangue", 2023, "Red", 270000.0, "AAA111"));
		cars.add(new Car(3, "Lexus", "Rx", 2018, "Black", 50000.0, "HPM092"));
		cars.add(new Car(4, "Ford", "Focus", 2010, "Blue", 10000.0, "POX012"));
		cars.add(new Car(5, "Kia", "Sportage", 2012, "Yellow", 20000.0, "EEE345"));
		cars.add(new Car(6, "Volkswagen", "Tiguan", 2017, "White", 18000.0, "KOM592"));
		cars.add(new Car(2, "Kia", "Picanto", 2023, "Red", 8000.0, "MCA819"));
		
		// a list of cars of a given brand;
		String givenMake = "Volkswagen";
		List<Car> sameMakes = new ArrayList<>();
        
		for (Car car: cars) {
			if (car.make == givenMake) {
				sameMakes.add(car);
			}
		}
		saveToFile(sameMakes, "sameMakes.txt");
        
		// a list of cars of a given model that have been in use for more than n years;
		String givenModel = "Polo";
		int usageYears = 5;
		List<Car> modelsAndUsage = new ArrayList<>();
        
		for (Car car: cars) {
			if (car.model == givenModel && (2024-car.yearOfManufacture) > usageYears ) {
				modelsAndUsage.add(car);
			}
		}
		saveToFile(modelsAndUsage, "modelsAndUsage.txt");
        
		// a list of cars of a given year of manufacture, 
		// the price of which is higher than the specified one.
		int givenYear = 2023;
		double minPrice = 15000.0;
		List<Car> yearsAndPrices = new ArrayList<>();
        
		for (Car car: cars) {
			if (car.yearOfManufacture == givenYear && car.price > minPrice) {
				yearsAndPrices.add(car);
			}
		}
		saveToFile(yearsAndPrices, "yearsAndPrices.txt");
	}
	
	public static void saveToFile(List<Car> cars, String fileName) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
			for (Car car : cars) {
				writer.write(car.forPrint());
				writer.newLine();
			}
			System.out.println("Saved " + cars.size() + " cars to " + fileName);
		} catch (IOException e) {
			System.err.println("Error saving file: " + fileName);
			e.printStackTrace();
		}
	}
}
