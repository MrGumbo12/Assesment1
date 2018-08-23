import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {

		// creating instance of persons
		// objects

		Person person1 = new Person("Earl", 23, " Retired");
		Person person2 = new Person("Jean", 21, "Proffesor");
		Person person3 = new Person("Dee", 18, "Smith");
		Person person4 = new Person("Pete", 98, "Pilot");

		// Creating the arraylist for person

		List<Person> People = new ArrayList<>();

		People.add(person1);
		People.add(person2);
		People.add(person3);
		People.add(person4);

		for (int i = 0; i < People.size(); i++) {

			System.out.println(People.get(i).getName());
			

		}

		System.out.println(People);
	}

}
