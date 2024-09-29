package self_assessment;

public class BEV extends Vehicle {

	public BEV(Manufacture manufacture, ElectricEngine engine) {
		super(manufacture, engine);
	}

	@Override
	public void showCharacteristics() {
		System.out.println("BEV:");
		manufacture.forPrint();
		engine.forPrint();
	}

}
