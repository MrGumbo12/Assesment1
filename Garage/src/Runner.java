
public class Runner 
{
	
	public static void main(String[] args) 
	{
		Car c1 = new Car(4, 1, 5, "red", 1000);
		Motorbike b1 = new Motorbike("Harley", 788, 2, "Blue", 2800);
		Garage garage = new Garage();
		
		garage.addToList(c1);
		garage.addToList(b1);
		System.out.println(c1.priceByType());
		System.out.println(b1.priceByType());
		garage.showVehicle();
		
	}

}
//
//		for (int i = 0; i < Vehicle.size(); i++) {
//
//			System.out.println(Vehicles.get(i));