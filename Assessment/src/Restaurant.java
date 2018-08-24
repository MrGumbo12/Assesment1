
public class Restaurant extends Attraction {

	private int mealOptions;
	
	public Restaurant(int mealOptions,String name, String toilet, int ID,int distance, String direction) {

		super(name, toilet, ID, distance, direction);

		this.mealOptions = mealOptions;

	}

	public int getMealOptions() {
		return mealOptions;
	}

	public void setMealOptions(int mealOptions) {
		this.mealOptions = mealOptions;
	}
	
}
