package self_assessment;

public class Car {
	public int id;
	public String make;
	public String model;
	public int yearOfManufacture;
	public String color;
	public double price;
	public String registrationNumber;
    
	public Car(int id, String make, String model, int yearOfManufacture,
            String color, double price, String registrationNumber) {
		this.id = id;
		this.make = make;
		this.model = model;
		this.yearOfManufacture = yearOfManufacture;
		this.color = color;
		this.price = price;
		this.registrationNumber = registrationNumber;
	}
    
	public String forPrint() {
		return "Car: [ID=" + id + ", Make=" + make + ", Model=" + model
                + ", Year of manufacture=" + yearOfManufacture + ", Color=" + color
                + ", Price=" + price + ", Registration Number=" + registrationNumber + "]";
	}
}
