package self_assessment;

public class ICEV extends Vehicle{

	public ICEV(Manufacture manufacture, CombustionEngine engine) {
		super(manufacture, engine);
	}

	@Override
	public void showCharacteristics() {
		System.out.println("ICEV:");
		manufacture.forPrint();
		engine.forPrint();
	}
	
}
