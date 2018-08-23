
public class Car extends Vehicle {

	private int no_OfDoors;

	public Car(int no_OfDoors, int ID, int no_Ofseats, String colour, int price) {

		super(ID, no_Ofseats, colour, price);

		this.no_OfDoors = no_OfDoors;

	}

	public int priceByType() {
		return price / 2;
	}

	public int getNo_OfDoors() {
		return no_OfDoors;
	}

	public void setNo_OfDoors(int no_OfDoors) {
		this.no_OfDoors = no_OfDoors;
	}

}
