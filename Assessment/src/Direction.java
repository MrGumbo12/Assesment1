
public class Direction {
	private String north;
	private String east;
	private String south;
	private String west;
	private String direction;

	public String getDirection() {
		
		if (direction.equals(getNorth())) {
			return "This is: " + getNorth() ;
		} else if
		(direction.equals(getEast())) {
			return "This is: " + getEast();
		} else if 
		(direction.equals(getSouth())) {
			return "This is: " + getSouth();
		} else if
		(direction.equals(getWest())) {
			return "This is: " + getWest();
		}
		
		return "You're lost mate";
	}

	public String getNorth() {
		return north;
	}

	public void setNorth(String north) {
		this.north = north;
	}

	public String getEast() {
		return east;
	}

	public void setEast(String east) {
		this.east = east;
	}

	public String getSouth() {
		return south;
	}
	

	public void setSouth(String south) {
		this.south = south;
	}

	public String getWest() {
		return west;
	}

	public void setWest(String west) {
		this.west = west;
	}

}
