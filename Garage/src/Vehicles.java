
public class Vehicles {

	protected String make;
	protected String model;
	protected int engineSize;
	protected int wheels;
	
	
	
	public Vehicles(String make, String model, int engineSize, int wheels) {
	this.make = make;
	this.model = model;
	this.engineSize = engineSize;
	this.wheels = wheels;
		
	}
	
	public int TestWheels() {
		
		
		return wheels; 
	}
	
}