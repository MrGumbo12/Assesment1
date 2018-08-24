
public class Attraction {

	private String name;
	private String toilet;
	private int ID;
	private int distance;
	private String direction;

	public Attraction(String name, String toilet, int ID, int distance, String direction) {
		this.name = name;
		this.toilet = toilet;
		this.ID = ID;
		this.direction = direction;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getToilet() {
		return toilet;
	}

	public void setToilet(String toilet) {
		this.toilet = toilet;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}
}
