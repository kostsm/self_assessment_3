package self_assessment;

public class HybridEngine extends Engine {
	public String name;
	public int power;
	
	public HybridEngine(String name, int power) {
		this.name = name;
		this.power = power;
	}

	@Override
	public void forPrint() {
		System.out.println("Hybrid Engine:");
		System.out.println("Name: " +  name + "; Power: " + power);
	}
}
