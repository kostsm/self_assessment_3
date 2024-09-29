package self_assessment;

public class VehicleManager {
	public static void main(String args[]) {
		Manufacture toyota = new Manufacture("Toyota", 1937);
		Manufacture ferrari = new Manufacture("Ferrari", 1939);
		Manufacture ford = new Manufacture("Ford", 1903);
	
		CombustionEngine combustionEngine = new CombustionEngine("V12", 750);
		ElectricEngine electricEngine = new ElectricEngine("PowerMan500", 500);
		HybridEngine hybridEngine = new HybridEngine("SmartDrive", 200);
	
		Vehicle[] vehicles = new Vehicle[3];
		vehicles[0] = new ICEV(ferrari, combustionEngine);
		vehicles[1] = new BEV(ford, electricEngine);
		vehicles[2] = new HybridV(toyota, hybridEngine);
	
		for (Vehicle v: vehicles) {
			v.showCharacteristics();
			System.out.println();
		}
	}

}
