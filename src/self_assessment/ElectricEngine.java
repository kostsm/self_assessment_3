package self_assessment;

public class ElectricEngine extends Engine {
	public String name;
	public int power;
	
	public ElectricEngine(String name, int power) {
		this.name = name;
		this.power = power;
	}

	@Override
	public void forPrint() {
		System.out.println("Electric Engine:");
		System.out.println("Name: " +  name + "; Power: " + power);
	}
}
