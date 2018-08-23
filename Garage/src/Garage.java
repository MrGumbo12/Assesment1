import java.util.ArrayList;
import java.util.List;

public class Garage 
{
	
	List<Vehicle> vehiclesList = new ArrayList<>();
	
	public void addToList(Vehicle vehicle) 
	{
		
		System.out.println("Vehicle nr: " +vehicle.getID() + " added to list");
		vehiclesList.add(vehicle);
	}

	
	public void showVehicle() {
		for (Vehicle vehicle : vehiclesList) 
		{
			System.out.println("Vehicle nr: "+vehicle.getID() + " Bill is: £" + vehicle.priceByType());
		}
	}
}
