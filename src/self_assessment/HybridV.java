package self_assessment;

public class HybridV extends Vehicle {

	public HybridV(Manufacture manufacture, HybridEngine engine) {
		super(manufacture, engine);
	}

	@Override
	public void showCharacteristics() {
		System.out.println("HybridV:");
		manufacture.forPrint();
		engine.forPrint();
	}
	
}
