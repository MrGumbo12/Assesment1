
public class Vehicle {

	private int ID;
	private int no_Ofseats;
	private String colour;
	protected int price;

	public Vehicle(int ID, int no_Ofseats, String colour, int price) {
		this.ID = ID;
		this.no_Ofseats = no_Ofseats;
		this.colour = colour;
		this.price = price;
	}
	
	public int priceByType () 
	{
		return price*2;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getNo_Ofseats() {
		return no_Ofseats;
	}

	public void setNo_Ofseats(int no_Ofseats) {
		this.no_Ofseats = no_Ofseats;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	

}
