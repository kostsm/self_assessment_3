package self_assessment;

public class CombustionEngine extends Engine {
	public String name;
	public int power;
	
	public CombustionEngine(String name, int power) {
		this.name = name;
		this.power = power;
	}

	@Override
	public void forPrint() {
		System.out.println("Combustion Engine:");
		System.out.println("Name: " +  name + "; Power: " + power);
	}
}
