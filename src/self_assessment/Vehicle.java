package self_assessment;

public abstract class Vehicle {
	protected Manufacture manufacture;
	protected Engine engine;
	
	public Vehicle(Manufacture manufacture, Engine engine) {
		this.manufacture = manufacture;
		this.engine = engine;
	}
	
	public abstract void showCharacteristics();
}
