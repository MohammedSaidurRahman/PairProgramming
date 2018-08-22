
public class Car extends Vehicles {

	public Car(String make, String model, int engineSize, int wheels) {
		super(make, model, engineSize, wheels);
		
	}

	Vehicles lexus = new Vehicles("Lexus", "IS200", 2, 4);
	
	Vehicles bmw = new Vehicles("Bmw", "530d", 3, 4);
	
	Vehicles mercedes = new Vehicles("Mercedes", "C200", 2, 4);
	
}
