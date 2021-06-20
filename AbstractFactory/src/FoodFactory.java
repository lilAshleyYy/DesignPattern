
public class FoodFactory extends  AbstractFactory{
	public Food getFood(String food) {
		if(food==null) {
			return null;
		}
		if(food.equalsIgnoreCase("PORK")) {
			return new pork();
		}
		else if(food.equalsIgnoreCase("CABBAGE")) {
			return new cabbage();
		}
		else if(food.equalsIgnoreCase("POTATO")) {
			return new potato();
		}
		return null;
	}
	public Recipe getCookMethod(String cookMethod) {
		return null;
	}
}
