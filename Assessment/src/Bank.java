
public class Bank extends Attraction {

	private String cashPoint;
	
	public Bank(String cashPoint,String name, String toilet, int ID, int distance, String direction) {

		super(name, toilet, ID, distance, direction);

		this.cashPoint = cashPoint;

	}

	public String getCashPoint() {
		return cashPoint;
	}

	public void setCashPoint(String cashPoint) {
		this.cashPoint = cashPoint;
	}
}
