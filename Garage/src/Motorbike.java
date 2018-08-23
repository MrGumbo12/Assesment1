
public class Motorbike extends Vehicle {

	private String make;

	public Motorbike(String make, int ID, int no_Ofseats, String colour, int price) {
		super(ID, no_Ofseats, colour,price );

		this.make = make;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

}
