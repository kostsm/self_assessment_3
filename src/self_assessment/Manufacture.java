package self_assessment;

public class Manufacture {
	private String name;
	private int year;
	
	public Manufacture(String name, int year) {
		this.name = name;
		this.year = year;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void forPrint() {
		System.out.println("Manufacture: " + name + "; Year: " + year);
	}
}
