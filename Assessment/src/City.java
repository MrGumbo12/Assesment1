import java.util.ArrayList;
import java.util.List;

public class City {

	List<Attraction> attractionList = new ArrayList<>();

	public void addToList(Attraction attraction) {

		attractionList.add(attraction);
		System.out.println(attraction.getname() + " with ID " + attraction.getID() + " is " + attraction.getDistance()
				+ " miles away has been added to list");

	}

	public void showAttraction() {
		for (Attraction attraction : attractionList) {
			System.out.println(attraction.getname() + " with ID no. " + attraction.getID() + " is "
					+ attraction.getDistance() + " miles away" + attraction.getDirection());
		}
	}

}
