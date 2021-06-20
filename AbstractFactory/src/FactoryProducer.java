
public class FactoryProducer {
	//创建一个工厂创造器/生成器，通过传递食材和烹饪方法获取工厂
	public static AbstractFactory getFactory(String choice) {
		if(choice.equals("FOOD")) {
			return new FoodFactory();
		}
		else if(choice.equals("RECIPE")) {
			return new RecipeFactory();
		}
		return null;
	}
}
