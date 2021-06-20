
public class RecipeFactory extends AbstractFactory{
	//
	public Food getFood(String food) {
		return null;
	}
	public Recipe getCookMethod(String cookMethod) {
		if(cookMethod==null)
			return null;
		if(cookMethod.equalsIgnoreCase("FRY")) {
			return new fry();
		}
		else if(cookMethod.equalsIgnoreCase("STEAMED")) {
			return new steamed();
		}else if(cookMethod.equalsIgnoreCase("BRAISE")) {
			return new braise();
		}
		return null;
	}
}
