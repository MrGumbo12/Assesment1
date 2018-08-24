/**
 * @title: Assessment 1
 * @author Elvis Gumbo
 * @date : 24/08/2018 This text based game is about navigation to attraction
 *       within an infinite City. The player can navigate to any attractions
 *       which have water and toilets.
 *
 **/
public class Runner {

	public static void main(String[] args) {

		City city = new City(); //creation of an object of the type city
		Game game = new Game();
		
		//code below show the creation of attractions

		Restaurant r1 = new Restaurant(7, "McDees", "WC", 103, 300, " North");
		Restaurant r2 = new Restaurant(7, "McDees", "WC", 104, 567, " North");
		Bank b1 = new Bank("Withdrawals", "Wonga", "WC", 201, 456, " West");
		Bank b2 = new Bank("Withdrawals", "Wonga", "WC", 202, 45, " West");
		
		//adding the attractions to the arraylist.
		
		
		city.attractionList.add(r1);
		city.attractionList.add(r2);
		city.attractionList.add(b1);
		city.attractionList.add(b2);
		
		//calling the fuction to show created attractions
		
		city.showAttraction();
		game.play();
		
		
	}

}
