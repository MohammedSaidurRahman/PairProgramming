
public class Planes extends Vehicles{

	public Planes(String make, String model, int engineSize, int wheels) {
		super(make, model, engineSize, wheels);
		// TODO Auto-generated constructor stub
	}
	
	Vehicles boeing = new Vehicles("Boeing", "747", 20, 6);
	
	Vehicles airbus = new Vehicles("Airbus", "A380", 54, 8);

}
