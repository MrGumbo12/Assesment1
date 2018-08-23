
public class Rickshaw extends Vehicle {

	private String drawn;

	public Rickshaw(String drawn, int ID, int no_Ofseats, String colour, int price) {
		super(ID, no_Ofseats, colour, price);

		this.drawn = drawn;
	}

	public String getDrawn() {
		return drawn;
	}

	public void setDrawn(String drawn) {
		this.drawn = drawn;
	}

}
